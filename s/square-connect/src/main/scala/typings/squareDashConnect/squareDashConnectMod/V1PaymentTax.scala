package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentTax")
@js.native
class V1PaymentTax () extends js.Object {
  /**
    * The amount of money that this tax adds to the payment.
    */
  var applied_money: js.UndefOr[V1Money] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The ID of the tax, if available. Taxes applied in older versions of Square Register might not have an ID.
    */
  var fee_id: js.UndefOr[String] = js.native
  /**
    * Whether the tax is an ADDITIVE tax or an INCLUSIVE tax.
    * See [V1PaymentTaxInclusionType](#type-v1paymenttaxinclusiontype) for possible values.
    */
  var inclusion_type: js.UndefOr[String] = js.native
  /**
    * The merchant-defined name of the tax.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The rate of the tax, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%.
    */
  var rate: js.UndefOr[String] = js.native
}

