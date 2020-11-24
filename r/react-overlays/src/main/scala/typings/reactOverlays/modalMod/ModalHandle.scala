package typings.reactOverlays.modalMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalHandle extends js.Object {
  
  var backdrop: HTMLElement | Null = js.native
  
  var dialog: HTMLElement | Null = js.native
}
object ModalHandle {
  
  @scala.inline
  def apply(): ModalHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalHandle]
  }
  
  @scala.inline
  implicit class ModalHandleOps[Self <: ModalHandle] (val x: Self) extends AnyVal {
    
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
    def setBackdrop(value: HTMLElement): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropNull: Self = this.set("backdrop", null)
    
    @scala.inline
    def setDialog(value: HTMLElement): Self = this.set("dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogNull: Self = this.set("dialog", null)
  }
}
