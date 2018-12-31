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

