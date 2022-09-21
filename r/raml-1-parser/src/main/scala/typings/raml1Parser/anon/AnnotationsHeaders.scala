package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsHeaders extends StObject {
  
  var annotations: NameString
  
  var headers: NameString
  
  var queryParameters: NameString
  
  var queryString: NameString
  
  var responses: NameString
}
object AnnotationsHeaders {
  
  inline def apply(
    annotations: NameString,
    headers: NameString,
    queryParameters: NameString,
    queryString: NameString,
    responses: NameString
  ): AnnotationsHeaders = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsHeaders]
  }
  
  extension [Self <: AnnotationsHeaders](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: NameString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: NameString): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: NameString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: NameString): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
