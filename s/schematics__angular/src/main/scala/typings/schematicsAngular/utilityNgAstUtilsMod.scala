package typings.schematicsAngular

import typings.angularDevkitSchematics.mod.Tree
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityNgAstUtilsMod {
  
  @JSImport("@schematics/angular/utility/ng-ast-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findBootstrapModuleCall(host: Tree, mainPath: String): CallExpression | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findBootstrapModuleCall")(host.asInstanceOf[js.Any], mainPath.asInstanceOf[js.Any])).asInstanceOf[CallExpression | Null]
  
  inline def getAppModulePath(host: Tree, mainPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppModulePath")(host.asInstanceOf[js.Any], mainPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isStandaloneApp(host: Tree, mainPath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStandaloneApp")(host.asInstanceOf[js.Any], mainPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
