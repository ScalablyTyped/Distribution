package typings.reactNativeModals.anon

import typings.reactNativeModals.mod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideFrom extends js.Object {
  
  var slideFrom: js.UndefOr[SlideFromTypes] = js.native
  
  var toValue: js.UndefOr[Double] = js.native
}
object SlideFrom {
  
  @scala.inline
  def apply(): SlideFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideFrom]
  }
  
  @scala.inline
  implicit class SlideFromOps[Self <: SlideFrom] (val x: Self) extends AnyVal {
    
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
    def setSlideFrom(value: SlideFromTypes): Self = this.set("slideFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideFrom: Self = this.set("slideFrom", js.undefined)
    
    @scala.inline
    def setToValue(value: Double): Self = this.set("toValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToValue: Self = this.set("toValue", js.undefined)
  }
}
