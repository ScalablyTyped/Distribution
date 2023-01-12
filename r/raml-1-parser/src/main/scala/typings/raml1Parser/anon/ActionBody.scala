package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionBody extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String
  
  var body: java.lang.String
  
  var headers: Action
  
  var is: java.lang.String
  
  var queryParameters: Action
  
  var queryString: ActionString
  
  var responses: Action
  
  var securedBy: java.lang.String
}
object ActionBody {
  
  inline def apply(
    $action: java.lang.String,
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String,
    body: java.lang.String,
    headers: Action,
    is: java.lang.String,
    queryParameters: Action,
    queryString: ActionString,
    responses: Action,
    securedBy: java.lang.String
  ): ActionBody = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionBody] (val x: Self) extends AnyVal {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def setBody(value: java.lang.String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Action): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIs(value: java.lang.String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: Action): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: ActionString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: Action): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: java.lang.String): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: java.lang.String): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
  }
}
