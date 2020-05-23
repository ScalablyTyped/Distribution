package typings.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/stringgenerator.Options> */
trait PartialOptionsOrder extends js.Object {
  var order: js.UndefOr[Double] = js.undefined
  var prior: js.UndefOr[Double] = js.undefined
  var words: js.UndefOr[Boolean] = js.undefined
}

object PartialOptionsOrder {
  @scala.inline
  def apply(
    order: js.UndefOr[Double] = js.undefined,
    prior: js.UndefOr[Double] = js.undefined,
    words: js.UndefOr[Boolean] = js.undefined
  ): PartialOptionsOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prior)) __obj.updateDynamic("prior")(prior.get.asInstanceOf[js.Any])
    if (!js.isUndefined(words)) __obj.updateDynamic("words")(words.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsOrder]
  }
}

