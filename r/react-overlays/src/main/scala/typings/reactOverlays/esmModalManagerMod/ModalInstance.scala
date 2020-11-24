package typings.reactOverlays.esmModalManagerMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalInstance extends js.Object {
  
  var backdrop: Element = js.native
  
  var dialog: Element = js.native
}
object ModalInstance {
  
  @scala.inline
  def apply(backdrop: Element, dialog: Element): ModalInstance = {
    val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalInstance]
  }
  
  @scala.inline
  implicit class ModalInstanceOps[Self <: ModalInstance] (val x: Self) extends AnyVal {
    
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
    def setBackdrop(value: Element): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog(value: Element): Self = this.set("dialog", value.asInstanceOf[js.Any])
  }
}
