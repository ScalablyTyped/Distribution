package typings.storybookReactDomShim.distPresetMod

import typings.storybookReactDomShim.anon.ArgTypeTargetsV7
import typings.storybookReactDomShim.storybookReactDomShimStrings.DEVELOPMENT
import typings.storybookReactDomShim.storybookReactDomShimStrings.PRODUCTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.storybookReactDomShim.distPresetMod.BuilderOptions because var conflicts: configDir, ignorePreview. Inlined configType, cache, docsMode, features, versionCheck, releaseNotesData, disableWebpackDefaults, serverChannelUrl
- typings.storybookReactDomShim.distPresetMod.CLIOptions because var conflicts: configDir, ignorePreview, outputDir. Inlined port, previewUrl, forceBuildPreview, disableTelemetry, enableCrashReports, host, staticDir, https, sslCa, sslCert, sslKey, smokeTest, managerCache, open, ci, loglevel, quiet, versionUpdates, releaseNotes, docs, debugWebpack, webpackStatsJson */ trait Options
  extends StObject
     with LoadOptions
     with StorybookConfigOptions {
  
  var cache: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemCache */ Any
  ] = js.undefined
  
  var ci: js.UndefOr[Boolean] = js.undefined
  
  var configType: js.UndefOr[DEVELOPMENT | PRODUCTION] = js.undefined
  
  var debugWebpack: js.UndefOr[Boolean] = js.undefined
  
  var disableTelemetry: js.UndefOr[Boolean] = js.undefined
  
  var disableWebpackDefaults: js.UndefOr[Boolean] = js.undefined
  
  var docs: js.UndefOr[Boolean] = js.undefined
  
  var docsMode: js.UndefOr[Boolean] = js.undefined
  
  var enableCrashReports: js.UndefOr[Boolean] = js.undefined
  
  var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
  
  var forceBuildPreview: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var loglevel: js.UndefOr[String] = js.undefined
  
  var managerCache: js.UndefOr[Boolean] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var previewUrl: js.UndefOr[String] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var releaseNotes: js.UndefOr[Boolean] = js.undefined
  
  var releaseNotesData: js.UndefOr[ReleaseNotesData] = js.undefined
  
  var serverChannelUrl: js.UndefOr[String] = js.undefined
  
  var smokeTest: js.UndefOr[Boolean] = js.undefined
  
  var sslCa: js.UndefOr[js.Array[String]] = js.undefined
  
  var sslCert: js.UndefOr[String] = js.undefined
  
  var sslKey: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use 'staticDirs' Storybook Configuration option instead
    */
  var staticDir: js.UndefOr[js.Array[String]] = js.undefined
  
  var versionCheck: js.UndefOr[VersionCheck] = js.undefined
  
  var versionUpdates: js.UndefOr[Boolean] = js.undefined
  
  var webpackStatsJson: js.UndefOr[String | Boolean] = js.undefined
}
object Options {
  
  inline def apply(packageJson: PackageJson, presets: Presets): Options = {
    val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setCache(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemCache */ Any
    ): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    inline def setConfigType(value: DEVELOPMENT | PRODUCTION): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    inline def setDebugWebpack(value: Boolean): Self = StObject.set(x, "debugWebpack", value.asInstanceOf[js.Any])
    
    inline def setDebugWebpackUndefined: Self = StObject.set(x, "debugWebpack", js.undefined)
    
    inline def setDisableTelemetry(value: Boolean): Self = StObject.set(x, "disableTelemetry", value.asInstanceOf[js.Any])
    
    inline def setDisableTelemetryUndefined: Self = StObject.set(x, "disableTelemetry", js.undefined)
    
    inline def setDisableWebpackDefaults(value: Boolean): Self = StObject.set(x, "disableWebpackDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableWebpackDefaultsUndefined: Self = StObject.set(x, "disableWebpackDefaults", js.undefined)
    
    inline def setDocs(value: Boolean): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    
    inline def setDocsModeUndefined: Self = StObject.set(x, "docsMode", js.undefined)
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setEnableCrashReports(value: Boolean): Self = StObject.set(x, "enableCrashReports", value.asInstanceOf[js.Any])
    
    inline def setEnableCrashReportsUndefined: Self = StObject.set(x, "enableCrashReports", js.undefined)
    
    inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setForceBuildPreview(value: Boolean): Self = StObject.set(x, "forceBuildPreview", value.asInstanceOf[js.Any])
    
    inline def setForceBuildPreviewUndefined: Self = StObject.set(x, "forceBuildPreview", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setLoglevel(value: String): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    inline def setManagerCache(value: Boolean): Self = StObject.set(x, "managerCache", value.asInstanceOf[js.Any])
    
    inline def setManagerCacheUndefined: Self = StObject.set(x, "managerCache", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setReleaseNotes(value: Boolean): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesData(value: ReleaseNotesData): Self = StObject.set(x, "releaseNotesData", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesDataUndefined: Self = StObject.set(x, "releaseNotesData", js.undefined)
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
    inline def setServerChannelUrl(value: String): Self = StObject.set(x, "serverChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setServerChannelUrlUndefined: Self = StObject.set(x, "serverChannelUrl", js.undefined)
    
    inline def setSmokeTest(value: Boolean): Self = StObject.set(x, "smokeTest", value.asInstanceOf[js.Any])
    
    inline def setSmokeTestUndefined: Self = StObject.set(x, "smokeTest", js.undefined)
    
    inline def setSslCa(value: js.Array[String]): Self = StObject.set(x, "sslCa", value.asInstanceOf[js.Any])
    
    inline def setSslCaUndefined: Self = StObject.set(x, "sslCa", js.undefined)
    
    inline def setSslCaVarargs(value: String*): Self = StObject.set(x, "sslCa", js.Array(value*))
    
    inline def setSslCert(value: String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
    
    inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
    
    inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
    
    inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
    
    inline def setStaticDir(value: js.Array[String]): Self = StObject.set(x, "staticDir", value.asInstanceOf[js.Any])
    
    inline def setStaticDirUndefined: Self = StObject.set(x, "staticDir", js.undefined)
    
    inline def setStaticDirVarargs(value: String*): Self = StObject.set(x, "staticDir", js.Array(value*))
    
    inline def setVersionCheck(value: VersionCheck): Self = StObject.set(x, "versionCheck", value.asInstanceOf[js.Any])
    
    inline def setVersionCheckUndefined: Self = StObject.set(x, "versionCheck", js.undefined)
    
    inline def setVersionUpdates(value: Boolean): Self = StObject.set(x, "versionUpdates", value.asInstanceOf[js.Any])
    
    inline def setVersionUpdatesUndefined: Self = StObject.set(x, "versionUpdates", js.undefined)
    
    inline def setWebpackStatsJson(value: String | Boolean): Self = StObject.set(x, "webpackStatsJson", value.asInstanceOf[js.Any])
    
    inline def setWebpackStatsJsonUndefined: Self = StObject.set(x, "webpackStatsJson", js.undefined)
  }
}
