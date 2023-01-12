package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.anon.AllowOptionalDependencies
import typings.reactNativeCommunityCliPluginMetro.anon.CustomizeFrame
import typings.reactNativeCommunityCliPluginMetro.anon.EnhanceMiddleware
import typings.reactNativeCommunityCliPluginMetro.anon.GetModulesRunBeforeMainModule
import typings.reactNativeCommunityCliPluginMetro.anon.PickConfigrootreactNative
import typings.reactNativeCommunityCliPluginMetro.anon.Platforms
import typings.reactNativeCommunityCliTypes.anon.Dictname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildToolsLoadMetroConfigMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/tools/loadMetroConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ctx: ConfigLoadingContext): js.Promise[MetroConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MetroConfig]]
  inline def default(ctx: ConfigLoadingContext, options: ConfigOptionsT): js.Promise[MetroConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MetroConfig]]
  
  inline def getDefaultConfig(ctx: PickConfigrootreactNative): MetroConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")(ctx.asInstanceOf[js.Any]).asInstanceOf[MetroConfig]
  
  /* Inlined std.Pick<@react-native-community/cli-types.@react-native-community/cli-types.Config, 'root' | 'reactNativePath' | 'platforms'> */
  trait ConfigLoadingContext extends StObject {
    
    var platforms: Dictname
    
    var reactNativePath: String
    
    var root: String
  }
  object ConfigLoadingContext {
    
    inline def apply(platforms: Dictname, reactNativePath: String, root: String): ConfigLoadingContext = {
      val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigLoadingContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigLoadingContext] (val x: Self) extends AnyVal {
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setReactNativePath(value: String): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigOptionsT extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var maxWorkers: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var projectRoot: js.UndefOr[String] = js.undefined
    
    var reporter: js.UndefOr[Any] = js.undefined
    
    var resetCache: js.UndefOr[Boolean] = js.undefined
    
    var sourceExts: js.UndefOr[js.Array[String]] = js.undefined
    
    var watchFolders: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConfigOptionsT {
    
    inline def apply(): ConfigOptionsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptionsT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptionsT] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setReporter(value: Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
      
      inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
      
      inline def setSourceExtsUndefined: Self = StObject.set(x, "sourceExts", js.undefined)
      
      inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersUndefined: Self = StObject.set(x, "watchFolders", js.undefined)
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
  
  trait MetroConfig extends StObject {
    
    var reporter: js.UndefOr[Any] = js.undefined
    
    var resolver: Platforms
    
    var serializer: GetModulesRunBeforeMainModule
    
    var server: EnhanceMiddleware
    
    var symbolicator: CustomizeFrame
    
    var transformer: AllowOptionalDependencies
    
    var watchFolders: js.Array[String]
  }
  object MetroConfig {
    
    inline def apply(
      resolver: Platforms,
      serializer: GetModulesRunBeforeMainModule,
      server: EnhanceMiddleware,
      symbolicator: CustomizeFrame,
      transformer: AllowOptionalDependencies,
      watchFolders: js.Array[String]
    ): MetroConfig = {
      val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], symbolicator = symbolicator.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetroConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetroConfig] (val x: Self) extends AnyVal {
      
      inline def setReporter(value: Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setResolver(value: Platforms): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setSerializer(value: GetModulesRunBeforeMainModule): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setServer(value: EnhanceMiddleware): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setSymbolicator(value: CustomizeFrame): Self = StObject.set(x, "symbolicator", value.asInstanceOf[js.Any])
      
      inline def setTransformer(value: AllowOptionalDependencies): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
}
