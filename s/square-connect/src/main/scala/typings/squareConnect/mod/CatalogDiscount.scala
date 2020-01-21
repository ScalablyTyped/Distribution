package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogDiscount")
@js.native
class CatalogDiscount () extends js.Object {
  /**
    * The amount of the discount. Specify an amount of `0` if `discount_type` is `VARIABLE_AMOUNT`.
    * Do not include this field for percentage-based or variable discounts.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * Indicates whether the discount is a fixed amount or percentage, or entered at the time of sale.
    * See [CatalogDiscountType](#type-catalogdiscounttype) for possible values.
    */
  var discount_type: js.UndefOr[DiscountType] = js.native
  /**
    * The color of the discount's display label in the Square Point of Sale app. This must be a valid hex color code.
    */
  var label_color: js.UndefOr[String] = js.native
  /**
    * The discount's name. Searchable. This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The percentage of the discount as a string representation of a decimal number, using a `.` as the decimal
    * separator and without a `%` sign. A value of `7.5` corresponds to `7.5%`. Specify a percentage of `0` if
    * `discount_type` is `VARIABLE_PERCENTAGE`. Do not include this field for amount-based or variable discounts.
    */
  var percentage: js.UndefOr[String] = js.native
  /**
    * Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment in the Square
    * Point of Sale app.
    */
  var pin_required: js.UndefOr[Boolean] = js.native
}

