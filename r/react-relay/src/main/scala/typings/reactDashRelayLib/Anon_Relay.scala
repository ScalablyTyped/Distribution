package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Relay extends js.Object {
  var relay: js.UndefOr[reactDashRelayLib.reactDashRelayMod.RelayProp] = js.undefined
}

object Anon_Relay {
  @scala.inline
  def apply(relay: reactDashRelayLib.reactDashRelayMod.RelayProp = null): Anon_Relay = {
    val __obj = js.Dynamic.literal()
    if (relay != null) __obj.updateDynamic("relay")(relay)
    __obj.asInstanceOf[Anon_Relay]
  }
}

