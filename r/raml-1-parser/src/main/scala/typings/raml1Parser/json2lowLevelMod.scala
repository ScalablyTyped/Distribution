package typings.raml1Parser

import typings.raml1Parser.anon.IncludePath
import typings.raml1Parser.highLevelASTMod.IParseResult
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.raml1Parser.lowLevelASTMod.IProject
import typings.raml1Parser.lowLevelASTMod.LineMapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json2lowLevelMod {
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/json2lowLevel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/json2lowLevel", "AstNode")
  @js.native
  open class AstNode protected ()
    extends StObject
       with ILowLevelASTNode {
    def this(_unit: ICompilationUnit, _object: Any) = this()
    def this(_unit: ICompilationUnit, _object: Any, _parent: ILowLevelASTNode) = this()
    def this(_unit: ICompilationUnit, _object: Any, _parent: Unit, options: SerializeOptions) = this()
    def this(_unit: ICompilationUnit, _object: Any, _parent: ILowLevelASTNode, options: SerializeOptions) = this()
    def this(_unit: ICompilationUnit, _object: Any, _parent: Unit, options: Unit, _key: String) = this()
    def this(_unit: ICompilationUnit, _object: Any, _parent: Unit, options: SerializeOptions, _key: String) = this()
    def this(_unit: ICompilationUnit, _object: Any, _parent: ILowLevelASTNode, options: Unit, _key: String) = this()
    def this(
      _unit: ICompilationUnit,
      _object: Any,
      _parent: ILowLevelASTNode,
      options: SerializeOptions,
      _key: String
    ) = this()
    
    /* private */ var _highLevelNode: Any = js.native
    
    /* private */ var _highLevelParseResult: Any = js.native
    
    /* private */ var _isOptional: Any = js.native
    
    /* protected */ var _key: js.UndefOr[String] = js.native
    
    /* protected */ var _object: Any = js.native
    
    /* protected */ var _parent: js.UndefOr[ILowLevelASTNode] = js.native
    
    /* private */ var _unit: Any = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    /* protected */ var options: SerializeOptions = js.native
  }
  /* static members */
  object AstNode {
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/json2lowLevel", "AstNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/jsyaml/json2lowLevel", "AstNode.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/json2lowLevel.AstNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/jsyaml/json2lowLevel.AstNode */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/json2lowLevel", "CompilationUnit")
  @js.native
  open class CompilationUnit protected ()
    extends StObject
       with ICompilationUnit {
    def this(_absolutePath: String, _path: String, _content: String, _project: IProject, _isTopoLevel: Boolean) = this()
    def this(
      _absolutePath: String,
      _path: String,
      _content: String,
      _project: IProject,
      _isTopoLevel: Boolean,
      serializeOptions: SerializeOptions
    ) = this()
    
    /* protected */ var _absolutePath: String = js.native
    
    /* protected */ var _content: String = js.native
    
    /* protected */ var _isTopoLevel: Boolean = js.native
    
    /* protected */ var _node: AstNode = js.native
    
    /* protected */ var _path: String = js.native
    
    /* protected */ var _project: IProject = js.native
    
    /* CompleteClass */
    override def absolutePath(): String = js.native
    
    /* CompleteClass */
    override def ast(): ILowLevelASTNode = js.native
    
    /* CompleteClass */
    override def contents(): String = js.native
    
    /* CompleteClass */
    override def expandedHighLevel(): IParseResult = js.native
    
    /**
      * gathers includes over ast without actual resolving of units;
      */
    /* CompleteClass */
    override def getIncludeNodes(): js.Array[IncludePath] = js.native
    
    /**
      * Returns master reference if presents, null otherwise.
      */
    /* CompleteClass */
    override def getMasterReferenceNode(): ILowLevelASTNode = js.native
    
    /* CompleteClass */
    override def highLevel(): typings.raml1Parser.mod.IParseResult = js.native
    
    /* CompleteClass */
    override def isDirty(): Boolean = js.native
    
    /**
      * Returns true if this unit is overlay or extension, false otherwise.
      */
    /* CompleteClass */
    override def isOverlayOrExtension(): Boolean = js.native
    
    /* CompleteClass */
    override def isRAMLUnit(): Boolean = js.native
    
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
    
    def ramlVersion(): String = js.native
    
    /* CompleteClass */
    override def resolve(p: String): ICompilationUnit = js.native
    
    /* CompleteClass */
    override def resolveAsync(p: String): js.Promise[ICompilationUnit] = js.native
    
    /* protected */ var serializeOptions: SerializeOptions = js.native
    
    /* CompleteClass */
    override def updateContent(newContent: String): Any = js.native
  }
  
  inline def serialize(node: ILowLevelASTNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def serialize(node: ILowLevelASTNode, options: SerializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def serialize2(n: ILowLevelASTNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize2")(n.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def serialize2(n: ILowLevelASTNode, full: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize2")(n.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait SerializeOptions extends StObject {
    
    var escapeNumericKeys: js.UndefOr[Boolean] = js.undefined
    
    var rawKey: js.UndefOr[Boolean] = js.undefined
    
    var writeErrors: js.UndefOr[Boolean] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    extension [Self <: SerializeOptions](x: Self) {
      
      inline def setEscapeNumericKeys(value: Boolean): Self = StObject.set(x, "escapeNumericKeys", value.asInstanceOf[js.Any])
      
      inline def setEscapeNumericKeysUndefined: Self = StObject.set(x, "escapeNumericKeys", js.undefined)
      
      inline def setRawKey(value: Boolean): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
      
      inline def setRawKeyUndefined: Self = StObject.set(x, "rawKey", js.undefined)
      
      inline def setWriteErrors(value: Boolean): Self = StObject.set(x, "writeErrors", value.asInstanceOf[js.Any])
      
      inline def setWriteErrorsUndefined: Self = StObject.set(x, "writeErrors", js.undefined)
    }
  }
}
