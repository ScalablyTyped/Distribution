package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlCaseMultiindexMod.CaseMultiindex
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseMultiscriptsMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/case_multiscripts", "CaseMultiscripts")
  @js.native
  open class CaseMultiscripts protected () extends CaseMultiindex {
    def this(semantic: SemanticNode) = this()
  }
  /* static members */
  object CaseMultiscripts {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_multiscripts", "CaseMultiscripts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def test(semantic: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(semantic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
