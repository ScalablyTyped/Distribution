package typings.reactSelect.menuMod

import typings.reactSelect.reactSelectStrings.bottom
import typings.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuPortalState extends js.Object {
  
  var placement: bottom | top | Null = js.native
}
object MenuPortalState {
  
  @scala.inline
  def apply(): MenuPortalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuPortalState]
  }
  
  @scala.inline
  implicit class MenuPortalStateOps[Self <: MenuPortalState] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: bottom | top): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementNull: Self = this.set("placement", null)
  }
}
