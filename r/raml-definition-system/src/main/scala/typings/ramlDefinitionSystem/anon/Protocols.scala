package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protocols extends StObject {
  
  var baseUriParameters: Domain
  
  var body: Domain
  
  var description: Domain
  
  var displayName: Domain
  
  var headers: Domain
  
  var is: Domain
  
  var protocols: Domain
  
  var queryParameters: Domain
  
  var responses: Domain
  
  var securedBy: Domain
}
object Protocols {
  
  inline def apply(
    baseUriParameters: Domain,
    body: Domain,
    description: Domain,
    displayName: Domain,
    headers: Domain,
    is: Domain,
    protocols: Domain,
    queryParameters: Domain,
    responses: Domain,
    securedBy: Domain
  ): Protocols = {
    val __obj = js.Dynamic.literal(baseUriParameters = baseUriParameters.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocols]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Protocols] (val x: Self) extends AnyVal {
    
    inline def setBaseUriParameters(value: Domain): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setBody(value: Domain): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Domain): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Domain): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIs(value: Domain): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: Domain): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: Domain): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: Domain): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: Domain): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
  }
}
