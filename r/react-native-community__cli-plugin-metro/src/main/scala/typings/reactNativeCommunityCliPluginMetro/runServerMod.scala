package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runServerMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/start/runServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(_argv: js.Array[String], ctx: Config, args: Args): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_argv.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Args extends StObject {
    
    var assetPlugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var customLogReporterPath: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var https: js.UndefOr[Boolean] = js.undefined
    
    var interactive: Boolean
    
    var key: js.UndefOr[String] = js.undefined
    
    var maxWorkers: js.UndefOr[Double] = js.undefined
    
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var projectRoot: js.UndefOr[String] = js.undefined
    
    var resetCache: js.UndefOr[Boolean] = js.undefined
    
    var sourceExts: js.UndefOr[js.Array[String]] = js.undefined
    
    var transformer: js.UndefOr[String] = js.undefined
    
    var watchFolders: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Args {
    
    inline def apply(interactive: Boolean): Args = {
      val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setAssetPlugins(value: js.Array[String]): Self = StObject.set(x, "assetPlugins", value.asInstanceOf[js.Any])
      
      inline def setAssetPluginsUndefined: Self = StObject.set(x, "assetPlugins", js.undefined)
      
      inline def setAssetPluginsVarargs(value: String*): Self = StObject.set(x, "assetPlugins", js.Array(value*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCustomLogReporterPath(value: String): Self = StObject.set(x, "customLogReporterPath", value.asInstanceOf[js.Any])
      
      inline def setCustomLogReporterPathUndefined: Self = StObject.set(x, "customLogReporterPath", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
      
      inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
      
      inline def setSourceExtsUndefined: Self = StObject.set(x, "sourceExts", js.undefined)
      
      inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
      
      inline def setTransformer(value: String): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersUndefined: Self = StObject.set(x, "watchFolders", js.undefined)
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
}
