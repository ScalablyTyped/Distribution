package typings
package sixDashRuntimeLib.SixNs.pluginsNs.uacNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uacConf extends js.Object {
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var enableMock: scala.Boolean
  var skipOffline: scala.Boolean
  var whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  def failHook(err: stdLib.Error, ctx: js.Object, next: sixDashRuntimeLib.SixNs.next): js.Any
  def getPath(ctx: js.Object): java.lang.String
}

object uacConf {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    enableMock: scala.Boolean,
    failHook: (stdLib.Error, js.Object, sixDashRuntimeLib.SixNs.next) => js.Any,
    getPath: js.Object => java.lang.String,
    skipOffline: scala.Boolean,
    whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  ): uacConf = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, enableMock = enableMock, failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[uacConf]
  }
}

