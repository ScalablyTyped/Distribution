package typings.reactNativeWindowsCli

import typings.ora.mod.Ora
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", JSImport.Namespace)
@js.native
object commandWithProgressMod extends js.Object {
  
  def commandWithProgress(spinner: Ora, taskDoingName: String, command: String, args: js.Array[String], verbose: Boolean): js.Promise[_] = js.native
  
  def newError(text: String): Unit = js.native
  
  def newInfo(text: String): Unit = js.native
  
  def newSpinner(text: String): Ora = js.native
  
  def newSuccess(text: String): Unit = js.native
  
  def newWarn(text: String): Unit = js.native
  
  def runPowerShellScriptFunction(taskDescription: String, script: String, funcName: String, verbose: Boolean): js.Promise[Unit] = js.native
  def runPowerShellScriptFunction(taskDescription: String, script: Null, funcName: String, verbose: Boolean): js.Promise[Unit] = js.native
}
