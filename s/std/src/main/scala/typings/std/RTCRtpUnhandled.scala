package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpUnhandled extends StObject {
  
  var muxId: js.UndefOr[java.lang.String] = js.native
  
  var payloadType: js.UndefOr[Double] = js.native
  
  var ssrc: js.UndefOr[Double] = js.native
}
object RTCRtpUnhandled {
  
  @scala.inline
  def apply(): RTCRtpUnhandled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpUnhandled]
  }
  
  @scala.inline
  implicit class RTCRtpUnhandledMutableBuilder[Self <: RTCRtpUnhandled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMuxId(value: java.lang.String): Self = StObject.set(x, "muxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuxIdUndefined: Self = StObject.set(x, "muxId", js.undefined)
    
    @scala.inline
    def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
  }
}
