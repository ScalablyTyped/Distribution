package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.lambda
import typings.serverless.serverlessStrings.mock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var authorizer: js.UndefOr[HttpAuthorizer] = js.native
  
  var cors: js.UndefOr[Boolean | HttpCors] = js.native
  
  var integration: js.UndefOr[lambda | mock] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[HttpRequestValidation] = js.native
}
object Http {
  
  @scala.inline
  def apply(method: String, path: String): Http = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
  
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setAuthorizer(value: HttpAuthorizer): Self = this.set("authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizer: Self = this.set("authorizer", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean | HttpCors): Self = this.set("cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    
    @scala.inline
    def setIntegration(value: lambda | mock): Self = this.set("integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegration: Self = this.set("integration", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setRequest(value: HttpRequestValidation): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
