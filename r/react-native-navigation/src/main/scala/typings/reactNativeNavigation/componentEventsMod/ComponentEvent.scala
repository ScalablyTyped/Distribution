package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentEvent extends js.Object {
  var componentId: String
}

object ComponentEvent {
  @scala.inline
  def apply(componentId: String): ComponentEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentEvent]
  }
}

