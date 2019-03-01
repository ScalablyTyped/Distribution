package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoReconnectOptions extends js.Object {
  var initialDelay: js.UndefOr[scala.Double] = js.undefined
  var maxDelay: js.UndefOr[scala.Double] = js.undefined
  var multiplier: js.UndefOr[scala.Double] = js.undefined
  var randomness: js.UndefOr[scala.Double] = js.undefined
}

object AutoReconnectOptions {
  @scala.inline
  def apply(
    initialDelay: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null,
    multiplier: scala.Int | scala.Double = null,
    randomness: scala.Int | scala.Double = null
  ): AutoReconnectOptions = {
    val __obj = js.Dynamic.literal()
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (randomness != null) __obj.updateDynamic("randomness")(randomness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoReconnectOptions]
  }
}

