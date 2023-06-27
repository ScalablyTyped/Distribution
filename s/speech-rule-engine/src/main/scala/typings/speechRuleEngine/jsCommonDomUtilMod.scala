package typings.speechRuleEngine

import typings.std.Element
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeList
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonDomUtilMod {
  
  @JSImport("speech-rule-engine/js/common/dom_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("speech-rule-engine/js/common/dom_util", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType & Double] = js.native
    
    @js.native
    sealed trait ATTRIBUTE_NODE
      extends StObject
         with NodeType
    /* 2 */ val ATTRIBUTE_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.ATTRIBUTE_NODE & Double = js.native
    
    @js.native
    sealed trait CDATA_SECTION_NODE
      extends StObject
         with NodeType
    /* 4 */ val CDATA_SECTION_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.CDATA_SECTION_NODE & Double = js.native
    
    @js.native
    sealed trait COMMENT_NODE
      extends StObject
         with NodeType
    /* 8 */ val COMMENT_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.COMMENT_NODE & Double = js.native
    
    @js.native
    sealed trait DOCUMENT_FRAGMENT_NODE
      extends StObject
         with NodeType
    /* 11 */ val DOCUMENT_FRAGMENT_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.DOCUMENT_FRAGMENT_NODE & Double = js.native
    
    @js.native
    sealed trait DOCUMENT_NODE
      extends StObject
         with NodeType
    /* 9 */ val DOCUMENT_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.DOCUMENT_NODE & Double = js.native
    
    @js.native
    sealed trait DOCUMENT_TYPE_NODE
      extends StObject
         with NodeType
    /* 10 */ val DOCUMENT_TYPE_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.DOCUMENT_TYPE_NODE & Double = js.native
    
    @js.native
    sealed trait ELEMENT_NODE
      extends StObject
         with NodeType
    /* 1 */ val ELEMENT_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.ELEMENT_NODE & Double = js.native
    
    @js.native
    sealed trait ENTITY_NODE
      extends StObject
         with NodeType
    /* 6 */ val ENTITY_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.ENTITY_NODE & Double = js.native
    
    @js.native
    sealed trait ENTITY_REFERENCE_NODE
      extends StObject
         with NodeType
    /* 5 */ val ENTITY_REFERENCE_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.ENTITY_REFERENCE_NODE & Double = js.native
    
    @js.native
    sealed trait NOTATION_NODE
      extends StObject
         with NodeType
    /* 12 */ val NOTATION_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.NOTATION_NODE & Double = js.native
    
    @js.native
    sealed trait PROCESSING_INSTRUCTION_NODE
      extends StObject
         with NodeType
    /* 7 */ val PROCESSING_INSTRUCTION_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.PROCESSING_INSTRUCTION_NODE & Double = js.native
    
    @js.native
    sealed trait TEXT_NODE
      extends StObject
         with NodeType
    /* 3 */ val TEXT_NODE: typings.speechRuleEngine.jsCommonDomUtilMod.NodeType.TEXT_NODE & Double = js.native
  }
  
  inline def cloneNode(node: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(node.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createElement(tag: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createElementNS(url: String, tag: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")(url.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def createTextNode(content: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextNode")(content.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  inline def formatXml(xml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatXml")(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseInput(input: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInput")(input.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def querySelectorAll(node: Element, tag: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(node.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def querySelectorAllByAttr(node: Element, attr: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAllByAttr")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def querySelectorAllByAttrValue(node: Element, attr: String, value: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAllByAttrValue")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def replaceNode(oldNode: Node, newNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(oldNode.asInstanceOf[js.Any], newNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serializeXml(node: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeXml")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tagName(node: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tagName")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toArray(nodeList: NamedNodeMap): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(nodeList.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def toArray(nodeList: NodeList): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(nodeList.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
