package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var product_id: js.UndefOr[Double] = js.undefined
}

object Id {
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined,
    product_id: js.UndefOr[Double] = js.undefined
  ): Id = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(product_id)) __obj.updateDynamic("product_id")(product_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

