package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.ActionBody
import typings.raml1Parser.anon.ActionString
import typings.raml1Parser.anon.BodyHeaders
import typings.raml1Parser.anon.Delete
import typings.raml1Parser.anon.Get
import typings.raml1Parser.anon.OneOf
import typings.raml1Parser.anon.OneOfArray
import typings.raml1Parser.anon._empty
import typings.raml1Parser.distParserAstDotcoreExpanderLLMod.DefaultTransformer
import typings.raml1Parser.distParserAstDotcoreLowLevelASTProxyMod.LowLevelCompositeNode
import typings.raml1Parser.distParserAstDotcoreNamespaceResolverMod.NamespaceResolver
import typings.raml1Parser.distParserAstDotcoreReferencePatcherMod.PatchMode
import typings.raml1Parser.distParserAstDotcoreReferencePatcherMod.PatchedReference
import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreReferencePatcherLLMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "ReferencePatcher")
  @js.native
  open class ReferencePatcher () extends StObject {
    def this(mode: PatchMode) = this()
    
    /* private */ var _libModels: Any = js.native
    
    /* private */ var _outerDependencies: Any = js.native
    
    /* private */ var contributeCollection: Any = js.native
    
    def expandLibraries(api: LowLevelCompositeNode): Unit = js.native
    def expandLibraries(api: LowLevelCompositeNode, excessive: Boolean): Unit = js.native
    
    /* private */ var libExpMode: Any = js.native
    
    /* protected */ var mode: PatchMode = js.native
    
    /* private */ var needTypesReset: Any = js.native
    
    /* private */ var patchDependencies: Any = js.native
    
    def patchNodeName(node: ILowLevelASTNode, state: State, collectionName: String): Unit = js.native
    
    def patchReference(attr: ILowLevelASTNode, state: State, collectionName: String): Unit = js.native
    def patchReference(attr: ILowLevelASTNode, state: State, collectionName: String, force: Boolean): Unit = js.native
    
    def patchType(node: ILowLevelASTNode, state: State): Boolean = js.native
    
    def patchUses(node: ILowLevelASTNode, resolver: NamespaceResolver): Unit = js.native
    
    def process(apiNode: ILowLevelASTNode): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: Unit, typeName: String): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: Unit, typeName: String, _removeUses: Boolean): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: String,
      _removeUses: Boolean,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: String,
      _removeUses: Boolean,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: String,
      _removeUses: Boolean,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: String,
      _removeUses: Unit,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: String,
      _removeUses: Unit,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: String,
      _removeUses: Unit,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: Unit, typeName: Unit, _removeUses: Boolean): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: Unit,
      _removeUses: Boolean,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: Unit,
      _removeUses: Boolean,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: Unit,
      _removeUses: Boolean,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: Unit,
      _removeUses: Unit,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: Unit,
      _removeUses: Unit,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: Unit,
      typeName: Unit,
      _removeUses: Unit,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: ILowLevelASTNode): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: ILowLevelASTNode, typeName: String): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: ILowLevelASTNode, typeName: String, _removeUses: Boolean): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: String,
      _removeUses: Boolean,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: String,
      _removeUses: Boolean,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: String,
      _removeUses: Boolean,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: String,
      _removeUses: Unit,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: String,
      _removeUses: Unit,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: String,
      _removeUses: Unit,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(apiNode: ILowLevelASTNode, rootNode: ILowLevelASTNode, typeName: Unit, _removeUses: Boolean): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: Unit,
      _removeUses: Boolean,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: Unit,
      _removeUses: Boolean,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: Unit,
      _removeUses: Boolean,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: Unit,
      _removeUses: Unit,
      _patchNodeName: Boolean
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: Unit,
      _removeUses: Unit,
      _patchNodeName: Boolean,
      collectionName: String
    ): Unit = js.native
    def process(
      apiNode: ILowLevelASTNode,
      rootNode: ILowLevelASTNode,
      typeName: Unit,
      _removeUses: Unit,
      _patchNodeName: Unit,
      collectionName: String
    ): Unit = js.native
    
    def registerPatchedReference(ref: PatchedReference): Unit = js.native
    
    /* private */ var removeUnusedDependencies: Any = js.native
    
    def removeUses(node: ILowLevelASTNode): Unit = js.native
    
    /* private */ var resetHighLevel: Any = js.native
    
    def resolveReferenceValue(stringToPatch: String, state: State, transformer: DefaultTransformer, collectionName: String): PatchedReference = js.native
    
    def resolveReferenceValueBasic(_value: String, state: State, collectionName: String): PatchedReference = js.native
    def resolveReferenceValueBasic(_value: String, state: State, collectionName: String, unitsOverride: js.Array[ICompilationUnit]): PatchedReference = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "ReferencePatcherActionsAndConditionsFactory")
  @js.native
  open class ReferencePatcherActionsAndConditionsFactory ()
    extends StObject
       with ActionsAndCondtionsFactory {
    
    /* CompleteClass */
    override def action(name: String): Action = js.native
    
    /* CompleteClass */
    override def condition(name: String): Condition = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "Scope")
  @js.native
  open class Scope () extends StObject {
    
    var hasRootMediaType: Boolean = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "State")
  @js.native
  open class State protected () extends StObject {
    def this(
      referencePatcher: ReferencePatcher,
      rootUnit: ICompilationUnit,
      globalScope: Scope,
      resolver: NamespaceResolver
    ) = this()
    
    def appendUnitIfNeeded(node: ICompilationUnit): Boolean = js.native
    def appendUnitIfNeeded(node: ILowLevelASTNode): Boolean = js.native
    
    var globalScope: Scope = js.native
    
    def lastUnit(): ICompilationUnit = js.native
    
    var meta: Any = js.native
    
    def popUnit(): Unit = js.native
    
    var referencePatcher: ReferencePatcher = js.native
    
    var registerOnly: Boolean = js.native
    
    var resolver: NamespaceResolver = js.native
    
    var rootUnit: ICompilationUnit = js.native
    
    var units: js.Array[ICompilationUnit] = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "Transition")
  @js.native
  open class Transition protected () extends StObject {
    def this(title: String, localMap: Any, globalMap: TransitionMap) = this()
    
    def action(node: ILowLevelASTNode, state: State): Boolean = js.native
    @JSName("action")
    var action_Original: Action = js.native
    
    def applyMappedTransition(node: ILowLevelASTNode, tr: Transition, state: State): Unit = js.native
    
    var applyToChildren: Boolean = js.native
    
    def checkConditions(node: ILowLevelASTNode, state: State): Boolean = js.native
    
    var children: js.Array[Transition] = js.native
    
    var conditions: js.Array[Condition] = js.native
    
    var globalMap: TransitionMap = js.native
    
    def init(factory: ActionsAndCondtionsFactory): Unit = js.native
    
    var kind: TransitionKind = js.native
    
    var localMap: Any = js.native
    
    def processNode(node: ILowLevelASTNode, state: State): Unit = js.native
    
    /* private */ var regexpTransitions: Any = js.native
    
    /* private */ var staticTransitions: Any = js.native
    
    var title: String = js.native
  }
  
  @js.native
  sealed trait TransitionKind extends StObject
  @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "TransitionKind")
  @js.native
  object TransitionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransitionKind & Double] = js.native
    
    @js.native
    sealed trait ACTION
      extends StObject
         with TransitionKind
    /* 2 */ val ACTION: typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.TransitionKind.ACTION & Double = js.native
    
    @js.native
    sealed trait BASIC
      extends StObject
         with TransitionKind
    /* 0 */ val BASIC: typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.TransitionKind.BASIC & Double = js.native
    
    @js.native
    sealed trait MIXED
      extends StObject
         with TransitionKind
    /* 3 */ val MIXED: typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.TransitionKind.MIXED & Double = js.native
    
    @js.native
    sealed trait ONE_OF
      extends StObject
         with TransitionKind
    /* 1 */ val ONE_OF: typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.TransitionKind.ONE_OF & Double = js.native
  }
  
  inline def toOriginal(node: ILowLevelASTNode): ILowLevelASTNode = ^.asInstanceOf[js.Dynamic].applyDynamic("toOriginal")(node.asInstanceOf[js.Any]).asInstanceOf[ILowLevelASTNode]
  
  object transitions {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Annotation")
    @js.native
    def Annotation: ActionString = js.native
    inline def Annotation_=(x: ActionString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Api")
    @js.native
    def Api: _empty = js.native
    inline def Api_=(x: _empty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Api")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Body")
    @js.native
    def Body: OneOf = js.native
    inline def Body_=(x: OneOf): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Method")
    @js.native
    def Method: ActionBody = js.native
    inline def Method_=(x: ActionBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Method")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Resource")
    @js.native
    def Resource: Delete = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.ResourceType")
    @js.native
    def ResourceType: Get = js.native
    inline def ResourceType_=(x: Get): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(x.asInstanceOf[js.Any])
    
    inline def Resource_=(x: Delete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Resource")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Response")
    @js.native
    def Response: typings.raml1Parser.anon.String = js.native
    inline def Response_=(x: typings.raml1Parser.anon.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Response")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.SecuritySchemeReferences")
    @js.native
    def SecuritySchemeReferences: typings.raml1Parser.anon.Action = js.native
    inline def SecuritySchemeReferences_=(x: typings.raml1Parser.anon.Action): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecuritySchemeReferences")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.Trait")
    @js.native
    def Trait: BodyHeaders = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.TraitReferences")
    @js.native
    def TraitReferences: typings.raml1Parser.anon.Action = js.native
    inline def TraitReferences_=(x: typings.raml1Parser.anon.Action): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TraitReferences")(x.asInstanceOf[js.Any])
    
    inline def Trait_=(x: BodyHeaders): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Trait")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/referencePatcherLL", "transitions.TypeDeclaration")
    @js.native
    def TypeDeclaration: OneOfArray = js.native
    inline def TypeDeclaration_=(x: OneOfArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeDeclaration")(x.asInstanceOf[js.Any])
  }
  
  type Action = js.Function2[/* node */ ILowLevelASTNode, /* state */ State, Boolean]
  
  trait ActionsAndCondtionsFactory extends StObject {
    
    def action(name: String): Action
    
    def condition(name: String): Condition
  }
  object ActionsAndCondtionsFactory {
    
    inline def apply(action: String => Action, condition: String => Condition): ActionsAndCondtionsFactory = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), condition = js.Any.fromFunction1(condition))
      __obj.asInstanceOf[ActionsAndCondtionsFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionsAndCondtionsFactory] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String => Action): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setCondition(value: String => Condition): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    }
  }
  
  type Condition = js.Function2[/* node */ ILowLevelASTNode, /* state */ State, Boolean]
  
  type TransitionMap = StringDictionary[Transition]
}
