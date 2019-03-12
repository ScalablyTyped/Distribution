package typings
package sixDashRuntimeLib.SixNs.pluginsNs.upmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait upmConf extends js.Object {
  var clientId: java.lang.String
  var clientSecret: java.lang.String
  var domain: java.lang.String
  var enableMock: scala.Boolean
  var path: java.lang.String
  var skipOffline: scala.Boolean
  var whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  def failHook(err: stdLib.Error, ctx: js.Object, next: sixDashRuntimeLib.SixNs.next): js.Any
  def getPath(ctx: js.Object): java.lang.String
}

object upmConf {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    domain: java.lang.String,
    enableMock: scala.Boolean,
    failHook: (stdLib.Error, js.Object, sixDashRuntimeLib.SixNs.next) => js.Any,
    getPath: js.Object => java.lang.String,
    path: java.lang.String,
    skipOffline: scala.Boolean,
    whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  ): upmConf = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, domain = domain, enableMock = enableMock, failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path, skipOffline = skipOffline, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[upmConf]
  }
}

