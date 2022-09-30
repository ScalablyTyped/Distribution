package typings.reactNativeWindows

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * React Native's implementation of fetch allows this syntax for uploading files from
  * local filesystem.
  * See https://github.com/facebook/react-native/blob/master/Libraries/Network/convertRequestBody.js#L22
  */
trait SourceUri
  extends StObject
     with /* key */ StringDictionary[Any]
     with _BodyInit {
  
  var uri: String
}
object SourceUri {
  
  inline def apply(uri: String): SourceUri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceUri]
  }
  
  extension [Self <: SourceUri](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
