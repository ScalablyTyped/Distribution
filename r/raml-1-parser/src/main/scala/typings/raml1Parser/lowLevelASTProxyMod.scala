package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.Errors
import typings.raml1Parser.anon.Node
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.yamlAstParser.yamlASTMod.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowLevelASTProxyMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelCompositeNode")
  @js.native
  open class LowLevelCompositeNode protected () extends LowLevelProxyNode {
    def this(
      node: ILowLevelASTNode,
      parent: LowLevelCompositeNode,
      transformer: ValueTransformer,
      ramlVersion: String
    ) = this()
    def this(
      node: ILowLevelASTNode,
      parent: LowLevelCompositeNode,
      transformer: ValueTransformer,
      ramlVersion: String,
      isPrimary: Boolean
    ) = this()
    
    /* protected */ var _adoptedNodes: js.Array[LowLevelValueTransformingNode] = js.native
    
    /* protected */ var _children: js.Array[LowLevelCompositeNode] = js.native
    
    /* protected */ var _preserveAnnotations: Boolean = js.native
    
    def adopt(node: ILowLevelASTNode, transformer: ValueTransformer): Unit = js.native
    
    def adoptedNodes(): js.Array[ILowLevelASTNode] = js.native
    
    /* private */ var buildKey: Any = js.native
    
    /* private */ var collectChildrenWithKeys: Any = js.native
    
    def filterChildren(): Unit = js.native
    
    /* protected */ var isInsideResource: Boolean = js.native
    
    /* private */ var isPrimary: Any = js.native
    
    /* private */ var isResource: Any = js.native
    
    /* protected */ var nonMergableChildren: StringDictionary[Boolean] = js.native
    
    def patchAdoptedNodes(entries: js.Array[Node]): Unit = js.native
    
    def preserveAnnotations(): Unit = js.native
    
    def removeChild(oldNode: ILowLevelASTNode): LowLevelCompositeNode = js.native
    
    def replaceChild(oldNode: ILowLevelASTNode, newNode: ILowLevelASTNode): LowLevelCompositeNode = js.native
    def replaceChild(oldNode: ILowLevelASTNode, newNode: ILowLevelASTNode, isPrimary: Boolean): LowLevelCompositeNode = js.native
    def replaceChild(
      oldNode: ILowLevelASTNode,
      newNode: ILowLevelASTNode,
      isPrimary: Boolean,
      transformer: ValueTransformer
    ): LowLevelCompositeNode = js.native
    def replaceChild(
      oldNode: ILowLevelASTNode,
      newNode: ILowLevelASTNode,
      isPrimary: Unit,
      transformer: ValueTransformer
    ): LowLevelCompositeNode = js.native
    
    def resetChildren(): Unit = js.native
    
    def setChildren(nodes: js.Array[ILowLevelASTNode]): LowLevelCompositeNode = js.native
    
    /* private */ var skipKey: Any = js.native
    
    def takeOnlyOriginalChildrenWithKey(key: String): Unit = js.native
  }
  /* static members */
  object LowLevelCompositeNode {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelCompositeNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelCompositeNode.CLASS_IDENTIFIER_LowLevelCompositeNode")
    @js.native
    def CLASS_IDENTIFIER_LowLevelCompositeNode: Any = js.native
    inline def CLASS_IDENTIFIER_LowLevelCompositeNode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_LowLevelCompositeNode")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelCompositeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelCompositeNode */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelProxyNode")
  @js.native
  open class LowLevelProxyNode protected ()
    extends StObject
       with ILowLevelASTNode {
    def this(_parent: ILowLevelASTNode, _transformer: ValueTransformer, ramlVersion: String) = this()
    
    /* private */ var _highLevelNode: Any = js.native
    
    /* private */ var _highLevelParseResult: Any = js.native
    
    /* protected */ var _keyOverride: String = js.native
    
    /* protected */ var _meta: StringDictionary[Any] = js.native
    
    /* protected */ var _originalNode: ILowLevelASTNode = js.native
    
    /* protected */ var _parent: ILowLevelASTNode = js.native
    
    /* protected */ var _transformer: ValueTransformer = js.native
    
    /* protected */ var _valueOverride: String = js.native
    
    def addMeta(key: String, value: Any): Unit = js.native
    
    def definingUnitSequence(): js.Array[ICompilationUnit] = js.native
    
    def find(name: String): ILowLevelASTNode = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    def getMeta(key: String): Any = js.native
    
    def isMap(): Boolean = js.native
    
    def isMapping(): Boolean = js.native
    
    def isScalar(): Boolean = js.native
    
    def isSeq(): Boolean = js.native
    
    def isValueInclude(): Boolean = js.native
    
    def isValueMap(): Boolean = js.native
    
    def isValueScalar(): Boolean = js.native
    
    def isValueSeq(): Boolean = js.native
    
    def key(raw: Boolean): String = js.native
    
    def originalNode(): ILowLevelASTNode = js.native
    
    def primaryNode(): ILowLevelASTNode = js.native
    
    /* protected */ var ramlVersion: String = js.native
    
    def root(): ILowLevelASTNode = js.native
    
    def setKeyOverride(_key: String): Unit = js.native
    
    def setTransformer(tr: ValueTransformer): Unit = js.native
    
    def setValueOverride(value: Any): Unit = js.native
    
    def transformer(): ValueTransformer = js.native
  }
  /* static members */
  object LowLevelProxyNode {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelProxyNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelProxyNode.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelProxyNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelProxyNode */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelValueTransformingNode")
  @js.native
  open class LowLevelValueTransformingNode protected () extends LowLevelProxyNode {
    def this(
      node: ILowLevelASTNode,
      parent: ILowLevelASTNode,
      transformer: ValueTransformer,
      ramlVersion: String
    ) = this()
  }
  /* static members */
  object LowLevelValueTransformingNode {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelValueTransformingNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/LowLevelASTProxy", "LowLevelValueTransformingNode.CLASS_IDENTIFIER_LowLevelValueTransformingNode")
    @js.native
    def CLASS_IDENTIFIER_LowLevelValueTransformingNode: Any = js.native
    inline def CLASS_IDENTIFIER_LowLevelValueTransformingNode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_LowLevelValueTransformingNode")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelValueTransformingNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelValueTransformingNode */ Boolean]
  }
  
  inline def isLowLevelProxyNode(node: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelProxyNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowLevelProxyNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/LowLevelASTProxy.LowLevelProxyNode */ Boolean]
  
  @js.native
  trait ValueTransformer extends StObject {
    
    def anchorValueKind(node: ILowLevelASTNode): Kind = js.native
    
    def children(node: ILowLevelASTNode): js.Array[ILowLevelASTNode] = js.native
    
    def definingUnitSequence(str: String): js.Array[ICompilationUnit] = js.native
    
    def includePath(node: ILowLevelASTNode): String = js.native
    
    def paramNodesChain(node: ILowLevelASTNode, inKey: Boolean): js.Array[ILowLevelASTNode] = js.native
    
    def resolvedValueKind(node: ILowLevelASTNode): Kind = js.native
    
    def transform(value: Any): Errors = js.native
    def transform(value: Any, toString: Boolean): Errors = js.native
    
    def valueKind(node: ILowLevelASTNode): Kind = js.native
  }
}
