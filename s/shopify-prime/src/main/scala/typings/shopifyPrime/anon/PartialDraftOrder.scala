package typings.shopifyPrime.anon

import typings.shopifyPrime.addressMod.Address
import typings.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typings.shopifyPrime.customerMod.Customer
import typings.shopifyPrime.draftLineItemMod.DraftLineItem
import typings.shopifyPrime.metaFieldMod.MetaField
import typings.shopifyPrime.noteAttributeMod.NoteAttribute
import typings.shopifyPrime.shippingLineMod.ShippingLine
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<shopify-prime.shopify-prime/dist/models.DraftOrder> */
trait PartialDraftOrder extends js.Object {
  var admin_graphql_api_id: js.UndefOr[String] = js.undefined
  var applied_discount: js.UndefOr[AppliedDiscount] = js.undefined
  var billing_address: js.UndefOr[Address] = js.undefined
  var completed_at: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var customer: js.UndefOr[Customer] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var invoice_sent_at: js.UndefOr[String] = js.undefined
  var invoice_url: js.UndefOr[String] = js.undefined
  var line_items: js.UndefOr[js.Array[DraftLineItem]] = js.undefined
  var metafields: js.UndefOr[js.Array[MetaField]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[String] = js.undefined
  var note_attributes: js.UndefOr[js.Array[NoteAttribute]] = js.undefined
  var order_id: js.UndefOr[Double] = js.undefined
  var shipping_address: js.UndefOr[Address] = js.undefined
  var shipping_line: js.UndefOr[ShippingLine] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var subtotal_price: js.UndefOr[Double] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
  var tax_exempt: js.UndefOr[Boolean] = js.undefined
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.undefined
  var taxes_included: js.UndefOr[Boolean] = js.undefined
  var total_price: js.UndefOr[Double] = js.undefined
  var total_tax: js.UndefOr[Double] = js.undefined
  var updated_at: js.UndefOr[String] = js.undefined
}

object PartialDraftOrder {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    applied_discount: AppliedDiscount = null,
    billing_address: Address = null,
    completed_at: String = null,
    created_at: String = null,
    currency: String = null,
    customer: Customer = null,
    email: String = null,
    id: js.UndefOr[Double] = js.undefined,
    invoice_sent_at: String = null,
    invoice_url: String = null,
    line_items: js.Array[DraftLineItem] = null,
    metafields: js.Array[MetaField] = null,
    name: String = null,
    note: String = null,
    note_attributes: js.Array[NoteAttribute] = null,
    order_id: js.UndefOr[Double] = js.undefined,
    shipping_address: Address = null,
    shipping_line: ShippingLine = null,
    status: String = null,
    subtotal_price: js.UndefOr[Double] = js.undefined,
    tags: String = null,
    tax_exempt: js.UndefOr[Boolean] = js.undefined,
    tax_lines: js.Array[TaxLine] = null,
    taxes_included: js.UndefOr[Boolean] = js.undefined,
    total_price: js.UndefOr[Double] = js.undefined,
    total_tax: js.UndefOr[Double] = js.undefined,
    updated_at: String = null
  ): PartialDraftOrder = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (applied_discount != null) __obj.updateDynamic("applied_discount")(applied_discount.asInstanceOf[js.Any])
    if (billing_address != null) __obj.updateDynamic("billing_address")(billing_address.asInstanceOf[js.Any])
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (invoice_sent_at != null) __obj.updateDynamic("invoice_sent_at")(invoice_sent_at.asInstanceOf[js.Any])
    if (invoice_url != null) __obj.updateDynamic("invoice_url")(invoice_url.asInstanceOf[js.Any])
    if (line_items != null) __obj.updateDynamic("line_items")(line_items.asInstanceOf[js.Any])
    if (metafields != null) __obj.updateDynamic("metafields")(metafields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (note_attributes != null) __obj.updateDynamic("note_attributes")(note_attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(order_id)) __obj.updateDynamic("order_id")(order_id.get.asInstanceOf[js.Any])
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address.asInstanceOf[js.Any])
    if (shipping_line != null) __obj.updateDynamic("shipping_line")(shipping_line.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(subtotal_price)) __obj.updateDynamic("subtotal_price")(subtotal_price.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(tax_exempt)) __obj.updateDynamic("tax_exempt")(tax_exempt.get.asInstanceOf[js.Any])
    if (tax_lines != null) __obj.updateDynamic("tax_lines")(tax_lines.asInstanceOf[js.Any])
    if (!js.isUndefined(taxes_included)) __obj.updateDynamic("taxes_included")(taxes_included.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_price)) __obj.updateDynamic("total_price")(total_price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_tax)) __obj.updateDynamic("total_tax")(total_tax.get.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDraftOrder]
  }
}

