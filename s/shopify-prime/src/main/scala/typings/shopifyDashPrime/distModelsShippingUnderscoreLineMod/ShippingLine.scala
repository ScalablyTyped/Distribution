package typings.shopifyDashPrime.distModelsShippingUnderscoreLineMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.distModelsTaxUnderscoreLineMod.TaxLine
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
    id: Int | Double = null,
    price: Int | Double = null,
    source: String = null,
    tax_lines: js.Array[TaxLine] = null,
    title: String = null
  ): ShippingLine = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (code != null) __obj.updateDynamic("code")(code)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (tax_lines != null) __obj.updateDynamic("tax_lines")(tax_lines)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShippingLine]
  }
}

