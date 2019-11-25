package typings.reactDashRelay.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProp extends js.Object {
  var environment: typings.relayDashRuntime.relayDashRuntimeMod.Environment
   // ensures no RelayRefetchProp is used with a fragment container
  var hasMore: js.UndefOr[scala.Nothing] = js.undefined
  var refetch: js.UndefOr[scala.Nothing] = js.undefined
}

object RelayProp {
  @scala.inline
  def apply(
    environment: typings.relayDashRuntime.relayDashRuntimeMod.Environment,
    hasMore: js.UndefOr[scala.Nothing] = js.undefined,
    refetch: js.UndefOr[scala.Nothing] = js.undefined
  ): RelayProp = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore.asInstanceOf[js.Any])
    if (!js.isUndefined(refetch)) __obj.updateDynamic("refetch")(refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayProp]
  }
}

