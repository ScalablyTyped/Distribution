package typings.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandCompletedEvent extends js.Object {
  var commandId: String
  var completionTime: Double
  var params: js.Any
}

object CommandCompletedEvent {
  @scala.inline
  def apply(commandId: String, completionTime: Double, params: js.Any): CommandCompletedEvent = {
    val __obj = js.Dynamic.literal(commandId = commandId.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommandCompletedEvent]
  }
}

