package typings.sdp.mod

import typings.sdp.anon.Mechanism
import typings.sdp.anon.Ssrc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPEncodingParameters extends StObject {
  
  var codecPayloadType: js.UndefOr[Double] = js.undefined
  
  var fec: js.UndefOr[Mechanism] = js.undefined
  
  var rtx: js.UndefOr[Ssrc] = js.undefined
  
  var ssrc: Double
}
object SDPEncodingParameters {
  
  @scala.inline
  def apply(ssrc: Double): SDPEncodingParameters = {
    val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPEncodingParameters]
  }
  
  @scala.inline
  implicit class SDPEncodingParametersMutableBuilder[Self <: SDPEncodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecPayloadType(value: Double): Self = StObject.set(x, "codecPayloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecPayloadTypeUndefined: Self = StObject.set(x, "codecPayloadType", js.undefined)
    
    @scala.inline
    def setFec(value: Mechanism): Self = StObject.set(x, "fec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFecUndefined: Self = StObject.set(x, "fec", js.undefined)
    
    @scala.inline
    def setRtx(value: Ssrc): Self = StObject.set(x, "rtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtxUndefined: Self = StObject.set(x, "rtx", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
  }
}
