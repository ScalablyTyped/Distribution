package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeySystemMediaCapability extends StObject {
  
  /* standard dom */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var encryptionScheme: js.UndefOr[java.lang.String | Null] = js.undefined
  
  /* standard dom */
  var robustness: js.UndefOr[java.lang.String] = js.undefined
}
object MediaKeySystemMediaCapability {
  
  inline def apply(): MediaKeySystemMediaCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemMediaCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaKeySystemMediaCapability] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: java.lang.String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEncryptionScheme(value: java.lang.String): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSchemeNull: Self = StObject.set(x, "encryptionScheme", null)
    
    inline def setEncryptionSchemeUndefined: Self = StObject.set(x, "encryptionScheme", js.undefined)
    
    inline def setRobustness(value: java.lang.String): Self = StObject.set(x, "robustness", value.asInstanceOf[js.Any])
    
    inline def setRobustnessUndefined: Self = StObject.set(x, "robustness", js.undefined)
  }
}
