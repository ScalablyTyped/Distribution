package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.Config
import typings.reactNativeWindowsCli.msbuildtoolsMod.default
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import typings.reactNativeWindowsCli.runWindowsOptionsMod.RunWindowsOptions_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deployMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/deploy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deployToDesktop(options: RunWindowsOptions_, verbose: Boolean, config: Config, buildTools: default): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deployToDesktop")(options.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], config.asInstanceOf[js.Any], buildTools.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def deployToDevice(options: RunWindowsOptions_, verbose: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deployToDevice")(options.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getBuildConfiguration(options: RunWindowsOptions_): BuildConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[BuildConfig]
  
  @scala.inline
  def startServerInNewWindow(options: RunWindowsOptions_, verbose: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startServerInNewWindow")(options.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
