package typings.recurlyRecurlyJs.configureMod

import typings.recurlyRecurlyJs.AnonBraintree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurlyOptions extends js.Object {
  var cors: js.UndefOr[Boolean] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var fraud: js.UndefOr[AnonBraintree] = js.undefined
  var publicKey: String
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RecurlyOptions {
  @scala.inline
  def apply(
    publicKey: String,
    cors: js.UndefOr[Boolean] = js.undefined,
    currency: String = null,
    fraud: AnonBraintree = null,
    required: js.Array[String] = null,
    timeout: Int | Double = null
  ): RecurlyOptions = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (fraud != null) __obj.updateDynamic("fraud")(fraud.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurlyOptions]
  }
}

