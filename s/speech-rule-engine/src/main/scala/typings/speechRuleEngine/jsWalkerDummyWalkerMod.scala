package typings.speechRuleEngine

import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerAbstractWalkerMod.AbstractWalker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerDummyWalkerMod {
  
  @JSImport("speech-rule-engine/js/walker/dummy_walker", "DummyWalker")
  @js.native
  open class DummyWalker protected () extends AbstractWalker[Unit] {
    def this(node: Element, generator: SpeechGenerator, highlighter: Highlighter, xml: String) = this()
  }
}
