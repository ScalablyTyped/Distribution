package typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidAppearEvent extends ComponentEvent {
  var componentName: String
  var passProps: js.UndefOr[js.Object] = js.undefined
}

object ComponentDidAppearEvent {
  @scala.inline
  def apply(componentId: String, componentName: String, passProps: js.Object = null): ComponentDidAppearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId, componentName = componentName)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps)
    __obj.asInstanceOf[ComponentDidAppearEvent]
  }
}

