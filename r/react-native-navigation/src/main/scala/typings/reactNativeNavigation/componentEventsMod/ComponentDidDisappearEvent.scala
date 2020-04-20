package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidDisappearEvent extends ComponentEvent {
  var componentName: String
  var componentType: ComponentType
}

object ComponentDidDisappearEvent {
  @scala.inline
  def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentDidDisappearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDidDisappearEvent]
  }
}

