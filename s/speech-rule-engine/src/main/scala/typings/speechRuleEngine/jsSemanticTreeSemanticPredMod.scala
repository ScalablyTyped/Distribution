package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticRole
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticType
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticPredMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_pred", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareNeutralFences(fence1: SemanticNode, fence2: SemanticNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareNeutralFences")(fence1.asInstanceOf[js.Any], fence2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def elligibleLeftNeutral(fence: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elligibleLeftNeutral")(fence.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def elligibleRightNeutral(fence: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elligibleRightNeutral")(fence.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAccent(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccent")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBigOpBoundary(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigOpBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinomial(table: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinomial")(table.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElligibleEmbellishedFence(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElligibleEmbellishedFence")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmbellished(node: SemanticNode): SemanticType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmbellished")(node.asInstanceOf[js.Any]).asInstanceOf[SemanticType | Null]
  
  inline def isFence(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFence")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFencedElement(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFencedElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isGeneralFunctionBoundary(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneralFunctionBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImplicit(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImplicit")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImplicitOp(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImplicitOp")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegralDxBoundary(firstNode: SemanticNode, secondNode: SemanticNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegralDxBoundary")(firstNode.asInstanceOf[js.Any], secondNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIntegralDxBoundarySingle(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegralDxBoundarySingle")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLimitBase(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLimitBase")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMembership(element: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMembership")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNeutralFence(fence: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNeutralFence")(fence.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOperator(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOperator")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrefixFunctionBoundary(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixFunctionBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPunctuation(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuation")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPureUnit(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPureUnit")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRelation(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelation")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRole(node: SemanticNode, attr: SemanticRole): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRole")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSetNode(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSimpleFunction(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleFunction")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSimpleFunctionHead(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleFunctionHead")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSimpleFunctionScope(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleFunctionScope")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSingletonSetContent(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingletonSetContent")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTableOrMultiline(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTableOrMultiline")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isType(node: SemanticNode, attr: SemanticType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUnitCounter(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitCounter")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnitProduct(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitProduct")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lineIsLabelled(line: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("lineIsLabelled")(line.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def singlePunctAtPosition(nodes: js.Array[SemanticNode], puncts: js.Array[SemanticNode], position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("singlePunctAtPosition")(nodes.asInstanceOf[js.Any], puncts.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tableIsCases(_table: SemanticNode, prevNodes: js.Array[SemanticNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tableIsCases")(_table.asInstanceOf[js.Any], prevNodes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tableIsMatrixOrVector(node: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tableIsMatrixOrVector")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tableIsMultiline(table: SemanticNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tableIsMultiline")(table.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
