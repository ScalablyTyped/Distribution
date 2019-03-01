package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringGeneratorOptions extends js.Object {
  var order: js.UndefOr[scala.Double] = js.undefined
  var prior: js.UndefOr[scala.Double] = js.undefined
  var words: js.UndefOr[scala.Boolean] = js.undefined
}

object StringGeneratorOptions {
  @scala.inline
  def apply(
    order: scala.Int | scala.Double = null,
    prior: scala.Int | scala.Double = null,
    words: js.UndefOr[scala.Boolean] = js.undefined
  ): StringGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (prior != null) __obj.updateDynamic("prior")(prior.asInstanceOf[js.Any])
    if (!js.isUndefined(words)) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[StringGeneratorOptions]
  }
}

