package typings.storybookReactDomShim.distPresetMod

import typings.storybookReactDomShim.anon.ArgTypeTargetsV7
import typings.storybookReactDomShim.storybookReactDomShimStrings.DEVELOPMENT
import typings.storybookReactDomShim.storybookReactDomShimStrings.PRODUCTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderOptions extends StObject {
  
  var cache: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemCache */ Any
  ] = js.undefined
  
  var configDir: String
  
  var configType: js.UndefOr[DEVELOPMENT | PRODUCTION] = js.undefined
  
  var disableWebpackDefaults: js.UndefOr[Boolean] = js.undefined
  
  var docsMode: js.UndefOr[Boolean] = js.undefined
  
  var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
  
  var ignorePreview: js.UndefOr[Boolean] = js.undefined
  
  var releaseNotesData: js.UndefOr[ReleaseNotesData] = js.undefined
  
  var serverChannelUrl: js.UndefOr[String] = js.undefined
  
  var versionCheck: js.UndefOr[VersionCheck] = js.undefined
}
object BuilderOptions {
  
  inline def apply(configDir: String): BuilderOptions = {
    val __obj = js.Dynamic.literal(configDir = configDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuilderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuilderOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemCache */ Any
    ): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigType(value: DEVELOPMENT | PRODUCTION): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    inline def setDisableWebpackDefaults(value: Boolean): Self = StObject.set(x, "disableWebpackDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableWebpackDefaultsUndefined: Self = StObject.set(x, "disableWebpackDefaults", js.undefined)
    
    inline def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    
    inline def setDocsModeUndefined: Self = StObject.set(x, "docsMode", js.undefined)
    
    inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setIgnorePreview(value: Boolean): Self = StObject.set(x, "ignorePreview", value.asInstanceOf[js.Any])
    
    inline def setIgnorePreviewUndefined: Self = StObject.set(x, "ignorePreview", js.undefined)
    
    inline def setReleaseNotesData(value: ReleaseNotesData): Self = StObject.set(x, "releaseNotesData", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesDataUndefined: Self = StObject.set(x, "releaseNotesData", js.undefined)
    
    inline def setServerChannelUrl(value: String): Self = StObject.set(x, "serverChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setServerChannelUrlUndefined: Self = StObject.set(x, "serverChannelUrl", js.undefined)
    
    inline def setVersionCheck(value: VersionCheck): Self = StObject.set(x, "versionCheck", value.asInstanceOf[js.Any])
    
    inline def setVersionCheckUndefined: Self = StObject.set(x, "versionCheck", js.undefined)
  }
}
