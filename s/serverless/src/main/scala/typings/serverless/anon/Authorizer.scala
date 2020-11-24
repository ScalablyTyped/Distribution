package typings.serverless.anon

import typings.serverless.validateMod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorizer extends js.Object {
  
  var authorizer: js.UndefOr[js.Any] = js.native
  
  var cors: js.UndefOr[js.Any] = js.native
  
  var integration: js.UndefOr[String] = js.native
  
  var mehtod: HttpMethod = js.native
  
  var path: String = js.native
}
object Authorizer {
  
  @scala.inline
  def apply(mehtod: HttpMethod, path: String): Authorizer = {
    val __obj = js.Dynamic.literal(mehtod = mehtod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizer]
  }
  
  @scala.inline
  implicit class AuthorizerOps[Self <: Authorizer] (val x: Self) extends AnyVal {
    
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
    def setMehtod(value: HttpMethod): Self = this.set("mehtod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizer(value: js.Any): Self = this.set("authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizer: Self = this.set("authorizer", js.undefined)
    
    @scala.inline
    def setCors(value: js.Any): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setIntegration(value: String): Self = this.set("integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegration: Self = this.set("integration", js.undefined)
  }
}
