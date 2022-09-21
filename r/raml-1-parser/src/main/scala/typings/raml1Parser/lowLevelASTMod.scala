package typings.raml1Parser

import typings.raml1Parser.anon.IncludePath
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.INodeDefinition
import typings.raml1Parser.highLevelASTMod.IParseResult
import typings.raml1Parser.highLevelASTMod.IStructuredValue
import typings.raml1Parser.resolversApiMod.FSResolver
import typings.raml1Parser.resolversApiMod.HTTPResolver
import typings.yamlAstParser.yamlASTMod.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowLevelASTMod {
  
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "ASTChangeCommand")
  @js.native
  open class ASTChangeCommand protected () extends StObject {
    def this(kind: CommandKind, target: ILowLevelASTNode, value: String, position: Double) = this()
    def this(kind: CommandKind, target: ILowLevelASTNode, value: ILowLevelASTNode, position: Double) = this()
    
    var insertionPoint: ILowLevelASTNode | InsertionPoint = js.native
    
    var kind: CommandKind = js.native
    
    var position: Double = js.native
    
    var target: ILowLevelASTNode = js.native
    
    var toSeq: Boolean = js.native
    
    var value: String | ILowLevelASTNode = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "ASTDelta")
  @js.native
  open class ASTDelta () extends StObject {
    
    var commands: js.Array[ASTChangeCommand] = js.native
  }
  
  @js.native
  sealed trait CommandKind extends StObject
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "CommandKind")
  @js.native
  object CommandKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandKind & Double] = js.native
    
    @js.native
    sealed trait ADD_CHILD
      extends StObject
         with CommandKind
    /* 0 */ val ADD_CHILD: typings.raml1Parser.lowLevelASTMod.CommandKind.ADD_CHILD & Double = js.native
    
    @js.native
    sealed trait CHANGE_KEY
      extends StObject
         with CommandKind
    /* 3 */ val CHANGE_KEY: typings.raml1Parser.lowLevelASTMod.CommandKind.CHANGE_KEY & Double = js.native
    
    @js.native
    sealed trait CHANGE_VALUE
      extends StObject
         with CommandKind
    /* 4 */ val CHANGE_VALUE: typings.raml1Parser.lowLevelASTMod.CommandKind.CHANGE_VALUE & Double = js.native
    
    @js.native
    sealed trait INIT_RAML_FILE
      extends StObject
         with CommandKind
    /* 5 */ val INIT_RAML_FILE: typings.raml1Parser.lowLevelASTMod.CommandKind.INIT_RAML_FILE & Double = js.native
    
    @js.native
    sealed trait MOVE_CHILD
      extends StObject
         with CommandKind
    /* 2 */ val MOVE_CHILD: typings.raml1Parser.lowLevelASTMod.CommandKind.MOVE_CHILD & Double = js.native
    
    @js.native
    sealed trait REMOVE_CHILD
      extends StObject
         with CommandKind
    /* 1 */ val REMOVE_CHILD: typings.raml1Parser.lowLevelASTMod.CommandKind.REMOVE_CHILD & Double = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "CompositeCommand")
  @js.native
  open class CompositeCommand () extends StObject {
    
    var commands: js.Array[ASTChangeCommand] = js.native
    
    var source: Any = js.native
    
    var timestamp: Double = js.native
  }
  
  @js.native
  sealed trait InsertionPointType extends StObject
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "InsertionPointType")
  @js.native
  object InsertionPointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InsertionPointType & Double] = js.native
    
    @js.native
    sealed trait END
      extends StObject
         with InsertionPointType
    /* 2 */ val END: typings.raml1Parser.lowLevelASTMod.InsertionPointType.END & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with InsertionPointType
    /* 0 */ val NONE: typings.raml1Parser.lowLevelASTMod.InsertionPointType.NONE & Double = js.native
    
    @js.native
    sealed trait POINT
      extends StObject
         with InsertionPointType
    /* 3 */ val POINT: typings.raml1Parser.lowLevelASTMod.InsertionPointType.POINT & Double = js.native
    
    @js.native
    sealed trait START
      extends StObject
         with InsertionPointType
    /* 1 */ val START: typings.raml1Parser.lowLevelASTMod.InsertionPointType.START & Double = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "LineMapperImpl")
  @js.native
  open class LineMapperImpl protected ()
    extends StObject
       with LineMapper {
    def this(content: String, absPath: String) = this()
    
    /* private */ var absPath: Any = js.native
    
    /* private */ var content: Any = js.native
    
    def initMapping(): Unit = js.native
    
    /* private */ var mapping: Any = js.native
    
    /* CompleteClass */
    override def position(pos: Double): TextPosition = js.native
    
    /* CompleteClass */
    override def toPosition(line: Double, column: Double): TextPosition = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/lowLevelAST", "TextChangeCommand")
  @js.native
  open class TextChangeCommand protected () extends StObject {
    def this(offset: Double, replacementLength: Double, text: String, unit: ICompilationUnit) = this()
    def this(
      offset: Double,
      replacementLength: Double,
      text: String,
      unit: ICompilationUnit,
      target: ILowLevelASTNode
    ) = this()
    
    var isUndefined: Boolean = js.native
    
    var offset: Double = js.native
    
    var replacementLength: Double = js.native
    
    var target: ILowLevelASTNode = js.native
    
    var text: String = js.native
    
    var unit: ICompilationUnit = js.native
  }
  
  inline def buildPath(reference: Any, unitPath: Any, rootPath: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(reference.asInstanceOf[js.Any], unitPath.asInstanceOf[js.Any], rootPath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def initRamlFile(root: ILowLevelASTNode, newroot: ILowLevelASTNode): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("initRamlFile")(root.asInstanceOf[js.Any], newroot.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: Unit, toSeq: Boolean): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any], toSeq.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: ILowLevelASTNode): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: ILowLevelASTNode, toSeq: Boolean): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any], toSeq.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: InsertionPoint): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: InsertionPoint, toSeq: Boolean): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any], toSeq.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  
  inline def isLowLevelNode(`object`: Any): /* is raml-1-parser.raml-1-parser/dist/parser/lowLevelAST.ILowLevelASTNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowLevelNode")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/lowLevelAST.ILowLevelASTNode */ Boolean]
  
  inline def isWebPath(reference: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebPath")(reference.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeNode(t: ILowLevelASTNode, child: ILowLevelASTNode): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  
  inline def setAttr(t: ILowLevelASTNode, value: String): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  
  inline def setAttrStructured(t: ILowLevelASTNode, value: IStructuredValue): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttrStructured")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  
  inline def setKey(t: ILowLevelASTNode, value: String): ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("setKey")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ASTChangeCommand]
  
  inline def toAbsolutePath(context: String, reference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toAbsolutePath")(context.asInstanceOf[js.Any], reference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ASTVisitor = js.Function1[/* node */ ILowLevelASTNode, Boolean]
  
  type IASTListener = js.Function1[/* delta */ ASTDelta, Any]
  
  trait ICompilationUnit extends StObject {
    
    def absolutePath(): String
    
    def ast(): ILowLevelASTNode
    
    def contents(): String
    
    def expandedHighLevel(): IParseResult
    
    /**
      * gathers includes over ast without actual resolving of units;
      */
    def getIncludeNodes(): js.Array[IncludePath]
    
    /**
      * Returns master reference if presents, null otherwise.
      */
    def getMasterReferenceNode(): ILowLevelASTNode
    
    def highLevel(): typings.raml1Parser.mod.IParseResult
    
    def isDirty(): Boolean
    
    /**
      * Returns true if this unit is overlay or extension, false otherwise.
      */
    def isOverlayOrExtension(): Boolean
    
    def isRAMLUnit(): Boolean
    
    def isTopLevel(): Boolean
    
    def lexerErrors(): js.Array[js.Error]
    
    def lineMapper(): LineMapper
    
    def path(): String
    
    def project(): IProject
    
    def resolve(p: String): ICompilationUnit
    
    def resolveAsync(p: String): js.Promise[ICompilationUnit]
    
    def updateContent(newContent: String): Any
  }
  object ICompilationUnit {
    
    inline def apply(
      absolutePath: () => String,
      ast: () => ILowLevelASTNode,
      contents: () => String,
      expandedHighLevel: () => IParseResult,
      getIncludeNodes: () => js.Array[IncludePath],
      getMasterReferenceNode: () => ILowLevelASTNode,
      highLevel: () => typings.raml1Parser.mod.IParseResult,
      isDirty: () => Boolean,
      isOverlayOrExtension: () => Boolean,
      isRAMLUnit: () => Boolean,
      isTopLevel: () => Boolean,
      lexerErrors: () => js.Array[js.Error],
      lineMapper: () => LineMapper,
      path: () => String,
      project: () => IProject,
      resolve: String => ICompilationUnit,
      resolveAsync: String => js.Promise[ICompilationUnit],
      updateContent: String => Any
    ): ICompilationUnit = {
      val __obj = js.Dynamic.literal(absolutePath = js.Any.fromFunction0(absolutePath), ast = js.Any.fromFunction0(ast), contents = js.Any.fromFunction0(contents), expandedHighLevel = js.Any.fromFunction0(expandedHighLevel), getIncludeNodes = js.Any.fromFunction0(getIncludeNodes), getMasterReferenceNode = js.Any.fromFunction0(getMasterReferenceNode), highLevel = js.Any.fromFunction0(highLevel), isDirty = js.Any.fromFunction0(isDirty), isOverlayOrExtension = js.Any.fromFunction0(isOverlayOrExtension), isRAMLUnit = js.Any.fromFunction0(isRAMLUnit), isTopLevel = js.Any.fromFunction0(isTopLevel), lexerErrors = js.Any.fromFunction0(lexerErrors), lineMapper = js.Any.fromFunction0(lineMapper), path = js.Any.fromFunction0(path), project = js.Any.fromFunction0(project), resolve = js.Any.fromFunction1(resolve), resolveAsync = js.Any.fromFunction1(resolveAsync), updateContent = js.Any.fromFunction1(updateContent))
      __obj.asInstanceOf[ICompilationUnit]
    }
    
    extension [Self <: ICompilationUnit](x: Self) {
      
      inline def setAbsolutePath(value: () => String): Self = StObject.set(x, "absolutePath", js.Any.fromFunction0(value))
      
      inline def setAst(value: () => ILowLevelASTNode): Self = StObject.set(x, "ast", js.Any.fromFunction0(value))
      
      inline def setContents(value: () => String): Self = StObject.set(x, "contents", js.Any.fromFunction0(value))
      
      inline def setExpandedHighLevel(value: () => IParseResult): Self = StObject.set(x, "expandedHighLevel", js.Any.fromFunction0(value))
      
      inline def setGetIncludeNodes(value: () => js.Array[IncludePath]): Self = StObject.set(x, "getIncludeNodes", js.Any.fromFunction0(value))
      
      inline def setGetMasterReferenceNode(value: () => ILowLevelASTNode): Self = StObject.set(x, "getMasterReferenceNode", js.Any.fromFunction0(value))
      
      inline def setHighLevel(value: () => typings.raml1Parser.mod.IParseResult): Self = StObject.set(x, "highLevel", js.Any.fromFunction0(value))
      
      inline def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
      
      inline def setIsOverlayOrExtension(value: () => Boolean): Self = StObject.set(x, "isOverlayOrExtension", js.Any.fromFunction0(value))
      
      inline def setIsRAMLUnit(value: () => Boolean): Self = StObject.set(x, "isRAMLUnit", js.Any.fromFunction0(value))
      
      inline def setIsTopLevel(value: () => Boolean): Self = StObject.set(x, "isTopLevel", js.Any.fromFunction0(value))
      
      inline def setLexerErrors(value: () => js.Array[js.Error]): Self = StObject.set(x, "lexerErrors", js.Any.fromFunction0(value))
      
      inline def setLineMapper(value: () => LineMapper): Self = StObject.set(x, "lineMapper", js.Any.fromFunction0(value))
      
      inline def setPath(value: () => String): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setProject(value: () => IProject): Self = StObject.set(x, "project", js.Any.fromFunction0(value))
      
      inline def setResolve(value: String => ICompilationUnit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveAsync(value: String => js.Promise[ICompilationUnit]): Self = StObject.set(x, "resolveAsync", js.Any.fromFunction1(value))
      
      inline def setUpdateContent(value: String => Any): Self = StObject.set(x, "updateContent", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ILowLevelASTNode extends StObject {
    
    def actual(): Any = js.native
    
    def addChild(n: ILowLevelASTNode): Any = js.native
    def addChild(n: ILowLevelASTNode, pos: Double): Any = js.native
    
    def anchorId(): String = js.native
    
    /**
      * For anchor returns kind of anchored node.
      * For the rest of the nodes returns null.
      */
    def anchorValueKind(): Kind = js.native
    
    def anchoredFrom(): ILowLevelASTNode = js.native
    
    def children(): js.Array[ILowLevelASTNode] = js.native
    
    def containingUnit(): ICompilationUnit = js.native
    
    def copy(): ILowLevelASTNode = js.native
    
    def dump(): String = js.native
    
    def dumpToObject(): Any = js.native
    def dumpToObject(full: Boolean): Any = js.native
    
    def end(): Double = js.native
    
    def errors(): js.Array[js.Error] = js.native
    
    def execute(cmd: CompositeCommand): Any = js.native
    
    def hasInnerIncludeError(): Boolean = js.native
    
    def highLevelNode(): IHighLevelNode = js.native
    
    def highLevelParseResult(): IParseResult = js.native
    
    /**
      * Returns a unit, which is a base for include reference.
      * This method should be called when a node may potentially hbe defined in several units
      * at once (in case of expansion) and caller needs a unit, which is a base for this node's
      * include statement.
      *
      * If this node has no include statement, return value of the method should be equal to the result of
      * unit() method call.
      */
    def includeBaseUnit(): ICompilationUnit = js.native
    
    def includeErrors(): js.Array[String] = js.native
    
    def includePath(): String = js.native
    
    def includeReference(): IncludeReference = js.native
    
    def includedFrom(): ILowLevelASTNode = js.native
    
    /**
      * Indicates that contents of this node are !included
      */
    def includesContents(): Boolean = js.native
    
    def isAnnotatedScalar(): Boolean = js.native
    
    def isValueLocal(): Boolean = js.native
    
    def key(): String = js.native
    
    def keyEnd(): Double = js.native
    
    /**
      * Returns kind of the key YAML node
      */
    def keyKind(): Kind = js.native
    
    def keyStart(): Double = js.native
    
    /**
      * Returns kind of the underlying YAML node
      */
    def kind(): Kind = js.native
    
    def markup(): String = js.native
    def markup(json: Boolean): String = js.native
    
    def nodeDefinition(): INodeDefinition = js.native
    
    def optional(): Boolean = js.native
    
    def parent(): ILowLevelASTNode = js.native
    
    /**
      * Returns value kind for AST with resolved includes and anchors
      */
    def resolvedValueKind(): Kind = js.native
    
    def setHighLevelNode(highLevelParseResult: IHighLevelNode): Any = js.native
    
    def setHighLevelParseResult(highLevel: IParseResult): Any = js.native
    
    def show(msg: String): Any = js.native
    def show(msg: String, lev: Double): Any = js.native
    def show(msg: String, lev: Double, text: String): Any = js.native
    def show(msg: String, lev: Unit, text: String): Any = js.native
    
    def start(): Double = js.native
    
    def text(unitText: String): String = js.native
    
    def unit(): ICompilationUnit = js.native
    
    def value(): Any = js.native
    def value(toString: Boolean): Any = js.native
    
    def valueEnd(): Double = js.native
    
    /**
      * Returns kind of the value YAML node
      */
    def valueKind(): Kind = js.native
    
    def valueStart(): Double = js.native
    
    def visit(v: ASTVisitor): Any = js.native
  }
  
  trait ILowLevelEnvironment extends StObject {
    
    def createProject(path: String): IProject
  }
  object ILowLevelEnvironment {
    
    inline def apply(createProject: String => IProject): ILowLevelEnvironment = {
      val __obj = js.Dynamic.literal(createProject = js.Any.fromFunction1(createProject))
      __obj.asInstanceOf[ILowLevelEnvironment]
    }
    
    extension [Self <: ILowLevelEnvironment](x: Self) {
      
      inline def setCreateProject(value: String => IProject): Self = StObject.set(x, "createProject", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IProject extends StObject {
    
    def addListener(listener: IASTListener): Any = js.native
    
    def addTextChangeListener(listener: ITextChangeCommandListener): Any = js.native
    
    def cloneWithResolver(newResolver: FSResolver): IProject = js.native
    def cloneWithResolver(newResolver: FSResolver, httpResolver: HTTPResolver): IProject = js.native
    def cloneWithResolver(r: Any): IProject = js.native
    
    def deleteUnit(n: String): Any = js.native
    
    def execute(cmd: CompositeCommand): Any = js.native
    
    def executeTextChange(textCommand: TextChangeCommand): Any = js.native
    
    def fsEnabled(): Boolean = js.native
    
    def getMainUnit(): ICompilationUnit = js.native
    
    def getRootPath(): String = js.native
    
    def lexerErrors(): js.Array[js.Error] = js.native
    
    def removeListener(listener: IASTListener): Any = js.native
    
    def removeTextChangeListener(listener: ITextChangeCommandListener): Any = js.native
    
    def setCachedUnitContent(path: String): Any = js.native
    def setCachedUnitContent(path: String, content: String): Any = js.native
    
    def unit(path: String): ICompilationUnit = js.native
    def unit(path: String, absolute: Boolean): ICompilationUnit = js.native
    
    def unitAsync(path: String): js.Promise[ICompilationUnit] = js.native
    def unitAsync(path: String, absolute: Boolean): js.Promise[ICompilationUnit] = js.native
    
    def units(): js.Array[ICompilationUnit] = js.native
  }
  
  type ITextChangeCommandListener = js.Function1[/* delta */ TextChangeCommand, Any]
  
  trait IncludeReference extends StObject {
    
    def asString(): String
    
    def encodedName(): String
    
    def getFragments(): js.Array[String]
    
    def getIncludePath(): String
  }
  object IncludeReference {
    
    inline def apply(
      asString: () => String,
      encodedName: () => String,
      getFragments: () => js.Array[String],
      getIncludePath: () => String
    ): IncludeReference = {
      val __obj = js.Dynamic.literal(asString = js.Any.fromFunction0(asString), encodedName = js.Any.fromFunction0(encodedName), getFragments = js.Any.fromFunction0(getFragments), getIncludePath = js.Any.fromFunction0(getIncludePath))
      __obj.asInstanceOf[IncludeReference]
    }
    
    extension [Self <: IncludeReference](x: Self) {
      
      inline def setAsString(value: () => String): Self = StObject.set(x, "asString", js.Any.fromFunction0(value))
      
      inline def setEncodedName(value: () => String): Self = StObject.set(x, "encodedName", js.Any.fromFunction0(value))
      
      inline def setGetFragments(value: () => js.Array[String]): Self = StObject.set(x, "getFragments", js.Any.fromFunction0(value))
      
      inline def setGetIncludePath(value: () => String): Self = StObject.set(x, "getIncludePath", js.Any.fromFunction0(value))
    }
  }
  
  trait InsertionPoint extends StObject {
    
    var point: ILowLevelASTNode
    
    var `type`: InsertionPointType
  }
  object InsertionPoint {
    
    inline def apply(point: ILowLevelASTNode, `type`: InsertionPointType): InsertionPoint = {
      val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertionPoint]
    }
    
    extension [Self <: InsertionPoint](x: Self) {
      
      inline def setPoint(value: ILowLevelASTNode): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setType(value: InsertionPointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineMapper extends StObject {
    
    def position(pos: Double): TextPosition
    
    def toPosition(line: Double, column: Double): TextPosition
  }
  object LineMapper {
    
    inline def apply(position: Double => TextPosition, toPosition: (Double, Double) => TextPosition): LineMapper = {
      val __obj = js.Dynamic.literal(position = js.Any.fromFunction1(position), toPosition = js.Any.fromFunction2(toPosition))
      __obj.asInstanceOf[LineMapper]
    }
    
    extension [Self <: LineMapper](x: Self) {
      
      inline def setPosition(value: Double => TextPosition): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      inline def setToPosition(value: (Double, Double) => TextPosition): Self = StObject.set(x, "toPosition", js.Any.fromFunction2(value))
    }
  }
  
  trait TextPosition extends StObject {
    
    /**
      * Column number, starting from one
      */
    var column: Double
    
    /**
      * Line number, starting from one
      */
    var line: Double
    
    /**
      * Character index in whole text, starting from zero
      */
    var position: Double
  }
  object TextPosition {
    
    inline def apply(column: Double, line: Double, position: Double): TextPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextPosition]
    }
    
    extension [Self <: TextPosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
