package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.Config
import typings.reactNativeWindowsCli.msbuildtoolsMod.default
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import typings.reactNativeWindowsCli.runWindowsOptionsMod.RunWindowsOptions_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/deploy", JSImport.Namespace)
@js.native
object deployMod extends js.Object {
  
  def deployToDesktop(options: RunWindowsOptions_, verbose: Boolean, config: Config, buildTools: default): js.Promise[Unit] = js.native
  
  def deployToDevice(options: RunWindowsOptions_, verbose: Boolean): js.Promise[Unit] = js.native
  
  def getBuildConfiguration(options: RunWindowsOptions_): BuildConfig = js.native
  
  def startServerInNewWindow(options: RunWindowsOptions_, verbose: Boolean): js.Promise[Unit] = js.native
}
