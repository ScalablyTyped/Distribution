package typings.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: StringDictionary[String]
  
  var string: String
}
object Headers {
  
  inline def apply(headers: StringDictionary[String], string: String): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
