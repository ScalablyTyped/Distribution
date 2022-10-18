package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserMod.^
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Api
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.Options
import typings.raml1Parser.distParserWrappedAstParserCoreMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getLanguageElementByRuntimeType(runtimeType: ITypeDefinition): BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageElementByRuntimeType")(runtimeType.asInstanceOf[js.Any]).asInstanceOf[BasicNode]

inline def loadApi(apiPath: String): js.Promise[Api] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Api]]
inline def loadApi(apiPath: String, extensionsAndOverlays: js.Array[String]): js.Promise[Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api]]
inline def loadApi(apiPath: String, extensionsAndOverlays: js.Array[String], options: Options): js.Promise[Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api]]
inline def loadApi(apiPath: String, options: Options): js.Promise[Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api]]

inline def loadApiSync(apiPath: String): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any]).asInstanceOf[Api]
inline def loadApiSync(apiPath: String, extensionsAndOverlays: js.Array[String]): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[Api]
inline def loadApiSync(apiPath: String, extensionsAndOverlays: js.Array[String], options: Options): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api]
inline def loadApiSync(apiPath: String, options: Options): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api]

inline def loadRAML(ramlPath: String, extensionsAndOverlays: js.Array[String]): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, extensionsAndOverlays: js.Array[String], options: Options): js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]]

inline def loadRAMLSync(ramlPath: String, extensionsAndOverlays: js.Array[String]): typings.raml1Parser.distParserHighLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, extensionsAndOverlays: js.Array[String], options: Options): typings.raml1Parser.distParserHighLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.distParserHighLevelASTMod.BasicNode]
