package typings.shopifyPrime.shippingLineMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingLine extends ShopifyObject {
  /**
    * A reference to the shipping method.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * The price of this shipping method.
    */
  var price: js.UndefOr[Double] = js.undefined
  /**
    * The source of the shipping method.
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * A list of <see cref="ShopifyTaxLine"/> objects, each of which details the taxes applicable to this <see cref="ShopifyShippingLine"/>.
    */
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.undefined
  /**
    * The title of the shipping method.
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShippingLine {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    code: String = null,
    id: js.UndefOr[Double] = js.undefined,
    price: js.UndefOr[Double] = js.undefined,
    source: String = null,
    tax_lines: js.Array[TaxLine] = null,
    title: String = null
  ): ShippingLine = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_lines != null) __obj.updateDynamic("tax_lines")(tax_lines.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingLine]
  }
}

