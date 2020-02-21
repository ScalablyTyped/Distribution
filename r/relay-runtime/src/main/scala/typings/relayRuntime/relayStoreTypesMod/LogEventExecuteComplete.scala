package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotcomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteComplete extends LogEvent {
  val name: executeDotcomplete
  val transactionID: Double
}

object LogEventExecuteComplete {
  @scala.inline
  def apply(name: executeDotcomplete, transactionID: Double): LogEventExecuteComplete = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogEventExecuteComplete]
  }
}

