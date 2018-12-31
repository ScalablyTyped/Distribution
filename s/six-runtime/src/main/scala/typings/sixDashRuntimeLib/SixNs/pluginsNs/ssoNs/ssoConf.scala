package typings
package sixDashRuntimeLib.SixNs.pluginsNs.ssoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoConf extends js.Object {
  var enableCache: scala.Boolean
  var hasLoginCacheMaxAge: scala.Double
  var ssoConf: ssoClientConf
  var whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  def adapter(user: js.Object): js.Object
}

