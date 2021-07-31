package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpEncodingParameters
  extends StObject
     with RTCRtpCodingParameters {
  
  var active: js.UndefOr[scala.Boolean] = js.undefined
  
  var codecPayloadType: js.UndefOr[Double] = js.undefined
  
  var dtx: js.UndefOr[RTCDtxStatus] = js.undefined
  
  var maxBitrate: js.UndefOr[Double] = js.undefined
  
  var maxFramerate: js.UndefOr[Double] = js.undefined
  
  var ptime: js.UndefOr[Double] = js.undefined
  
  var scaleResolutionDownBy: js.UndefOr[Double] = js.undefined
}
object RTCRtpEncodingParameters {
  
  @scala.inline
  def apply(): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  
  @scala.inline
  implicit class RTCRtpEncodingParametersMutableBuilder[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: scala.Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCodecPayloadType(value: Double): Self = StObject.set(x, "codecPayloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecPayloadTypeUndefined: Self = StObject.set(x, "codecPayloadType", js.undefined)
    
    @scala.inline
    def setDtx(value: RTCDtxStatus): Self = StObject.set(x, "dtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtxUndefined: Self = StObject.set(x, "dtx", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: Double): Self = StObject.set(x, "maxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "maxBitrate", js.undefined)
    
    @scala.inline
    def setMaxFramerate(value: Double): Self = StObject.set(x, "maxFramerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFramerateUndefined: Self = StObject.set(x, "maxFramerate", js.undefined)
    
    @scala.inline
    def setPtime(value: Double): Self = StObject.set(x, "ptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtimeUndefined: Self = StObject.set(x, "ptime", js.undefined)
    
    @scala.inline
    def setScaleResolutionDownBy(value: Double): Self = StObject.set(x, "scaleResolutionDownBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleResolutionDownByUndefined: Self = StObject.set(x, "scaleResolutionDownBy", js.undefined)
  }
}
