package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.lambda
import typings.serverless.serverlessStrings.mock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Http extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var authorizer: js.UndefOr[HttpAuthorizer | String] = js.undefined
  
  var cors: js.UndefOr[Boolean | HttpCors] = js.undefined
  
  var integration: js.UndefOr[lambda | mock] = js.undefined
  
  var method: String
  
  var path: String
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[HttpRequestValidation] = js.undefined
}
object Http {
  
  inline def apply(method: String, path: String): Http = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
  
  extension [Self <: Http](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setAuthorizer(value: HttpAuthorizer | String): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    inline def setCors(value: Boolean | HttpCors): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setIntegration(value: lambda | mock): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    inline def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setRequest(value: HttpRequestValidation): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
