package typings.sixRuntime.Six.plugins.sso

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ssoClientConf extends js.Object {
  var callbackUrl: String = js.native
  var clientId: String = js.native
  var env: String = js.native
  var protocol: String = js.native
  var secret: String = js.native
  var token: typings.sixRuntime.Six.plugins.sso.token = js.native
  def errorHook(error: Error): Unit = js.native
}

object ssoClientConf {
  @scala.inline
  def apply(
    callbackUrl: String,
    clientId: String,
    env: String,
    errorHook: Error => Unit,
    protocol: String,
    secret: String,
    token: token
  ): ssoClientConf = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], errorHook = js.Any.fromFunction1(errorHook), protocol = protocol.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ssoClientConf]
  }
  @scala.inline
  implicit class ssoClientConfOps[Self <: ssoClientConf] (val x: Self) extends AnyVal {
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
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorHook(value: Error => Unit): Self = this.set("errorHook", js.Any.fromFunction1(value))
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: token): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

