package typings.shopifyDashPrime.distModelsDraftUnderscoreLineUnderscoreItemMod

import typings.shopifyDashPrime.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount
import typings.shopifyDashPrime.distModelsLineUnderscoreItemMod.LineItem
import typings.shopifyDashPrime.distModelsLineUnderscoreItemUnderscorePropertyMod.LineItemProperty
import typings.shopifyDashPrime.distModelsTaxUnderscoreLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftLineItem extends LineItem {
  /**
    * Discount which will be applied to the line item or the overall order.
    */
  var applied_discount: AppliedDiscount
  /**
    * Indicates if this is a product variant line item, or a custom line item. If set to true indicates a custom line item. If set to false indicates a product variant line item. This is a read only field.
    */
  var custom: js.UndefOr[Boolean] = js.undefined
}

object DraftLineItem {
  @scala.inline
  def apply(
    applied_discount: AppliedDiscount,
    admin_graphql_api_id: String = null,
    custom: js.UndefOr[Boolean] = js.undefined,
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
  ): DraftLineItem = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount)
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

