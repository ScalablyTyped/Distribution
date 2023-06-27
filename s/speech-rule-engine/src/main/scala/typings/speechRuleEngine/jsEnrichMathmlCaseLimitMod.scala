package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlAbstractEnrichCaseMod.AbstractEnrichCase
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseLimitMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/case_limit", "CaseLimit")
  @js.native
  open class CaseLimit protected () extends AbstractEnrichCase {
    def this(semantic: SemanticNode) = this()
    
    var mml: Element = js.native
  }
  /* static members */
  object CaseLimit {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_limit", "CaseLimit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def test(semantic: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(semantic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_limit", "CaseLimit.walkTree_")
    @js.native
    def walkTree_ : Any = js.native
    inline def walkTree__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("walkTree_")(x.asInstanceOf[js.Any])
  }
}
