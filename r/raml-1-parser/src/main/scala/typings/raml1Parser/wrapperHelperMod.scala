package typings.raml1Parser

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.parserCoreMod.AttributeNodeImpl
import typings.raml1Parser.parserCoreMod.BasicNode
import typings.raml1Parser.parserCoreMod.BasicNodeImpl
import typings.raml1Parser.parserCoreMod.TypeInstanceImpl
import typings.raml1Parser.raml10parserapiMod.AbstractSecurityScheme
import typings.raml1Parser.raml10parserapiMod.AnnotationRef
import typings.raml1Parser.raml10parserapiMod.Api
import typings.raml1Parser.raml10parserapiMod.ArrayTypeDeclaration
import typings.raml1Parser.raml10parserapiMod.ExampleSpec
import typings.raml1Parser.raml10parserapiMod.ExampleSpecScalarsAnnotations
import typings.raml1Parser.raml10parserapiMod.Library
import typings.raml1Parser.raml10parserapiMod.LibraryBase
import typings.raml1Parser.raml10parserapiMod.MarkdownString
import typings.raml1Parser.raml10parserapiMod.Method
import typings.raml1Parser.raml10parserapiMod.Reference
import typings.raml1Parser.raml10parserapiMod.Resource
import typings.raml1Parser.raml10parserapiMod.ResourceBase
import typings.raml1Parser.raml10parserapiMod.ResourceType
import typings.raml1Parser.raml10parserapiMod.ResourceTypeRef
import typings.raml1Parser.raml10parserapiMod.Response
import typings.raml1Parser.raml10parserapiMod.SecuritySchemeRef
import typings.raml1Parser.raml10parserapiMod.Trait
import typings.raml1Parser.raml10parserapiMod.TraitRef
import typings.raml1Parser.raml10parserapiMod.TypeDeclaration
import typings.raml1Parser.raml10parserapiMod.TypeInstance
import typings.raml1Parser.raml10parserapiMod.UsesDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperHelperMod {
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/wrapperHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/wrapperHelper", "ExampleSpecImpl")
  @js.native
  open class ExampleSpecImpl protected () extends BasicNodeImpl {
    def this(
      hlNode: IHighLevelNode,
      expandable: Any,
      _annotations: js.Array[AttributeNodeImpl],
      _scalarAnnotations: ExampleSpecScalarsAnnotations
    ) = this()
    
    /* protected */ var _annotations: js.Array[AttributeNodeImpl] = js.native
    
    /* protected */ var _scalarAnnotations: ExampleSpecScalarsAnnotations = js.native
    
    def annotations(): js.Array[Any] = js.native
    
    def description(): MarkdownString = js.native
    
    def displayName(): String = js.native
    
    /* protected */ var expandable: Any = js.native
    
    def name(): String = js.native
    
    def scalarsAnnotations(): ExampleSpecScalarsAnnotations = js.native
    
    def strict(): Boolean = js.native
    
    def structuredValue(): TypeInstanceImpl = js.native
    
    def uses(): js.Array[UsesDeclaration] = js.native
    
    def value(): Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/wrapperHelper", "ParamValue")
  @js.native
  open class ParamValue protected () extends StObject {
    def this(key: String, value: Any) = this()
    
    var key: String = js.native
    
    var value: Any = js.native
  }
  
  inline def RAMLVersion(api: Api): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RAMLVersion")(api.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/wrapperHelper", "SchemaDef")
  @js.native
  open class SchemaDef protected () extends StObject {
    def this(_content: String) = this()
    def this(_content: String, _name: String) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    def content(): String = js.native
    
    def name(): String = js.native
  }
  
  inline def absoluteUri(res: Resource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def absoluteUriParameters(res: Resource): js.Array[TypeDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUriParameters")(res.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeDeclaration]]
  
  inline def allProtocols(api: Api): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allProtocols")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def allResourceTypes(a: LibraryBase): js.Array[ResourceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allResourceTypes")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResourceType]]
  
  inline def allResources(api: Api): js.Array[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("allResources")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[Resource]]
  
  inline def allSecuredBy(resourceOrMethod: Method): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSecuredBy")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  inline def allSecuredBy(resourceOrMethod: ResourceBase): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSecuredBy")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  
  inline def allTraits(a: LibraryBase): js.Array[Trait] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTraits")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Trait]]
  
  inline def baseUriParameters(api: Api): js.Array[TypeDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUriParameters")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeDeclaration]]
  
  inline def baseUriParametersPrimary(api: Api): js.Array[TypeDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUriParametersPrimary")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeDeclaration]]
  
  inline def childMethod(resource: Resource, method: String): js.Array[Method] = (^.asInstanceOf[js.Dynamic].applyDynamic("childMethod")(resource.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[Method]]
  
  inline def childResource(container: Api, relPath: String): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("childResource")(container.asInstanceOf[js.Any], relPath.asInstanceOf[js.Any])).asInstanceOf[Resource]
  inline def childResource(container: Resource, relPath: String): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("childResource")(container.asInstanceOf[js.Any], relPath.asInstanceOf[js.Any])).asInstanceOf[Resource]
  
  inline def completeRelativeUri(res: Resource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("completeRelativeUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def examplesFromNominal(runtimeDefinition: ITypeDefinition, hlParent: IHighLevelNode, isSingle: Boolean): js.Array[ExampleSpecImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("examplesFromNominal")(runtimeDefinition.asInstanceOf[js.Any], hlParent.asInstanceOf[js.Any], isSingle.asInstanceOf[js.Any])).asInstanceOf[js.Array[ExampleSpecImpl]]
  inline def examplesFromNominal(runtimeDefinition: ITypeDefinition, hlParent: IHighLevelNode, isSingle: Boolean, patchHL: Boolean): js.Array[ExampleSpecImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("examplesFromNominal")(runtimeDefinition.asInstanceOf[js.Any], hlParent.asInstanceOf[js.Any], isSingle.asInstanceOf[js.Any], patchHL.asInstanceOf[js.Any])).asInstanceOf[js.Array[ExampleSpecImpl]]
  
  inline def expandLibraries(api: Api): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("expandLibraries")(api.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  inline def expandLibrarySpec(lib: Library): Library = ^.asInstanceOf[js.Dynamic].applyDynamic("expandLibrarySpec")(lib.asInstanceOf[js.Any]).asInstanceOf[Library]
  
  inline def expandSpec(api: Api): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("expandSpec")(api.asInstanceOf[js.Any]).asInstanceOf[Api]
  inline def expandSpec(api: Api, expLib: Boolean): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("expandSpec")(api.asInstanceOf[js.Any], expLib.asInstanceOf[js.Any])).asInstanceOf[Api]
  
  inline def expandTraitsAndResourceTypes(api: Api): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypes")(api.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  inline def findComponentTypeDeclaration(arrayTypeDecl: ArrayTypeDeclaration): TypeDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("findComponentTypeDeclaration")(arrayTypeDecl.asInstanceOf[js.Any]).asInstanceOf[TypeDeclaration]
  
  inline def getItems(typeDeclaration: ArrayTypeDeclaration): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItems")(typeDeclaration.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getMethod(container: Api, path: js.Array[String], method: String): js.Array[Method] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[Method]]
  inline def getMethod(container: Resource, path: js.Array[String], method: String): js.Array[Method] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[Method]]
  
  inline def getResource(container: Api, path: js.Array[String]): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Resource]
  inline def getResource(container: Resource, path: js.Array[String]): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Resource]
  
  inline def getTemplateParametrizedProperties(node: Method): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: ResourceType): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: Response): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: Trait): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: TypeDeclaration): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def getTypeExample(td: TypeDeclaration): ExampleSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeExample")(td.asInstanceOf[js.Any]).asInstanceOf[ExampleSpec]
  
  inline def getTypeExamples(td: TypeDeclaration): js.Array[ExampleSpec] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeExamples")(td.asInstanceOf[js.Any]).asInstanceOf[js.Array[ExampleSpec]]
  
  inline def isOkRange(response: Response): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOkRange")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def itemsStructuredValue(typeDeclaration: ArrayTypeDeclaration): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("itemsStructuredValue")(typeDeclaration.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def load(pth: String): BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pth.asInstanceOf[js.Any]).asInstanceOf[BasicNode]
  
  inline def matchUri(apiRootRelativeUri: String, resource: Resource): typings.raml1Parser.optMod.^[js.Array[ParamValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchUri")(apiRootRelativeUri.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.optMod.^[js.Array[ParamValue]]]
  
  inline def methodId(method: Method): String = ^.asInstanceOf[js.Dynamic].applyDynamic("methodId")(method.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ownerApi(method: Method): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerApi")(method.asInstanceOf[js.Any]).asInstanceOf[Api]
  inline def ownerApi(method: Resource): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerApi")(method.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  inline def parent(resource: Resource): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")(resource.asInstanceOf[js.Any]).asInstanceOf[Resource]
  
  inline def parentResource(method: Method): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("parentResource")(method.asInstanceOf[js.Any]).asInstanceOf[Resource]
  
  inline def protocolsPrimary(api: Api): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("protocolsPrimary")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def referenceName(reference: Reference): String = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceName")(reference.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def referencedAnnotation(ref: AnnotationRef): TypeDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("referencedAnnotation")(ref.asInstanceOf[js.Any]).asInstanceOf[TypeDeclaration]
  
  inline def referencedNode(usesDecl: UsesDeclaration): Library = ^.asInstanceOf[js.Dynamic].applyDynamic("referencedNode")(usesDecl.asInstanceOf[js.Any]).asInstanceOf[Library]
  
  inline def referencedResourceType(ref: ResourceTypeRef): ResourceType = ^.asInstanceOf[js.Dynamic].applyDynamic("referencedResourceType")(ref.asInstanceOf[js.Any]).asInstanceOf[ResourceType]
  
  inline def referencedTrait(ref: TraitRef): Trait = ^.asInstanceOf[js.Dynamic].applyDynamic("referencedTrait")(ref.asInstanceOf[js.Any]).asInstanceOf[Trait]
  
  inline def relativeUriSegments(res: Resource): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeUriSegments")(res.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def resolveType(p: TypeDeclaration): ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveType")(p.asInstanceOf[js.Any]).asInstanceOf[ITypeDefinition]
  
  inline def resourceTypesPrimary(a: LibraryBase): js.Array[ResourceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceTypesPrimary")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResourceType]]
  
  inline def runtimeType(p: TypeDeclaration): ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("runtimeType")(p.asInstanceOf[js.Any]).asInstanceOf[ITypeDefinition]
  
  inline def schemaValue(typeDeclaration: TypeDeclaration): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaValue")(typeDeclaration.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def securedByPrimary(resourceOrMethod: Method): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("securedByPrimary")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  inline def securedByPrimary(resourceOrMethod: ResourceBase): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("securedByPrimary")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  
  inline def securityScheme(schemeReference: SecuritySchemeRef): AbstractSecurityScheme = ^.asInstanceOf[js.Dynamic].applyDynamic("securityScheme")(schemeReference.asInstanceOf[js.Any]).asInstanceOf[AbstractSecurityScheme]
  
  inline def securitySchemeName(schemeReference: SecuritySchemeRef): String = ^.asInstanceOf[js.Dynamic].applyDynamic("securitySchemeName")(schemeReference.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def structuredValue(reference: Reference): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("structuredValue")(reference.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def traitsPrimary(a: LibraryBase): js.Array[Trait] = ^.asInstanceOf[js.Dynamic].applyDynamic("traitsPrimary")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Trait]]
  
  inline def typeFixedFacets(td: TypeDeclaration): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("typeFixedFacets")(td.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def typeStructuredValue(typeDeclaration: TypeDeclaration): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("typeStructuredValue")(typeDeclaration.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def typeValue(typeDeclaration: TypeDeclaration): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeValue")(typeDeclaration.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def uriParameters(resource: ResourceBase): js.Array[TypeDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriParameters")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeDeclaration]]
  
  inline def uriParametersPrimary(resource: ResourceBase): js.Array[TypeDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriParametersPrimary")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeDeclaration]]
  
  inline def validateInstance(res: TypeDeclaration, value: Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInstance")(res.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def validateInstanceWithDetailedStatuses(res: TypeDeclaration, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInstanceWithDetailedStatuses")(res.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
}
