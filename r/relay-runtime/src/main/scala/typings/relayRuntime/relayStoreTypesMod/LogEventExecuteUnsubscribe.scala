package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotunsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEventExecuteUnsubscribe extends LogEvent {
  val name: executeDotunsubscribe = js.native
  val transactionID: Double = js.native
}

object LogEventExecuteUnsubscribe {
  @scala.inline
  def apply(name: executeDotunsubscribe, transactionID: Double): LogEventExecuteUnsubscribe = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteUnsubscribe]
  }
  @scala.inline
  implicit class LogEventExecuteUnsubscribeOps[Self <: LogEventExecuteUnsubscribe] (val x: Self) extends AnyVal {
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
    def setName(value: executeDotunsubscribe): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
  
}

