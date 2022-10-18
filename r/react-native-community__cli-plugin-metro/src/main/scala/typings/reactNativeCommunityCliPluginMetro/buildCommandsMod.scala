package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.anon.DescriptionFunc
import typings.reactNativeCommunityCliPluginMetro.anon.Func
import typings.reactNativeCommunityCliPluginMetro.anon.Options
import typings.reactNativeCommunityCliPluginMetro.buildCommandsBundleBundleCommandLineArgsMod.CommandLineArgs
import typings.reactNativeCommunityCliPluginMetro.buildToolsLoadMetroConfigMod.MetroConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands", JSImport.Default)
  @js.native
  val default: js.Array[Func | Options | DescriptionFunc] = js.native
  
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
}
