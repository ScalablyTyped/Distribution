package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMediaStreamOptions extends StObject {
  
  /* standard dom */
  var audio: js.UndefOr[scala.Boolean | MediaTrackConstraints] = js.undefined
  
  /* standard dom */
  var video: js.UndefOr[scala.Boolean | MediaTrackConstraints] = js.undefined
}
object DisplayMediaStreamOptions {
  
  inline def apply(): DisplayMediaStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMediaStreamOptions]
  }
  
  extension [Self <: DisplayMediaStreamOptions](x: Self) {
    
    inline def setAudio(value: scala.Boolean | MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: scala.Boolean | MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
