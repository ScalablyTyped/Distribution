package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConfig extends StObject {
  
  var attributes: js.UndefOr[js.Object] = js.undefined
  
  var dashVersion: js.UndefOr[String] = js.undefined
  
  var forceAudio: js.UndefOr[Boolean] = js.undefined
  
  var forceDASH: js.UndefOr[Boolean] = js.undefined
  
  var forceHLS: js.UndefOr[Boolean] = js.undefined
  
  var forceVideo: js.UndefOr[Boolean] = js.undefined
  
  var hlsOptions: js.UndefOr[js.Object] = js.undefined
  
  var hlsVersion: js.UndefOr[String] = js.undefined
  
  var tracks: js.UndefOr[js.Array[TrackProps]] = js.undefined
}
object FileConfig {
  
  inline def apply(): FileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileConfig]
  }
  
  extension [Self <: FileConfig](x: Self) {
    
    inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDashVersion(value: String): Self = StObject.set(x, "dashVersion", value.asInstanceOf[js.Any])
    
    inline def setDashVersionUndefined: Self = StObject.set(x, "dashVersion", js.undefined)
    
    inline def setForceAudio(value: Boolean): Self = StObject.set(x, "forceAudio", value.asInstanceOf[js.Any])
    
    inline def setForceAudioUndefined: Self = StObject.set(x, "forceAudio", js.undefined)
    
    inline def setForceDASH(value: Boolean): Self = StObject.set(x, "forceDASH", value.asInstanceOf[js.Any])
    
    inline def setForceDASHUndefined: Self = StObject.set(x, "forceDASH", js.undefined)
    
    inline def setForceHLS(value: Boolean): Self = StObject.set(x, "forceHLS", value.asInstanceOf[js.Any])
    
    inline def setForceHLSUndefined: Self = StObject.set(x, "forceHLS", js.undefined)
    
    inline def setForceVideo(value: Boolean): Self = StObject.set(x, "forceVideo", value.asInstanceOf[js.Any])
    
    inline def setForceVideoUndefined: Self = StObject.set(x, "forceVideo", js.undefined)
    
    inline def setHlsOptions(value: js.Object): Self = StObject.set(x, "hlsOptions", value.asInstanceOf[js.Any])
    
    inline def setHlsOptionsUndefined: Self = StObject.set(x, "hlsOptions", js.undefined)
    
    inline def setHlsVersion(value: String): Self = StObject.set(x, "hlsVersion", value.asInstanceOf[js.Any])
    
    inline def setHlsVersionUndefined: Self = StObject.set(x, "hlsVersion", js.undefined)
    
    inline def setTracks(value: js.Array[TrackProps]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: TrackProps*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
