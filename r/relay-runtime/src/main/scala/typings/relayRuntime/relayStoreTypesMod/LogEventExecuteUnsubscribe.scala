package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotunsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteUnsubscribe extends LogEvent {
  val name: executeDotunsubscribe
  val transactionID: Double
}

object LogEventExecuteUnsubscribe {
  @scala.inline
  def apply(name: executeDotunsubscribe, transactionID: Double): LogEventExecuteUnsubscribe = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteUnsubscribe]
  }
}

