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
  var token: token
  def errorHook(error: stdLib.Error): scala.Unit
}

