package typings.reactNativeWindows

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWindows.anon.Headers
  - typings.reactNativeWindows.anon.Name
*/
trait FormDataPart extends StObject
object FormDataPart {
  
  inline def Headers(headers: StringDictionary[String], string: String): typings.reactNativeWindows.anon.Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeWindows.anon.Headers]
  }
  
  inline def Name(headers: StringDictionary[String], uri: String): typings.reactNativeWindows.anon.Name = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeWindows.anon.Name]
  }
}
