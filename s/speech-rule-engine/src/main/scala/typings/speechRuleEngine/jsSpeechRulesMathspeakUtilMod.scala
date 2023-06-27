package typings.speechRuleEngine

import typings.speechRuleEngine.anon.Sub
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.speechRuleEngine.jsRuleEngineSpeechRuleStoreMod.SpeechRuleStore
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesMathspeakUtilMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/mathspeak_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baselineBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("baselineBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def baselineVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("baselineVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def closingFractionBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingFractionBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def closingFractionSbrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingFractionSbrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def closingFractionVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingFractionVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def closingRadicalBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingRadicalBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def closingRadicalVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("closingRadicalVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def determinantIsSimple(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("determinantIsSimple")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def endscripts(_node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("endscripts")(_node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def fractionNestingDepth(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fractionNestingDepth")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def generateBaselineConstraint(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBaselineConstraint")().asInstanceOf[js.Array[String]]
  
  inline def generateTensorRules(store: SpeechRuleStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTensorRules")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generateTensorRules(store: SpeechRuleStore, brief: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTensorRules")(store.asInstanceOf[js.Any], brief.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def indexRadicalBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRadicalBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def indexRadicalSbrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRadicalSbrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def indexRadicalVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRadicalVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def isSmallVulgarFraction(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmallVulgarFraction")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def nestedOverscript(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("nestedOverscript")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def nestedSubSuper(node: Element, init: String, replace: Sub): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nestedSubSuper")(node.asInstanceOf[js.Any], init.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def nestedUnderscript(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("nestedUnderscript")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingFractionBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingFractionBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingFractionSbrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingFractionSbrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingFractionVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingFractionVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingRadicalBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingRadicalBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingRadicalSbrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingRadicalSbrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def openingRadicalVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("openingRadicalVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def overFractionSbrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("overFractionSbrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def overFractionVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("overFractionVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def removeParens(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeParens")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def resetNestingDepth(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetNestingDepth")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def smallRoot(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("smallRoot")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def spaceoutIdentifier(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("spaceoutIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def spaceoutNumber(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("spaceoutNumber")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def spaceoutText(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("spaceoutText")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def subscriptBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscriptBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def subscriptVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscriptVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def superscriptBrief(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("superscriptBrief")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
  
  inline def superscriptVerbose(node: Element): js.Array[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("superscriptVerbose")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Span]]
}
