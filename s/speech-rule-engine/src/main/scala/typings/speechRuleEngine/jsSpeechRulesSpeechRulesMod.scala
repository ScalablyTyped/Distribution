package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.SpeechRuleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesSpeechRulesMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/speech_rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addStore(constr: String, inherit: String, store: StringDictionary[SpeechRuleFunction]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStore")(constr.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getStore(locale: String, modality: String, domain: String): StringDictionary[SpeechRuleFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStore")(locale.asInstanceOf[js.Any], modality.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[SpeechRuleFunction]]
}
