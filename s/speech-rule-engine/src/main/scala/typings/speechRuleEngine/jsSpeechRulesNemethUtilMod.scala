package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesNemethUtilMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/nemeth_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closingFraction(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def closingRadical(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingRadical")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def contentIterator(nodes: js.Array[Element], context: String): js.Function0[js.Array[AuditoryDescription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("contentIterator")(nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[AuditoryDescription]]]
  
  inline def hyperFractionBoundary(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("hyperFractionBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def implicitIterator(nodes: js.Array[Element], context: String): js.Function0[js.Array[AuditoryDescription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("implicitIterator")(nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[AuditoryDescription]]]
  
  inline def indexRadical(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRadical")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingFraction(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingRadical(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingRadical")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def overBevelledFraction(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("overBevelledFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def overFraction(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("overFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def relationIterator(nodes: js.Array[Element], context: String): js.Function0[js.Array[AuditoryDescription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("relationIterator")(nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[AuditoryDescription]]]
}
