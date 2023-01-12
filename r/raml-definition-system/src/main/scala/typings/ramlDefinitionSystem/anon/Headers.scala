package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var baseUriParameters: Domain
  
  var body: Domain
  
  var description: Domain
  
  var headers: Domain
  
  var protocols: Domain
  
  var queryParameters: Domain
  
  var responses: Domain
  
  var securedBy: Domain
}
object Headers {
  
  inline def apply(
    baseUriParameters: Domain,
    body: Domain,
    description: Domain,
    headers: Domain,
    protocols: Domain,
    queryParameters: Domain,
    responses: Domain,
    securedBy: Domain
  ): Headers = {
    val __obj = js.Dynamic.literal(baseUriParameters = baseUriParameters.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    inline def setBaseUriParameters(value: Domain): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setBody(value: Domain): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Domain): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: Domain): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: Domain): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: Domain): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: Domain): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
  }
}
