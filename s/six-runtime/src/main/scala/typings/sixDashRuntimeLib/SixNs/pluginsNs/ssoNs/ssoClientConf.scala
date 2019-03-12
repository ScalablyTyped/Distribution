package typings
package sixDashRuntimeLib.SixNs.pluginsNs.ssoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoClientConf extends js.Object {
  var callbackUrl: java.lang.String
  var clientId: java.lang.String
  var env: java.lang.String
  var protocol: java.lang.String
  var secret: java.lang.String
  var token: sixDashRuntimeLib.SixNs.pluginsNs.ssoNs.token
  def errorHook(error: stdLib.Error): scala.Unit
}

object ssoClientConf {
  @scala.inline
  def apply(
    callbackUrl: java.lang.String,
    clientId: java.lang.String,
    env: java.lang.String,
    errorHook: stdLib.Error => scala.Unit,
    protocol: java.lang.String,
    secret: java.lang.String,
    token: token
  ): ssoClientConf = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl, clientId = clientId, env = env, errorHook = js.Any.fromFunction1(errorHook), protocol = protocol, secret = secret, token = token)
  
    __obj.asInstanceOf[ssoClientConf]
  }
}

