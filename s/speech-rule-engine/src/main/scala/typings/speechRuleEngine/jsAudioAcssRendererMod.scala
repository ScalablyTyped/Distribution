package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioMarkupRendererMod.MarkupRenderer
import typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioAcssRendererMod {
  
  @JSImport("speech-rule-engine/js/audio/acss_renderer", "AcssRenderer")
  @js.native
  open class AcssRenderer () extends MarkupRenderer {
    
    def error(key: Double): String = js.native
    
    def prosodyElement(key: personalityProps, value: Double): String = js.native
    
    /* private */ var prosody_ : Any = js.native
  }
}
