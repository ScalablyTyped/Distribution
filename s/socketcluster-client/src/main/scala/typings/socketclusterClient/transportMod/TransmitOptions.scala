package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransmitOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
}

object TransmitOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): TransmitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransmitOptions]
  }
}

