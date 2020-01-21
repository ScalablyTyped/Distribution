package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.aborted
import typings.relayRuntime.relayRuntimeStrings.complete
import typings.relayRuntime.relayRuntimeStrings.error_
import typings.relayRuntime.relayRuntimeStrings.missing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingState extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var status: aborted | complete | error_ | missing
}

object LoadingState {
  @scala.inline
  def apply(status: aborted | complete | error_ | missing, error: Error = null): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingState]
  }
}

