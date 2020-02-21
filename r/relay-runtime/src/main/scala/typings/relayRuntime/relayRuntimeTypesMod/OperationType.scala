package typings.relayRuntime.relayRuntimeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationType extends js.Object {
  val rawResponse: js.UndefOr[js.Any] = js.undefined
  val response: js.Any
  val variables: Variables
}

object OperationType {
  @scala.inline
  def apply(response: js.Any, variables: Variables, rawResponse: js.Any = null): OperationType = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (rawResponse != null) __obj.updateDynamic("rawResponse")(rawResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationType]
  }
}

