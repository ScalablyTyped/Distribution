package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpHeaderExtension extends StObject {
  
  var kind: js.UndefOr[java.lang.String] = js.undefined
  
  var preferredEncrypt: js.UndefOr[scala.Boolean] = js.undefined
  
  var preferredId: js.UndefOr[Double] = js.undefined
  
  var uri: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtpHeaderExtension {
  
  inline def apply(): RTCRtpHeaderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtension]
  }
  
  extension [Self <: RTCRtpHeaderExtension](x: Self) {
    
    inline def setKind(value: java.lang.String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPreferredEncrypt(value: scala.Boolean): Self = StObject.set(x, "preferredEncrypt", value.asInstanceOf[js.Any])
    
    inline def setPreferredEncryptUndefined: Self = StObject.set(x, "preferredEncrypt", js.undefined)
    
    inline def setPreferredId(value: Double): Self = StObject.set(x, "preferredId", value.asInstanceOf[js.Any])
    
    inline def setPreferredIdUndefined: Self = StObject.set(x, "preferredId", js.undefined)
    
    inline def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
