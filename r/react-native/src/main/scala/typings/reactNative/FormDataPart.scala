package typings.reactNative

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.anon.Headers
  - typings.reactNative.anon.Type
*/
trait FormDataPart extends StObject
object FormDataPart {
  
  inline def Headers(headers: StringDictionary[String], string: String): typings.reactNative.anon.Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.anon.Headers]
  }
  
  inline def Type(headers: StringDictionary[String], uri: String): typings.reactNative.anon.Type = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.anon.Type]
  }
}
