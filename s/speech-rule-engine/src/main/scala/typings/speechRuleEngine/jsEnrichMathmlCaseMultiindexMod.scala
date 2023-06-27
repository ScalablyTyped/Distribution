package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlAbstractEnrichCaseMod.AbstractEnrichCase
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSemanticTreeSemanticSkeletonMod.Sexp
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseMultiindexMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/enrich_mathml/case_multiindex", "CaseMultiindex")
  @js.native
  open class CaseMultiindex protected () extends AbstractEnrichCase {
    def this(semantic: SemanticNode) = this()
    
    /* protected */ def completeMultiscript(rightIndices: Sexp, leftIndices: Sexp): Unit = js.native
    
    var mml: Element = js.native
  }
  /* static members */
  object CaseMultiindex {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_multiindex", "CaseMultiindex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_multiindex", "CaseMultiindex.createNone_")
    @js.native
    def createNone_ : Any = js.native
    inline def createNone__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNone_")(x.asInstanceOf[js.Any])
    
    inline def multiscriptIndex(index: SemanticNode): Sexp = ^.asInstanceOf[js.Dynamic].applyDynamic("multiscriptIndex")(index.asInstanceOf[js.Any]).asInstanceOf[Sexp]
  }
}
