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

object ssoConf {
  @scala.inline
  def apply(
    adapter: js.Function1[js.Object, js.Object],
    enableCache: scala.Boolean,
    hasLoginCacheMaxAge: scala.Double,
    ssoConf: ssoClientConf,
    whiteList: java.lang.String | stdLib.RegExp | js.Array[java.lang.String] | sixDashRuntimeLib.SixNs.pluginsNs.whiteList
  ): ssoConf = {
    val __obj = js.Dynamic.literal(adapter = adapter, enableCache = enableCache, hasLoginCacheMaxAge = hasLoginCacheMaxAge, ssoConf = ssoConf, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ssoConf]
  }
}

