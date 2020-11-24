package typings.simpleOauth2.anon

import typings.simpleOauth2.simpleOauth2Strings.body
import typings.simpleOauth2.simpleOauth2Strings.form
import typings.simpleOauth2.simpleOauth2Strings.header
import typings.simpleOauth2.simpleOauth2Strings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationMethod extends js.Object {
  
  /**
    * Indicates the method used to send the client.id/client.secret authorization params at the token request.
    * If set to body, the bodyFormat option will be used to format the credentials.
    * Defaults to header
    */
  var authorizationMethod: js.UndefOr[header | body] = js.native
  
  /** Format of data sent in the request body. Defaults to form. */
  var bodyFormat: js.UndefOr[json | form] = js.native
}
object AuthorizationMethod {
  
  @scala.inline
  def apply(): AuthorizationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationMethod]
  }
  
  @scala.inline
  implicit class AuthorizationMethodOps[Self <: AuthorizationMethod] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationMethod(value: header | body): Self = this.set("authorizationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationMethod: Self = this.set("authorizationMethod", js.undefined)
    
    @scala.inline
    def setBodyFormat(value: json | form): Self = this.set("bodyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyFormat: Self = this.set("bodyFormat", js.undefined)
  }
}
