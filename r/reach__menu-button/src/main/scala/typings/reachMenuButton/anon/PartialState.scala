package typings.reachMenuButton.anon

import typings.reachMenuButton.mod.ButtonRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@reach/menu-button.@reach/menu-button.State> */
@js.native
trait PartialState extends js.Object {
  
  var buttonId: js.UndefOr[String] = js.native
  
  var buttonRect: js.UndefOr[ButtonRect] = js.native
  
  var closingWithClick: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var selectionIndex: js.UndefOr[Double] = js.native
}
object PartialState {
  
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  @scala.inline
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
    
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
    def setButtonId(value: String): Self = this.set("buttonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonId: Self = this.set("buttonId", js.undefined)
    
    @scala.inline
    def setButtonRect(value: ButtonRect): Self = this.set("buttonRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonRect: Self = this.set("buttonRect", js.undefined)
    
    @scala.inline
    def setClosingWithClick(value: Boolean): Self = this.set("closingWithClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosingWithClick: Self = this.set("closingWithClick", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setSelectionIndex(value: Double): Self = this.set("selectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionIndex: Self = this.set("selectionIndex", js.undefined)
  }
}
