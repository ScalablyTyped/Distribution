package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotcomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEventExecuteComplete extends LogEvent {
  val name: executeDotcomplete = js.native
  val transactionID: Double = js.native
}

object LogEventExecuteComplete {
  @scala.inline
  def apply(name: executeDotcomplete, transactionID: Double): LogEventExecuteComplete = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteComplete]
  }
  @scala.inline
  implicit class LogEventExecuteCompleteOps[Self <: LogEventExecuteComplete] (val x: Self) extends AnyVal {
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
    def setName(value: executeDotcomplete): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
  
}

