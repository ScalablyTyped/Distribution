package typings.reactRelay

import typings.reactRelay.mod.RelayProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelay extends js.Object {
  var relay: js.UndefOr[RelayProp] = js.undefined
}

object AnonRelay {
  @scala.inline
  def apply(relay: RelayProp = null): AnonRelay = {
    val __obj = js.Dynamic.literal()
    if (relay != null) __obj.updateDynamic("relay")(relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelay]
  }
}

