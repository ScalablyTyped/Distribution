package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDtlsFingerprint extends StObject {
  
  /* standard dom */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var value: js.UndefOr[java.lang.String] = js.undefined
}
object RTCDtlsFingerprint {
  
  inline def apply(): RTCDtlsFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDtlsFingerprint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCDtlsFingerprint] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: java.lang.String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
