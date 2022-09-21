package typings.serverless.anon

import typings.serverless.validateMod.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizer extends StObject {
  
  var authorizer: js.UndefOr[Any] = js.undefined
  
  var cors: js.UndefOr[Any] = js.undefined
  
  var integration: js.UndefOr[String] = js.undefined
  
  var mehtod: HttpMethod
  
  var path: String
}
object Authorizer {
  
  inline def apply(mehtod: HttpMethod, path: String): Authorizer = {
    val __obj = js.Dynamic.literal(mehtod = mehtod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizer]
  }
  
  extension [Self <: Authorizer](x: Self) {
    
    inline def setAuthorizer(value: Any): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    inline def setCors(value: Any): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setIntegration(value: String): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    inline def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    inline def setMehtod(value: HttpMethod): Self = StObject.set(x, "mehtod", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
