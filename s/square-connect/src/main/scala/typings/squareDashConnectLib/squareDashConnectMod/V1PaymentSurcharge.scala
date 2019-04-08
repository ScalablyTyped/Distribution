package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentSurcharge")
@js.native
class V1PaymentSurcharge () extends js.Object {
  /**
    * The amount of the surcharge as a Money object. Exactly one of rate or amount_money should be set.
    */
  var amount_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of money applied to the order as a result of the surcharge.
    */
  var applied_money: js.UndefOr[V1Money] = js.native
  /**
    * The name of the surcharge.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The amount of the surcharge as a percentage. The percentage is provided as a string representing the decimal
    * equivalent of the percentage. For example, \"0.7\" corresponds to a 7% surcharge. Exactly one of rate or
    * amount_money should be set.
    */
  var rate: js.UndefOr[java.lang.String] = js.native
  /**
    * A Square-issued unique identifier associated with the surcharge.
    */
  var surcharge_id: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates whether the surcharge is taxable.
    */
  var taxable: js.UndefOr[scala.Boolean] = js.native
  /**
    * The list of taxes that should be applied to the surcharge.
    */
  var taxes: js.UndefOr[js.Array[V1PaymentTax]] = js.native
  /**
    * Indicates the source of the surcharge. For example, if it was applied as an automatic gratuity for a large group.
    * See [V1PaymentSurchargeType](#type-v1paymentsurchargetype) for possible values
    */
  var `type`: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum] = js.native
}

