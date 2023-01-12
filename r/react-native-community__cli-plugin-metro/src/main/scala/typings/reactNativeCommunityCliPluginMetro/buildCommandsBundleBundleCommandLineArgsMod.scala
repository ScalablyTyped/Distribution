package typings.reactNativeCommunityCliPluginMetro

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeCommunityCliPluginMetro.anon.Default
import typings.reactNativeCommunityCliPluginMetro.anon.DefaultDescription
import typings.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionName
import typings.reactNativeCommunityCliPluginMetro.anon.Description
import typings.reactNativeCommunityCliPluginMetro.anon.DescriptionName
import typings.reactNativeCommunityCliPluginMetro.anon.NameParse
import typings.reactNativeCommunityCliPluginMetro.anon.Parse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBundleBundleCommandLineArgsMod extends Shortcut {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/bundleCommandLineArgs", JSImport.Default)
  @js.native
  val default: js.Array[
    Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
  ] = js.native
  
  trait CommandLineArgs extends StObject {
    
    var assetCatalogDest: js.UndefOr[String] = js.undefined
    
    var assetsDest: js.UndefOr[String] = js.undefined
    
    var bundleEncoding: js.UndefOr[String] = js.undefined
    
    var bundleOutput: String
    
    var config: js.UndefOr[String] = js.undefined
    
    var dev: Boolean
    
    var entryFile: String
    
    var generateStaticViewConfigs: Boolean
    
    var maxWorkers: js.UndefOr[Double] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var platform: String
    
    var resetCache: Boolean
    
    var resetGlobalCache: Boolean
    
    var sourcemapOutput: js.UndefOr[String] = js.undefined
    
    var sourcemapSourcesRoot: js.UndefOr[String] = js.undefined
    
    var sourcemapUseAbsolutePath: Boolean
    
    var transformer: js.UndefOr[String] = js.undefined
    
    var unstableTransformProfile: js.UndefOr[String] = js.undefined
    
    var verbose: Boolean
  }
  object CommandLineArgs {
    
    inline def apply(
      bundleOutput: String,
      dev: Boolean,
      entryFile: String,
      generateStaticViewConfigs: Boolean,
      platform: String,
      resetCache: Boolean,
      resetGlobalCache: Boolean,
      sourcemapUseAbsolutePath: Boolean,
      verbose: Boolean
    ): CommandLineArgs = {
      val __obj = js.Dynamic.literal(bundleOutput = bundleOutput.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], generateStaticViewConfigs = generateStaticViewConfigs.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], resetGlobalCache = resetGlobalCache.asInstanceOf[js.Any], sourcemapUseAbsolutePath = sourcemapUseAbsolutePath.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandLineArgs] (val x: Self) extends AnyVal {
      
      inline def setAssetCatalogDest(value: String): Self = StObject.set(x, "assetCatalogDest", value.asInstanceOf[js.Any])
      
      inline def setAssetCatalogDestUndefined: Self = StObject.set(x, "assetCatalogDest", js.undefined)
      
      inline def setAssetsDest(value: String): Self = StObject.set(x, "assetsDest", value.asInstanceOf[js.Any])
      
      inline def setAssetsDestUndefined: Self = StObject.set(x, "assetsDest", js.undefined)
      
      inline def setBundleEncoding(value: String): Self = StObject.set(x, "bundleEncoding", value.asInstanceOf[js.Any])
      
      inline def setBundleEncodingUndefined: Self = StObject.set(x, "bundleEncoding", js.undefined)
      
      inline def setBundleOutput(value: String): Self = StObject.set(x, "bundleOutput", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setGenerateStaticViewConfigs(value: Boolean): Self = StObject.set(x, "generateStaticViewConfigs", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetGlobalCache(value: Boolean): Self = StObject.set(x, "resetGlobalCache", value.asInstanceOf[js.Any])
      
      inline def setSourcemapOutput(value: String): Self = StObject.set(x, "sourcemapOutput", value.asInstanceOf[js.Any])
      
      inline def setSourcemapOutputUndefined: Self = StObject.set(x, "sourcemapOutput", js.undefined)
      
      inline def setSourcemapSourcesRoot(value: String): Self = StObject.set(x, "sourcemapSourcesRoot", value.asInstanceOf[js.Any])
      
      inline def setSourcemapSourcesRootUndefined: Self = StObject.set(x, "sourcemapSourcesRoot", js.undefined)
      
      inline def setSourcemapUseAbsolutePath(value: Boolean): Self = StObject.set(x, "sourcemapUseAbsolutePath", value.asInstanceOf[js.Any])
      
      inline def setTransformer(value: String): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      inline def setUnstableTransformProfile(value: String): Self = StObject.set(x, "unstableTransformProfile", value.asInstanceOf[js.Any])
      
      inline def setUnstableTransformProfileUndefined: Self = StObject.set(x, "unstableTransformProfile", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Array[
    Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
  ]
  
  /* This means you don't have to write `default`, but can instead just say `buildCommandsBundleBundleCommandLineArgsMod.foo` */
  override def _to: js.Array[
    Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
  ] = default
}
