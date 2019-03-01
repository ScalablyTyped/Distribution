package typings
package reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarCancelPressedEvent extends ComponentEvent {
  var componentName: js.UndefOr[java.lang.String] = js.undefined
}

object SearchBarCancelPressedEvent {
  @scala.inline
  def apply(componentId: java.lang.String, componentName: java.lang.String = null): SearchBarCancelPressedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentId")(componentId)
    if (componentName != null) __obj.updateDynamic("componentName")(componentName)
    __obj.asInstanceOf[SearchBarCancelPressedEvent]
  }
}

