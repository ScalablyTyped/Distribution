package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSemanticTreeSemanticSkeletonMod.Sexp
import typings.speechRuleEngine.jsSemanticTreeSemanticTreeMod.SemanticTree
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlEnrichMathmlMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich_mathml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCollapsedAttribute(node: Element, collapsed: Sexp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCollapsedAttribute")(node.asInstanceOf[js.Any], collapsed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ascendNewNode(newNode: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ascendNewNode")(newNode.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def cloneContentNode(content: SemanticNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneContentNode")(content.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def collapsePunctuated(semantic: SemanticNode): Sexp = ^.asInstanceOf[js.Dynamic].applyDynamic("collapsePunctuated")(semantic.asInstanceOf[js.Any]).asInstanceOf[Sexp]
  inline def collapsePunctuated(semantic: SemanticNode, opt_children: js.Array[Element]): Sexp = (^.asInstanceOf[js.Dynamic].applyDynamic("collapsePunctuated")(semantic.asInstanceOf[js.Any], opt_children.asInstanceOf[js.Any])).asInstanceOf[Sexp]
  
  inline def enrich(mml: Element, semantic: SemanticTree): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("enrich")(mml.asInstanceOf[js.Any], semantic.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def getInnerNode(node: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerNode")(node.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def introduceNewLayer(children: js.Array[Element], semantic: SemanticNode): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("introduceNewLayer")(children.asInstanceOf[js.Any], semantic.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def rewriteMfenced(mml: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriteMfenced")(mml.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def setOperatorAttribute(semantic: SemanticNode, content: js.Array[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOperatorAttribute")(semantic.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkTree(semantic: SemanticNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("walkTree")(semantic.asInstanceOf[js.Any]).asInstanceOf[Element]
}
