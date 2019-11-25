package typings.shopifyDashPrime.distModelsLineUnderscoreItemMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.distModelsLineUnderscoreItemUnderscorePropertyMod.LineItemProperty
import typings.shopifyDashPrime.distModelsTaxUnderscoreLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItem extends ShopifyObject {
  var fulfillable_quantity: js.UndefOr[Double] = js.undefined
  var fulfillment_service: js.UndefOr[String] = js.undefined
  var fulfillment_status: js.UndefOr[String] = js.undefined
  var gift_card: js.UndefOr[Boolean] = js.undefined
  var grams: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Double] = js.undefined
  var product_id: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[js.Array[LineItemProperty]] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var requires_shipping: js.UndefOr[Boolean] = js.undefined
  var sku: js.UndefOr[String] = js.undefined
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.undefined
  var taxable: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var total_discount: js.UndefOr[Double] = js.undefined
  var variant_id: js.UndefOr[Double] = js.undefined
  var variant_title: js.UndefOr[String] = js.undefined
  var vendor: js.UndefOr[String] = js.undefined
}

object LineItem {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    fulfillable_quantity: Int | Double = null,
    fulfillment_service: String = null,
    fulfillment_status: String = null,
    gift_card: js.UndefOr[Boolean] = js.undefined,
    grams: Int | Double = null,
    id: Int | Double = null,
    name: String = null,
    price: Int | Double = null,
    product_id: Int | Double = null,
    properties: js.Array[LineItemProperty] = null,
    quantity: Int | Double = null,
    requires_shipping: js.UndefOr[Boolean] = js.undefined,
    sku: String = null,
    tax_lines: js.Array[TaxLine] = null,
    taxable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    total_discount: Int | Double = null,
    variant_id: Int | Double = null,
    variant_title: String = null,
    vendor: String = null
  ): LineItem = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (fulfillable_quantity != null) __obj.updateDynamic("fulfillable_quantity")(fulfillable_quantity.asInstanceOf[js.Any])
    if (fulfillment_service != null) __obj.updateDynamic("fulfillment_service")(fulfillment_service.asInstanceOf[js.Any])
    if (fulfillment_status != null) __obj.updateDynamic("fulfillment_status")(fulfillment_status.asInstanceOf[js.Any])
    if (!js.isUndefined(gift_card)) __obj.updateDynamic("gift_card")(gift_card.asInstanceOf[js.Any])
    if (grams != null) __obj.updateDynamic("grams")(grams.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (!js.isUndefined(requires_shipping)) __obj.updateDynamic("requires_shipping")(requires_shipping.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (tax_lines != null) __obj.updateDynamic("tax_lines")(tax_lines.asInstanceOf[js.Any])
    if (!js.isUndefined(taxable)) __obj.updateDynamic("taxable")(taxable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (total_discount != null) __obj.updateDynamic("total_discount")(total_discount.asInstanceOf[js.Any])
    if (variant_id != null) __obj.updateDynamic("variant_id")(variant_id.asInstanceOf[js.Any])
    if (variant_title != null) __obj.updateDynamic("variant_title")(variant_title.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
}

