package typings.scDashBroker.scDashBrokerMod

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
    initialDelay: Int | Double = null,
    maxDelay: Int | Double = null,
    multiplier: Int | Double = null,
    randomness: Int | Double = null
  ): AutoReconnectOptions = {
    val __obj = js.Dynamic.literal()
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (randomness != null) __obj.updateDynamic("randomness")(randomness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoReconnectOptions]
  }
}

