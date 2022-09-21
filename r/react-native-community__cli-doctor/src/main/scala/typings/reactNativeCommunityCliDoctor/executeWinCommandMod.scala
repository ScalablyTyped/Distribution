package typings.reactNativeCommunityCliDoctor

import typings.execa.mod.ExecaChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executeWinCommandMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/windows/executeWinCommand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Executes the given `command` on a shell taking care of slicing the parameters
    * if needed.
    */
  inline def executeCommand(command: String): ExecaChildProcess[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeCommand")(command.asInstanceOf[js.Any]).asInstanceOf[ExecaChildProcess[String]]
  inline def executeCommand(command: String, elevated: Boolean): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeCommand")(command.asInstanceOf[js.Any], elevated.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
}
