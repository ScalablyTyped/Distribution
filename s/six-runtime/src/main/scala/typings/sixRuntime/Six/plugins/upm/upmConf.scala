package typings.sixRuntime.Six.plugins.upm

import typings.sixRuntime.Six.next
import typings.sixRuntime.Six.plugins.whiteList
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait upmConf extends js.Object {
  
  var clientId: String = js.native
  
  var clientSecret: String = js.native
  
  var domain: String = js.native
  
  var enableMock: Boolean = js.native
  
  def failHook(err: Error, ctx: js.Object, next: next): js.Any = js.native
  
  def getPath(ctx: js.Object): String = js.native
  
  var path: String = js.native
  
  var skipOffline: Boolean = js.native
  
  var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList = js.native
}
object upmConf {
  
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    domain: String,
    enableMock: Boolean,
    failHook: (Error, js.Object, next) => js.Any,
    getPath: js.Object => String,
    path: String,
    skipOffline: Boolean,
    whiteList: String | RegExp | js.Array[String] | whiteList
  ): upmConf = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[upmConf]
  }
  
  @scala.inline
  implicit class upmConfOps[Self <: upmConf] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMock(value: Boolean): Self = this.set("enableMock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailHook(value: (Error, js.Object, next) => js.Any): Self = this.set("failHook", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetPath(value: js.Object => String): Self = this.set("getPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOffline(value: Boolean): Self = this.set("skipOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteListVarargs(value: String*): Self = this.set("whiteList", js.Array(value :_*))
    
    @scala.inline
    def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = this.set("whiteList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhiteList(value: String | RegExp | js.Array[String] | whiteList): Self = this.set("whiteList", value.asInstanceOf[js.Any])
  }
}
