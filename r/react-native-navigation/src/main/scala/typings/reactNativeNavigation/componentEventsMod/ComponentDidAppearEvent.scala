package typings.reactNativeNavigation.componentEventsMod

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
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDidAppearEvent]
  }
}

