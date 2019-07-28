package typings.sixDashRuntime.SixNs.pluginsNs.ssoNs

import typings.sixDashRuntime.SixNs.pluginsNs.whiteList
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoConf extends js.Object {
  var enableCache: Boolean
  var hasLoginCacheMaxAge: Double
  var ssoConf: ssoClientConf
  var whiteList: String | RegExp | js.Array[String] | typings.sixDashRuntime.SixNs.pluginsNs.whiteList
  def adapter(user: js.Object): js.Object
}

object ssoConf {
  @scala.inline
  def apply(
    adapter: js.Object => js.Object,
    enableCache: Boolean,
    hasLoginCacheMaxAge: Double,
    ssoConf: ssoClientConf,
    whiteList: String | RegExp | js.Array[String] | whiteList
  ): ssoConf = {
    val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), enableCache = enableCache, hasLoginCacheMaxAge = hasLoginCacheMaxAge, ssoConf = ssoConf, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ssoConf]
  }
}

