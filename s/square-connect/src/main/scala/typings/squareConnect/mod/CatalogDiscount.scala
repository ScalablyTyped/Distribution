package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogDiscount")
@js.native
class CatalogDiscount () extends StObject {
  
  /**
    * The amount of the discount. Specify an amount of `0` if `discount_type` is `VARIABLE_AMOUNT`.
    * Do not use this field for percentage-based or variable discounts.
    */
  var amount_money: js.UndefOr[Money] = js.native
  
  /**
    * Indicates whether the discount is a fixed amount or percentage, or entered at the time of sale.
    * See [CatalogDiscountType](#type-catalogdiscounttype) for possible values.
    */
  var discount_type: js.UndefOr[DiscountType] = js.native
  
  /**
    * The color of the discount display label in the Square Point of Sale app. This must be a valid hex color code.
    */
  var label_color: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this discount should reduce the price used to calculate tax.
    * Most discounts should use `MODIFY_TAX_BASIS`. However, in some circumstances taxes must be calculated based on
    * an item's price, ignoring a particular discount. For example, in many US jurisdictions, a manufacturer coupon or
    * instant rebate reduces the price a customer pays but does not reduce the sale price used to calculate how much
    * sales tax is due. In this case, the discount representing that manufacturer coupon should have
    * `DO_NOT_MODIFY_TAX_BASIS` for this field. If you are unsure whether you need to use this field, consult your
    * tax professional. See [CatalogDiscountModifyTaxBasis](#type-catalogdiscountmodifytaxbasis) for possible values.
    */
  var modify_tax_basis: js.UndefOr[String] = js.native
  
  /**
    * The discount name. This is a searchable attribute for use in applicable query filters, and its value length is of Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The percentage of the discount as a string representation of a decimal number, using a `.` as the decimal separator and without a `%` sign.
    * A value of `7.5` corresponds to `7.5%`. Specify a percentage of `0` if `discount_type` is `VARIABLE_PERCENTAGE`.
    * Do not use this field for amount-based or variable discounts.
    */
  var percentage: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment in the Square
    * Point of Sale app.
    */
  var pin_required: js.UndefOr[Boolean] = js.native
}
