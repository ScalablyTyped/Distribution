package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoConfiguration extends StObject {
  
  /* standard dom */
  var bitrate: Double
  
  /* standard dom */
  var colorGamut: js.UndefOr[ColorGamut] = js.undefined
  
  /* standard dom */
  var contentType: java.lang.String
  
  /* standard dom */
  var framerate: Double
  
  /* standard dom */
  var hdrMetadataType: js.UndefOr[HdrMetadataType] = js.undefined
  
  /* standard dom */
  var height: Double
  
  /* standard dom */
  var scalabilityMode: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var transferFunction: js.UndefOr[TransferFunction] = js.undefined
  
  /* standard dom */
  var width: Double
}
object VideoConfiguration {
  
  inline def apply(bitrate: Double, contentType: java.lang.String, framerate: Double, height: Double, width: Double): VideoConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setColorGamut(value: ColorGamut): Self = StObject.set(x, "colorGamut", value.asInstanceOf[js.Any])
    
    inline def setColorGamutUndefined: Self = StObject.set(x, "colorGamut", js.undefined)
    
    inline def setContentType(value: java.lang.String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setHdrMetadataType(value: HdrMetadataType): Self = StObject.set(x, "hdrMetadataType", value.asInstanceOf[js.Any])
    
    inline def setHdrMetadataTypeUndefined: Self = StObject.set(x, "hdrMetadataType", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScalabilityMode(value: java.lang.String): Self = StObject.set(x, "scalabilityMode", value.asInstanceOf[js.Any])
    
    inline def setScalabilityModeUndefined: Self = StObject.set(x, "scalabilityMode", js.undefined)
    
    inline def setTransferFunction(value: TransferFunction): Self = StObject.set(x, "transferFunction", value.asInstanceOf[js.Any])
    
    inline def setTransferFunctionUndefined: Self = StObject.set(x, "transferFunction", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
