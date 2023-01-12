package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpHeaderExtensionCapability extends StObject {
  
  /* standard dom */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtpHeaderExtensionCapability {
  
  inline def apply(): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpHeaderExtensionCapability] (val x: Self) extends AnyVal {
    
    inline def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
