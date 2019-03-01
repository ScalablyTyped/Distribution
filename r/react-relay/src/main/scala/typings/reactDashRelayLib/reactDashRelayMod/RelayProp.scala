package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProp extends js.Object {
  var environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment
}

object RelayProp {
  @scala.inline
  def apply(environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment): RelayProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment)
    __obj.asInstanceOf[RelayProp]
  }
}

