package typings
package reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarUpdatedEvent extends ComponentEvent {
  var isFocused: scala.Boolean
  var text: java.lang.String
}

object SearchBarUpdatedEvent {
  @scala.inline
  def apply(componentId: java.lang.String, isFocused: scala.Boolean, text: java.lang.String): SearchBarUpdatedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId, isFocused = isFocused, text = text)
  
    __obj.asInstanceOf[SearchBarUpdatedEvent]
  }
}

