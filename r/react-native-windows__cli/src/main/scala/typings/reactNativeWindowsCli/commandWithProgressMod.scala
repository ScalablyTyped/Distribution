package typings.reactNativeWindowsCli

import typings.ora.mod.Ora
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandWithProgressMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "commandWithProgress")
  @js.native
  def commandWithProgress(spinner: Ora, taskDoingName: String, command: String, args: js.Array[String], verbose: Boolean): js.Promise[_] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "newError")
  @js.native
  def newError(text: String): Unit = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "newInfo")
  @js.native
  def newInfo(text: String): Unit = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "newSpinner")
  @js.native
  def newSpinner(text: String): Ora = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "newSuccess")
  @js.native
  def newSuccess(text: String): Unit = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "newWarn")
  @js.native
  def newWarn(text: String): Unit = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "runPowerShellScriptFunction")
  @js.native
  def runPowerShellScriptFunction(taskDescription: String, script: String, funcName: String, verbose: Boolean): js.Promise[Unit] = js.native
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", "runPowerShellScriptFunction")
  @js.native
  def runPowerShellScriptFunction(taskDescription: String, script: Null, funcName: String, verbose: Boolean): js.Promise[Unit] = js.native
}
