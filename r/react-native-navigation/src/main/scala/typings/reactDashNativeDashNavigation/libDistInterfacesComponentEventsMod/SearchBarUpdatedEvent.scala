package typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod

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
    val __obj = js.Dynamic.literal(componentId = componentId, isFocused = isFocused, text = text)
  
    __obj.asInstanceOf[SearchBarUpdatedEvent]
  }
}

