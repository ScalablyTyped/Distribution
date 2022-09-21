package typings.schematicsAngular

import typings.angularDevkitSchematics.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  @JSImport("@schematics/angular/utility/test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAppModule(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UnitTestTree */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppModule")(tree.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createAppModule(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UnitTestTree */ Any,
    path: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppModule")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFileContent(tree: Tree, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileContent")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
}
