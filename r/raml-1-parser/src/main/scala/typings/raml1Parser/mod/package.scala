package typings.raml1Parser.mod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Api
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.DocumentationItem
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Extension
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.FragmentDeclaration
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Library
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Overlay
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.ResourceType
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Trait
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.TypeDeclaration
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.LoadOptions
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.Options
import typings.raml1Parser.distTypingsNewFormatRamlMod.RAMLParseResult
import typings.raml1Parser.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def asFragment(node: Api): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: DocumentationItem): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: Extension): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: Library): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: Overlay): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: ResourceType): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: Trait): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]
inline def asFragment(node: TypeDeclaration): FragmentDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("asFragment")(node.asInstanceOf[js.Any]).asInstanceOf[FragmentDeclaration]

inline def getLanguageElementByRuntimeType(runtimeType: ITypeDefinition): BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageElementByRuntimeType")(runtimeType.asInstanceOf[js.Any]).asInstanceOf[BasicNode]

inline def isFragment(node: Api): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: DocumentationItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: Extension): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: Library): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: Overlay): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: ResourceType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: Trait): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFragment(node: TypeDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def load(ramlPathOrContent: String): js.Promise[RAMLParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(ramlPathOrContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RAMLParseResult]]
inline def load(ramlPathOrContent: String, options: LoadOptions): js.Promise[RAMLParseResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(ramlPathOrContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RAMLParseResult]]

inline def loadApi(apiPath: String): js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]]
inline def loadApi(apiPath: String, extensionsAndOverlays: js.Array[String]): js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]]
inline def loadApi(apiPath: String, extensionsAndOverlays: js.Array[String], options: Options): js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]]
inline def loadApi(apiPath: String, options: Options): js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]]

inline def loadApiSync(apiPath: String): Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api = ^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any]).asInstanceOf[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]
inline def loadApiSync(apiPath: String, extensionsAndOverlays: js.Array[String]): Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]
inline def loadApiSync(apiPath: String, extensionsAndOverlays: js.Array[String], options: Options): Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]
inline def loadApiSync(apiPath: String, options: Options): Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api | typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api]

inline def loadRAML(ramlPath: String, extensionsAndOverlays: js.Array[String]): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, extensionsAndOverlays: js.Array[String], options: Options): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]]

inline def loadRAMLSync(ramlPath: String, extensionsAndOverlays: js.Array[String]): typings.raml1Parser.distParserHighLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, extensionsAndOverlays: js.Array[String], options: Options): typings.raml1Parser.distParserHighLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]

inline def loadSync(ramlPathOrContent: String): RAMLParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(ramlPathOrContent.asInstanceOf[js.Any]).asInstanceOf[RAMLParseResult]
inline def loadSync(ramlPathOrContent: String, options: LoadOptions): RAMLParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(ramlPathOrContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RAMLParseResult]

inline def parse(ramlPathOrContent: String): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(ramlPathOrContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]]
inline def parse(ramlPathOrContent: String, options: LoadOptions): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(ramlPathOrContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]]

inline def parseRAML(content: String): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRAML")(content.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]]
inline def parseRAML(content: String, arg2: Options): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRAML")(content.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]]

inline def parseRAMLSync(content: String): typings.raml1Parser.distParserHighLevelASTMod.BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRAMLSync")(content.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]
inline def parseRAMLSync(content: String, arg2: Options): typings.raml1Parser.distParserHighLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRAMLSync")(content.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]

inline def parseSync(ramlPathOrContent: String): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(ramlPathOrContent.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]
inline def parseSync(ramlPathOrContent: String, options: LoadOptions): typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(ramlPathOrContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode]

type IHighLevelNode = typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode

type IParseResult = typings.raml1Parser.distParserHighLevelASTMod.IParseResult

type IProperty = typings.raml1Parser.distParserHighLevelASTMod.IProperty
