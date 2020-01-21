package typings.sixRuntime.Six_.plugins.sso

import typings.sixRuntime.Six_.plugins.whiteList
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoConf extends js.Object {
  var enableCache: Boolean
  var hasLoginCacheMaxAge: Double
  var ssoConf: ssoClientConf
  var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six_.plugins.whiteList
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
    val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), enableCache = enableCache.asInstanceOf[js.Any], hasLoginCacheMaxAge = hasLoginCacheMaxAge.asInstanceOf[js.Any], ssoConf = ssoConf.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ssoConf]
  }
}

