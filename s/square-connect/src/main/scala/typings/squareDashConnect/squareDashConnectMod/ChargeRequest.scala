package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ChargeRequest")
@js.native
class ChargeRequest () extends js.Object {
  /**
    * The basic primitive of multi-party transaction. The value is optional. The transaction facilitated by you can be
    * split from here.  If you provide this value, the `amount_money` value in your additional_recipients must not be
    * more than 90% of the `amount_money` value in the charge request. The `location_id` must be the valid location of
    * the app owner merchant.  This field requires the `PAYMENTS_WRITE_ADDITIONAL_RECIPIENTS` OAuth permission.  This
    * field is currently not supported in sandbox.
    */
  var additional_recipients: js.UndefOr[js.Array[AdditionalRecipient]] = js.native
  /**
    * The amount of money to charge. Note that you specify the amount in the __smallest denomination of the applicable
    * currency__. For example, US dollar amounts are specified in cents.
    * See [Working with monetary amounts] (#workingwithmonetaryamounts) for details.
    * The value of `currency` must match the currency associated with the business that is charging the card.
    */
  var amount_money: Money = js.native
  /**
    * The buyer's billing address.
    */
  var billing_address: js.UndefOr[Address] = js.native
  /**
    * The buyer's email address, if available.
    */
  var buyer_email_address: js.UndefOr[String] = js.native
  /**
    * A nonce generated from the `SqPaymentForm` that represents the card to charge. The application that provides a
    * nonce to this endpoint must be the _same application_ that generated the nonce with the `SqPaymentForm`.
    * Otherwise, the nonce is invalid. Do not provide a value for this field if you provide a value for `customer_card_id`.
    */
  var card_nonce: js.UndefOr[String] = js.native
  /**
    * The ID of the customer card on file to charge. Do not provide a value for this field if you provide a value for `card_nonce`.
    * If you provide this value, you _must_ also provide a value for `customer_id`.
    */
  var customer_card_id: js.UndefOr[String] = js.native
  /**
    * The ID of the customer to associate this transaction with.
    * This field is required if you provide a value for `customer_card_id`, and optional otherwise.
    */
  var customer_id: js.UndefOr[String] = js.native
  /**
    * If `true`, the request will only perform an Auth on the provided card. You can then later perform either a
    * Capture (with the [CaptureTransaction](#endpoint-capturetransaction) endpoint) or a Void (with the
    * [VoidTransaction](#endpoint-voidtransaction) endpoint). Default value: `false`.
    */
  var delay_capture: js.UndefOr[Boolean] = js.native
  /**
    * A value you specify that uniquely identifies this transaction among transactions you've created.
    * If you're unsure whether a particular transaction succeeded, you can reattempt it with the same idempotency key
    * without worrying about double-charging the buyer. See [Idempotency](/basics/api101/idempotency) for more information.
    */
  var idempotency_key: String = js.native
  /**
    * An optional note to associate with the transaction. This value cannot exceed 60 characters.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The ID of the order to associate with this transaction. If you provide this value, the `amount_money` value of
    * your request must __exactly match__ the value of the order's `total_money` field.
    */
  var order_id: js.UndefOr[String] = js.native
  /**
    * An optional ID you can associate with the transaction for your own purposes (such as to associate the transaction
    * with an entity ID in your own database). This value cannot exceed 40 characters.
    */
  var reference_id: js.UndefOr[String] = js.native
  /**
    * The buyer's shipping address, if available.
    */
  var shipping_address: js.UndefOr[Address] = js.native
}

