package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderReturnDiscount")
@js.native
class OrderReturnDiscount () extends js.Object {
  /**
    * The total monetary amount of the applicable discount. If it is at order level, it is the value of the order level discount.
    * If it is at line item level, it is the value of the line item level discount.
    * The amount_money won't be set for a percentage-based discount.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * The amount of discount actually applied to this line item. When an amount-based discount is at order-level,
    * this value is different from `amount_money` because the discount is distributed across the line items.
    */
  var applied_money: js.UndefOr[Money] = js.native
  /**
    * The catalog object id referencing [CatalogDiscount](#type-catalogdiscount).
    */
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The discount's name.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The percentage of the tax, as a string representation of a decimal number.
    * A value of `7.25` corresponds to a percentage of 7.25%.
    * The percentage won't be set for an amount-based discount.
    */
  var percentage: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates the level at which the discount applies. This field is set by the server.
    * If set in a CreateOrder request, it will be ignored on write.
    * See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values.
    */
  var scope: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum] = js.native
  /**
    * `uid` of the Discount from the Order which contains the original application of this discount.
    */
  var source_discount_uid: js.UndefOr[java.lang.String] = js.native
  /**
    * The type of the discount. If it is created by API, it would be either `FIXED_PERCENTAGE` or `FIXED_AMOUNT`.
    * VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage
    * or amount has to be specified. See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values.
    */
  var `type`: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum] = js.native
  /**
    * The return discount's Unique identifier, unique only within this order.
    */
  var uid: js.UndefOr[java.lang.String] = js.native
}

