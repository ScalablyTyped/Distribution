package typings.reactPlayer

import typings.reactPlayer.baseMod.BaseReactPlayerProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("react-player/file", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactPlayer.baseMod.default[FilePlayerProps]
  
  trait FileConfig extends StObject {
    
    var attributes: js.UndefOr[Record[String, Any]] = js.undefined
    
    var dashVersion: js.UndefOr[String] = js.undefined
    
    var flvVersion: js.UndefOr[String] = js.undefined
    
    var forceAudio: js.UndefOr[Boolean] = js.undefined
    
    var forceDASH: js.UndefOr[Boolean] = js.undefined
    
    var forceFLV: js.UndefOr[Boolean] = js.undefined
    
    var forceHLS: js.UndefOr[Boolean] = js.undefined
    
    var forceVideo: js.UndefOr[Boolean] = js.undefined
    
    var hlsOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var hlsVersion: js.UndefOr[String] = js.undefined
    
    var tracks: js.UndefOr[js.Array[TrackProps]] = js.undefined
  }
  object FileConfig {
    
    inline def apply(): FileConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileConfig]
    }
    
    extension [Self <: FileConfig](x: Self) {
      
      inline def setAttributes(value: Record[String, Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDashVersion(value: String): Self = StObject.set(x, "dashVersion", value.asInstanceOf[js.Any])
      
      inline def setDashVersionUndefined: Self = StObject.set(x, "dashVersion", js.undefined)
      
      inline def setFlvVersion(value: String): Self = StObject.set(x, "flvVersion", value.asInstanceOf[js.Any])
      
      inline def setFlvVersionUndefined: Self = StObject.set(x, "flvVersion", js.undefined)
      
      inline def setForceAudio(value: Boolean): Self = StObject.set(x, "forceAudio", value.asInstanceOf[js.Any])
      
      inline def setForceAudioUndefined: Self = StObject.set(x, "forceAudio", js.undefined)
      
      inline def setForceDASH(value: Boolean): Self = StObject.set(x, "forceDASH", value.asInstanceOf[js.Any])
      
      inline def setForceDASHUndefined: Self = StObject.set(x, "forceDASH", js.undefined)
      
      inline def setForceFLV(value: Boolean): Self = StObject.set(x, "forceFLV", value.asInstanceOf[js.Any])
      
      inline def setForceFLVUndefined: Self = StObject.set(x, "forceFLV", js.undefined)
      
      inline def setForceHLS(value: Boolean): Self = StObject.set(x, "forceHLS", value.asInstanceOf[js.Any])
      
      inline def setForceHLSUndefined: Self = StObject.set(x, "forceHLS", js.undefined)
      
      inline def setForceVideo(value: Boolean): Self = StObject.set(x, "forceVideo", value.asInstanceOf[js.Any])
      
      inline def setForceVideoUndefined: Self = StObject.set(x, "forceVideo", js.undefined)
      
      inline def setHlsOptions(value: Record[String, Any]): Self = StObject.set(x, "hlsOptions", value.asInstanceOf[js.Any])
      
      inline def setHlsOptionsUndefined: Self = StObject.set(x, "hlsOptions", js.undefined)
      
      inline def setHlsVersion(value: String): Self = StObject.set(x, "hlsVersion", value.asInstanceOf[js.Any])
      
      inline def setHlsVersionUndefined: Self = StObject.set(x, "hlsVersion", js.undefined)
      
      inline def setTracks(value: js.Array[TrackProps]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
      
      inline def setTracksVarargs(value: TrackProps*): Self = StObject.set(x, "tracks", js.Array(value*))
    }
  }
  
  type FilePlayer = typings.reactPlayer.baseMod.default[FilePlayerProps]
  
  trait FilePlayerProps
    extends StObject
       with BaseReactPlayerProps {
    
    var config: js.UndefOr[FileConfig] = js.undefined
  }
  object FilePlayerProps {
    
    inline def apply(): FilePlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePlayerProps]
    }
    
    extension [Self <: FilePlayerProps](x: Self) {
      
      inline def setConfig(value: FileConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
  
  trait TrackProps extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var kind: String
    
    var label: String
    
    var src: String
    
    var srcLang: String
  }
  object TrackProps {
    
    inline def apply(kind: String, label: String, src: String, srcLang: String): TrackProps = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcLang = srcLang.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    extension [Self <: TrackProps](x: Self) {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    }
  }
}
