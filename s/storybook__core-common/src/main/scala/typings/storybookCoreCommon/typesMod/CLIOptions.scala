package typings.storybookCoreCommon.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CLIOptions extends StObject {
  
  var ci: js.UndefOr[Boolean] = js.undefined
  
  var configDir: js.UndefOr[String] = js.undefined
  
  var debugWebpack: js.UndefOr[Boolean] = js.undefined
  
  var disableTelemetry: js.UndefOr[Boolean] = js.undefined
  
  var dll: js.UndefOr[Boolean] = js.undefined
  
  var docs: js.UndefOr[Boolean] = js.undefined
  
  var docsDll: js.UndefOr[Boolean] = js.undefined
  
  var enableCrashReports: js.UndefOr[Boolean] = js.undefined
  
  var forceBuildPreview: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var ignorePreview: js.UndefOr[Boolean] = js.undefined
  
  var loglevel: js.UndefOr[String] = js.undefined
  
  var managerCache: js.UndefOr[Boolean] = js.undefined
  
  var modern: js.UndefOr[Boolean] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var outputDir: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var previewUrl: js.UndefOr[String] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var releaseNotes: js.UndefOr[Boolean] = js.undefined
  
  var smokeTest: js.UndefOr[Boolean] = js.undefined
  
  var sslCa: js.UndefOr[js.Array[String]] = js.undefined
  
  var sslCert: js.UndefOr[String] = js.undefined
  
  var sslKey: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use 'staticDirs' Storybook Configuration option instead
    */
  var staticDir: js.UndefOr[js.Array[String]] = js.undefined
  
  var uiDll: js.UndefOr[Boolean] = js.undefined
  
  var versionUpdates: js.UndefOr[Boolean] = js.undefined
  
  var webpackStatsJson: js.UndefOr[String | Boolean] = js.undefined
}
object CLIOptions {
  
  inline def apply(): CLIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CLIOptions]
  }
  
  extension [Self <: CLIOptions](x: Self) {
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
    
    inline def setDebugWebpack(value: Boolean): Self = StObject.set(x, "debugWebpack", value.asInstanceOf[js.Any])
    
    inline def setDebugWebpackUndefined: Self = StObject.set(x, "debugWebpack", js.undefined)
    
    inline def setDisableTelemetry(value: Boolean): Self = StObject.set(x, "disableTelemetry", value.asInstanceOf[js.Any])
    
    inline def setDisableTelemetryUndefined: Self = StObject.set(x, "disableTelemetry", js.undefined)
    
    inline def setDll(value: Boolean): Self = StObject.set(x, "dll", value.asInstanceOf[js.Any])
    
    inline def setDllUndefined: Self = StObject.set(x, "dll", js.undefined)
    
    inline def setDocs(value: Boolean): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsDll(value: Boolean): Self = StObject.set(x, "docsDll", value.asInstanceOf[js.Any])
    
    inline def setDocsDllUndefined: Self = StObject.set(x, "docsDll", js.undefined)
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setEnableCrashReports(value: Boolean): Self = StObject.set(x, "enableCrashReports", value.asInstanceOf[js.Any])
    
    inline def setEnableCrashReportsUndefined: Self = StObject.set(x, "enableCrashReports", js.undefined)
    
    inline def setForceBuildPreview(value: Boolean): Self = StObject.set(x, "forceBuildPreview", value.asInstanceOf[js.Any])
    
    inline def setForceBuildPreviewUndefined: Self = StObject.set(x, "forceBuildPreview", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setIgnorePreview(value: Boolean): Self = StObject.set(x, "ignorePreview", value.asInstanceOf[js.Any])
    
    inline def setIgnorePreviewUndefined: Self = StObject.set(x, "ignorePreview", js.undefined)
    
    inline def setLoglevel(value: String): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    inline def setManagerCache(value: Boolean): Self = StObject.set(x, "managerCache", value.asInstanceOf[js.Any])
    
    inline def setManagerCacheUndefined: Self = StObject.set(x, "managerCache", js.undefined)
    
    inline def setModern(value: Boolean): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
    
    inline def setModernUndefined: Self = StObject.set(x, "modern", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
    
    inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setReleaseNotes(value: Boolean): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
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
    
    inline def setUiDll(value: Boolean): Self = StObject.set(x, "uiDll", value.asInstanceOf[js.Any])
    
    inline def setUiDllUndefined: Self = StObject.set(x, "uiDll", js.undefined)
    
    inline def setVersionUpdates(value: Boolean): Self = StObject.set(x, "versionUpdates", value.asInstanceOf[js.Any])
    
    inline def setVersionUpdatesUndefined: Self = StObject.set(x, "versionUpdates", js.undefined)
    
    inline def setWebpackStatsJson(value: String | Boolean): Self = StObject.set(x, "webpackStatsJson", value.asInstanceOf[js.Any])
    
    inline def setWebpackStatsJsonUndefined: Self = StObject.set(x, "webpackStatsJson", js.undefined)
  }
}
