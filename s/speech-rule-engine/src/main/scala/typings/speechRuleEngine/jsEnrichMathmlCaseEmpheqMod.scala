package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlAbstractEnrichCaseMod.AbstractEnrichCase
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseEmpheqMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/case_empheq", "CaseEmpheq")
  @js.native
  open class CaseEmpheq protected () extends AbstractEnrichCase {
    def this(semantic: SemanticNode) = this()
    
    /* private */ var finalizeTable: Any = js.native
    
    var mml: Element = js.native
    
    /* private */ var mrows: Any = js.native
    
    /* private */ var recurseToTable: Any = js.native
  }
  /* static members */
  object CaseEmpheq {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_empheq", "CaseEmpheq")
    @js.native
    val ^ : js.Any = js.native
    
    inline def test(semantic: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(semantic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
