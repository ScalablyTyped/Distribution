package typings.speechRuleEngine

import org.scalablytyped.runtime.NumberDictionary
import typings.speechRuleEngine.jsEnrichMathmlAbstractEnrichCaseMod.AbstractEnrichCase
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlCaseEmbellishedMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/case_embellished", "CaseEmbellished")
  @js.native
  open class CaseEmbellished protected () extends AbstractEnrichCase {
    def this(semantic: SemanticNode) = this()
    
    var cfence: SemanticNode = js.native
    
    var cfenceMap: NumberDictionary[Element] = js.native
    
    var cfenceMml: Element = js.native
    
    /* private */ var cleanupParents_ : Any = js.native
    
    var fenced: SemanticNode = js.native
    
    /* private */ var fencedElement: Any = js.native
    
    var fencedMml: Element = js.native
    
    var fencedMmlNodes: js.Array[Element] = js.native
    
    /* private */ var fullFence: Any = js.native
    
    /* private */ var getFencedMml_ : Any = js.native
    
    /* private */ var getFenced_ : Any = js.native
    
    /* private */ var getFencesMml_ : Any = js.native
    
    /* private */ var introduceNewLayer_ : Any = js.native
    
    var ofence: SemanticNode = js.native
    
    var ofenceMap: NumberDictionary[Element] = js.native
    
    var ofenceMml: Element = js.native
    
    var parentCleanup: js.Array[Element] = js.native
    
    /* private */ var rewrite_ : Any = js.native
    
    /* private */ var specialCase_ : Any = js.native
  }
  /* static members */
  object CaseEmbellished {
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_embellished", "CaseEmbellished")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_embellished", "CaseEmbellished.fencedMap_")
    @js.native
    def fencedMap_ : Any = js.native
    inline def fencedMap__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fencedMap_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/enrich_mathml/case_embellished", "CaseEmbellished.makeEmptyNode_")
    @js.native
    def makeEmptyNode_ : Any = js.native
    inline def makeEmptyNode__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeEmptyNode_")(x.asInstanceOf[js.Any])
    
    inline def test(semantic: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(semantic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
