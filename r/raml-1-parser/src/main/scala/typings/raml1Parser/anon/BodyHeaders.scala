package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyHeaders extends StObject {
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String
  
  var body: java.lang.String
  
  var headers: Action
  
  var queryParameters: Action
  
  var queryString: ActionString
  
  var responses: D33
  
  var securedBy: java.lang.String
}
object BodyHeaders {
  
  inline def apply(
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String,
    body: java.lang.String,
    headers: Action,
    queryParameters: Action,
    queryString: ActionString,
    responses: D33,
    securedBy: java.lang.String
  ): BodyHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyHeaders]
  }
  
  extension [Self <: BodyHeaders](x: Self) {
    
    inline def setBody(value: java.lang.String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Action): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: Action): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: ActionString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: D33): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: java.lang.String): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: java.lang.String): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
  }
}
