package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoReconnectOptions extends js.Object {
  var initialDelay: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
  var multiplier: js.UndefOr[Double] = js.undefined
  var randomness: js.UndefOr[Double] = js.undefined
}

object AutoReconnectOptions {
  @scala.inline
  def apply(
    initialDelay: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    multiplier: js.UndefOr[Double] = js.undefined,
    randomness: js.UndefOr[Double] = js.undefined
  ): AutoReconnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomness)) __obj.updateDynamic("randomness")(randomness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoReconnectOptions]
  }
}

