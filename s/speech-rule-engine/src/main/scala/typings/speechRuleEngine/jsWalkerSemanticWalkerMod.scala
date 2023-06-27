package typings.speechRuleEngine

import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerAbstractWalkerMod.AbstractWalker
import typings.speechRuleEngine.jsWalkerFocusMod.Focus
import typings.speechRuleEngine.jsWalkerLevelsMod.Levels
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerSemanticWalkerMod {
  
  @JSImport("speech-rule-engine/js/walker/semantic_walker", "SemanticWalker")
  @js.native
  open class SemanticWalker protected () extends AbstractWalker[Focus] {
    def this(node: Element, generator: SpeechGenerator, highlighter: Highlighter, xml: String) = this()
    
    def combinePunctuations(
      children: js.Array[String],
      content: js.Array[String],
      prepunct: js.Array[String],
      acc: js.Array[Focus]
    ): js.Array[Focus] = js.native
    
    @JSName("levels")
    var levels_SemanticWalker: Levels[Focus] = js.native
    
    def makePairList(children: js.Array[String], content: js.Array[String]): js.Array[Focus] = js.native
  }
}
