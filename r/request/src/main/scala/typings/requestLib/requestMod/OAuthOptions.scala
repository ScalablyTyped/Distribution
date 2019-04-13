package typings
package requestLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthOptions extends js.Object {
  var body_hash: js.UndefOr[requestLib.requestLibNumbers.`true` | java.lang.String] = js.undefined
  var callback: js.UndefOr[java.lang.String] = js.undefined
  var consumer_key: js.UndefOr[java.lang.String] = js.undefined
  var consumer_secret: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var token_secret: js.UndefOr[java.lang.String] = js.undefined
  var transport_method: js.UndefOr[
    requestLib.requestLibStrings.body | requestLib.requestLibStrings.header | requestLib.requestLibStrings.query
  ] = js.undefined
  var verifier: js.UndefOr[java.lang.String] = js.undefined
}

object OAuthOptions {
  @scala.inline
  def apply(
    body_hash: requestLib.requestLibNumbers.`true` | java.lang.String = null,
    callback: java.lang.String = null,
    consumer_key: java.lang.String = null,
    consumer_secret: java.lang.String = null,
    token: java.lang.String = null,
    token_secret: java.lang.String = null,
    transport_method: requestLib.requestLibStrings.body | requestLib.requestLibStrings.header | requestLib.requestLibStrings.query = null,
    verifier: java.lang.String = null
  ): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (body_hash != null) __obj.updateDynamic("body_hash")(body_hash.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (consumer_key != null) __obj.updateDynamic("consumer_key")(consumer_key)
    if (consumer_secret != null) __obj.updateDynamic("consumer_secret")(consumer_secret)
    if (token != null) __obj.updateDynamic("token")(token)
    if (token_secret != null) __obj.updateDynamic("token_secret")(token_secret)
    if (transport_method != null) __obj.updateDynamic("transport_method")(transport_method.asInstanceOf[js.Any])
    if (verifier != null) __obj.updateDynamic("verifier")(verifier)
    __obj.asInstanceOf[OAuthOptions]
  }
}

