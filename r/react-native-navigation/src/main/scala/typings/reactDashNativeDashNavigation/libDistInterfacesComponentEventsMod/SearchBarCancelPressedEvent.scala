package typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarCancelPressedEvent extends ComponentEvent {
  var componentName: js.UndefOr[String] = js.undefined
}

object SearchBarCancelPressedEvent {
  @scala.inline
  def apply(componentId: String, componentName: String = null): SearchBarCancelPressedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    if (componentName != null) __obj.updateDynamic("componentName")(componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarCancelPressedEvent]
  }
}

