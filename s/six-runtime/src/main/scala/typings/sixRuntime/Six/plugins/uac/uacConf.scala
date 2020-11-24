package typings.sixRuntime.Six.plugins.uac

import typings.sixRuntime.Six.next
import typings.sixRuntime.Six.plugins.whiteList
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait uacConf extends js.Object {
  
  var client_id: String = js.native
  
  var client_secret: String = js.native
  
  var enableMock: Boolean = js.native
  
  def failHook(err: Error, ctx: js.Object, next: next): js.Any = js.native
  
  def getPath(ctx: js.Object): String = js.native
  
  var skipOffline: Boolean = js.native
  
  var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList = js.native
}
object uacConf {
  
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    enableMock: Boolean,
    failHook: (Error, js.Object, next) => js.Any,
    getPath: js.Object => String,
    skipOffline: Boolean,
    whiteList: String | RegExp | js.Array[String] | whiteList
  ): uacConf = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[uacConf]
  }
  
  @scala.inline
  implicit class uacConfOps[Self <: uacConf] (val x: Self) extends AnyVal {
    
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMock(value: Boolean): Self = this.set("enableMock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailHook(value: (Error, js.Object, next) => js.Any): Self = this.set("failHook", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetPath(value: js.Object => String): Self = this.set("getPath", js.Any.fromFunction1(value))
    
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
