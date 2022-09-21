package typings.raml1Parser.raml08parserMod

import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import typings.raml1Parser.parserCoreApiMod.Options
import typings.raml1Parser.parserCoreMod.BasicNode
import typings.raml1Parser.raml08parserMod.^
import typings.raml1Parser.raml08parserapiMod.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getLanguageElementByRuntimeType(runtimeType: ITypeDefinition): BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageElementByRuntimeType")(runtimeType.asInstanceOf[js.Any]).asInstanceOf[BasicNode]

inline def loadApi(apiPath: String): js.Promise[Api] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Api]]
inline def loadApi(apiPath: String, options: Options): js.Promise[Api] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApi")(apiPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Api]]

inline def loadApiSync(apiPath: String): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any]).asInstanceOf[Api]
inline def loadApiSync(apiPath: String, options: Options): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("loadApiSync")(apiPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api]

inline def loadRAML(ramlPath: String): js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, arg1: js.Array[String]): js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, arg1: js.Array[String], arg2: Options): js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, arg1: Unit, arg2: Options): js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, arg1: Options): js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode]]
inline def loadRAML(ramlPath: String, arg1: Options, arg2: Options): js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAML")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.raml1Parser.highLevelASTMod.BasicNode]]

inline def loadRAMLSync(ramlPath: String): typings.raml1Parser.highLevelASTMod.BasicNode = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any]).asInstanceOf[typings.raml1Parser.highLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, arg1: js.Array[String]): typings.raml1Parser.highLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, arg1: js.Array[String], arg2: Options): typings.raml1Parser.highLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, arg1: Unit, arg2: Options): typings.raml1Parser.highLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, arg1: Options): typings.raml1Parser.highLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.BasicNode]
inline def loadRAMLSync(ramlPath: String, arg1: Options, arg2: Options): typings.raml1Parser.highLevelASTMod.BasicNode = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRAMLSync")(ramlPath.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.raml1Parser.highLevelASTMod.BasicNode]
