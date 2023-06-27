package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.anon.Conclusion
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeFactoryMod.SemanticNodeFactory
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticProcessorMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with SemanticProcessor
  /* static members */
  object default {
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.CLASSIFY_FUNCTION_")
    @js.native
    val CLASSIFY_FUNCTION_ : Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.FENCE_TO_PUNCT_")
    @js.native
    val FENCE_TO_PUNCT_ : Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.MATHJAX_FONTS")
    @js.native
    val MATHJAX_FONTS: Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.MML_TO_BOUNDS_")
    @js.native
    val MML_TO_BOUNDS_ : Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.MML_TO_LIMIT_")
    @js.native
    val MML_TO_LIMIT_ : Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.assignRoleToRow_")
    @js.native
    def assignRoleToRow_ : Any = js.native
    inline def assignRoleToRow__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assignRoleToRow_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.binomialForm_")
    @js.native
    def binomialForm_ : Any = js.native
    inline def binomialForm__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binomialForm_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.cayleySpacing")
    @js.native
    def cayleySpacing: Any = js.native
    inline def cayleySpacing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cayleySpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.classifyByColumns_")
    @js.native
    def classifyByColumns_ : Any = js.native
    inline def classifyByColumns__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classifyByColumns_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.classifyFunction_")
    @js.native
    def classifyFunction_ : Any = js.native
    inline def classifyFunction__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classifyFunction_")(x.asInstanceOf[js.Any])
    
    inline def classifyMultiline(multiline: SemanticNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("classifyMultiline")(multiline.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def classifyTable(table: SemanticNode): SemanticNode = ^.asInstanceOf[js.Dynamic].applyDynamic("classifyTable")(table.asInstanceOf[js.Any]).asInstanceOf[SemanticNode]
    
    inline def compSemantics(node: SemanticNode, field: String, sem: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compSemantics")(node.asInstanceOf[js.Any], field.asInstanceOf[js.Any], sem.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.computeColumns_")
    @js.native
    def computeColumns_ : Any = js.native
    inline def computeColumns__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computeColumns_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.detectCaleyTable")
    @js.native
    def detectCaleyTable: Any = js.native
    inline def detectCaleyTable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detectCaleyTable")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.exprFont_")
    @js.native
    def exprFont_ : Any = js.native
    inline def exprFont__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exprFont_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.fenceToPunct_")
    @js.native
    def fenceToPunct_ : Any = js.native
    inline def fenceToPunct__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fenceToPunct_")(x.asInstanceOf[js.Any])
    
    inline def findSemantics(node: Element, attr: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findSemantics")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def findSemantics(node: Element, attr: String, opt_value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findSemantics")(node.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], opt_value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.getComponentRoles_")
    @js.native
    def getComponentRoles_ : Any = js.native
    inline def getComponentRoles__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getComponentRoles_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.getFunctionOp_")
    @js.native
    def getFunctionOp_ : Any = js.native
    inline def getFunctionOp__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFunctionOp_")(x.asInstanceOf[js.Any])
    
    inline def getInstance(): SemanticProcessor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[SemanticProcessor]
    
    inline def getSemantics(node: Element): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemantics")(node.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.getSpacer_")
    @js.native
    def getSpacer_ : Any = js.native
    inline def getSpacer__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSpacer_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.isEndRelation_")
    @js.native
    def isEndRelation_ : Any = js.native
    inline def isEndRelation__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEndRelation_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.isPureRelation_")
    @js.native
    def isPureRelation_ : Any = js.native
    inline def isPureRelation__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPureRelation_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.matchSpaces_")
    @js.native
    def matchSpaces_ : Any = js.native
    inline def matchSpaces__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchSpaces_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.nextSeparatorFunction_")
    @js.native
    def nextSeparatorFunction_ : Any = js.native
    inline def nextSeparatorFunction__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextSeparatorFunction_")(x.asInstanceOf[js.Any])
    
    inline def number(node: SemanticNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.numberRole_")
    @js.native
    def numberRole_ : Any = js.native
    inline def numberRole__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numberRole_")(x.asInstanceOf[js.Any])
    
    inline def proof(
      node: Element,
      semantics: String,
      parse: js.Function1[/* p1 */ js.Array[Element], js.Array[SemanticNode]]
    ): SemanticNode = (^.asInstanceOf[js.Dynamic].applyDynamic("proof")(node.asInstanceOf[js.Any], semantics.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[SemanticNode]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.propagateFencePointer_")
    @js.native
    def propagateFencePointer_ : Any = js.native
    inline def propagateFencePointer__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propagateFencePointer_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.propagateFunctionRole_")
    @js.native
    def propagateFunctionRole_ : Any = js.native
    inline def propagateFunctionRole__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propagateFunctionRole_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.purgeFences_")
    @js.native
    def purgeFences_ : Any = js.native
    inline def purgeFences__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purgeFences_")(x.asInstanceOf[js.Any])
    
    inline def removePrefix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removePrefix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.rewriteFence_")
    @js.native
    def rewriteFence_ : Any = js.native
    inline def rewriteFence__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rewriteFence_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.rewriteFencedLine_")
    @js.native
    def rewriteFencedLine_ : Any = js.native
    inline def rewriteFencedLine__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rewriteFencedLine_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.rewriteFencedNode_")
    @js.native
    def rewriteFencedNode_ : Any = js.native
    inline def rewriteFencedNode__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rewriteFencedNode_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.rowToLine_")
    @js.native
    def rowToLine_ : Any = js.native
    inline def rowToLine__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowToLine_")(x.asInstanceOf[js.Any])
    
    inline def separateSemantics(attr: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateSemantics")(attr.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.tableToCases_")
    @js.native
    def tableToCases_ : Any = js.native
    inline def tableToCases__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableToCases_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.tableToMatrixOrVector_")
    @js.native
    def tableToMatrixOrVector_ : Any = js.native
    inline def tableToMatrixOrVector__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableToMatrixOrVector_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.tableToMatrix_")
    @js.native
    def tableToMatrix_ : Any = js.native
    inline def tableToMatrix__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableToMatrix_")(x.asInstanceOf[js.Any])
    
    inline def tableToMultiline(table: SemanticNode): SemanticNode = ^.asInstanceOf[js.Dynamic].applyDynamic("tableToMultiline")(table.asInstanceOf[js.Any]).asInstanceOf[SemanticNode]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.tableToSquare_")
    @js.native
    def tableToSquare_ : Any = js.native
    inline def tableToSquare__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableToSquare_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.tableToVector_")
    @js.native
    def tableToVector_ : Any = js.native
    inline def tableToVector__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableToVector_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_processor", "default.testColumns_")
    @js.native
    def testColumns_ : Any = js.native
    inline def testColumns__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testColumns_")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SemanticProcessor extends StObject {
    
    /* private */ var accentNode_ : Any = js.native
    
    /* private */ var accentRole_ : Any = js.native
    
    /* private */ var addFactor: Any = js.native
    
    /* private */ var appendAdditiveOp_ : Any = js.native
    
    /* private */ var appendDivisionOp_ : Any = js.native
    
    /* private */ var appendExistingOperator_ : Any = js.native
    
    /* private */ var appendLastOperand_ : Any = js.native
    
    /* private */ var appendMultiplicativeOp_ : Any = js.native
    
    /* private */ var appendOperand_ : Any = js.native
    
    /* private */ var bigOpNode_ : Any = js.native
    
    /* private */ var classifyHorizontalFence_ : Any = js.native
    
    def cleanInference(nodes: NodeList): js.Array[Element] = js.native
    
    /* private */ var combineFencedContent_ : Any = js.native
    
    /* private */ var combineUnits_ : Any = js.native
    
    /* private */ var concatNode_ : Any = js.native
    
    /* private */ var dummyNode_ : Any = js.native
    
    /* private */ var explicitMixed_ : Any = js.native
    
    /* private */ var factory_ : Any = js.native
    
    /* private */ var fences_ : Any = js.native
    
    def findNestedRow(nodes: js.Array[Element], semantic: String): Element = js.native
    def findNestedRow(nodes: js.Array[Element], semantic: String, opt_value: String): Element = js.native
    
    /* private */ var findNestedRow_ : Any = js.native
    
    def font(font: String): SemanticFont = js.native
    
    def fractionLikeNode(denom: SemanticNode, enume: SemanticNode, linethickness: String, bevelled: Boolean): SemanticNode = js.native
    
    /* private */ var fractionNode_ : Any = js.native
    
    var funcAppls: StringDictionary[SemanticNode] = js.native
    
    /* private */ var functionNode_ : Any = js.native
    
    /* private */ var functionalNode_ : Any = js.native
    
    /* private */ var getFencesInRow_ : Any = js.native
    
    def getFormulas(
      node: Element,
      children: js.Array[Element],
      parse: js.Function1[/* p1 */ js.Array[Element], js.Array[SemanticNode]]
    ): Conclusion = js.native
    
    /* private */ var getFunctionArgs_ : Any = js.native
    
    /* private */ var getFunctionsInRow_ : Any = js.native
    
    /* private */ var getIntegralArgs_ : Any = js.native
    
    def getLabel(
      _node: Element,
      children: js.Array[Element],
      parse: js.Function1[/* p1 */ js.Array[Element], js.Array[SemanticNode]],
      side: String
    ): SemanticNode = js.native
    
    /* private */ var getMixedNumbers_ : Any = js.native
    
    def getNodeFactory(): SemanticNodeFactory = js.native
    
    /* private */ var getPunctuationInRow_ : Any = js.native
    
    /* private */ var getTextInRow_ : Any = js.native
    
    /* private */ var horizontalFencedNode_ : Any = js.native
    
    def identifierNode(leaf: SemanticNode, font: SemanticFont, unit: String): SemanticNode = js.native
    
    def implicitNode(nodes: js.Array[SemanticNode]): SemanticNode = js.native
    
    /* private */ var implicitNode_ : Any = js.native
    
    def inference(
      node: Element,
      semantics: StringDictionary[String],
      parse: js.Function1[/* p1 */ js.Array[Element], js.Array[SemanticNode]]
    ): SemanticNode = js.native
    
    /* private */ var infixNode_ : Any = js.native
    
    /* private */ var integralNode_ : Any = js.native
    
    def limitNode(mmlTag: String, children: js.Array[SemanticNode]): SemanticNode = js.native
    
    /* private */ var makeLimitNode_ : Any = js.native
    
    def mfenced(open: String, close: String, sepValue: String, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: String, close: String, sepValue: Null, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: String, close: Null, sepValue: String, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: String, close: Null, sepValue: Null, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: Null, close: String, sepValue: String, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: Null, close: String, sepValue: Null, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: Null, close: Null, sepValue: String, children: js.Array[SemanticNode]): SemanticNode = js.native
    def mfenced(open: Null, close: Null, sepValue: Null, children: js.Array[SemanticNode]): SemanticNode = js.native
    
    /* private */ var neutralFences_ : Any = js.native
    
    /* private */ var operationsInRow_ : Any = js.native
    
    /* private */ var operationsTree_ : Any = js.native
    
    def operatorNode(node: SemanticNode): SemanticNode = js.native
    
    /* private */ var postfixNode_ : Any = js.native
    
    /* private */ var prefixNode_ : Any = js.native
    
    def proof(
      node: Element,
      semantics: StringDictionary[String],
      parse: js.Function1[/* p1 */ js.Array[Element], js.Array[SemanticNode]]
    ): SemanticNode = js.native
    
    def pseudoTensor(base: SemanticNode, sub: js.Array[SemanticNode], sup: js.Array[SemanticNode]): SemanticNode = js.native
    
    /* private */ var punctuatedNode_ : Any = js.native
    
    /* private */ var relationsInRow_ : Any = js.native
    
    def row(nodes: js.Array[SemanticNode]): SemanticNode = js.native
    
    /* private */ var scriptNode_ : Any = js.native
    
    /* private */ var setExtension_ : Any = js.native
    
    def setNodeFactory(factory: SemanticNodeFactory): Unit = js.native
    
    /* private */ var splitOps: Any = js.native
    
    /* private */ var splitRoles: Any = js.native
    
    /* private */ var splitSingles: Any = js.native
    
    def tablesInRow(nodes: js.Array[SemanticNode]): js.Array[SemanticNode] = js.native
    
    def tensor(
      base: SemanticNode,
      lsub: js.Array[SemanticNode],
      lsup: js.Array[SemanticNode],
      rsub: js.Array[SemanticNode],
      rsup: js.Array[SemanticNode]
    ): SemanticNode = js.native
    
    def text(leaf: SemanticNode, `type`: String): SemanticNode = js.native
    
    /* private */ var wrapFactor: Any = js.native
    
    /* private */ var wrapPostfix: Any = js.native
  }
}
