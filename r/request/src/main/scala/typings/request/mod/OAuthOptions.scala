package typings.request.mod

import typings.request.requestBooleans.`true`
import typings.request.requestStrings.body
import typings.request.requestStrings.header
import typings.request.requestStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthOptions extends js.Object {
  var body_hash: js.UndefOr[`true` | String] = js.native
  var callback: js.UndefOr[String] = js.native
  var consumer_key: js.UndefOr[String] = js.native
  var consumer_secret: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var token_secret: js.UndefOr[String] = js.native
  var transport_method: js.UndefOr[body | header | query] = js.native
  var verifier: js.UndefOr[String] = js.native
}

object OAuthOptions {
  @scala.inline
  def apply(): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthOptions]
  }
  @scala.inline
  implicit class OAuthOptionsOps[Self <: OAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody_hash(value: `true` | String): Self = this.set("body_hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody_hash: Self = this.set("body_hash", js.undefined)
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setConsumer_key(value: String): Self = this.set("consumer_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumer_key: Self = this.set("consumer_key", js.undefined)
    @scala.inline
    def setConsumer_secret(value: String): Self = this.set("consumer_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumer_secret: Self = this.set("consumer_secret", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setToken_secret(value: String): Self = this.set("token_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_secret: Self = this.set("token_secret", js.undefined)
    @scala.inline
    def setTransport_method(value: body | header | query): Self = this.set("transport_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport_method: Self = this.set("transport_method", js.undefined)
    @scala.inline
    def setVerifier(value: String): Self = this.set("verifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifier: Self = this.set("verifier", js.undefined)
  }
  
}

