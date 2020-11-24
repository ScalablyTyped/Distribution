package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.projectConfigMod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/vstools", JSImport.Namespace)
@js.native
object vstoolsMod extends js.Object {
  
  def addProjectToSolution(slnFile: String, project: Project): Boolean = js.native
  def addProjectToSolution(slnFile: String, project: Project, verbose: js.UndefOr[scala.Nothing], checkMode: Boolean): Boolean = js.native
  def addProjectToSolution(slnFile: String, project: Project, verbose: Boolean): Boolean = js.native
  def addProjectToSolution(slnFile: String, project: Project, verbose: Boolean, checkMode: Boolean): Boolean = js.native
}
