package typings.schematicsAngular

import typings.angularDevkitSchematics.mod.Tree
import typings.schematicsAngular.typescriptMod.CallExpression
import typings.schematicsAngular.typescriptMod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standaloneMod {
  
  @JSImport("@schematics/angular/private/standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addModuleImportToStandaloneBootstrap(tree: Tree, filePath: String, moduleName: String, modulePath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addModuleImportToStandaloneBootstrap")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], modulePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findBootstrapApplicationCall(sourceFile: SourceFile): CallExpression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findBootstrapApplicationCall")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[CallExpression | Null]
  
  inline def importsProvidersFrom(tree: Tree, filePath: String, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("importsProvidersFrom")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
