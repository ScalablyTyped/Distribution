package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesAlphabetGeneratorMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/alphabet_generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def generateBase(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBase")().asInstanceOf[Unit]
}
