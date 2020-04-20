package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotnext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteNext extends LogEvent {
  val name: executeDotnext
  val response: js.Any
  val transactionID: Double
}

object LogEventExecuteNext {
  @scala.inline
  def apply(name: executeDotnext, response: js.Any, transactionID: Double): LogEventExecuteNext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteNext]
  }
}

