package typings.relayRuntime.relayRuntimeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationType extends js.Object {
  val rawResponse: js.UndefOr[js.Any] = js.native
  val response: js.Any = js.native
  val variables: Variables = js.native
}

object OperationType {
  @scala.inline
  def apply(response: js.Any, variables: Variables): OperationType = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationType]
  }
  @scala.inline
  implicit class OperationTypeOps[Self <: OperationType] (val x: Self) extends AnyVal {
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
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawResponse(value: js.Any): Self = this.set("rawResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawResponse: Self = this.set("rawResponse", js.undefined)
  }
  
}

