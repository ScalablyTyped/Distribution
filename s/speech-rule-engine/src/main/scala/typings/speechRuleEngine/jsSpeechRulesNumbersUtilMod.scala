package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesNumbersUtilMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/numbers_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ordinalCounter(_node: Node, context: String): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ordinalCounter")(_node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
  
  inline def ordinalPosition(node: Node): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalPosition")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def vulgarFraction(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("vulgarFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def wordCounter(_node: Element, context: String): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("wordCounter")(_node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
}
