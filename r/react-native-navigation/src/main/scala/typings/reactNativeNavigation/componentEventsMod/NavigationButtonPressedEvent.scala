package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationButtonPressedEvent extends ComponentEvent {
  var buttonId: String
}

object NavigationButtonPressedEvent {
  @scala.inline
  def apply(buttonId: String, componentId: String): NavigationButtonPressedEvent = {
    val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationButtonPressedEvent]
  }
}

