package typings.speechRuleEngine

import typings.speechRuleEngine.jsSpeechGeneratorAbstractSpeechGeneratorMod.AbstractSpeechGenerator
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechGeneratorColorGeneratorMod {
  
  @JSImport("speech-rule-engine/js/speech_generator/color_generator", "ColorGenerator")
  @js.native
  open class ColorGenerator () extends AbstractSpeechGenerator {
    
    /* private */ var colorLeave_ : Any = js.native
    
    /* private */ var colorLeaves_ : Any = js.native
    
    var contrast: Any = js.native
    
    def generateSpeech(node: Element, xml: String): String = js.native
    def generateSpeech(node: Element, xml: Element): String = js.native
  }
  /* static members */
  object ColorGenerator {
    
    @JSImport("speech-rule-engine/js/speech_generator/color_generator", "ColorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/speech_generator/color_generator", "ColorGenerator.visitStree_")
    @js.native
    def visitStree_ : Any = js.native
    inline def visitStree__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visitStree_")(x.asInstanceOf[js.Any])
  }
}
