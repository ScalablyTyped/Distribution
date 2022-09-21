package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametrizedProperties extends StObject {
  
  var baseUriParameters: Domain
  
  var body: Domain
  
  var description: Domain
  
  var displayName: Domain
  
  var headers: Domain
  
  var name: Domain
  
  var parametrizedProperties: NameString
  
  var protocols: Domain
  
  var queryParameters: Domain
  
  var responses: Domain
  
  var securedBy: Domain
  
  var usage: Domain
}
object ParametrizedProperties {
  
  inline def apply(
    baseUriParameters: Domain,
    body: Domain,
    description: Domain,
    displayName: Domain,
    headers: Domain,
    name: Domain,
    parametrizedProperties: NameString,
    protocols: Domain,
    queryParameters: Domain,
    responses: Domain,
    securedBy: Domain,
    usage: Domain
  ): ParametrizedProperties = {
    val __obj = js.Dynamic.literal(baseUriParameters = baseUriParameters.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametrizedProperties]
  }
  
  extension [Self <: ParametrizedProperties](x: Self) {
    
    inline def setBaseUriParameters(value: Domain): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setBody(value: Domain): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Domain): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Domain): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: NameString): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: Domain): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: Domain): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: Domain): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: Domain): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Domain): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
