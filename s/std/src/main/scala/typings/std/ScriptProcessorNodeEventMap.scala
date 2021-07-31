package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptProcessorNodeEventMap extends StObject {
  
  var audioprocess: AudioProcessingEvent
}
object ScriptProcessorNodeEventMap {
  
  @scala.inline
  def apply(audioprocess: AudioProcessingEvent): ScriptProcessorNodeEventMap = {
    val __obj = js.Dynamic.literal(audioprocess = audioprocess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptProcessorNodeEventMap]
  }
  
  @scala.inline
  implicit class ScriptProcessorNodeEventMapMutableBuilder[Self <: ScriptProcessorNodeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioprocess(value: AudioProcessingEvent): Self = StObject.set(x, "audioprocess", value.asInstanceOf[js.Any])
  }
}
