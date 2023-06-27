package typings.speechRuleEngine

import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechGeneratorSpeechGeneratorFactoryMod {
  
  @JSImport("speech-rule-engine/js/speech_generator/speech_generator_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generator(`type`: String): SpeechGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("generator")(`type`.asInstanceOf[js.Any]).asInstanceOf[SpeechGenerator]
}
