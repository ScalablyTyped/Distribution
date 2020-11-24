package typings.reactAuthKit.typesMod

import typings.reactAuthKit.reactAuthKitStrings.cookie
import typings.reactAuthKit.reactAuthKitStrings.localstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenObjectParamsInterface extends js.Object {
  
  var authStorageName: String = js.native
  
  var authStorageType: cookie | localstorage = js.native
  
  var authTimeStorageName: String = js.native
  
  var cookieDomain: js.UndefOr[String] = js.native
  
  var cookieSecure: js.UndefOr[Boolean] = js.native
  
  var stateStorageName: String = js.native
}
object TokenObjectParamsInterface {
  
  @scala.inline
  def apply(
    authStorageName: String,
    authStorageType: cookie | localstorage,
    authTimeStorageName: String,
    stateStorageName: String
  ): TokenObjectParamsInterface = {
    val __obj = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenObjectParamsInterface]
  }
  
  @scala.inline
  implicit class TokenObjectParamsInterfaceOps[Self <: TokenObjectParamsInterface] (val x: Self) extends AnyVal {
    
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
    def setAuthStorageName(value: String): Self = this.set("authStorageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthStorageType(value: cookie | localstorage): Self = this.set("authStorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTimeStorageName(value: String): Self = this.set("authTimeStorageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateStorageName(value: String): Self = this.set("stateStorageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieDomain(value: String): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    
    @scala.inline
    def setCookieSecure(value: Boolean): Self = this.set("cookieSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieSecure: Self = this.set("cookieSecure", js.undefined)
  }
}
