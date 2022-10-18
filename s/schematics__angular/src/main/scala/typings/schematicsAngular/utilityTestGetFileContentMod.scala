package typings.schematicsAngular

import typings.angularDevkitSchematics.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityTestGetFileContentMod {
  
  @JSImport("@schematics/angular/utility/test/get-file-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileContent(tree: Tree, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileContent")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
}
