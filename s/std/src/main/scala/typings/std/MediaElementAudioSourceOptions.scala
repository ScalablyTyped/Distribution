package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaElementAudioSourceOptions extends StObject {
  
  /* standard dom */
  var mediaElement: HTMLMediaElement
}
object MediaElementAudioSourceOptions {
  
  inline def apply(mediaElement: HTMLMediaElement): MediaElementAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaElement = mediaElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaElementAudioSourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaElementAudioSourceOptions] (val x: Self) extends AnyVal {
    
    inline def setMediaElement(value: HTMLMediaElement): Self = StObject.set(x, "mediaElement", value.asInstanceOf[js.Any])
  }
}
