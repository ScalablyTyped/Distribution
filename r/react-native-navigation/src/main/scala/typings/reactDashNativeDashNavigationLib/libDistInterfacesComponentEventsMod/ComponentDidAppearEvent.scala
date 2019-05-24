package typings
package reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidAppearEvent extends ComponentEvent {
  var componentName: java.lang.String
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object ComponentDidAppearEvent {
  @scala.inline
  def apply(componentId: java.lang.String, componentName: java.lang.String, passProps: js.Object = null): ComponentDidAppearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId, componentName = componentName)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    __obj.asInstanceOf[ComponentDidAppearEvent]
  }
}

