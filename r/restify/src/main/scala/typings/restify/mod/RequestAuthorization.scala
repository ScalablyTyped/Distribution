package typings.restify.mod

import typings.restify.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAuthorization extends js.Object {
  
  var basic: js.UndefOr[Password] = js.native
  
  var credentials: String = js.native
  
  var scheme: String = js.native
}
object RequestAuthorization {
  
  @scala.inline
  def apply(credentials: String, scheme: String): RequestAuthorization = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAuthorization]
  }
  
  @scala.inline
  implicit class RequestAuthorizationOps[Self <: RequestAuthorization] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: String): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasic(value: Password): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
  }
}
