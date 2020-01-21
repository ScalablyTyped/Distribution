package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarUpdatedEvent extends ComponentEvent {
  var isFocused: Boolean
  var text: String
}

object SearchBarUpdatedEvent {
  @scala.inline
  def apply(componentId: String, isFocused: Boolean, text: String): SearchBarUpdatedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchBarUpdatedEvent]
  }
}

