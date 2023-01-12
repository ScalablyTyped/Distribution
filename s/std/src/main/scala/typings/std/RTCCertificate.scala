package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCCertificate extends StObject {
  
  /* standard dom */
  val expires: EpochTimeStamp
  
  /* standard dom */
  def getFingerprints(): js.Array[RTCDtlsFingerprint]
}
object RTCCertificate {
  
  inline def apply(expires: EpochTimeStamp, getFingerprints: () => js.Array[RTCDtlsFingerprint]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getFingerprints = js.Any.fromFunction0(getFingerprints))
    __obj.asInstanceOf[RTCCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCCertificate] (val x: Self) extends AnyVal {
    
    inline def setExpires(value: EpochTimeStamp): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setGetFingerprints(value: () => js.Array[RTCDtlsFingerprint]): Self = StObject.set(x, "getFingerprints", js.Any.fromFunction0(value))
  }
}
