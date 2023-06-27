package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticAnnotatorMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_annotator", "SemanticAnnotator")
  @js.native
  open class SemanticAnnotator protected () extends StObject {
    def this(domain: String, name: String, func: js.Function1[/* p1 */ SemanticNode, Any]) = this()
    
    var active: Boolean = js.native
    
    def annotate(node: SemanticNode): Unit = js.native
    
    var domain: String = js.native
    
    def func(p1: SemanticNode): Any = js.native
    
    var name: String = js.native
  }
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_annotator", "SemanticVisitor")
  @js.native
  open class SemanticVisitor protected () extends StObject {
    def this(
      domain: String,
      name: String,
      func: js.Function2[/* p1 */ SemanticNode, /* p2 */ StringDictionary[Any], Any]
    ) = this()
    def this(
      domain: String,
      name: String,
      func: js.Function2[/* p1 */ SemanticNode, /* p2 */ StringDictionary[Any], Any],
      `def`: StringDictionary[Any]
    ) = this()
    
    var active: Boolean = js.native
    
    var `def`: StringDictionary[Any] = js.native
    
    var domain: String = js.native
    
    def func(p1: SemanticNode, p2: StringDictionary[Any]): Any = js.native
    
    var name: String = js.native
    
    def visit(node: SemanticNode, info: StringDictionary[Any]): Any = js.native
  }
}
