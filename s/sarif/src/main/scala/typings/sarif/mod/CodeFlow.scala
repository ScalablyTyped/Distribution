package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeFlow extends js.Object {
  /**
    * A message relevant to the code flow.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the code flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a
    * thread of execution.
    */
  var threadFlows: js.Array[ThreadFlow] = js.native
}

object CodeFlow {
  @scala.inline
  def apply(threadFlows: js.Array[ThreadFlow]): CodeFlow = {
    val __obj = js.Dynamic.literal(threadFlows = threadFlows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFlow]
  }
  @scala.inline
  implicit class CodeFlowOps[Self <: CodeFlow] (val x: Self) extends AnyVal {
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
    def setThreadFlowsVarargs(value: ThreadFlow*): Self = this.set("threadFlows", js.Array(value :_*))
    @scala.inline
    def setThreadFlows(value: js.Array[ThreadFlow]): Self = this.set("threadFlows", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

