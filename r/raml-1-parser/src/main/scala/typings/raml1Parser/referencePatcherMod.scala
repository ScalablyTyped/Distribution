package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.Node
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.jsyaml2lowLevelMod.ASTNode
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.raml1Parser.lowLevelASTProxyMod.LowLevelCompositeNode
import typings.ramlTypesystem.mod.IParsedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referencePatcherMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ParametersEscapingStatus extends StObject
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcher", "ParametersEscapingStatus")
  @js.native
  object ParametersEscapingStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ParametersEscapingStatus & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with ParametersEscapingStatus
    /* 2 */ val ERROR: typings.raml1Parser.referencePatcherMod.ParametersEscapingStatus.ERROR & Double = js.native
    
    @js.native
    sealed trait NOT_REQUIRED
      extends StObject
         with ParametersEscapingStatus
    /* 1 */ val NOT_REQUIRED: typings.raml1Parser.referencePatcherMod.ParametersEscapingStatus.NOT_REQUIRED & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with ParametersEscapingStatus
    /* 0 */ val OK: typings.raml1Parser.referencePatcherMod.ParametersEscapingStatus.OK & Double = js.native
  }
  
  @js.native
  sealed trait PatchMode extends StObject
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcher", "PatchMode")
  @js.native
  object PatchMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PatchMode & Double] = js.native
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with PatchMode
    /* 0 */ val DEFAULT: typings.raml1Parser.referencePatcherMod.PatchMode.DEFAULT & Double = js.native
    
    @js.native
    sealed trait PATH
      extends StObject
         with PatchMode
    /* 1 */ val PATH: typings.raml1Parser.referencePatcherMod.PatchMode.PATH & Double = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcher", "PatchedReference")
  @js.native
  open class PatchedReference protected () extends StObject {
    def this(
      _namespace: String,
      _name: String,
      _collectionName: String,
      _referencedUnit: ICompilationUnit,
      _isChained: Boolean,
      _mode: PatchMode
    ) = this()
    
    /* private */ var _collectionName: Any = js.native
    
    /* private */ var _isChained: Any = js.native
    
    /* private */ var _mode: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _namespace: Any = js.native
    
    /* private */ var _referencedUnit: Any = js.native
    
    def collectionName(): String = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    var gotQuestion: Boolean = js.native
    
    def isChained(): Boolean = js.native
    
    def mode(): PatchMode = js.native
    
    def name(): String = js.native
    
    def namespace(): String = js.native
    
    var referencedNode: ILowLevelASTNode = js.native
    
    def referencedUnit(): ICompilationUnit = js.native
    
    def value(): String = js.native
  }
  /* static members */
  object PatchedReference {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcher", "PatchedReference")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcher", "PatchedReference.CLASS_IDENTIFIER_PatchedReference")
    @js.native
    def CLASS_IDENTIFIER_PatchedReference: Any = js.native
    inline def CLASS_IDENTIFIER_PatchedReference_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_PatchedReference")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/referencePatcher.PatchedReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/referencePatcher.PatchedReference */ Boolean]
  }
  
  inline def checkExpression(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExpression")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def escapeTemplateParameters(str: String): EscapeData = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeTemplateParameters")(str.asInstanceOf[js.Any]).asInstanceOf[EscapeData]
  
  inline def getDeclaration(elementName: String, typeName: String, units: js.Array[ICompilationUnit]): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeclaration")(elementName.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def instanceOfPatchedReference(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/referencePatcher.PatchedReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfPatchedReference")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/referencePatcher.PatchedReference */ Boolean]
  
  inline def isCompoundValue(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompoundValue")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def patchMethodIs(node: IHighLevelNode, traits: js.Array[Node], rootPath: String): LowLevelCompositeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("patchMethodIs")(node.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], rootPath.asInstanceOf[js.Any])).asInstanceOf[LowLevelCompositeNode]
  
  inline def prepareTraitRefNode(llNode: ILowLevelASTNode, llParent: ILowLevelASTNode): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareTraitRefNode")(llNode.asInstanceOf[js.Any], llParent.asInstanceOf[js.Any])).asInstanceOf[ASTNode]
  
  inline def toOriginal(node: ILowLevelASTNode): ILowLevelASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("toOriginal")(node.asInstanceOf[js.Any]).asInstanceOf[ILowLevelASTNode]
  
  inline def typeUnit(t: ITypeDefinition): ICompilationUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("typeUnit")(t.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit]
  inline def typeUnit(t: IParsedType): ICompilationUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("typeUnit")(t.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit]
  
  inline def unescapeTemplateParameters(str: String, substitutions: StringDictionary[String]): EscapeData = (^.asInstanceOf[js.Dynamic].applyDynamic("unescapeTemplateParameters")(str.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[EscapeData]
  
  type DependencyMap = StringDictionary[StringDictionary[PatchedReference]]
  
  trait EscapeData extends StObject {
    
    var resultingString: js.UndefOr[String] = js.undefined
    
    var status: ParametersEscapingStatus
    
    var substitutions: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object EscapeData {
    
    inline def apply(status: ParametersEscapingStatus): EscapeData = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[EscapeData]
    }
    
    extension [Self <: EscapeData](x: Self) {
      
      inline def setResultingString(value: String): Self = StObject.set(x, "resultingString", value.asInstanceOf[js.Any])
      
      inline def setResultingStringUndefined: Self = StObject.set(x, "resultingString", js.undefined)
      
      inline def setStatus(value: ParametersEscapingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubstitutions(value: StringDictionary[String]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
    }
  }
}
