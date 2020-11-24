package typings.reactstrap.alertMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertProps extends UncontrolledAlertProps {
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[MouseEventHandler[_]] = js.native
}
object AlertProps {
  
  @scala.inline
  def apply(): AlertProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertProps]
  }
  
  @scala.inline
  implicit class AlertPropsOps[Self <: AlertProps] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setToggle(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
