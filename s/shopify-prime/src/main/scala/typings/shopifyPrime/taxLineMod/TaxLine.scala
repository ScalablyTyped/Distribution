package typings.shopifyPrime.taxLineMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxLine extends ShopifyObject {
  /**
    * The amount of tax to be charged.
    */
  var price: js.UndefOr[Double] = js.undefined
  /**
    * The rate of tax to be applied.
    */
  var rate: js.UndefOr[Double] = js.undefined
  /**
    * The name of the tax.
    */
  var title: js.UndefOr[String] = js.undefined
}

object TaxLine {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    id: js.UndefOr[Double] = js.undefined,
    price: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): TaxLine = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxLine]
  }
}

