package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesUnitUtilMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/unit_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oneLeft(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneLeft")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def unitMultipliers(nodes: js.Array[Element], _context: String): js.Function0[js.Array[AuditoryDescription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unitMultipliers")(nodes.asInstanceOf[js.Any], _context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[AuditoryDescription]]]
}
