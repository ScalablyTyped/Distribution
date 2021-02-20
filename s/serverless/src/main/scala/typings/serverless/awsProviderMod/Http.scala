package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.lambda
import typings.serverless.serverlessStrings.mock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http extends StObject {
  
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
  implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setAuthorizer(value: HttpAuthorizer): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean | HttpCors): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setIntegration(value: lambda | mock): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setRequest(value: HttpRequestValidation): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
