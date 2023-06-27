package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlEnrichAttrMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich_attr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Attribute extends StObject
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich_attr", "Attribute")
  @js.native
  object Attribute extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Attribute & String] = js.native
    
    @js.native
    sealed trait ADDED
      extends StObject
         with Attribute
    /* "data-semantic-added" */ val ADDED: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.ADDED & String = js.native
    
    @js.native
    sealed trait ALTERNATIVE
      extends StObject
         with Attribute
    /* "data-semantic-alternative" */ val ALTERNATIVE: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.ALTERNATIVE & String = js.native
    
    @js.native
    sealed trait ANNOTATION
      extends StObject
         with Attribute
    /* "data-semantic-annotation" */ val ANNOTATION: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.ANNOTATION & String = js.native
    
    @js.native
    sealed trait ATTRIBUTES
      extends StObject
         with Attribute
    /* "data-semantic-attributes" */ val ATTRIBUTES: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.ATTRIBUTES & String = js.native
    
    @js.native
    sealed trait CHILDREN
      extends StObject
         with Attribute
    /* "data-semantic-children" */ val CHILDREN: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.CHILDREN & String = js.native
    
    @js.native
    sealed trait COLLAPSED
      extends StObject
         with Attribute
    /* "data-semantic-collapsed" */ val COLLAPSED: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.COLLAPSED & String = js.native
    
    @js.native
    sealed trait CONTENT
      extends StObject
         with Attribute
    /* "data-semantic-content" */ val CONTENT: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.CONTENT & String = js.native
    
    @js.native
    sealed trait EMBELLISHED
      extends StObject
         with Attribute
    /* "data-semantic-embellished" */ val EMBELLISHED: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.EMBELLISHED & String = js.native
    
    @js.native
    sealed trait FENCEPOINTER
      extends StObject
         with Attribute
    /* "data-semantic-fencepointer" */ val FENCEPOINTER: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.FENCEPOINTER & String = js.native
    
    @js.native
    sealed trait FONT
      extends StObject
         with Attribute
    /* "data-semantic-font" */ val FONT: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.FONT & String = js.native
    
    @js.native
    sealed trait ID
      extends StObject
         with Attribute
    /* "data-semantic-id" */ val ID: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.ID & String = js.native
    
    @js.native
    sealed trait OPERATOR
      extends StObject
         with Attribute
    /* "data-semantic-operator" */ val OPERATOR: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.OPERATOR & String = js.native
    
    @js.native
    sealed trait OWNS
      extends StObject
         with Attribute
    /* "data-semantic-owns" */ val OWNS: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.OWNS & String = js.native
    
    @js.native
    sealed trait PARENT
      extends StObject
         with Attribute
    /* "data-semantic-parent" */ val PARENT: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.PARENT & String = js.native
    
    @js.native
    sealed trait POSTFIX
      extends StObject
         with Attribute
    /* "data-semantic-postfix" */ val POSTFIX: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.POSTFIX & String = js.native
    
    @js.native
    sealed trait PREFIX
      extends StObject
         with Attribute
    /* "data-semantic-prefix" */ val PREFIX: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.PREFIX & String = js.native
    
    @js.native
    sealed trait ROLE
      extends StObject
         with Attribute
    /* "data-semantic-role" */ val ROLE: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.ROLE & String = js.native
    
    @js.native
    sealed trait SPEECH
      extends StObject
         with Attribute
    /* "data-semantic-speech" */ val SPEECH: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.SPEECH & String = js.native
    
    @js.native
    sealed trait STRUCTURE
      extends StObject
         with Attribute
    /* "data-semantic-structure" */ val STRUCTURE: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.STRUCTURE & String = js.native
    
    @js.native
    sealed trait TYPE
      extends StObject
         with Attribute
    /* "data-semantic-type" */ val TYPE: typings.speechRuleEngine.jsEnrichMathmlEnrichAttrMod.Attribute.TYPE & String = js.native
  }
  
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich_attr", "EnrichAttributes")
  @js.native
  val EnrichAttributes: js.Array[String] = js.native
  
  inline def addPrefix(attr: String): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("addPrefix")(attr.asInstanceOf[js.Any]).asInstanceOf[Attribute]
  
  inline def makeIdList(nodes: js.Array[SemanticNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeIdList")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeAttributePrefix(mml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAttributePrefix")(mml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setAttributes(mml: Element, semantic: SemanticNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttributes")(mml.asInstanceOf[js.Any], semantic.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
