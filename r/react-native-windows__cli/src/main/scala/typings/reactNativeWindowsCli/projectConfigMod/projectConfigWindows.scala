package typings.reactNativeWindowsCli.projectConfigMod

import typings.reactNativeWindowsCli.anon.PartialWindowsProjectConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/config/projectConfig", "projectConfigWindows")
@js.native
object projectConfigWindows extends js.Object {
  
  def apply(folder: String): WindowsProjectConfig | Null = js.native
  def apply(folder: String, userConfig: PartialWindowsProjectConf): WindowsProjectConfig | Null = js.native
}
