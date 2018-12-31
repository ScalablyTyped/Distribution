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

