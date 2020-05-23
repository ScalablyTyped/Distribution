package typings.reactRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProp extends js.Object {
  var environment: typings.relayRuntime.mod.Environment
   // ensures no RelayRefetchProp is used with a fragment container
  var hasMore: js.UndefOr[scala.Nothing] = js.undefined
  var refetch: js.UndefOr[scala.Nothing] = js.undefined
}

object RelayProp {
  @scala.inline
  def apply(environment: typings.relayRuntime.mod.Environment): RelayProp = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayProp]
  }
}

