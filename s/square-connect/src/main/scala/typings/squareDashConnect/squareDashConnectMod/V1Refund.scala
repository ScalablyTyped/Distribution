package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Refund")
@js.native
class V1Refund () extends js.Object {
  /**
    * The time when the merchant initiated the refund for Square to process, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Indicates whether or not the refund is associated with an exchange. If is_exchange is true, the refund reflects
    * the value of goods returned in the exchange not the total money refunded.
    */
  var is_exchange: js.UndefOr[Boolean] = js.native
  var merchant_id: js.UndefOr[String] = js.native
  /**
    * A Square-issued ID associated with the refund. For single-tender refunds, payment_id is the ID of the original
    * payment ID. For split-tender refunds, payment_id is the ID of the original tender. For exchange-based refunds
    * (is_exchange == true), payment_id is the ID of the original payment ID even if the payment includes other tenders.
    */
  var payment_id: js.UndefOr[String] = js.native
  /**
    * The time when Square processed the refund on behalf of the merchant, in ISO 8601 format.
    */
  var processed_at: js.UndefOr[String] = js.native
  /**
    * The merchant-specified reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * All of the additive taxes associated with the refund.
    */
  var refunded_additive_tax: js.UndefOr[js.Array[V1PaymentTax]] = js.native
  /**
    * The amount of additive tax money refunded. This amount is always negative.
    */
  var refunded_additive_tax_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of discount money refunded. This amount is always positive.
    */
  var refunded_discount_money: js.UndefOr[V1Money] = js.native
  /**
    * All of the inclusive taxes associated with the refund.
    */
  var refunded_inclusive_tax: js.UndefOr[js.Array[V1PaymentTax]] = js.native
  /**
    * The amount of inclusive tax money refunded. This amount is always negative.
    */
  var refunded_inclusive_tax_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of money refunded. This amount is always negative.
    */
  var refunded_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of processing fee money refunded. This amount is always positive.
    */
  var refunded_processing_fee_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of surcharge money refunded. This amount is always negative.
    */
  var refunded_surcharge_money: js.UndefOr[V1Money] = js.native
  /**
    * A list of all surcharges associated with the refund.
    */
  var refunded_surcharges: js.UndefOr[js.Array[V1PaymentSurcharge]] = js.native
  /**
    * The total amount of tax money refunded. This amount is always negative.
    */
  var refunded_tax_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of tip money refunded. This amount is always negative.
    */
  var refunded_tip_money: js.UndefOr[V1Money] = js.native
  /**
    * The type of refund. See [V1RefundType](#type-v1refundtype) for possible values.
    */
  var `type`: js.UndefOr[String] = js.native
}

