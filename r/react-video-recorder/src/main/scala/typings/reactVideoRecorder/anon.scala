package typings.reactVideoRecorder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: Any
    
    var video: Any
  }
  object Audio {
    
    inline def apply(audio: Any, video: Any): Audio = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
      
      inline def setAudio(value: Any): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Any): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
}
