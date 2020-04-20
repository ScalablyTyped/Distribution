package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDoterror
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteError extends LogEvent {
  val error: Error
  val name: executeDoterror
  val transactionID: Double
}

object LogEventExecuteError {
  @scala.inline
  def apply(error: Error, name: executeDoterror, transactionID: Double): LogEventExecuteError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteError]
  }
}

