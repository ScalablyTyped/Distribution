package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.anon.DescriptionFunc
import typings.reactNativeCommunityCliPluginMetro.anon.Func
import typings.reactNativeCommunityCliPluginMetro.anon.Options
import typings.reactNativeCommunityCliPluginMetro.anon.PickConfigrootreactNative
import typings.reactNativeCommunityCliPluginMetro.bundleCommandLineArgsMod.CommandLineArgs
import typings.reactNativeCommunityCliPluginMetro.loadMetroConfigMod.ConfigLoadingContext
import typings.reactNativeCommunityCliPluginMetro.loadMetroConfigMod.ConfigOptionsT
import typings.reactNativeCommunityCliPluginMetro.loadMetroConfigMod.MetroConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig, output: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("@react-native-community/cli-plugin-metro/build", "commands")
  @js.native
  val commands: js.Array[Func | Options | DescriptionFunc] = js.native
  
  inline def getDefaultConfig(ctx: PickConfigrootreactNative): MetroConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")(ctx.asInstanceOf[js.Any]).asInstanceOf[MetroConfig]
  
  inline def loadMetroConfig(ctx: ConfigLoadingContext): js.Promise[MetroConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMetroConfig")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MetroConfig]]
  inline def loadMetroConfig(ctx: ConfigLoadingContext, options: ConfigOptionsT): js.Promise[MetroConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMetroConfig")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MetroConfig]]
}
