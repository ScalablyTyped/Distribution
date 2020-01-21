package typings.request.mod

import typings.request.requestBooleans.`true`
import typings.request.requestStrings.body
import typings.request.requestStrings.header
import typings.request.requestStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthOptions extends js.Object {
  var body_hash: js.UndefOr[`true` | String] = js.undefined
  var callback: js.UndefOr[String] = js.undefined
  var consumer_key: js.UndefOr[String] = js.undefined
  var consumer_secret: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var token_secret: js.UndefOr[String] = js.undefined
  var transport_method: js.UndefOr[body | header | query] = js.undefined
  var verifier: js.UndefOr[String] = js.undefined
}

object OAuthOptions {
  @scala.inline
  def apply(
    body_hash: `true` | String = null,
    callback: String = null,
    consumer_key: String = null,
    consumer_secret: String = null,
    token: String = null,
    token_secret: String = null,
    transport_method: body | header | query = null,
    verifier: String = null
  ): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (body_hash != null) __obj.updateDynamic("body_hash")(body_hash.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (consumer_key != null) __obj.updateDynamic("consumer_key")(consumer_key.asInstanceOf[js.Any])
    if (consumer_secret != null) __obj.updateDynamic("consumer_secret")(consumer_secret.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (token_secret != null) __obj.updateDynamic("token_secret")(token_secret.asInstanceOf[js.Any])
    if (transport_method != null) __obj.updateDynamic("transport_method")(transport_method.asInstanceOf[js.Any])
    if (verifier != null) __obj.updateDynamic("verifier")(verifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthOptions]
  }
}

