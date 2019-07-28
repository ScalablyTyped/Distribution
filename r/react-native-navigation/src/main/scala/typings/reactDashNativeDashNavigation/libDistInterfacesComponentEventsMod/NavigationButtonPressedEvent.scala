package typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationButtonPressedEvent extends ComponentEvent {
  var buttonId: String
}

object NavigationButtonPressedEvent {
  @scala.inline
  def apply(buttonId: String, componentId: String): NavigationButtonPressedEvent = {
    val __obj = js.Dynamic.literal(buttonId = buttonId, componentId = componentId)
  
    __obj.asInstanceOf[NavigationButtonPressedEvent]
  }
}

