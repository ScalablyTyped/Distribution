package typings.reactNativeAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AudioFileURL extends StObject {
    
    var audioFileURL: String
    
    var base64: String
    
    var status: String
  }
  object AudioFileURL {
    
    inline def apply(audioFileURL: String, base64: String, status: String): AudioFileURL = {
      val __obj = js.Dynamic.literal(audioFileURL = audioFileURL.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioFileURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AudioFileURL] (val x: Self) extends AnyVal {
      
      inline def setAudioFileURL(value: String): Self = StObject.set(x, "audioFileURL", value.asInstanceOf[js.Any])
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentTime extends StObject {
    
    var currentTime: Double
  }
  object CurrentTime {
    
    inline def apply(currentTime: Double): CurrentTime = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentTime] (val x: Self) extends AnyVal {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    }
  }
}
