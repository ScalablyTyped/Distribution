package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IStyleType.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllSelected extends js.Object {
  
  var allSelected: Header = js.native
  
  var allSelectedHover: Header = js.native
  
  var normal: Header = js.native
  
  var normalHover: Header = js.native
  
  var partSelected: Header = js.native
  
  var partSelectedHover: Header = js.native
}
object AllSelected {
  
  @scala.inline
  def apply(
    allSelected: Header,
    allSelectedHover: Header,
    normal: Header,
    normalHover: Header,
    partSelected: Header,
    partSelectedHover: Header
  ): AllSelected = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], allSelectedHover = allSelectedHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any], partSelected = partSelected.asInstanceOf[js.Any], partSelectedHover = partSelectedHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSelected]
  }
  
  @scala.inline
  implicit class AllSelectedOps[Self <: AllSelected] (val x: Self) extends AnyVal {
    
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
    def setAllSelected(value: Header): Self = this.set("allSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSelectedHover(value: Header): Self = this.set("allSelectedHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Header): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: Header): Self = this.set("normalHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSelected(value: Header): Self = this.set("partSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSelectedHover(value: Header): Self = this.set("partSelectedHover", value.asInstanceOf[js.Any])
  }
}
