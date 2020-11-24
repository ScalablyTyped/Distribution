package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalDismissedEvent extends ComponentEvent {
  
  var componentName: String = js.native
  
  var modalsDismissed: Double = js.native
}
object ModalDismissedEvent {
  
  @scala.inline
  def apply(componentId: String, componentName: String, modalsDismissed: Double): ModalDismissedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], modalsDismissed = modalsDismissed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDismissedEvent]
  }
  
  @scala.inline
  implicit class ModalDismissedEventOps[Self <: ModalDismissedEvent] (val x: Self) extends AnyVal {
    
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
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalsDismissed(value: Double): Self = this.set("modalsDismissed", value.asInstanceOf[js.Any])
  }
}
