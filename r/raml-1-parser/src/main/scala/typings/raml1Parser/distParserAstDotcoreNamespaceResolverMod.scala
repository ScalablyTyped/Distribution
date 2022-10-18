package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.Action
import typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.ActionsAndCondtionsFactory
import typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.Condition
import typings.raml1Parser.distParserAstDotcoreReferencePatcherLLMod.ReferencePatcherActionsAndConditionsFactory
import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreNamespaceResolverMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "ElementsCollection")
  @js.native
  open class ElementsCollection protected () extends StObject {
    def this(name: String) = this()
    
    var array: js.Array[ILowLevelASTNode] = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    def getElement(name: String): ILowLevelASTNode = js.native
    
    def getTemplateModel(name: String): TemplateModel = js.native
    
    def hasElement(name: String): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    var map: StringDictionary[ILowLevelASTNode] = js.native
    
    var name: String = js.native
    
    var templateModels: StringDictionary[TemplateModel] = js.native
  }
  /* static members */
  object ElementsCollection {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "ElementsCollection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "ElementsCollection.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-1-parser.raml-1-parser/dist/parser/ast.core/namespaceResolver.ElementsCollection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/ast.core/namespaceResolver.ElementsCollection */ Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "NamespaceResolver")
  @js.native
  open class NamespaceResolver () extends StObject {
    
    /* private */ var _expandedNSMap: Any = js.native
    
    /* private */ var _hasFragments: Any = js.native
    
    /* private */ var _unitModels: Any = js.native
    
    /* private */ var byNsMap: Any = js.native
    
    /* private */ var byPathMap: Any = js.native
    
    /* private */ var calculateExpandedNamespaces: Any = js.native
    
    /* private */ var calculateNamespaces: Any = js.native
    
    def deleteUnitModel(aPath: String): Unit = js.native
    
    /* private */ var expandedAbsToNsMap: Any = js.native
    
    def expandedNSMap(unit: ICompilationUnit): StringDictionary[UsesInfo] = js.native
    
    def expandedPathMap(unit: ICompilationUnit): StringDictionary[UsesInfo] = js.native
    
    def getComponent(rootUnit: ICompilationUnit, `type`: String, namespace: String, name: String): TemplateModel = js.native
    def getComponent(
      rootUnit: ICompilationUnit,
      `type`: String,
      namespace: String,
      name: String,
      passed: StringDictionary[Boolean]
    ): TemplateModel = js.native
    
    def hasFragments(unit: ICompilationUnit): Boolean = js.native
    
    def hasTemplates(unit: ICompilationUnit): Boolean = js.native
    
    /* private */ var lexLessEq: Any = js.native
    
    def nsMap(unit: ICompilationUnit): StringDictionary[UsesInfo] = js.native
    
    def pathMap(unit: ICompilationUnit): StringDictionary[UsesInfo] = js.native
    
    def resolveNamespace(from: ICompilationUnit, to: ICompilationUnit): UsesInfo = js.native
    
    def unitModel(unit: ICompilationUnit): UnitModel = js.native
    def unitModel(unit: ICompilationUnit, passed: StringDictionary[Boolean]): UnitModel = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "NamespaceResolverActionsAndConditionsFactory")
  @js.native
  open class NamespaceResolverActionsAndConditionsFactory ()
    extends StObject
       with ActionsAndCondtionsFactory {
    
    /* CompleteClass */
    override def action(name: String): Action = js.native
    
    /* CompleteClass */
    override def condition(name: String): Condition = js.native
    
    var parent: ReferencePatcherActionsAndConditionsFactory = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "TemplateModel")
  @js.native
  open class TemplateModel protected () extends StObject {
    def this(name: String, kind: String, node: ILowLevelASTNode, typeValuedParameters: Any) = this()
    
    def id(): String = js.native
    
    def isInitialized(): Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var node: ILowLevelASTNode = js.native
    
    var typeValuedParameters: Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "UnitModel")
  @js.native
  open class UnitModel protected () extends StObject {
    def this(unit: ICompilationUnit) = this()
    
    /* private */ var _extensionChain: Any = js.native
    
    /* private */ var _extensionSet: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    var annotationTypes: ElementsCollection = js.native
    
    def collection(collectionName: String): ElementsCollection = js.native
    
    def extensionChain(): js.Array[UnitModel] = js.native
    
    def extensionSet(): StringDictionary[UnitModel] = js.native
    
    /* private */ var init: Any = js.native
    
    def isOverlayOrExtension(): Boolean = js.native
    
    var master: UnitModel = js.native
    
    var resourceTypes: ElementsCollection = js.native
    
    var securitySchemes: ElementsCollection = js.native
    
    var traits: ElementsCollection = js.native
    
    def `type`(): String = js.native
    
    var types: ElementsCollection = js.native
    
    var unit: ICompilationUnit = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/namespaceResolver", "UsesInfo")
  @js.native
  open class UsesInfo protected () extends StObject {
    def this(usesNodes: js.Array[ILowLevelASTNode], unit: ICompilationUnit, includePath: String) = this()
    
    def absolutePath(): String = js.native
    
    var includePath: String = js.native
    
    def namespace(): String = js.native
    
    var namespaceSegments: js.Array[String] = js.native
    
    def steps(): Double = js.native
    
    var unit: ICompilationUnit = js.native
    
    var usesNodes: js.Array[ILowLevelASTNode] = js.native
  }
  
  inline def extendedUnit(u: ICompilationUnit): ICompilationUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendedUnit")(u.asInstanceOf[js.Any]).asInstanceOf[ICompilationUnit]
  
  inline def initUnitModel(result: UnitModel, resolver: NamespaceResolver): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initUnitModel")(result.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initUnitModel(result: UnitModel, resolver: NamespaceResolver, passed: StringDictionary[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initUnitModel")(result.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], passed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isLibraryBaseDescendant(unit: ICompilationUnit): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLibraryBaseDescendant")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
