package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderConfig extends StObject {
  
  /* standard dom */
  var alpha: js.UndefOr[AlphaOption] = js.undefined
  
  /* standard dom */
  var avc: js.UndefOr[AvcEncoderConfig] = js.undefined
  
  /* standard dom */
  var bitrate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var bitrateMode: js.UndefOr[VideoEncoderBitrateMode] = js.undefined
  
  /* standard dom */
  var codec: java.lang.String
  
  /* standard dom */
  var displayHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var displayWidth: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framerate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var hardwareAcceleration: js.UndefOr[HardwareAcceleration] = js.undefined
  
  /* standard dom */
  var height: Double
  
  /* standard dom */
  var latencyMode: js.UndefOr[LatencyMode] = js.undefined
  
  /* standard dom */
  var scalabilityMode: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var width: Double
}
object VideoEncoderConfig {
  
  inline def apply(codec: java.lang.String, height: Double, width: Double): VideoEncoderConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: AlphaOption): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAvc(value: AvcEncoderConfig): Self = StObject.set(x, "avc", value.asInstanceOf[js.Any])
    
    inline def setAvcUndefined: Self = StObject.set(x, "avc", js.undefined)
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateMode(value: VideoEncoderBitrateMode): Self = StObject.set(x, "bitrateMode", value.asInstanceOf[js.Any])
    
    inline def setBitrateModeUndefined: Self = StObject.set(x, "bitrateMode", js.undefined)
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setCodec(value: java.lang.String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeightUndefined: Self = StObject.set(x, "displayHeight", js.undefined)
    
    inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
    
    inline def setDisplayWidthUndefined: Self = StObject.set(x, "displayWidth", js.undefined)
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
    
    inline def setHardwareAcceleration(value: HardwareAcceleration): Self = StObject.set(x, "hardwareAcceleration", value.asInstanceOf[js.Any])
    
    inline def setHardwareAccelerationUndefined: Self = StObject.set(x, "hardwareAcceleration", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLatencyMode(value: LatencyMode): Self = StObject.set(x, "latencyMode", value.asInstanceOf[js.Any])
    
    inline def setLatencyModeUndefined: Self = StObject.set(x, "latencyMode", js.undefined)
    
    inline def setScalabilityMode(value: java.lang.String): Self = StObject.set(x, "scalabilityMode", value.asInstanceOf[js.Any])
    
    inline def setScalabilityModeUndefined: Self = StObject.set(x, "scalabilityMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
