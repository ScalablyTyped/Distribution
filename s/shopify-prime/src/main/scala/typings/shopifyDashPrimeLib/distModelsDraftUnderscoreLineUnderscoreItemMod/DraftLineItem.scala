package typings
package shopifyDashPrimeLib.distModelsDraftUnderscoreLineUnderscoreItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftLineItem
  extends shopifyDashPrimeLib.distModelsLineUnderscoreItemMod.LineItem {
  /**
    * Discount which will be applied to the line item or the overall order.
    */
  var applied_discount: shopifyDashPrimeLib.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount
  /**
    * Indicates if this is a product variant line item, or a custom line item. If set to true indicates a custom line item. If set to false indicates a product variant line item. This is a read only field.
    */
  var custom: js.UndefOr[scala.Boolean] = js.undefined
}

object DraftLineItem {
  @scala.inline
  def apply(
    applied_discount: shopifyDashPrimeLib.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount,
    admin_graphql_api_id: java.lang.String = null,
    custom: js.UndefOr[scala.Boolean] = js.undefined,
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
  ): DraftLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applied_discount")(applied_discount)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
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
    __obj.asInstanceOf[DraftLineItem]
  }
}

