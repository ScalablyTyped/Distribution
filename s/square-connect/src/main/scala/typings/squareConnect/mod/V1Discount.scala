package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Discount")
@js.native
class V1Discount () extends js.Object {
  /**
    * The amount of the discount. This amount is 0 if discount_type is VARIABLE_AMOUNT.
    * This field is not included for rate-based discounts.
    */
  var amount_money: js.UndefOr[V1Money] = js.native
  /**
    * The color of the discount's display label in Square Register, if not the default color.
    * The default color is "9da2a6". See [V1DiscountColor](#type-v1discountcolor) for possible values.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Indicates whether the discount is a FIXED value or entered at the time of sale.
    * See [V1DiscountDiscountType](#type-v1discountdiscounttype) for possible values.
    */
  var discount_type: js.UndefOr[String] = js.native
  /**
    * The discount's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The discount's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment.
    */
  var pin_required: js.UndefOr[Boolean] = js.native
  /**
    * The rate of the discount, as a string representation of a decimal number.
    * A value of 0.07 corresponds to a rate of 7%. This rate is 0 if discount_type is VARIABLE_PERCENTAGE.
    */
  var rate: js.UndefOr[String] = js.native
  /**
    * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID.
    */
  var v2_id: js.UndefOr[String] = js.native
}

