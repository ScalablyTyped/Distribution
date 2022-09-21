package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.IncludePath
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.INodeDefinition
import typings.raml1Parser.highLevelASTMod.IParseResult
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.raml1Parser.lowLevelASTMod.IProject
import typings.raml1Parser.lowLevelASTMod.LineMapper
import typings.raml1Parser.lowLevelASTMod.TextChangeCommand
import typings.raml1Parser.namespaceResolverMod.NamespaceResolver
import typings.raml1Parser.resolversApiMod.FSResolver
import typings.raml1Parser.resolversApiMod.HTTPResolver
import typings.yamlAstParser.yamlASTMod.Kind
import typings.yamlAstParser.yamlASTMod.YAMLMapping
import typings.yamlAstParser.yamlASTMod.YAMLNode
import typings.yamlAstParser.yamlASTMod.YAMLScalar
import typings.yamlAstParser.yamlASTMod.YAMLSequence
import typings.yamlAstParser.yamlASTMod.YamlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsyaml2lowLevelMod {
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "ASTNode")
  @js.native
  open class ASTNode protected ()
    extends StObject
       with ILowLevelASTNode {
    def this(_node: YAMLNode, _unit: ICompilationUnit, _parent: ASTNode, _anchor: ASTNode, _include: ASTNode) = this()
    def this(
      _node: YAMLNode,
      _unit: ICompilationUnit,
      _parent: ASTNode,
      _anchor: ASTNode,
      _include: ASTNode,
      cacheChildren: Boolean
    ) = this()
    def this(
      _node: YAMLNode,
      _unit: ICompilationUnit,
      _parent: ASTNode,
      _anchor: ASTNode,
      _include: ASTNode,
      cacheChildren: Boolean,
      _includesContents: Boolean
    ) = this()
    def this(
      _node: YAMLNode,
      _unit: ICompilationUnit,
      _parent: ASTNode,
      _anchor: ASTNode,
      _include: ASTNode,
      cacheChildren: Unit,
      _includesContents: Boolean
    ) = this()
    
    def _actualNode(): YAMLNode = js.native
    
    /* private */ var _anchor: Any = js.native
    
    var _children: js.Array[ILowLevelASTNode] = js.native
    
    var _errors: js.Array[js.Error] = js.native
    
    /* private */ var _highLevelNode: Any = js.native
    
    /* private */ var _highLevelParseResult: Any = js.native
    
    /* private */ var _include: Any = js.native
    
    /* private */ var _includesContents: Any = js.native
    
    /* private */ var _node: Any = js.native
    
    var _oldText: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _unit: Any = js.native
    
    def addIncludeError(error: js.Error): Unit = js.native
    
    def asMap(): YamlMap = js.native
    
    def asMapping(): YAMLMapping = js.native
    
    def asScalar(): YAMLScalar = js.native
    
    def asSeq(): YAMLSequence = js.native
    
    /* private */ var cacheChildren: Any = js.native
    
    def canInclude(unit: ICompilationUnit): Boolean = js.native
    
    def children(inc: Unit, anc: Unit, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    def children(inc: Unit, anc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    def children(inc: Unit, anc: ASTNode, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    def children(inc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    def children(inc: ASTNode, anc: Unit, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    def children(inc: ASTNode, anc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    def children(inc: ASTNode, anc: ASTNode, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    
    def directChildren(): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: Unit, anc: Unit, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: Unit, anc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: Unit, anc: ASTNode, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: ASTNode, anc: Unit, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: ASTNode, anc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    def directChildren(inc: ASTNode, anc: ASTNode, inOneMemberMap: Boolean): js.Array[ILowLevelASTNode] = js.native
    
    def dumpNode(n: YAMLNode): Any = js.native
    def dumpNode(n: YAMLNode, full: Boolean): Any = js.native
    
    def find(name: String): ASTNode = js.native
    
    def gatherIncludes(): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath]): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: Unit, anc: Unit, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: Unit, anc: ASTNode): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: Unit, anc: ASTNode, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: ASTNode): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: ASTNode, anc: Unit, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: ASTNode, anc: ASTNode): Unit = js.native
    def gatherIncludes(s: js.Array[IncludePath], inc: ASTNode, anc: ASTNode, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: Unit, inc: Unit, anc: Unit, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: Unit, inc: Unit, anc: ASTNode): Unit = js.native
    def gatherIncludes(s: Unit, inc: Unit, anc: ASTNode, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: Unit, inc: ASTNode): Unit = js.native
    def gatherIncludes(s: Unit, inc: ASTNode, anc: Unit, inOneMemberMap: Boolean): Unit = js.native
    def gatherIncludes(s: Unit, inc: ASTNode, anc: ASTNode): Unit = js.native
    def gatherIncludes(s: Unit, inc: ASTNode, anc: ASTNode, inOneMemberMap: Boolean): Unit = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    def getIncludeString(): String = js.native
    
    def indent(lev: Double): String = js.native
    def indent(lev: Double, str: String): String = js.native
    
    def inlined(kind: Kind): Boolean = js.native
    
    var innerIncludeErrors: Boolean = js.native
    
    def isMap(): Boolean = js.native
    
    def isMapping(): Boolean = js.native
    
    def isScalar(): Boolean = js.native
    
    def isSeq(): Boolean = js.native
    
    def isValueInclude(): Boolean = js.native
    
    def isValueMap(): Boolean = js.native
    
    def isValueScalar(): Boolean = js.native
    
    def isValueSeq(): Boolean = js.native
    
    /**
      * Joins current mappings with mappings from "<<" anchor, if there is one.
      * @param mappings
      * @param inc
      * @param anc
      * @returns {any}
      */
    def joinMappingsWithFullIncludeAnchor(mappings: js.Array[YAMLMapping], inc: ASTNode, anc: ASTNode): js.Array[ILowLevelASTNode] = js.native
    
    def key(raw: Boolean): String = js.native
    
    def kindName(): String = js.native
    
    def markupNode(xbuf: MarkupIndentingBuffer, node: YAMLNode, lev: Double): Unit = js.native
    def markupNode(xbuf: MarkupIndentingBuffer, node: YAMLNode, lev: Double, json: Boolean): Unit = js.native
    
    def nodeShortText(node: YAMLNode, unittext: String): String = js.native
    def nodeShortText(node: YAMLNode, unittext: String, maxlen: Double): String = js.native
    
    def parentOfKind(kind: Kind): ASTNode = js.native
    
    def printDetails(): String = js.native
    def printDetails(indent: String): String = js.native
    
    /* private */ var rawKey: Any = js.native
    
    def recalcEndPositionFromChilds(): Unit = js.native
    
    def removeChild(n: ILowLevelASTNode): Unit = js.native
    
    def replaceNewlines(s: String): String = js.native
    def replaceNewlines(s: String, rep: String): String = js.native
    
    def root(): ILowLevelASTNode = js.native
    
    def setIncludesContents(includesContents: Boolean): Unit = js.native
    
    def setUnit(unit: ICompilationUnit): Unit = js.native
    
    def shiftNodes(offset: Double, shift: Double): Any = js.native
    def shiftNodes(offset: Double, shift: Double, exclude: ASTNode): Any = js.native
    
    def shortText(unittext: String): String = js.native
    def shortText(unittext: String, maxlen: Double): String = js.native
    
    def show(): Unit = js.native
    def show(message: Unit, lev: Double): Unit = js.native
    def show(message: Unit, lev: Double, text: String): Unit = js.native
    def show(message: Unit, lev: Unit, text: String): Unit = js.native
    
    def showParents(message: String): Double = js.native
    def showParents(message: String, lev: Double): Double = js.native
    
    def text(): String = js.native
    
    /* private */ var unitKind: Any = js.native
    
    def updateFrom(n: YAMLNode): Unit = js.native
    
    def valueAsInclude(): YAMLScalar = js.native
    
    def valueAsMap(): YamlMap = js.native
    
    def valueAsScalar(): YAMLScalar = js.native
    
    def valueAsSeq(): YAMLSequence = js.native
    
    def valueKindName(): String = js.native
    
    def yamlNode(): YAMLNode = js.native
  }
  /* static members */
  object ASTNode {
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "ASTNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "ASTNode.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel.ASTNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel.ASTNode */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "CompilationUnit")
  @js.native
  open class CompilationUnit protected ()
    extends StObject
       with ICompilationUnit {
    def this(_path: Any, _content: Any, _tl: Any, _project: Project, _apath: String) = this()
    
    /* private */ var _apath: Any = js.native
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _hl: Any = js.native
    
    /* private */ var _includedByPaths: Any = js.native
    
    /* private */ var _lineMapper: Any = js.native
    
    /* private */ var _node: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _project: Any = js.native
    
    /* private */ var _tl: Any = js.native
    
    /* CompleteClass */
    override def absolutePath(): String = js.native
    
    def addIncludedBy(path: String): Unit = js.native
    
    /* CompleteClass */
    override def ast(): ILowLevelASTNode = js.native
    
    def cloneToProject(p: Project): CompilationUnit = js.native
    
    /* CompleteClass */
    override def contents(): String = js.native
    
    /* private */ var errors: Any = js.native
    
    var expanded: IHighLevelNode = js.native
    
    /* CompleteClass */
    override def expandedHighLevel(): IParseResult = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    /**
      * gathers includes over ast without actual resolving of units;
      */
    /* CompleteClass */
    override def getIncludeNodes(): js.Array[IncludePath] = js.native
    
    def getIncludedByPaths(): js.Array[String] = js.native
    
    /**
      * Returns master reference if presents, null otherwise.
      */
    /* CompleteClass */
    override def getMasterReferenceNode(): ILowLevelASTNode = js.native
    
    /* CompleteClass */
    override def highLevel(): typings.raml1Parser.mod.IParseResult = js.native
    
    def includedByContains(path: String): Boolean = js.native
    
    /* CompleteClass */
    override def isDirty(): Boolean = js.native
    
    /**
      * Returns true if this unit is overlay or extension, false otherwise.
      */
    /* CompleteClass */
    override def isOverlayOrExtension(): Boolean = js.native
    
    /* CompleteClass */
    override def isRAMLUnit(): Boolean = js.native
    
    def isStubUnit(): Boolean = js.native
    
    /* CompleteClass */
    override def isTopLevel(): Boolean = js.native
    
    /* CompleteClass */
    override def lexerErrors(): js.Array[js.Error] = js.native
    
    /* CompleteClass */
    override def lineMapper(): LineMapper = js.native
    
    /* CompleteClass */
    override def path(): String = js.native
    
    /* CompleteClass */
    override def project(): IProject = js.native
    
    /* CompleteClass */
    override def resolve(p: String): ICompilationUnit = js.native
    
    /* CompleteClass */
    override def resolveAsync(p: String): js.Promise[ICompilationUnit] = js.native
    
    /* private */ var stu: Any = js.native
    
    def stub(): CompilationUnit = js.native
    
    /* CompleteClass */
    override def updateContent(newContent: String): Any = js.native
    
    def updateContentSafe(n: String): Unit = js.native
  }
  /* static members */
  object CompilationUnit {
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "CompilationUnit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "CompilationUnit.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel.CompilationUnit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel.CompilationUnit */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "FSResolverImpl")
  @js.native
  open class FSResolverImpl ()
    extends StObject
       with ExtendedFSResolver {
    
    /**
      * Load file content synchronosly
      * @param path File path
      * @return File content as string
      **/
    /* CompleteClass */
    override def content(path: String): String = js.native
    
    /**
      * Load file content asynchronosly
      * @param path File path
      * @return File content as string
      **/
    /* CompleteClass */
    override def contentAsync(path: String): js.Promise[String] = js.native
    
    /**
      * List directory synchronosly
      * @param path Directory path
      * @return Names list of files located in the directory
      **/
    /* CompleteClass */
    override def list(path: String): js.Array[String] = js.native
    
    /**
      * List directory asynchronosly
      * @param path Directory path
      * @return Names list of files located in the directory
      **/
    /* CompleteClass */
    override def listAsync(path: String): js.Promise[js.Array[String]] = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "HTTPResolverImpl")
  @js.native
  open class HTTPResolverImpl ()
    extends StObject
       with HTTPResolver {
    
    /* private */ var executor: Any = js.native
    
    /**
      * Load resource by URL synchronously
      * @param url Resource URL
      * @return Resource content in string form
      **/
    /* CompleteClass */
    override def getResource(url: String): typings.raml1Parser.resolversApiMod.Response = js.native
    
    /**
      * Load resource by URL asynchronously
      * @param url Resource URL
      * @return Resource content in string form
      **/
    /* CompleteClass */
    override def getResourceAsync(url: String): js.Promise[typings.raml1Parser.resolversApiMod.Response] = js.native
    
    /* private */ var toResponse: Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "InsertionPoint")
  @js.native
  open class InsertionPoint protected () extends StObject {
    def this(`type`: InsertionPointType) = this()
    def this(`type`: InsertionPointType, point: ASTNode) = this()
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    var point: ASTNode = js.native
    
    def show(msg: String): Unit = js.native
    
    var `type`: InsertionPointType = js.native
  }
  /* static members */
  object InsertionPoint {
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "InsertionPoint")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "InsertionPoint.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def after(point: ASTNode): InsertionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(point.asInstanceOf[js.Any]).asInstanceOf[InsertionPoint]
    
    inline def atEnd(): InsertionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("atEnd")().asInstanceOf[InsertionPoint]
    
    inline def atStart(): InsertionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("atStart")().asInstanceOf[InsertionPoint]
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel.InsertionPoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel.InsertionPoint */ Boolean]
    
    inline def node(): InsertionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("node")().asInstanceOf[InsertionPoint]
  }
  
  @js.native
  sealed trait InsertionPointType extends StObject
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "InsertionPointType")
  @js.native
  object InsertionPointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InsertionPointType & Double] = js.native
    
    @js.native
    sealed trait END
      extends StObject
         with InsertionPointType
    /* 2 */ val END: typings.raml1Parser.jsyaml2lowLevelMod.InsertionPointType.END & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with InsertionPointType
    /* 0 */ val NONE: typings.raml1Parser.jsyaml2lowLevelMod.InsertionPointType.NONE & Double = js.native
    
    @js.native
    sealed trait POINT
      extends StObject
         with InsertionPointType
    /* 3 */ val POINT: typings.raml1Parser.jsyaml2lowLevelMod.InsertionPointType.POINT & Double = js.native
    
    @js.native
    sealed trait START
      extends StObject
         with InsertionPointType
    /* 1 */ val START: typings.raml1Parser.jsyaml2lowLevelMod.InsertionPointType.START & Double = js.native
  }
  
  object Kind {
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "Kind")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "Kind.SCALAR")
    @js.native
    def SCALAR: typings.yamlAstParser.yamlASTMod.Kind = js.native
    inline def SCALAR_=(x: typings.yamlAstParser.yamlASTMod.Kind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "MarkupIndentingBuffer")
  @js.native
  open class MarkupIndentingBuffer protected () extends StObject {
    def this(indent: String) = this()
    
    def addChar(ch: String): Unit = js.native
    
    def addWithIndent(lev: Double, s: String): Unit = js.native
    
    def append(s: String): Unit = js.native
    
    var indent: String = js.native
    
    def isLastNL(): Boolean = js.native
    
    var text: String = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "Project")
  @js.native
  open class Project protected ()
    extends StObject
       with IProject {
    /**
      *
      * @param rootPath - path to folder where your root api is located
      * @param resolver
      * @param _httpResolver
      */
    def this(rootPath: String) = this()
    def this(rootPath: String, resolver: FSResolver) = this()
    def this(rootPath: String, resolver: Unit, _httpResolver: HTTPResolver) = this()
    def this(rootPath: String, resolver: FSResolver, _httpResolver: HTTPResolver) = this()
    
    var _fsEnabled: Boolean = js.native
    
    /* private */ var _httpResolver: Any = js.native
    
    /* private */ var _namespaceResolver: Any = js.native
    
    /* private */ var add2: Any = js.native
    
    /* private */ var canWriteInOneLine: Any = js.native
    
    /* private */ var changeKey: Any = js.native
    
    /* private */ var changeValue: Any = js.native
    
    def deleteUnit(p: String, absolute: Boolean): Unit = js.native
    
    /* private */ var executeReplace: Any = js.native
    
    def executeTextChange2(textCommand: TextChangeCommand): Unit = js.native
    
    var failedUnits: StringDictionary[Any] = js.native
    
    def findNode(n: ILowLevelASTNode, offset: Double, end: Double): ILowLevelASTNode = js.native
    
    def getMainUnitPath(): String = js.native
    
    def indent(node: ASTNode): String = js.native
    
    /* private */ var initWithRoot: Any = js.native
    
    /* private */ var isJson: Any = js.native
    
    /* private */ var isJsonMap: Any = js.native
    
    /* private */ var isJsonSeq: Any = js.native
    
    /* private */ var isOneLine: Any = js.native
    
    /* private */ var listeners: Any = js.native
    
    /* private */ var mainUnitPath: Any = js.native
    
    def namespaceResolver(): NamespaceResolver = js.native
    
    var pathToUnit: StringDictionary[CompilationUnit] = js.native
    
    /* private */ var recalcPositionsUp: Any = js.native
    
    /* private */ var remove: Any = js.native
    
    def replaceYamlNode(target: ASTNode, newNodeContent: String, offset: Double, shift: Double, unit: ICompilationUnit): Unit = js.native
    
    def resolve(unitPath: String, pathInUnit: String): CompilationUnit = js.native
    
    def resolveAsync(unitPath: String, pathInUnit: String): js.Promise[ICompilationUnit] = js.native
    
    /* private */ var resolver: Any = js.native
    
    /* private */ var rootPath: Any = js.native
    
    def setCachedUnitContent(pth: String, cnt: String, tl: Boolean): CompilationUnit = js.native
    
    def setFSResolver(res: FSResolver): Unit = js.native
    
    def setHTTPResolver(res: HTTPResolver): Unit = js.native
    
    def setMainUnitPath(mainUnitPath: String): Unit = js.native
    
    def startIndent(node: ASTNode): String = js.native
    
    /* private */ var tlisteners: Any = js.native
    
    def unitsAsync(): js.Promise[js.Array[ICompilationUnit]] = js.native
    
    def updatePositions(offset: Double, n: YAMLNode): Unit = js.native
    
    def visualizeNewlines(s: String): String = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "SimpleExecutor")
  @js.native
  open class SimpleExecutor () extends StObject {
    
    /* private */ var appendParams: Any = js.native
    
    /* private */ var doRequest: Any = js.native
    
    def execute(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify har.Request */ Any
    ): Any = js.native
    def execute(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify har.Request */ Any,
      doAppendParams: Boolean
    ): Any = js.native
    
    def executeAsync(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify har.Request */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify har.Response */ Any
      ] = js.native
    def executeAsync(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify har.Request */ Any,
      doAppendParams: Boolean
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify har.Response */ Any
      ] = js.native
    
    def log(varName: String, value: Any): Unit = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/jsyaml2lowLevel", "XMLHttpRequestWrapper")
  @js.native
  open class XMLHttpRequestWrapper () extends StObject {
    
    var async: Any = js.native
    
    def getAllResponseHeaders(): Any = js.native
    
    def getResponseHeader(name: Any): Any = js.native
    
    /* private */ var onResponse: Any = js.native
    
    var onerror: Any = js.native
    
    var onload: Any = js.native
    
    def open(method: Any, url: Any, async: Any): Unit = js.native
    
    var responseText: Any = js.native
    
    var responseType: Any = js.native
    
    def send(content: Any): Unit = js.native
    
    def setRequestHeader(name: Any, value: Any): Unit = js.native
    
    var status: Any = js.native
    
    var statusText: Any = js.native
    
    /* private */ var xhr: Any = js.native
  }
  
  inline def buildXHR(): XMLHttpRequestWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("buildXHR")().asInstanceOf[XMLHttpRequestWrapper]
  
  inline def createMap(mappings: js.Array[YAMLMapping]): ASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createMap")(mappings.asInstanceOf[js.Any]).asInstanceOf[ASTNode]
  
  inline def createMapNode(key: String): ASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createMapNode")(key.asInstanceOf[js.Any]).asInstanceOf[ASTNode]
  inline def createMapNode(key: String, unit: ICompilationUnit): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMapNode")(key.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  
  inline def createMapping(key: String, v: String): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMapping")(key.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  inline def createMapping(key: String, v: Boolean): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMapping")(key.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  inline def createMapping(key: String, v: Double): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createMapping")(key.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  
  inline def createNode(key: String): ASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(key.asInstanceOf[js.Any]).asInstanceOf[ASTNode]
  inline def createNode(key: String, parent: Unit, unit: ICompilationUnit): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(key.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  inline def createNode(key: String, parent: ASTNode): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(key.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  inline def createNode(key: String, parent: ASTNode, unit: ICompilationUnit): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(key.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  
  inline def createScalar(value: String): ASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createScalar")(value.asInstanceOf[js.Any]).asInstanceOf[ASTNode]
  
  inline def createSeq(sn: YAMLSequence, parent: ASTNode, unit: CompilationUnit): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSeq")(sn.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  
  inline def createSeqNode(key: String): ASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createSeqNode")(key.asInstanceOf[js.Any]).asInstanceOf[ASTNode]
  
  inline def fetchIncludesAndMasterAsync(project: IProject, apiPath: String): js.Promise[ICompilationUnit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchIncludesAndMasterAsync")(project.asInstanceOf[js.Any], apiPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ICompilationUnit]]
  
  inline def getDefinitionForLowLevelNode(node: ILowLevelASTNode): INodeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionForLowLevelNode")(node.asInstanceOf[js.Any]).asInstanceOf[INodeDefinition]
  
  inline def toChildCachingNode(node: ILowLevelASTNode): ILowLevelASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("toChildCachingNode")(node.asInstanceOf[js.Any]).asInstanceOf[ILowLevelASTNode]
  
  inline def toIncludingNode(node: ILowLevelASTNode): ILowLevelASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("toIncludingNode")(node.asInstanceOf[js.Any]).asInstanceOf[ILowLevelASTNode]
  
  trait ExtendedFSResolver
    extends StObject
       with FSResolver {
    
    /**
      * List directory synchronosly
      * @param path Directory path
      * @return Names list of files located in the directory
      **/
    def list(path: String): js.Array[String]
    
    /**
      * List directory asynchronosly
      * @param path Directory path
      * @return Names list of files located in the directory
      **/
    def listAsync(path: String): js.Promise[js.Array[String]]
  }
  object ExtendedFSResolver {
    
    inline def apply(
      content: String => String,
      contentAsync: String => js.Promise[String],
      list: String => js.Array[String],
      listAsync: String => js.Promise[js.Array[String]]
    ): ExtendedFSResolver = {
      val __obj = js.Dynamic.literal(content = js.Any.fromFunction1(content), contentAsync = js.Any.fromFunction1(contentAsync), list = js.Any.fromFunction1(list), listAsync = js.Any.fromFunction1(listAsync))
      __obj.asInstanceOf[ExtendedFSResolver]
    }
    
    extension [Self <: ExtendedFSResolver](x: Self) {
      
      inline def setList(value: String => js.Array[String]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setListAsync(value: String => js.Promise[js.Array[String]]): Self = StObject.set(x, "listAsync", js.Any.fromFunction1(value))
    }
  }
  
  type Response = typings.raml1Parser.resolversApiMod.Response
}
