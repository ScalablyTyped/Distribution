package typings.speechRuleEngine

import typings.speechRuleEngine.jsHighlighterAbstractHighlighterMod.AbstractHighlighter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsHighlighterSvgHighlighterMod {
  
  @JSImport("speech-rule-engine/js/highlighter/svg_highlighter", "SvgHighlighter")
  @js.native
  open class SvgHighlighter () extends AbstractHighlighter {
    
    def isMactionNode(node: HTMLElement): Boolean = js.native
  }
}
