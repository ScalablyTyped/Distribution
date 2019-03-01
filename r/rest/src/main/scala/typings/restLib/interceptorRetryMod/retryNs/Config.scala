package typings
package restLib.interceptorRetryMod.retryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var initial: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var multiplier: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    initial: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    multiplier: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

