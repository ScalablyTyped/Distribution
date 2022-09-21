package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsMod {
  
  @JSImport("@schematics/angular/utility/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def relativePathToWorkspaceRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relativePathToWorkspaceRoot")().asInstanceOf[String]
  inline def relativePathToWorkspaceRoot(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relativePathToWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
}
