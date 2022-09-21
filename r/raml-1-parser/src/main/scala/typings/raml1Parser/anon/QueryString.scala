package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryString extends StObject {
  
  var annotations: NameString
  
  var body: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var headers: NameString
  
  var is: NameString
  
  var protocols: NameString
  
  var queryParameters: NameString
  
  var queryString: NameString
  
  var responses: NameString
  
  var securedBy: NameString
}
object QueryString {
  
  inline def apply(
    annotations: NameString,
    body: NameString,
    description: NameString,
    displayName: NameString,
    headers: NameString,
    is: NameString,
    protocols: NameString,
    queryParameters: NameString,
    queryString: NameString,
    responses: NameString,
    securedBy: NameString
  ): QueryString = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryString]
  }
  
  extension [Self <: QueryString](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setBody(value: NameString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: NameString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIs(value: NameString): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: NameString): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: NameString): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: NameString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: NameString): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: NameString): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
  }
}
