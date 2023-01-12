package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpHeaderExtensionParameters extends StObject {
  
  /* standard dom */
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var id: Double
  
  /* standard dom */
  var uri: java.lang.String
}
object RTCRtpHeaderExtensionParameters {
  
  inline def apply(id: Double, uri: java.lang.String): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpHeaderExtensionParameters] (val x: Self) extends AnyVal {
    
    inline def setEncrypted(value: scala.Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
