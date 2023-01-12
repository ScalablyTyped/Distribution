package typings.reactMic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AudioBitsPerSecond extends StObject {
    
    var audioBitsPerSecond: Double
    
    var mimeType: String
  }
  object AudioBitsPerSecond {
    
    inline def apply(audioBitsPerSecond: Double, mimeType: String): AudioBitsPerSecond = {
      val __obj = js.Dynamic.literal(audioBitsPerSecond = audioBitsPerSecond.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioBitsPerSecond]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AudioBitsPerSecond] (val x: Self) extends AnyVal {
      
      inline def setAudioBitsPerSecond(value: Double): Self = StObject.set(x, "audioBitsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
}
