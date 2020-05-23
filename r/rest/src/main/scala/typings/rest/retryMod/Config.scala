package typings.rest.retryMod

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
  def apply(
    initial: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    multiplier: js.UndefOr[Double] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

