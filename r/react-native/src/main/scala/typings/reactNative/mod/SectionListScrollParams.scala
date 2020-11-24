package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListScrollParams extends js.Object {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var itemIndex: Double = js.native
  
  var sectionIndex: Double = js.native
  
  var viewOffset: js.UndefOr[Double] = js.native
  
  var viewPosition: js.UndefOr[Double] = js.native
}
object SectionListScrollParams {
  
  @scala.inline
  def apply(itemIndex: Double, sectionIndex: Double): SectionListScrollParams = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
  
  @scala.inline
  implicit class SectionListScrollParamsOps[Self <: SectionListScrollParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setViewOffset(value: Double): Self = this.set("viewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewOffset: Self = this.set("viewOffset", js.undefined)
    
    @scala.inline
    def setViewPosition(value: Double): Self = this.set("viewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewPosition: Self = this.set("viewPosition", js.undefined)
  }
}
