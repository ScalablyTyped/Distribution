package typings.speechRuleEngine

import typings.speechRuleEngine.jsEnrichMathmlEnrichCaseMod.EnrichCase
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlAbstractEnrichCaseMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/enrich_mathml/abstract_enrich_case", "AbstractEnrichCase")
  @js.native
  open class AbstractEnrichCase protected ()
    extends StObject
       with EnrichCase {
    def this(semantic: SemanticNode) = this()
    
    /* CompleteClass */
    override def getMathml(): Element = js.native
    
    var semantic: SemanticNode = js.native
  }
}
