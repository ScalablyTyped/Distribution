package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.storybookCoreCommon.anon.ArgTypeTargetsV7
import typings.storybookCoreCommon.distTs3Dot9UtilsFileCacheMod.FileSystemCache
import typings.storybookCoreCommon.storybookCoreCommonStrings.DEVELOPMENT
import typings.storybookCoreCommon.storybookCoreCommonStrings.PRODUCTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderOptions extends StObject {
  
  var cache: FileSystemCache
  
  var configDir: String
  
  var configType: js.UndefOr[DEVELOPMENT | PRODUCTION] = js.undefined
  
  var disableWebpackDefaults: js.UndefOr[Boolean] = js.undefined
  
  var docsMode: Boolean
  
  var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
  
  var ignorePreview: Boolean
  
  var releaseNotesData: js.UndefOr[ReleaseNotesData] = js.undefined
  
  var serverChannelUrl: js.UndefOr[String] = js.undefined
  
  var versionCheck: js.UndefOr[VersionCheck] = js.undefined
}
object BuilderOptions {
  
  inline def apply(cache: FileSystemCache, configDir: String, docsMode: Boolean, ignorePreview: Boolean): BuilderOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], configDir = configDir.asInstanceOf[js.Any], docsMode = docsMode.asInstanceOf[js.Any], ignorePreview = ignorePreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuilderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuilderOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: FileSystemCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigType(value: DEVELOPMENT | PRODUCTION): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    inline def setDisableWebpackDefaults(value: Boolean): Self = StObject.set(x, "disableWebpackDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableWebpackDefaultsUndefined: Self = StObject.set(x, "disableWebpackDefaults", js.undefined)
    
    inline def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setIgnorePreview(value: Boolean): Self = StObject.set(x, "ignorePreview", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesData(value: ReleaseNotesData): Self = StObject.set(x, "releaseNotesData", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesDataUndefined: Self = StObject.set(x, "releaseNotesData", js.undefined)
    
    inline def setServerChannelUrl(value: String): Self = StObject.set(x, "serverChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setServerChannelUrlUndefined: Self = StObject.set(x, "serverChannelUrl", js.undefined)
    
    inline def setVersionCheck(value: VersionCheck): Self = StObject.set(x, "versionCheck", value.asInstanceOf[js.Any])
    
    inline def setVersionCheckUndefined: Self = StObject.set(x, "versionCheck", js.undefined)
  }
}
