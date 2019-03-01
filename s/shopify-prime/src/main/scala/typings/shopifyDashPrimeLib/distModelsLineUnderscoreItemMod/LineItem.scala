package typings
package shopifyDashPrimeLib.distModelsLineUnderscoreItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItem
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  var fulfillable_quantity: js.UndefOr[scala.Double] = js.undefined
  var fulfillment_service: js.UndefOr[java.lang.String] = js.undefined
  var fulfillment_status: js.UndefOr[java.lang.String] = js.undefined
  var gift_card: js.UndefOr[scala.Boolean] = js.undefined
  var grams: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[scala.Double] = js.undefined
  var product_id: js.UndefOr[scala.Double] = js.undefined
  var properties: js.UndefOr[
    js.Array[
      shopifyDashPrimeLib.distModelsLineUnderscoreItemUnderscorePropertyMod.LineItemProperty
    ]
  ] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var requires_shipping: js.UndefOr[scala.Boolean] = js.undefined
  var sku: js.UndefOr[java.lang.String] = js.undefined
  var tax_lines: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine]] = js.undefined
  var taxable: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var total_discount: js.UndefOr[scala.Double] = js.undefined
  var variant_id: js.UndefOr[scala.Double] = js.undefined
  var variant_title: js.UndefOr[java.lang.String] = js.undefined
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

object LineItem {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    fulfillable_quantity: scala.Int | scala.Double = null,
    fulfillment_service: java.lang.String = null,
    fulfillment_status: java.lang.String = null,
    gift_card: js.UndefOr[scala.Boolean] = js.undefined,
    grams: scala.Int | scala.Double = null,
    id: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    price: scala.Int | scala.Double = null,
    product_id: scala.Int | scala.Double = null,
    properties: js.Array[
      shopifyDashPrimeLib.distModelsLineUnderscoreItemUnderscorePropertyMod.LineItemProperty
    ] = null,
    quantity: scala.Int | scala.Double = null,
    requires_shipping: js.UndefOr[scala.Boolean] = js.undefined,
    sku: java.lang.String = null,
    tax_lines: js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine] = null,
    taxable: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    total_discount: scala.Int | scala.Double = null,
    variant_id: scala.Int | scala.Double = null,
    variant_title: java.lang.String = null,
    vendor: java.lang.String = null
  ): LineItem = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (fulfillable_quantity != null) __obj.updateDynamic("fulfillable_quantity")(fulfillable_quantity.asInstanceOf[js.Any])
    if (fulfillment_service != null) __obj.updateDynamic("fulfillment_service")(fulfillment_service)
    if (fulfillment_status != null) __obj.updateDynamic("fulfillment_status")(fulfillment_status)
    if (!js.isUndefined(gift_card)) __obj.updateDynamic("gift_card")(gift_card)
    if (grams != null) __obj.updateDynamic("grams")(grams.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (!js.isUndefined(requires_shipping)) __obj.updateDynamic("requires_shipping")(requires_shipping)
    if (sku != null) __obj.updateDynamic("sku")(sku)
    if (tax_lines != null) __obj.updateDynamic("tax_lines")(tax_lines)
    if (!js.isUndefined(taxable)) __obj.updateDynamic("taxable")(taxable)
    if (title != null) __obj.updateDynamic("title")(title)
    if (total_discount != null) __obj.updateDynamic("total_discount")(total_discount.asInstanceOf[js.Any])
    if (variant_id != null) __obj.updateDynamic("variant_id")(variant_id.asInstanceOf[js.Any])
    if (variant_title != null) __obj.updateDynamic("variant_title")(variant_title)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[LineItem]
  }
}

