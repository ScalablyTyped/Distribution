package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamAudioSourceOptions extends StObject {
  
  var mediaStream: MediaStream
}
object MediaStreamAudioSourceOptions {
  
  @scala.inline
  def apply(mediaStream: MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MediaStreamAudioSourceOptionsMutableBuilder[Self <: MediaStreamAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStream(value: MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
  }
}
