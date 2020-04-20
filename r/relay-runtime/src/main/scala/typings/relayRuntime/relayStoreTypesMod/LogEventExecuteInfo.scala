package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotinfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteInfo extends LogEvent {
  val info: js.Any
  val name: executeDotinfo
  val transactionID: Double
}

object LogEventExecuteInfo {
  @scala.inline
  def apply(info: js.Any, name: executeDotinfo, transactionID: Double): LogEventExecuteInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteInfo]
  }
}

