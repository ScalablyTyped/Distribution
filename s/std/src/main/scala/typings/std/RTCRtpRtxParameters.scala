package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpRtxParameters extends StObject {
  
  var ssrc: js.UndefOr[Double] = js.undefined
}
object RTCRtpRtxParameters {
  
  inline def apply(): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
  
  extension [Self <: RTCRtpRtxParameters](x: Self) {
    
    inline def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    inline def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
  }
}
