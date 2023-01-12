package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCCertificateExpiration extends StObject {
  
  /* standard dom */
  var expires: js.UndefOr[Double] = js.undefined
}
object RTCCertificateExpiration {
  
  inline def apply(): RTCCertificateExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCCertificateExpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCCertificateExpiration] (val x: Self) extends AnyVal {
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
