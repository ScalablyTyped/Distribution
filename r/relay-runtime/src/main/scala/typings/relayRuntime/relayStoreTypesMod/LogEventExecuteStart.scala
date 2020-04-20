package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.AnonName
import typings.relayRuntime.relayRuntimeStrings.executeDotstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteStart extends LogEvent {
  val name: executeDotstart
  val params: AnonName
  val transactionID: Double
  val variables: js.Object
}

object LogEventExecuteStart {
  @scala.inline
  def apply(name: executeDotstart, params: AnonName, transactionID: Double, variables: js.Object): LogEventExecuteStart = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteStart]
  }
}

