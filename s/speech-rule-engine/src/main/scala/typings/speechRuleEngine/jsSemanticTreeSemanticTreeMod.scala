package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticDefaultMod.SemanticMeaningCollator
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSemanticTreeSemanticParserMod.SemanticParser
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticTreeMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_tree", "SemanticTree")
  @js.native
  open class SemanticTree protected () extends StObject {
    def this(mathml: Element) = this()
    
    var collator: SemanticMeaningCollator = js.native
    
    def displayTree(): Unit = js.native
    
    def formatXml(): String = js.native
    def formatXml(opt_brief: Boolean): String = js.native
    
    var mathml: Element = js.native
    
    var parser: SemanticParser[Element] = js.native
    
    def replaceNode(oldNode: SemanticNode, newNode: SemanticNode): Unit = js.native
    
    var root: SemanticNode = js.native
    
    def toJson(): Any = js.native
    
    def toString(opt_brief: Boolean): String = js.native
    
    def xml(): Element = js.native
    def xml(opt_brief: Boolean): Element = js.native
  }
  /* static members */
  object SemanticTree {
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_tree", "SemanticTree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): SemanticTree = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[SemanticTree]
    
    inline def fromNode(semantic: SemanticNode): SemanticTree = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(semantic.asInstanceOf[js.Any]).asInstanceOf[SemanticTree]
    inline def fromNode(semantic: SemanticNode, opt_mathml: Element): SemanticTree = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(semantic.asInstanceOf[js.Any], opt_mathml.asInstanceOf[js.Any])).asInstanceOf[SemanticTree]
    
    inline def fromRoot(semantic: SemanticNode): SemanticTree = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRoot")(semantic.asInstanceOf[js.Any]).asInstanceOf[SemanticTree]
    inline def fromRoot(semantic: SemanticNode, opt_mathml: Element): SemanticTree = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRoot")(semantic.asInstanceOf[js.Any], opt_mathml.asInstanceOf[js.Any])).asInstanceOf[SemanticTree]
    
    inline def fromXml(xml: Element): SemanticTree = ^.asInstanceOf[js.Dynamic].applyDynamic("fromXml")(xml.asInstanceOf[js.Any]).asInstanceOf[SemanticTree]
  }
}
