package typings.speechRuleEngine

import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerWalkerMod.Walker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerWalkerFactoryMod {
  
  @JSImport("speech-rule-engine/js/walker/walker_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walker(`type`: String, node: Element, generator: SpeechGenerator, highlighter: Highlighter, xml: String): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("walker")(`type`.asInstanceOf[js.Any], node.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).asInstanceOf[Walker]
}
