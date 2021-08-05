package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoadEventDataAndroid extends StObject {
  
  var uri: js.UndefOr[String] = js.undefined
}
object ImageLoadEventDataAndroid {
  
  inline def apply(): ImageLoadEventDataAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageLoadEventDataAndroid]
  }
  
  extension [Self <: ImageLoadEventDataAndroid](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
