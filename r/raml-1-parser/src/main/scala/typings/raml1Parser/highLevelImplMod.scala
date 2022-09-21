package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.Entry
import typings.raml1Parser.contentproviderMod.ContentProvider
import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.IEditableHighLevelNode
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.INodeDefinition
import typings.raml1Parser.highLevelASTMod.IParseResult
import typings.raml1Parser.highLevelASTMod.IProperty
import typings.raml1Parser.highLevelASTMod.IStructuredValue
import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.highLevelASTMod.IValueTypeDefinition
import typings.raml1Parser.highLevelASTMod.RamlParserError
import typings.raml1Parser.highLevelASTMod.ValidationAcceptor
import typings.raml1Parser.highLevelASTMod.ValidationIssue
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.ramlDefinitionSystem.ramlDefinitionSystemMod.SourceProvider
import typings.ramlDefinitionSystem.ramlDefinitionSystemMod.Universe
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highLevelImplMod {
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "ASTNodeImpl")
  @js.native
  open class ASTNodeImpl protected ()
    extends BasicASTNode
       with IEditableHighLevelNode {
    def this(node: ILowLevelASTNode, parent: IHighLevelNode, _def: INodeDefinition, _prop: IProperty) = this()
    
    var _allowQuestion: Boolean = js.native
    
    var _associatedDef: INodeDefinition = js.native
    
    /* private */ var _auxChecked: Any = js.native
    
    var _children: js.Array[IParseResult] = js.native
    
    var _computedKey: String = js.native
    
    /* private */ var _def: Any = js.native
    
    /* private */ var _expanded: Any = js.native
    
    /* private */ var _findNode: Any = js.native
    
    /* private */ var _isAux: Any = js.native
    
    /* private */ var _knownIds: Any = js.native
    
    /* private */ var _knownLowLevelIds: Any = js.native
    
    var _mergedChildren: js.Array[IParseResult] = js.native
    
    /* private */ var _patchedName: Any = js.native
    
    /* private */ var _prop: Any = js.native
    
    /* private */ var _ptype: Any = js.native
    
    /* private */ var _reusedNode: Any = js.native
    
    /* private */ var _slaveIds: Any = js.native
    
    var _subTypesCache: StringDictionary[js.Array[ITypeDefinition]] = js.native
    
    /* private */ var _types: Any = js.native
    
    /* private */ var _universe: Any = js.native
    
    /* private */ var _wrapperNode: Any = js.native
    
    /* private */ var buildWrapperNode: Any = js.native
    
    /* private */ var calculateMasterByRef: Any = js.native
    
    def clearChildrenCache(): Unit = js.native
    
    def clearTypesCache(): Unit = js.native
    
    /* private */ var getExtractedChildren: Any = js.native
    
    /* private */ var getExtractedLowLevelChildren: Any = js.native
    
    def getMergeMode(): OverlayMergeMode = js.native
    
    def initRamlFile(): Unit = js.native
    
    /* private */ var initilizeKnownIDs: Any = js.native
    
    def isAllowedToUse(p: IProperty): Boolean = js.native
    
    def isEmptyRamlFile(): Boolean = js.native
    
    var isInEdit: Boolean = js.native
    
    def isNamePatch(): String = js.native
    
    /* private */ var isParametrizedType: Any = js.native
    
    def isStub(): Boolean = js.native
    
    def knownIds(): StringDictionary[IParseResult] = js.native
    
    /**
      * Externally set master AST, should be only available for root nodes,
      * and only in the case when we merge multiple overlays/extensions.
      */
    /* private */ var masterApi: Any = js.native
    
    /* private */ var mergeChild: Any = js.native
    
    /* private */ var mergeChildren: Any = js.native
    
    /* private */ var mergeLowLevelChild: Any = js.native
    
    /* private */ var mergeLowLevelChildren: Any = js.native
    
    /**
      * Depending on the merge mode, overlays and extensions are either merged with the master, or their trees are joined via aggregation
      * @type {OverlayMergeMode}
      */
    /* private */ var overlayMergeMode: Any = js.native
    
    /**
      * Forcefully sets a master unit for this API, which may be different from the one, current unit points to
      * via masterRef.
      * @param master
      */
    def overrideMaster(master: IParseResult): Unit = js.native
    
    def patchProp(pr: IProperty): Unit = js.native
    
    def patchType(d: INodeDefinition): Unit = js.native
    
    /* private */ var resetAuxilaryState: Any = js.native
    
    def resetRuntimeTypes(): Unit = js.native
    
    def setAssociatedType(d: INodeDefinition): Unit = js.native
    
    def setMergeMode(mergeMode: OverlayMergeMode): Unit = js.native
    
    def setNamePatch(s: String): Unit = js.native
    
    def setReusedNode(n: IHighLevelNode): Unit = js.native
    
    def setSlave(slave: IParseResult): Unit = js.native
    
    def setTypes(
      t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify rTypes.IParsedTypeCollection */ Any
    ): Unit = js.native
    
    def setUniverse(u: Universe): Unit = js.native
    
    /**
      * Slave of this master, if there is any
      */
    /* private */ var slave: Any = js.native
    
    def types(requestedByFragmentOrLibrary: Boolean): Any = js.native
    
    def universe(): Universe = js.native
    
    def valuesOf(propName: String): js.Array[IHighLevelNode] = js.native
  }
  /* static members */
  object ASTNodeImpl {
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "ASTNodeImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "ASTNodeImpl.CLASS_IDENTIFIER_ASTNodeImpl")
    @js.native
    def CLASS_IDENTIFIER_ASTNodeImpl: Any = js.native
    inline def CLASS_IDENTIFIER_ASTNodeImpl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_ASTNodeImpl")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.ASTNodeImpl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.ASTNodeImpl */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "ASTPropImpl")
  @js.native
  open class ASTPropImpl protected ()
    extends BasicASTNode
       with IAttribute {
    def this(node: ILowLevelASTNode, parent: IHighLevelNode, _def: IValueTypeDefinition, _prop: IProperty) = this()
    def this(
      node: ILowLevelASTNode,
      parent: IHighLevelNode,
      _def: IValueTypeDefinition,
      _prop: IProperty,
      fromKey: Boolean
    ) = this()
    
    /* private */ var _def: Any = js.native
    
    /* private */ var _prop: Any = js.native
    
    /* private */ var _sval: Any = js.native
    
    var _value: String = js.native
    
    def addStringValue(value: String): Unit = js.native
    
    def addStructuredValue(sv: StructuredValue): Unit = js.native
    
    def addValue(value: StructuredValue): Unit = js.native
    
    /* private */ var calcValue: Any = js.native
    
    def convertMultivalueToString(value: String): String = js.native
    
    def findReferenceDeclaration(): IHighLevelNode = js.native
    
    /* private */ var fromKey: Any = js.native
    
    def isEmbedded(): Boolean = js.native
    
    def isFromKey(): Boolean = js.native
    
    def isString(): Boolean = js.native
    
    def overrideValue(value: String): Unit = js.native
    
    def patchType(t: IValueTypeDefinition): Unit = js.native
    
    def setValue(value: StructuredValue): Unit = js.native
  }
  /* static members */
  object ASTPropImpl {
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "ASTPropImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "ASTPropImpl.CLASS_IDENTIFIER_ASTPropImpl")
    @js.native
    def CLASS_IDENTIFIER_ASTPropImpl: Any = js.native
    inline def CLASS_IDENTIFIER_ASTPropImpl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_ASTPropImpl")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.ASTPropImpl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.ASTPropImpl */ Boolean]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.tsInterfaces.IAnnotatedElement * / any */ @JSImport("raml-1-parser/dist/parser/highLevelImpl", "AnnotatedNode")
  @js.native
  open class AnnotatedNode protected () extends StObject {
    def this(_node: IParseResult) = this()
    
    /* private */ var _annotations: Any = js.native
    
    /* private */ var _annotationsMap: Any = js.native
    
    /* protected */ var _node: IParseResult = js.native
    
    def annotations(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.tsInterfaces.IAnnotationInstance */ Any
      ] = js.native
    
    def annotationsMap(): StringDictionary[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.tsInterfaces.IAnnotationInstance */ Any
      ] = js.native
    
    def entry(): IParseResult = js.native
    
    def kind(): String = js.native
    
    def name(): String = js.native
    
    def value(): Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.tsInterfaces.IAnnotationInstance * / any */ @JSImport("raml-1-parser/dist/parser/highLevelImpl", "AnnotationInstance")
  @js.native
  open class AnnotationInstance protected () extends StObject {
    def this(attr: IAttribute) = this()
    
    /* protected */ var attr: IAttribute = js.native
    
    /**
      * Annotation definition type
      */
    def definition(): Any = js.native
    
    def name(): String = js.native
    
    /**
      * Annotation value
      */
    def value(): Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "BasicASTNode")
  @js.native
  open class BasicASTNode protected ()
    extends StObject
       with IParseResult {
    def this(_node: ILowLevelASTNode, _parent: IHighLevelNode) = this()
    
    var _computed: Boolean = js.native
    
    /* private */ var _hashkey: Any = js.native
    
    /* private */ var _implicit: Any = js.native
    
    /* protected */ var _isReused: Boolean = js.native
    
    /* protected */ var _jsonCache: Any = js.native
    
    /* protected */ var _node: ILowLevelASTNode = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* protected */ var _reuseMode: Boolean = js.native
    
    /* protected */ var _valueSource: IParseResult = js.native
    
    def allowRecursive(): Boolean = js.native
    
    var cachedFullId: String = js.native
    
    var cachedId: String = js.native
    
    def checkContextValue(name: String, value: String, thisObj: Any): Boolean = js.native
    
    var errorMessage: Entry = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    var invalidSequence: Boolean = js.native
    
    def isReused(): Boolean = js.native
    
    var knownProperty: IProperty = js.native
    
    def markCh(): Boolean = js.native
    
    var needMap: Boolean = js.native
    
    var needSequence: Boolean = js.native
    
    def resetIDs(): Unit = js.native
    
    def reuseMode(): Boolean = js.native
    
    def setComputed(name: String, v: Any): Unit = js.native
    
    def setParent(parent: IHighLevelNode): Unit = js.native
    
    def setReuseMode(`val`: Boolean): Unit = js.native
    
    def setReused(`val`: Boolean): Unit = js.native
    
    def setValueSource(n: IParseResult): Unit = js.native
    
    /**
      * Used for test comparison of two trees. Touching this will require AST tests update.
      * @param indent
      * @returns {string}
      */
    def testSerialize(): String = js.native
    def testSerialize(indent: String): String = js.native
    
    var unitMap: StringDictionary[String] = js.native
    
    def unmarkCh(): Unit = js.native
    
    var unresolvedRef: String = js.native
    
    /* private */ var values: Any = js.native
  }
  /* static members */
  object BasicASTNode {
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "BasicASTNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "BasicASTNode.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.BasicASTNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.BasicASTNode */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "LowLevelWrapperForTypeSystem")
  @js.native
  open class LowLevelWrapperForTypeSystem protected ()
    extends SourceProvider
       with ParseNode {
    def this(_node: ILowLevelASTNode, _highLevelRoot: IHighLevelNode) = this()
    
    var _children: js.Array[LowLevelWrapperForTypeSystem] = js.native
    
    /* protected */ var _highLevelRoot: IHighLevelNode = js.native
    
    /* protected */ var _node: ILowLevelASTNode = js.native
    
    /* private */ var _toMerge: Any = js.native
    
    /* CompleteClass */
    override def addMeta(key: String, value: Any): Any = js.native
    
    var childByKey: StringDictionary[LowLevelWrapperForTypeSystem] = js.native
    
    /* CompleteClass */
    override def childWithKey(k: String): ParseNode = js.native
    
    /* CompleteClass */
    override def children(): js.Array[ParseNode] = js.native
    
    def contentProvider(): ContentProvider = js.native
    
    /* CompleteClass */
    override def getMeta(key: String): Any = js.native
    
    /* CompleteClass */
    override def key(): String = js.native
    
    /* CompleteClass */
    override def kind(): Double = js.native
    
    def node(): ILowLevelASTNode = js.native
    
    /* private */ var ownMeta: Any = js.native
    
    /* CompleteClass */
    override def path(): String = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
  }
  /* static members */
  object LowLevelWrapperForTypeSystem {
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "LowLevelWrapperForTypeSystem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "LowLevelWrapperForTypeSystem.CLASS_IDENTIFIER_LowLevelWrapperForTypeSystem")
    @js.native
    def CLASS_IDENTIFIER_LowLevelWrapperForTypeSystem: Any = js.native
    inline def CLASS_IDENTIFIER_LowLevelWrapperForTypeSystem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_LowLevelWrapperForTypeSystem")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.LowLevelWrapperForTypeSystem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.LowLevelWrapperForTypeSystem */ Boolean]
  }
  
  @js.native
  sealed trait OverlayMergeMode extends StObject
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "OverlayMergeMode")
  @js.native
  object OverlayMergeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OverlayMergeMode & Double] = js.native
    
    @js.native
    sealed trait AGGREGATE
      extends StObject
         with OverlayMergeMode
    /* 1 */ val AGGREGATE: typings.raml1Parser.highLevelImplMod.OverlayMergeMode.AGGREGATE & Double = js.native
    
    @js.native
    sealed trait MERGE
      extends StObject
         with OverlayMergeMode
    /* 0 */ val MERGE: typings.raml1Parser.highLevelImplMod.OverlayMergeMode.MERGE & Double = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "StructuredValue")
  @js.native
  open class StructuredValue protected ()
    extends StObject
       with IStructuredValue {
    def this(node: ILowLevelASTNode, _parent: IHighLevelNode, _pr: IProperty) = this()
    def this(node: ILowLevelASTNode, _parent: IHighLevelNode, _pr: IProperty, kv: Any) = this()
    
    /* private */ var _hl: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _pr: Any = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    /* private */ var kv: Any = js.native
    
    /* private */ var node: Any = js.native
    
    def resetHighLevelNode(): Unit = js.native
  }
  /* static members */
  object StructuredValue {
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "StructuredValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/highLevelImpl", "StructuredValue.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.StructuredValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.StructuredValue */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "UsesNodeWrapperFoTypeSystem")
  @js.native
  open class UsesNodeWrapperFoTypeSystem protected () extends LowLevelWrapperForTypeSystem {
    def this(_node: ILowLevelASTNode, _highLevelRoot: IHighLevelNode) = this()
    
    def anchor(): Any = js.native
  }
  
  inline def actualPath(node: IParseResult): String = ^.asInstanceOf[js.Dynamic].applyDynamic("actualPath")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def actualPath(node: IParseResult, checkIfDifferent: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("actualPath")(node.asInstanceOf[js.Any], checkIfDifferent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def actualUnit(llNode: ILowLevelASTNode): ICompilationUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("actualUnit")(llNode.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit]
  
  inline def applyNodeAnnotationValidationPlugins(node: IParseResult): js.Array[ValidationIssue] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyNodeAnnotationValidationPlugins")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[ValidationIssue]]
  
  inline def applyNodeValidationPlugins(node: IParseResult): js.Array[ValidationIssue] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyNodeValidationPlugins")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[ValidationIssue]]
  
  inline def auxiliaryTypeForExample(node: IHighLevelNode): typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("auxiliaryTypeForExample")(node.asInstanceOf[js.Any]).asInstanceOf[typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition]
  
  inline def createBasicValidationAcceptor(errors: js.Array[ValidationIssue]): ValidationAcceptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createBasicValidationAcceptor")(errors.asInstanceOf[js.Any]).asInstanceOf[ValidationAcceptor]
  inline def createBasicValidationAcceptor(errors: js.Array[ValidationIssue], primaryUnitPointerNode: IParseResult): ValidationAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createBasicValidationAcceptor")(errors.asInstanceOf[js.Any], primaryUnitPointerNode.asInstanceOf[js.Any])).asInstanceOf[ValidationAcceptor]
  
  inline def fromUnit(l: ICompilationUnit): IParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnit")(l.asInstanceOf[js.Any]).asInstanceOf[IParseResult]
  
  inline def getFragmentDefenitionName(highLevelNode: IHighLevelNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentDefenitionName")(highLevelNode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isASTPropImpl(node: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.ASTPropImpl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isASTPropImpl")(node.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.ASTPropImpl */ Boolean]
  
  inline def isAnnotationTypeFragment(node: IHighLevelNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnnotationTypeFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStructuredValue(node: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.StructuredValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStructuredValue")(node.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelImpl.StructuredValue */ Boolean]
  
  inline def qName(x: IHighLevelNode, context: IHighLevelNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("qName")(x.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ramlFirstLine(content: String): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ramlFirstLine")(content.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def resolveSchemaFragment(node: IParseResult, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSchemaFragment")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toParserErrors(issues: js.Array[ValidationIssue], node: IHighLevelNode): js.Array[RamlParserError] = (^.asInstanceOf[js.Dynamic].applyDynamic("toParserErrors")(issues.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[RamlParserError]]
  
  @JSImport("raml-1-parser/dist/parser/highLevelImpl", "universeProvider")
  @js.native
  def universeProvider: Any = js.native
  inline def universeProvider_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("universeProvider")(x.asInstanceOf[js.Any])
  
  trait ParseNode extends StObject {
    
    def addMeta(key: String, value: Any): Any
    
    def childWithKey(k: String): ParseNode
    
    def children(): js.Array[ParseNode]
    
    def getMeta(key: String): Any
    
    def key(): String
    
    def kind(): Double
    
    def path(): String
    
    def value(): Any
  }
  object ParseNode {
    
    inline def apply(
      addMeta: (String, Any) => Any,
      childWithKey: String => ParseNode,
      children: () => js.Array[ParseNode],
      getMeta: String => Any,
      key: () => String,
      kind: () => Double,
      path: () => String,
      value: () => Any
    ): ParseNode = {
      val __obj = js.Dynamic.literal(addMeta = js.Any.fromFunction2(addMeta), childWithKey = js.Any.fromFunction1(childWithKey), children = js.Any.fromFunction0(children), getMeta = js.Any.fromFunction1(getMeta), key = js.Any.fromFunction0(key), kind = js.Any.fromFunction0(kind), path = js.Any.fromFunction0(path), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[ParseNode]
    }
    
    extension [Self <: ParseNode](x: Self) {
      
      inline def setAddMeta(value: (String, Any) => Any): Self = StObject.set(x, "addMeta", js.Any.fromFunction2(value))
      
      inline def setChildWithKey(value: String => ParseNode): Self = StObject.set(x, "childWithKey", js.Any.fromFunction1(value))
      
      inline def setChildren(value: () => js.Array[ParseNode]): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setGetMeta(value: String => Any): Self = StObject.set(x, "getMeta", js.Any.fromFunction1(value))
      
      inline def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
      
      inline def setKind(value: () => Double): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
      
      inline def setPath(value: () => String): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
}
