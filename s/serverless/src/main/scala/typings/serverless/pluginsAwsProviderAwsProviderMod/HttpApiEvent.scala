package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpApiEvent extends StObject {
  
  var authorizer: js.UndefOr[NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer] = js.undefined
  
  var method: String
  
  var path: String
}
object HttpApiEvent {
  
  inline def apply(method: String, path: String): HttpApiEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiEvent]
  }
  
  extension [Self <: HttpApiEvent](x: Self) {
    
    inline def setAuthorizer(value: NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
