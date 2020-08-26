package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.anon.Name
import typings.relayRuntime.relayRuntimeStrings.executeDotstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEventExecuteStart extends LogEvent {
  val name: executeDotstart = js.native
  val params: Name = js.native
  val transactionID: Double = js.native
  val variables: js.Object = js.native
}

object LogEventExecuteStart {
  @scala.inline
  def apply(name: executeDotstart, params: Name, transactionID: Double, variables: js.Object): LogEventExecuteStart = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteStart]
  }
  @scala.inline
  implicit class LogEventExecuteStartOps[Self <: LogEventExecuteStart] (val x: Self) extends AnyVal {
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
    def setName(value: executeDotstart): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Name): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

