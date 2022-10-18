package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.buildCommandsBundleBundleCommandLineArgsMod.CommandLineArgs
import typings.reactNativeCommunityCliPluginMetro.buildToolsLoadMetroConfigMod.MetroConfig
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBundleBuildBundleMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/buildBundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: CommandLineArgs, ctx: Config): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  inline def default(args: CommandLineArgs, ctx: Config, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  inline def buildBundleWithConfig(args: CommandLineArgs, config: MetroConfig, output: Any): js.Promise[js.UndefOr[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildBundleWithConfig")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Unit]]]
  
  trait AssetData extends StObject {
    
    var __packager_asset: Boolean
    
    var fileSystemLocation: String
    
    var files: js.Array[String]
    
    var hash: String
    
    var height: Double | Null
    
    var httpServerLocation: String
    
    var name: String
    
    var scales: js.Array[Double]
    
    var `type`: String
    
    var width: Double | Null
  }
  object AssetData {
    
    inline def apply(
      __packager_asset: Boolean,
      fileSystemLocation: String,
      files: js.Array[String],
      hash: String,
      httpServerLocation: String,
      name: String,
      scales: js.Array[Double],
      `type`: String
    ): AssetData = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], height = null, width = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetData]
    }
    
    extension [Self <: AssetData](x: Self) {
      
      inline def setFileSystemLocation(value: String): Self = StObject.set(x, "fileSystemLocation", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def set__packager_asset(value: Boolean): Self = StObject.set(x, "__packager_asset", value.asInstanceOf[js.Any])
    }
  }
}
