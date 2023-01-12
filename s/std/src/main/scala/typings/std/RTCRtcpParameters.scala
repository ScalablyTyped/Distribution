package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtcpParameters extends StObject {
  
  /* standard dom */
  var cname: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var reducedSize: js.UndefOr[scala.Boolean] = js.undefined
}
object RTCRtcpParameters {
  
  inline def apply(): RTCRtcpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtcpParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtcpParameters] (val x: Self) extends AnyVal {
    
    inline def setCname(value: java.lang.String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setReducedSize(value: scala.Boolean): Self = StObject.set(x, "reducedSize", value.asInstanceOf[js.Any])
    
    inline def setReducedSizeUndefined: Self = StObject.set(x, "reducedSize", js.undefined)
  }
}
