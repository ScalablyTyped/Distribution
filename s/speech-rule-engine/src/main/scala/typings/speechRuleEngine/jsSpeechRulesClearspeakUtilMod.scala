package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesClearspeakUtilMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/clearspeak_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allCellsSimple(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("allCellsSimple")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def fencedArguments(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("fencedArguments")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def isSmallVulgarFraction(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmallVulgarFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def matchingFences(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchingFences")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def nestingDepth(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("nestingDepth")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def nodeCounter(nodes: js.Array[Node]): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeCounter")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
  inline def nodeCounter(nodes: js.Array[Node], context: String): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCounter")(nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
  
  inline def ordinalExponent(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalExponent")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def simpleArguments(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleArguments")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def wordOrdinal(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordOrdinal")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
}
