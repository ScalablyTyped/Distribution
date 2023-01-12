package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptProcessorNodeEventMap extends StObject {
  
  /* standard dom */
  var audioprocess: AudioProcessingEvent
}
object ScriptProcessorNodeEventMap {
  
  inline def apply(audioprocess: AudioProcessingEvent): ScriptProcessorNodeEventMap = {
    val __obj = js.Dynamic.literal(audioprocess = audioprocess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptProcessorNodeEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptProcessorNodeEventMap] (val x: Self) extends AnyVal {
    
    inline def setAudioprocess(value: AudioProcessingEvent): Self = StObject.set(x, "audioprocess", value.asInstanceOf[js.Any])
  }
}
