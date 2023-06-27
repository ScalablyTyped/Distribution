package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlCaseMultiindexMod.CaseMultiindex
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseTensorMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/case_tensor", "CaseTensor")
  @js.native
  open class CaseTensor protected () extends CaseMultiindex {
    def this(semantic: SemanticNode) = this()
  }
  /* static members */
  object CaseTensor {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_tensor", "CaseTensor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def test(semantic: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(semantic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
