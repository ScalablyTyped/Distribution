package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackAudioSourceOptions extends StObject {
  
  var mediaStreamTrack: MediaStreamTrack
}
object MediaStreamTrackAudioSourceOptions {
  
  @scala.inline
  def apply(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStreamTrack = mediaStreamTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MediaStreamTrackAudioSourceOptionsMutableBuilder[Self <: MediaStreamTrackAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStreamTrack(value: MediaStreamTrack): Self = StObject.set(x, "mediaStreamTrack", value.asInstanceOf[js.Any])
  }
}
