package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.Command
import typings.reactNativeWindowsCli.reactNativeWindowsCliBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runWindowsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/runWindows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnonymizedProjectName(projectRoot: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnonymizedProjectName")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/runWindows", "runWindowsCommand")
  @js.native
  val runWindowsCommand: Command[`false`] = js.native
}
