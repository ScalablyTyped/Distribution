package typings.relayDashRuntime.libMutationsCommitMutationMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationParameters extends js.Object {
  val rawResponse: js.UndefOr[js.Any] = js.undefined
  val response: js.Any
  val variables: Variables
}

object MutationParameters {
  @scala.inline
  def apply(response: js.Any, variables: Variables, rawResponse: js.Any = null): MutationParameters = {
    val __obj = js.Dynamic.literal(response = response, variables = variables)
    if (rawResponse != null) __obj.updateDynamic("rawResponse")(rawResponse)
    __obj.asInstanceOf[MutationParameters]
  }
}

