package typings.simpleOauth2.mod

import typings.simpleOauth2.anon.AuthorizationMethod
import typings.simpleOauth2.anon.AuthorizeHost
import typings.simpleOauth2.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOptions[ClientIdName /* <: String */] extends js.Object {
  
  var auth: AuthorizeHost = js.native
  
  var client: Id[ClientIdName] = js.native
  
  /**
    * Used to set global options to the internal http library (wreck).
    * All options except baseUrl are allowed
    * Defaults to header.Accept = "application/json"
    */
  var http: js.UndefOr[js.Object] = js.native
  
  var options: js.UndefOr[AuthorizationMethod] = js.native
}
object ModuleOptions {
  
  @scala.inline
  def apply[ClientIdName /* <: String */](auth: AuthorizeHost, client: Id[ClientIdName]): ModuleOptions[ClientIdName] = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ClientIdName]]
  }
  
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions[_], ClientIdName /* <: String */] (val x: Self with ModuleOptions[ClientIdName]) extends AnyVal {
    
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
    def setAuth(value: AuthorizeHost): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: Id[ClientIdName]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: js.Object): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setOptions(value: AuthorizationMethod): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
