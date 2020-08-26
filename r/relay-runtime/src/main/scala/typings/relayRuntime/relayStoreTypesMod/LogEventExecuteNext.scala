package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.executeDotnext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEventExecuteNext extends LogEvent {
  val name: executeDotnext = js.native
  val response: js.Any = js.native
  val transactionID: Double = js.native
}

object LogEventExecuteNext {
  @scala.inline
  def apply(name: executeDotnext, response: js.Any, transactionID: Double): LogEventExecuteNext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteNext]
  }
  @scala.inline
  implicit class LogEventExecuteNextOps[Self <: LogEventExecuteNext] (val x: Self) extends AnyVal {
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
    def setName(value: executeDotnext): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
  
}

