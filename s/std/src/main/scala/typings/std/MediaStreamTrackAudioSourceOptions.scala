package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackAudioSourceOptions extends StObject {
  
  var mediaStreamTrack: MediaStreamTrack
}
object MediaStreamTrackAudioSourceOptions {
  
  inline def apply(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStreamTrack = mediaStreamTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackAudioSourceOptions]
  }
  
  extension [Self <: MediaStreamTrackAudioSourceOptions](x: Self) {
    
    inline def setMediaStreamTrack(value: MediaStreamTrack): Self = StObject.set(x, "mediaStreamTrack", value.asInstanceOf[js.Any])
  }
}
