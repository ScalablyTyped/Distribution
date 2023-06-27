package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticMeaning
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticRole
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticType
import typings.speechRuleEngine.speechRuleEngineStrings.$t
import typings.speechRuleEngine.speechRuleEngineStrings.`type`
import typings.speechRuleEngine.speechRuleEngineStrings.annotation
import typings.speechRuleEngine.speechRuleEngineStrings.children
import typings.speechRuleEngine.speechRuleEngineStrings.content
import typings.speechRuleEngine.speechRuleEngineStrings.embellished
import typings.speechRuleEngine.speechRuleEngineStrings.fencepointer
import typings.speechRuleEngine.speechRuleEngineStrings.font
import typings.speechRuleEngine.speechRuleEngineStrings.id
import typings.speechRuleEngine.speechRuleEngineStrings.role
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticNodeMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_node", "SemanticNode")
  @js.native
  open class SemanticNode protected () extends StObject {
    def this(id: Double) = this()
    
    def addAnnotation(domain: String, annotation: String): Unit = js.native
    
    /* private */ var addAnnotation_ : Any = js.native
    
    /* private */ var addExternalAttributes: Any = js.native
    
    def addMathmlNodes(mmlNodes: js.Array[Element]): Unit = js.native
    
    def allAttributes(): js.Array[js.Tuple2[Attribute, String]] = js.native
    
    var annotation: StringDictionary[js.Array[String]] = js.native
    
    /* private */ var annotationXml: Any = js.native
    
    def appendChild(child: SemanticNode): Unit = js.native
    
    def appendContentNode(node: SemanticNode): Unit = js.native
    
    var attributes: StringDictionary[String] = js.native
    
    def attributesXml(): String = js.native
    
    var childNodes: js.Array[SemanticNode] = js.native
    
    var contentNodes: js.Array[SemanticNode] = js.native
    
    def displayTree(): Unit = js.native
    
    /* private */ var displayTree_ : Any = js.native
    
    var embellished: SemanticType = js.native
    
    def equals(node: SemanticNode): Boolean = js.native
    
    var fencePointer: String = js.native
    
    var font: SemanticFont = js.native
    
    def getAnnotation(domain: String): js.Array[String] = js.native
    
    def hasAnnotation(domain: String, annotation: String): Boolean = js.native
    
    var id: Double = js.native
    
    var mathml: js.Array[Element] = js.native
    
    var mathmlTree: Element = js.native
    
    /* private */ var mathmlTreeString: Any = js.native
    
    def meaning(): SemanticMeaning = js.native
    
    var nobreaking: Boolean = js.native
    
    var parent: SemanticNode = js.native
    
    def parseAnnotation(stateStr: String): Unit = js.native
    
    def parseAttributes(stateStr: String): Unit = js.native
    
    def querySelectorAll(pred: js.Function1[/* p1 */ this.type, Boolean]): js.Array[SemanticNode] = js.native
    
    def removeContentNode(node: SemanticNode): Unit = js.native
    
    /* private */ var removeMathmlNodes: Any = js.native
    
    def replaceChild(oldNode: SemanticNode, newNode: SemanticNode): Unit = js.native
    
    var role: SemanticRole = js.native
    
    var textContent: String = js.native
    
    def toJson(): Any = js.native
    
    def toString(brief: Boolean): String = js.native
    
    var `type`: SemanticType = js.native
    
    def updateContent(content: String): Unit = js.native
    def updateContent(content: String, text: Boolean): Unit = js.native
    
    def xml(xml: Document): Element = js.native
    def xml(xml: Document, brief: Boolean): Element = js.native
    
    /* private */ var xmlAttributes: Any = js.native
  }
  /* static members */
  object SemanticNode {
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_node", "SemanticNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromXml(xml: Element): SemanticNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromXml")(xml.asInstanceOf[js.Any]).asInstanceOf[SemanticNode]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_node", "SemanticNode.processChildren")
    @js.native
    def processChildren: Any = js.native
    inline def processChildren_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processChildren")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_node", "SemanticNode.setAttribute")
    @js.native
    def setAttribute: Any = js.native
    inline def setAttribute_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.speechRuleEngine.speechRuleEngineStrings.embellished
    - typings.speechRuleEngine.speechRuleEngineStrings.fencepointer
    - typings.speechRuleEngine.speechRuleEngineStrings.font
    - typings.speechRuleEngine.speechRuleEngineStrings.id
    - typings.speechRuleEngine.speechRuleEngineStrings.annotation
    - typings.speechRuleEngine.speechRuleEngineStrings.role
    - typings.speechRuleEngine.speechRuleEngineStrings.`type`
    - typings.speechRuleEngine.speechRuleEngineStrings.children
    - typings.speechRuleEngine.speechRuleEngineStrings.content
    - typings.speechRuleEngine.speechRuleEngineStrings.$t
  */
  trait Attribute extends StObject
  object Attribute {
    
    inline def ANNOTATION: annotation = "annotation".asInstanceOf[annotation]
    
    inline def CHILDREN: children = "children".asInstanceOf[children]
    
    inline def CONTENT: content = "content".asInstanceOf[content]
    
    inline def EMBELLISHED: embellished = "embellished".asInstanceOf[embellished]
    
    inline def FENCEPOINTER: fencepointer = "fencepointer".asInstanceOf[fencepointer]
    
    inline def FONT: font = "font".asInstanceOf[font]
    
    inline def ID: id = "id".asInstanceOf[id]
    
    inline def ROLE: role = "role".asInstanceOf[role]
    
    inline def TEXT: $t = "$t".asInstanceOf[$t]
    
    inline def TYPE: `type` = "type".asInstanceOf[`type`]
  }
}
