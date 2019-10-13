package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItemDiscount")
@js.native
class OrderLineItemDiscount () extends js.Object {
  /**
    * The total declared monetary amount of the discount. `amount_money` is not set for percentage-based discounts.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * The amount of discount actually applied to the line item. Represents the amount of money applied as a line
    * item-scoped discount. When an amount-based discount is scoped to the entire order, the value of `applied_money`
    * is different from `amount_money` because the total amount of the discount is distributed across all line items.
    */
  var applied_money: js.UndefOr[Money] = js.native
  /**
    * The catalog object id referencing [CatalogDiscount](#type-catalogdiscount).
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * The discount's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The percentage of the discount, as a string representation of a decimal number.
    * A value of `7.25` corresponds to a percentage of 7.25%. The percentage won't be set for an amount-based discount.
    */
  var percentage: js.UndefOr[String] = js.native
  /**
    * Indicates the level at which the discount applies. For `ORDER` scoped discounts, Square generates references
    * in `applied_discounts` on all order line items that do not have them. For `LINE_ITEM` scoped discounts,
    * the discount only applies to line items with a discount reference in their `applied_discounts` field.
    * This field is immutable. To change the scope of a discount you must delete the discount and re-add it as a new discount.
    * See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values.
    */
  var scope: js.UndefOr[DiscountApplicationScopeType] = js.native
  /**
    * The type of the discount. If it is created by API, it would be either `FIXED_PERCENTAGE` or `FIXED_AMOUNT`.
    * VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has
    * to be specified. See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values.
    */
  var `type`: js.UndefOr[DiscountType] = js.native
  /**
    * Unique ID that identifies the discount only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}

