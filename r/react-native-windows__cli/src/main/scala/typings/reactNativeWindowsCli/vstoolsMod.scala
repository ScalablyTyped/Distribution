package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.projectConfigMod.Project
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vstoolsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/vstools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addProjectToSolution(slnFile: String, project: Project): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addProjectToSolution")(slnFile.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addProjectToSolution(slnFile: String, project: Project, verbose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addProjectToSolution")(slnFile.asInstanceOf[js.Any], project.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addProjectToSolution(slnFile: String, project: Project, verbose: Boolean, checkMode: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addProjectToSolution")(slnFile.asInstanceOf[js.Any], project.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkMode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def addProjectToSolution(slnFile: String, project: Project, verbose: Unit, checkMode: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addProjectToSolution")(slnFile.asInstanceOf[js.Any], project.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkMode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
