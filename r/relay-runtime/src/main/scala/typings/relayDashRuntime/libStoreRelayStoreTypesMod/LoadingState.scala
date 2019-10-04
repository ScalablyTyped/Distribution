package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.relayDashRuntimeStrings.aborted
import typings.relayDashRuntime.relayDashRuntimeStrings.complete
import typings.relayDashRuntime.relayDashRuntimeStrings.error
import typings.relayDashRuntime.relayDashRuntimeStrings.missing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingState extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var status: aborted | complete | error | missing
}

object LoadingState {
  @scala.inline
  def apply(status: aborted | complete | error | missing, error: Error = null): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[LoadingState]
  }
}

