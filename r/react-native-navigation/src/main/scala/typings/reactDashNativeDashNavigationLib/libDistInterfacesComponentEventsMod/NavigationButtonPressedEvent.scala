package typings
package reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationButtonPressedEvent extends ComponentEvent {
  var buttonId: java.lang.String
}

object NavigationButtonPressedEvent {
  @scala.inline
  def apply(buttonId: java.lang.String, componentId: java.lang.String): NavigationButtonPressedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonId")(buttonId)
    __obj.updateDynamic("componentId")(componentId)
    __obj.asInstanceOf[NavigationButtonPressedEvent]
  }
}

