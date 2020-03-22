package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDismissedEvent extends ComponentEvent {
  var componentName: String
  var modalsDismissed: Double
}

object ModalDismissedEvent {
  @scala.inline
  def apply(componentId: String, componentName: String, modalsDismissed: Double): ModalDismissedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], modalsDismissed = modalsDismissed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModalDismissedEvent]
  }
}

