package typings.sixRuntime.Six.plugins.sso

import typings.sixRuntime.Six.plugins.whiteList
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ssoConf extends js.Object {
  
  def adapter(user: js.Object): js.Object = js.native
  
  var enableCache: Boolean = js.native
  
  var hasLoginCacheMaxAge: Double = js.native
  
  var ssoConf: ssoClientConf = js.native
  
  var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList = js.native
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
  
  @scala.inline
  implicit class ssoConfOps[Self <: ssoConf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapter(value: js.Object => js.Object): Self = this.set("adapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableCache(value: Boolean): Self = this.set("enableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLoginCacheMaxAge(value: Double): Self = this.set("hasLoginCacheMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoConf(value: ssoClientConf): Self = this.set("ssoConf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteListVarargs(value: String*): Self = this.set("whiteList", js.Array(value :_*))
    
    @scala.inline
    def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = this.set("whiteList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhiteList(value: String | RegExp | js.Array[String] | whiteList): Self = this.set("whiteList", value.asInstanceOf[js.Any])
  }
}
