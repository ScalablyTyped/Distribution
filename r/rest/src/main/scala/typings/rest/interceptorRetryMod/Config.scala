package typings.rest.interceptorRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var initial: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var multiplier: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(initial: Int | Double = null, max: Int | Double = null, multiplier: Int | Double = null): Config = {
    val __obj = js.Dynamic.literal()
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

