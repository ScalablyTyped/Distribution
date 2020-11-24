package typings.reactToastify.closeButtonMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactToastify.typesMod.TypeOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseButtonProps extends js.Object {
  
  var ariaLabel: js.UndefOr[String] = js.native
  
  def closeToast(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  
  var `type`: TypeOptions = js.native
}
object CloseButtonProps {
  
  @scala.inline
  def apply(closeToast: MouseEvent[HTMLElement, NativeMouseEvent] => Unit, `type`: TypeOptions): CloseButtonProps = {
    val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction1(closeToast))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseButtonProps]
  }
  
  @scala.inline
  implicit class CloseButtonPropsOps[Self <: CloseButtonProps] (val x: Self) extends AnyVal {
    
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
    def setCloseToast(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("closeToast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: TypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
  }
}
