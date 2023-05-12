package typings.schematicsAngular

import typings.angularDevkitSchematics.mod.Tree
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CallExpression
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Expression
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateComponentsMod {
  
  @JSImport("@schematics/angular/private/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFunctionalProvidersToStandaloneBootstrap(tree: Tree, filePath: String, functionName: String, importPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addFunctionalProvidersToStandaloneBootstrap")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addFunctionalProvidersToStandaloneBootstrap(tree: Tree, filePath: String, functionName: String, importPath: String, args: js.Array[Expression]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addFunctionalProvidersToStandaloneBootstrap")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def addModuleImportToStandaloneBootstrap(tree: Tree, filePath: String, moduleName: String, modulePath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addModuleImportToStandaloneBootstrap")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callsProvidersFunction(tree: Tree, filePath: String, functionName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("callsProvidersFunction")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findBootstrapApplicationCall(sourceFile: SourceFile): CallExpression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findBootstrapApplicationCall")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[CallExpression | Null]
  
  inline def importsProvidersFrom(tree: Tree, filePath: String, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("importsProvidersFrom")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
