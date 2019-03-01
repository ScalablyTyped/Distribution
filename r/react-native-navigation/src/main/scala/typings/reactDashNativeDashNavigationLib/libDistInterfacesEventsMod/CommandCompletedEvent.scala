package typings
package reactDashNativeDashNavigationLib.libDistInterfacesEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandCompletedEvent extends js.Object {
  var commandId: java.lang.String
  var completionTime: scala.Double
  var params: js.Any
}

object CommandCompletedEvent {
  @scala.inline
  def apply(commandId: java.lang.String, completionTime: scala.Double, params: js.Any): CommandCompletedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commandId")(commandId)
    __obj.updateDynamic("completionTime")(completionTime)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[CommandCompletedEvent]
  }
}

