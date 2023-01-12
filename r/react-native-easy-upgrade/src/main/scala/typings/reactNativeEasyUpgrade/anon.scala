package typings.reactNativeEasyUpgrade

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowedInMetered extends StObject {
    
    var allowedInMetered: js.UndefOr[Boolean] = js.undefined
    
    var allowedInRoaming: js.UndefOr[Boolean] = js.undefined
    
    var downloadDescription: js.UndefOr[String] = js.undefined
    
    var downloadTitle: js.UndefOr[String] = js.undefined
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var saveAsName: js.UndefOr[String] = js.undefined
    
    var showInDownloads: js.UndefOr[Boolean] = js.undefined
    
    var tempDownloadPath: String
  }
  object AllowedInMetered {
    
    inline def apply(tempDownloadPath: String): AllowedInMetered = {
      val __obj = js.Dynamic.literal(tempDownloadPath = tempDownloadPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedInMetered]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowedInMetered] (val x: Self) extends AnyVal {
      
      inline def setAllowedInMetered(value: Boolean): Self = StObject.set(x, "allowedInMetered", value.asInstanceOf[js.Any])
      
      inline def setAllowedInMeteredUndefined: Self = StObject.set(x, "allowedInMetered", js.undefined)
      
      inline def setAllowedInRoaming(value: Boolean): Self = StObject.set(x, "allowedInRoaming", value.asInstanceOf[js.Any])
      
      inline def setAllowedInRoamingUndefined: Self = StObject.set(x, "allowedInRoaming", js.undefined)
      
      inline def setDownloadDescription(value: String): Self = StObject.set(x, "downloadDescription", value.asInstanceOf[js.Any])
      
      inline def setDownloadDescriptionUndefined: Self = StObject.set(x, "downloadDescription", js.undefined)
      
      inline def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      inline def setDownloadTitleUndefined: Self = StObject.set(x, "downloadTitle", js.undefined)
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSaveAsName(value: String): Self = StObject.set(x, "saveAsName", value.asInstanceOf[js.Any])
      
      inline def setSaveAsNameUndefined: Self = StObject.set(x, "saveAsName", js.undefined)
      
      inline def setShowInDownloads(value: Boolean): Self = StObject.set(x, "showInDownloads", value.asInstanceOf[js.Any])
      
      inline def setShowInDownloadsUndefined: Self = StObject.set(x, "showInDownloads", js.undefined)
      
      inline def setTempDownloadPath(value: String): Self = StObject.set(x, "tempDownloadPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var trackViewUrl: String
    
    var version: String
  }
  object Dictkey {
    
    inline def apply(trackViewUrl: String, version: String): Dictkey = {
      val __obj = js.Dynamic.literal(trackViewUrl = trackViewUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setTrackViewUrl(value: String): Self = StObject.set(x, "trackViewUrl", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasNewVersion extends StObject {
    
    var hasNewVersion: Boolean
    
    var latestVersion: String
    
    var localVersion: String
    
    var lookupInfo: Dictkey
    
    var trackViewUrl: String
  }
  object HasNewVersion {
    
    inline def apply(
      hasNewVersion: Boolean,
      latestVersion: String,
      localVersion: String,
      lookupInfo: Dictkey,
      trackViewUrl: String
    ): HasNewVersion = {
      val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], localVersion = localVersion.asInstanceOf[js.Any], lookupInfo = lookupInfo.asInstanceOf[js.Any], trackViewUrl = trackViewUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasNewVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasNewVersion] (val x: Self) extends AnyVal {
      
      inline def setHasNewVersion(value: Boolean): Self = StObject.set(x, "hasNewVersion", value.asInstanceOf[js.Any])
      
      inline def setLatestVersion(value: String): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      inline def setLocalVersion(value: String): Self = StObject.set(x, "localVersion", value.asInstanceOf[js.Any])
      
      inline def setLookupInfo(value: Dictkey): Self = StObject.set(x, "lookupInfo", value.asInstanceOf[js.Any])
      
      inline def setTrackViewUrl(value: String): Self = StObject.set(x, "trackViewUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-native-easy-upgrade.react-native-easy-upgrade.Options> */
  trait PartialOptions extends StObject {
    
    var downloadApkEnd: js.UndefOr[js.Function1[/* path */ String, Any]] = js.undefined
    
    var downloadApkName: js.UndefOr[String] = js.undefined
    
    var downloadDescription: js.UndefOr[String] = js.undefined
    
    var downloadDestDirectory: js.UndefOr[String] = js.undefined
    
    var downloadTitle: js.UndefOr[String] = js.undefined
    
    var iOSAppId: js.UndefOr[String] = js.undefined
    
    var iOSAppLookupUrl: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Any]] = js.undefined
    
    var shouldCheckApkHasDownloaded: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setDownloadApkEnd(value: /* path */ String => Any): Self = StObject.set(x, "downloadApkEnd", js.Any.fromFunction1(value))
      
      inline def setDownloadApkEndUndefined: Self = StObject.set(x, "downloadApkEnd", js.undefined)
      
      inline def setDownloadApkName(value: String): Self = StObject.set(x, "downloadApkName", value.asInstanceOf[js.Any])
      
      inline def setDownloadApkNameUndefined: Self = StObject.set(x, "downloadApkName", js.undefined)
      
      inline def setDownloadDescription(value: String): Self = StObject.set(x, "downloadDescription", value.asInstanceOf[js.Any])
      
      inline def setDownloadDescriptionUndefined: Self = StObject.set(x, "downloadDescription", js.undefined)
      
      inline def setDownloadDestDirectory(value: String): Self = StObject.set(x, "downloadDestDirectory", value.asInstanceOf[js.Any])
      
      inline def setDownloadDestDirectoryUndefined: Self = StObject.set(x, "downloadDestDirectory", js.undefined)
      
      inline def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      inline def setDownloadTitleUndefined: Self = StObject.set(x, "downloadTitle", js.undefined)
      
      inline def setIOSAppId(value: String): Self = StObject.set(x, "iOSAppId", value.asInstanceOf[js.Any])
      
      inline def setIOSAppIdUndefined: Self = StObject.set(x, "iOSAppId", js.undefined)
      
      inline def setIOSAppLookupUrl(value: String): Self = StObject.set(x, "iOSAppLookupUrl", value.asInstanceOf[js.Any])
      
      inline def setIOSAppLookupUrlUndefined: Self = StObject.set(x, "iOSAppLookupUrl", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setShouldCheckApkHasDownloaded(value: Boolean): Self = StObject.set(x, "shouldCheckApkHasDownloaded", value.asInstanceOf[js.Any])
      
      inline def setShouldCheckApkHasDownloadedUndefined: Self = StObject.set(x, "shouldCheckApkHasDownloaded", js.undefined)
    }
  }
  
  trait VERSIONCODE extends StObject {
    
    var VERSION_CODE: String
    
    var VERSION_NAME: String
  }
  object VERSIONCODE {
    
    inline def apply(VERSION_CODE: String, VERSION_NAME: String): VERSIONCODE = {
      val __obj = js.Dynamic.literal(VERSION_CODE = VERSION_CODE.asInstanceOf[js.Any], VERSION_NAME = VERSION_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[VERSIONCODE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VERSIONCODE] (val x: Self) extends AnyVal {
      
      inline def setVERSION_CODE(value: String): Self = StObject.set(x, "VERSION_CODE", value.asInstanceOf[js.Any])
      
      inline def setVERSION_NAME(value: String): Self = StObject.set(x, "VERSION_NAME", value.asInstanceOf[js.Any])
    }
  }
}
