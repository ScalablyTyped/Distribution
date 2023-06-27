package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAudioRendererMod.AudioRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioAbstractAudioRendererMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/audio/abstract_audio_renderer", "AbstractAudioRenderer")
  @js.native
  open class AbstractAudioRenderer ()
    extends StObject
       with AudioRenderer {
    
    def pauseValue(value: String): Double = js.native
    
    /* private */ var separator_ : Any = js.native
    
    @JSName("separator")
    def separator_MAbstractAudioRenderer: String = js.native
  }
}
