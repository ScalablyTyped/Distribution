package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String
  
  var body: java.lang.String
  
  var headers: Action
}
object String {
  
  inline def apply(
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String,
    body: java.lang.String,
    headers: Action
  ): String = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setBody(value: java.lang.String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Action): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: java.lang.String): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
  }
}
