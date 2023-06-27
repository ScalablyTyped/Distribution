package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlAbstractEnrichCaseMod.AbstractEnrichCase
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseProofMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/case_proof", "CaseProof")
  @js.native
  open class CaseProof protected () extends AbstractEnrichCase {
    def this(semantic: SemanticNode) = this()
    
    var mml: Element = js.native
  }
  /* static members */
  object CaseProof {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_proof", "CaseProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def test(semantic: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(semantic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
