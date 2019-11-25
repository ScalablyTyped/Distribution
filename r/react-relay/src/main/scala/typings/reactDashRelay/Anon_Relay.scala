package typings.reactDashRelay

import typings.reactDashRelay.reactDashRelayMod.RelayProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Relay extends js.Object {
  var relay: js.UndefOr[RelayProp] = js.undefined
}

object Anon_Relay {
  @scala.inline
  def apply(relay: RelayProp = null): Anon_Relay = {
    val __obj = js.Dynamic.literal()
    if (relay != null) __obj.updateDynamic("relay")(relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Relay]
  }
}

