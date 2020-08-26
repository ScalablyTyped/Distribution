package typings.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandCompletedEvent extends js.Object {
  var commandId: String = js.native
  var commandName: String = js.native
  var completionTime: Double = js.native
  var params: js.Any = js.native
}

object CommandCompletedEvent {
  @scala.inline
  def apply(commandId: String, commandName: String, completionTime: Double, params: js.Any): CommandCompletedEvent = {
    val __obj = js.Dynamic.literal(commandId = commandId.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandCompletedEvent]
  }
  @scala.inline
  implicit class CommandCompletedEventOps[Self <: CommandCompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandId(value: String): Self = this.set("commandId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletionTime(value: Double): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

