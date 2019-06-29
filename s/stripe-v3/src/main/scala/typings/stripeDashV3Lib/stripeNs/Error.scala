package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /**
    * For card errors, the ID of the failed charge.
    */
  var charge: java.lang.String
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported.
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for
    * the decline if they provide one.
    */
  var decline_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL to more information about the error code reported.
    */
  var doc_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-readable message providing more details about the
    * error. For card errors, these messages can be shown to
    * your users.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the error is parameter-specific, the parameter related
    * to the error. For example, you can use this to display a
    * message near the correct form field.
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The PaymentIntent object for errors returned on a request
    * involving a PaymentIntent.
    */
  var payment_intent: js.UndefOr[stripeDashV3Lib.stripeNs.paymentIntentsNs.PaymentIntent] = js.undefined
  /**
    * The PaymentMethod object for errors returned on a
    * request involving a PaymentMethod.
    */
  var payment_method: js.UndefOr[stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethod] = js.undefined
  /**
    * The source object for errors returned on a request involving
    * a source.
    */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * The type of error returned.
    */
  var `type`: ErrorType
}

object Error {
  @scala.inline
  def apply(
    charge: java.lang.String,
    `type`: ErrorType,
    code: java.lang.String = null,
    decline_code: java.lang.String = null,
    doc_url: java.lang.String = null,
    message: java.lang.String = null,
    param: java.lang.String = null,
    payment_intent: stripeDashV3Lib.stripeNs.paymentIntentsNs.PaymentIntent = null,
    payment_method: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethod = null,
    source: Source = null
  ): Error = {
    val __obj = js.Dynamic.literal(charge = charge)
    __obj.updateDynamic("type")(`type`)
    if (code != null) __obj.updateDynamic("code")(code)
    if (decline_code != null) __obj.updateDynamic("decline_code")(decline_code)
    if (doc_url != null) __obj.updateDynamic("doc_url")(doc_url)
    if (message != null) __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Error]
  }
}

