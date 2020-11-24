package typings.server.optionsMod

import typings.csurf.mod.CookieOptions
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsurfOptions extends js.Object {
  
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.native
  
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.native
  
  var sessionKey: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
}
object CsurfOptions {
  
  @scala.inline
  def apply(): CsurfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsurfOptions]
  }
  
  @scala.inline
  implicit class CsurfOptionsOps[Self <: CsurfOptions] (val x: Self) extends AnyVal {
    
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
    def setCookie(value: CookieOptions | Boolean): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setIgnoreMethodsVarargs(value: String*): Self = this.set("ignoreMethods", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreMethods(value: js.Array[String]): Self = this.set("ignoreMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMethods: Self = this.set("ignoreMethods", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setValue(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
