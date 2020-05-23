package typings.recurlyRecurlyJs.configureMod

import typings.recurlyRecurlyJs.anon.Braintree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurlyOptions extends js.Object {
  var cors: js.UndefOr[Boolean] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var fraud: js.UndefOr[Braintree] = js.undefined
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
    fraud: Braintree = null,
    required: js.Array[String] = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): RecurlyOptions = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (fraud != null) __obj.updateDynamic("fraud")(fraud.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurlyOptions]
  }
}

