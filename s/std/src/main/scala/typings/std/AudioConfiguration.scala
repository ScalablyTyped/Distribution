package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioConfiguration extends StObject {
  
  /* standard dom */
  var bitrate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var channels: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var contentType: java.lang.String
  
  /* standard dom */
  var samplerate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var spatialRendering: js.UndefOr[scala.Boolean] = js.undefined
}
object AudioConfiguration {
  
  inline def apply(contentType: java.lang.String): AudioConfiguration = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setChannels(value: java.lang.String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setContentType(value: java.lang.String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setSamplerate(value: Double): Self = StObject.set(x, "samplerate", value.asInstanceOf[js.Any])
    
    inline def setSamplerateUndefined: Self = StObject.set(x, "samplerate", js.undefined)
    
    inline def setSpatialRendering(value: scala.Boolean): Self = StObject.set(x, "spatialRendering", value.asInstanceOf[js.Any])
    
    inline def setSpatialRenderingUndefined: Self = StObject.set(x, "spatialRendering", js.undefined)
  }
}
