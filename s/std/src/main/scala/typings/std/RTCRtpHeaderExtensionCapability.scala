package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpHeaderExtensionCapability extends StObject {
  
  /* standard dom */
  var uri: java.lang.String
}
object RTCRtpHeaderExtensionCapability {
  
  inline def apply(uri: java.lang.String): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpHeaderExtensionCapability] (val x: Self) extends AnyVal {
    
    inline def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
