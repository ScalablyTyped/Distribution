package typings.reactNativeWindowsCli

import typings.ora.mod.Ora
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandWithProgressMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/commandWithProgress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def commandWithProgress(spinner: Ora, taskDoingName: String, command: String, args: js.Array[String], verbose: Boolean): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("commandWithProgress")(spinner.asInstanceOf[js.Any], taskDoingName.asInstanceOf[js.Any], command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def newError(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newError")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def newInfo(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newInfo")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def newSpinner(text: String): Ora = ^.asInstanceOf[js.Dynamic].applyDynamic("newSpinner")(text.asInstanceOf[js.Any]).asInstanceOf[Ora]
  
  @scala.inline
  def newSuccess(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newSuccess")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def newWarn(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("newWarn")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def runPowerShellScriptFunction(taskDescription: String, script: String, funcName: String, verbose: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runPowerShellScriptFunction")(taskDescription.asInstanceOf[js.Any], script.asInstanceOf[js.Any], funcName.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def runPowerShellScriptFunction(taskDescription: String, script: Null, funcName: String, verbose: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runPowerShellScriptFunction")(taskDescription.asInstanceOf[js.Any], script.asInstanceOf[js.Any], funcName.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
