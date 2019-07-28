package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateCheckoutRequest")
@js.native
class CreateCheckoutRequest () extends js.Object {
  /**
    * The basic primitive of multi-party transaction. The value is optional. The transaction facilitated by you can be
    * split from here. If you provide this value, the `amount_money` value in your additional_recipients must not be
    * more than 90% of the `total_money` calculated by Square for your order. The `location_id` must be the valid
    * location of the app owner merchant. This field requires `PAYMENTS_WRITE_ADDITIONAL_RECIPIENTS` OAuth permission.
    * This field is currently not supported in sandbox.
    */
  var additional_recipients: js.UndefOr[js.Array[ChargeRequestAdditionalRecipient]] = js.native
  /**
    * If `true`, Square Checkout will collect shipping information on your behalf and store that information with the
    * transaction information in your Square Dashboard.  Default: `false`.
    */
  var ask_for_shipping_address: js.UndefOr[Boolean] = js.native
  /**
    * A unique string that identifies this checkout among others you've created. It can be any valid string but must be
    * unique for every order sent to Square Checkout for a given location ID. The idempotency key is used to avoid
    * processing the same order more than once. If you're unsure whether a particular checkout was created
    * successfully, you can reattempt it with the same idempotency key and all the same other parameters without
    * worrying about creating duplicates. We recommend using a random number/string generator native to the language
    * you are working in to generate strings for your idempotency keys. See [Idempotency](/basics/api101/idempotency)
    * for more information.
    */
  var idempotency_key: String = js.native
  /**
    * The email address to display on the Square Checkout confirmation page and confirmation email that the buyer can
    * use to contact the merchant. If this value is not set, the confirmation page and email will display the primary
    * email address associated with the merchant's Square account. Default: none; only exists if explicitly set.
    */
  var merchant_support_email: js.UndefOr[String] = js.native
  /**
    * An optional note to associate with the checkout object. This value cannot exceed 60 characters.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The order including line items to be checked out.
    */
  var order: CreateOrderRequest = js.native
  /**
    * If provided, the buyer's email is pre-populated on the checkout page as an editable text field.  Default: none;
    * only exists if explicitly set.
    */
  var pre_populate_buyer_email: js.UndefOr[String] = js.native
  /**
    * If provided, the buyer's shipping info is pre-populated on the checkout page as editable text fields.  Default:
    * none; only exists if explicitly set.
    */
  var pre_populate_shipping_address: js.UndefOr[Address] = js.native
  /**
    * The URL to redirect to after checkout is completed with `checkoutId`, Square's `orderId`, `transactionId`, and
    * `referenceId` appended as URL parameters. For example, if the provided redirect_url is
    * `http://www.example.com/order-complete`, a successful transaction redirects the customer to:
    * `http://www.example.com/order-complete?checkoutId=xxxxxx&orderId=xxxxxx&referenceId=xxxxxx&transactionId=xxxxxx`
    * If you do not provide a redirect URL, Square Checkout will display an order confirmation page on your behalf;
    * however Square strongly recommends that you provide a redirect URL so you can verify the transaction results and
    * finalize the order through your existing/normal confirmation workflow.
    * Default: none; only exists if explicitly set.
    */
  var redirect_url: js.UndefOr[String] = js.native
}

