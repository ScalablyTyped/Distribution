package typings.raml1Parser

import typings.raml1Parser.parserCoreMod.BasicNode
import typings.raml1Parser.raml08parserapiMod.AbstractSecurityScheme
import typings.raml1Parser.raml08parserapiMod.Api
import typings.raml1Parser.raml08parserapiMod.BodyLike
import typings.raml1Parser.raml08parserapiMod.Method
import typings.raml1Parser.raml08parserapiMod.Parameter
import typings.raml1Parser.raml08parserapiMod.Reference
import typings.raml1Parser.raml08parserapiMod.Resource
import typings.raml1Parser.raml08parserapiMod.ResourceType
import typings.raml1Parser.raml08parserapiMod.ResourceTypeRef
import typings.raml1Parser.raml08parserapiMod.Response
import typings.raml1Parser.raml08parserapiMod.SecuritySchemeRef
import typings.raml1Parser.raml08parserapiMod.Trait
import typings.raml1Parser.raml08parserapiMod.TraitRef
import typings.raml1Parser.raml08parserapiMod.TypeInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperHelper08Mod {
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/wrapperHelper08", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RAMLVersion(api: Api): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RAMLVersion")(api.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def absoluteUri(res: Resource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def absoluteUriParameters(res: Resource): js.Array[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUriParameters")(res.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parameter]]
  
  inline def allProtocols(api: Api): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allProtocols")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def allResourceTypes(a: Api): js.Array[ResourceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allResourceTypes")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResourceType]]
  
  inline def allResources(api: Api): js.Array[Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("allResources")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[Resource]]
  
  inline def allSecuredBy(resourceOrMethod: Method): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSecuredBy")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  inline def allSecuredBy(resourceOrMethod: Resource): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSecuredBy")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  
  inline def allTraits(a: Api): js.Array[Trait] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTraits")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Trait]]
  
  inline def baseUriParameters(api: Api): js.Array[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUriParameters")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parameter]]
  
  inline def baseUriParametersPrimary(api: Api): js.Array[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUriParametersPrimary")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parameter]]
  
  inline def childMethod(resource: Resource, method: String): js.Array[Method] = (^.asInstanceOf[js.Dynamic].applyDynamic("childMethod")(resource.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[Method]]
  
  inline def childResource(container: Api, relPath: String): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("childResource")(container.asInstanceOf[js.Any], relPath.asInstanceOf[js.Any])).asInstanceOf[Resource]
  inline def childResource(container: Resource, relPath: String): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("childResource")(container.asInstanceOf[js.Any], relPath.asInstanceOf[js.Any])).asInstanceOf[Resource]
  
  inline def completeRelativeUri(res: Resource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("completeRelativeUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def expandTraitsAndResourceTypes(api: Api): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypes")(api.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  inline def getMethod(container: Api, path: js.Array[String], method: String): js.Array[Method] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[Method]]
  inline def getMethod(container: Resource, path: js.Array[String], method: String): js.Array[Method] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Array[Method]]
  
  inline def getResource(container: Api, path: js.Array[String]): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Resource]
  inline def getResource(container: Resource, path: js.Array[String]): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(container.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Resource]
  
  inline def getTemplateParametrizedProperties(node: BodyLike): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: Method): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: Parameter): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: ResourceType): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: Response): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  inline def getTemplateParametrizedProperties(node: Trait): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateParametrizedProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def isOkRange(response: Response): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOkRange")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def load(pth: String): BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pth.asInstanceOf[js.Any]).asInstanceOf[BasicNode]
  
  inline def methodId(method: Method): String = ^.asInstanceOf[js.Dynamic].applyDynamic("methodId")(method.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ownerApi(method: Method): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerApi")(method.asInstanceOf[js.Any]).asInstanceOf[Api]
  inline def ownerApi(method: Resource): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerApi")(method.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  inline def parent(resource: Resource): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")(resource.asInstanceOf[js.Any]).asInstanceOf[Resource]
  
  inline def parentResource(method: Method): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("parentResource")(method.asInstanceOf[js.Any]).asInstanceOf[Resource]
  
  inline def protocolsPrimary(api: Api): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("protocolsPrimary")(api.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def qName(c: BasicNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("qName")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def referenceName(reference: Reference): String = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceName")(reference.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def referencedResourceType(ref: ResourceTypeRef): ResourceType = ^.asInstanceOf[js.Dynamic].applyDynamic("referencedResourceType")(ref.asInstanceOf[js.Any]).asInstanceOf[ResourceType]
  
  inline def referencedTrait(ref: TraitRef): Trait = ^.asInstanceOf[js.Dynamic].applyDynamic("referencedTrait")(ref.asInstanceOf[js.Any]).asInstanceOf[Trait]
  
  inline def relativeUriSegments(res: Resource): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeUriSegments")(res.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def resourceTypesPrimary(a: Api): js.Array[ResourceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceTypesPrimary")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResourceType]]
  
  inline def schemaContent(bodyDeclaration: BodyLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaContent")(bodyDeclaration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def securedByPrimary(resourceOrMethod: Method): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("securedByPrimary")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  inline def securedByPrimary(resourceOrMethod: Resource): js.Array[SecuritySchemeRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("securedByPrimary")(resourceOrMethod.asInstanceOf[js.Any]).asInstanceOf[js.Array[SecuritySchemeRef]]
  
  inline def securityScheme(schemeReference: SecuritySchemeRef): AbstractSecurityScheme = ^.asInstanceOf[js.Dynamic].applyDynamic("securityScheme")(schemeReference.asInstanceOf[js.Any]).asInstanceOf[AbstractSecurityScheme]
  
  inline def securitySchemeName(schemeReference: SecuritySchemeRef): String = ^.asInstanceOf[js.Dynamic].applyDynamic("securitySchemeName")(schemeReference.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def structuredValue(reference: Reference): TypeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("structuredValue")(reference.asInstanceOf[js.Any]).asInstanceOf[TypeInstance]
  
  inline def traitsPrimary(a: Api): js.Array[Trait] = ^.asInstanceOf[js.Dynamic].applyDynamic("traitsPrimary")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Trait]]
  
  inline def uriParameters(resource: Resource): js.Array[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriParameters")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parameter]]
  
  inline def uriParametersPrimary(resource: Resource): js.Array[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriParametersPrimary")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parameter]]
}
