package typings.speechRuleEngine

import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerAbstractWalkerMod.AbstractWalker
import typings.speechRuleEngine.jsWalkerLevelsMod.Levels
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerSyntaxWalkerMod {
  
  @JSImport("speech-rule-engine/js/walker/syntax_walker", "SyntaxWalker")
  @js.native
  open class SyntaxWalker protected () extends AbstractWalker[String] {
    def this(node: Element, generator: SpeechGenerator, highlighter: Highlighter, xml: String) = this()
    
    @JSName("levels")
    var levels_SyntaxWalker: Levels[String] = js.native
  }
}
