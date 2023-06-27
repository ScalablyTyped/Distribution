package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlEnrichCaseMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich_case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich_case", "factory")
  @js.native
  val factory: js.Array[Case] = js.native
  
  inline def getCase(node: SemanticNode): EnrichCase = ^.asInstanceOf[js.Dynamic].applyDynamic("getCase")(node.asInstanceOf[js.Any]).asInstanceOf[EnrichCase]
  
  trait Case extends StObject {
    
    def constr(p1: SemanticNode): EnrichCase
    
    def test(p1: SemanticNode): Boolean
  }
  object Case {
    
    inline def apply(constr: SemanticNode => EnrichCase, test: SemanticNode => Boolean): Case = {
      val __obj = js.Dynamic.literal(constr = js.Any.fromFunction1(constr), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[Case]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Case] (val x: Self) extends AnyVal {
      
      inline def setConstr(value: SemanticNode => EnrichCase): Self = StObject.set(x, "constr", js.Any.fromFunction1(value))
      
      inline def setTest(value: SemanticNode => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait EnrichCase extends StObject {
    
    def getMathml(): Element
  }
  object EnrichCase {
    
    inline def apply(getMathml: () => Element): EnrichCase = {
      val __obj = js.Dynamic.literal(getMathml = js.Any.fromFunction0(getMathml))
      __obj.asInstanceOf[EnrichCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnrichCase] (val x: Self) extends AnyVal {
      
      inline def setGetMathml(value: () => Element): Self = StObject.set(x, "getMathml", js.Any.fromFunction0(value))
    }
  }
}
