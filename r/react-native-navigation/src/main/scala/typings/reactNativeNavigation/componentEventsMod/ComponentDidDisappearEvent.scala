package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidDisappearEvent extends ComponentEvent {
  var componentName: String
}

object ComponentDidDisappearEvent {
  @scala.inline
  def apply(componentId: String, componentName: String): ComponentDidDisappearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentDidDisappearEvent]
  }
}

