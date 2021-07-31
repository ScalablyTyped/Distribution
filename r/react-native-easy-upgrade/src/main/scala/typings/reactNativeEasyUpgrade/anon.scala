package typings.reactNativeEasyUpgrade

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
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
    
    @scala.inline
    def apply(tempDownloadPath: String): AllowedInMetered = {
      val __obj = js.Dynamic.literal(tempDownloadPath = tempDownloadPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedInMetered]
    }
    
    @scala.inline
    implicit class AllowedInMeteredMutableBuilder[Self <: AllowedInMetered] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedInMetered(value: Boolean): Self = StObject.set(x, "allowedInMetered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedInMeteredUndefined: Self = StObject.set(x, "allowedInMetered", js.undefined)
      
      @scala.inline
      def setAllowedInRoaming(value: Boolean): Self = StObject.set(x, "allowedInRoaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedInRoamingUndefined: Self = StObject.set(x, "allowedInRoaming", js.undefined)
      
      @scala.inline
      def setDownloadDescription(value: String): Self = StObject.set(x, "downloadDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDescriptionUndefined: Self = StObject.set(x, "downloadDescription", js.undefined)
      
      @scala.inline
      def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadTitleUndefined: Self = StObject.set(x, "downloadTitle", js.undefined)
      
      @scala.inline
      def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSaveAsName(value: String): Self = StObject.set(x, "saveAsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveAsNameUndefined: Self = StObject.set(x, "saveAsName", js.undefined)
      
      @scala.inline
      def setShowInDownloads(value: Boolean): Self = StObject.set(x, "showInDownloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInDownloadsUndefined: Self = StObject.set(x, "showInDownloads", js.undefined)
      
      @scala.inline
      def setTempDownloadPath(value: String): Self = StObject.set(x, "tempDownloadPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var trackViewUrl: String
    
    var version: String
  }
  object Dictkey {
    
    @scala.inline
    def apply(trackViewUrl: String, version: String): Dictkey = {
      val __obj = js.Dynamic.literal(trackViewUrl = trackViewUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrackViewUrl(value: String): Self = StObject.set(x, "trackViewUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    implicit class HasNewVersionMutableBuilder[Self <: HasNewVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasNewVersion(value: Boolean): Self = StObject.set(x, "hasNewVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestVersion(value: String): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalVersion(value: String): Self = StObject.set(x, "localVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupInfo(value: Dictkey): Self = StObject.set(x, "lookupInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackViewUrl(value: String): Self = StObject.set(x, "trackViewUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-native-easy-upgrade.react-native-easy-upgrade.Options> */
  trait PartialOptions extends StObject {
    
    var downloadApkEnd: js.UndefOr[js.Function1[/* path */ String, js.Any]] = js.undefined
    
    var downloadApkName: js.UndefOr[String] = js.undefined
    
    var downloadDescription: js.UndefOr[String] = js.undefined
    
    var downloadDestDirectory: js.UndefOr[String] = js.undefined
    
    var downloadTitle: js.UndefOr[String] = js.undefined
    
    var iOSAppId: js.UndefOr[String] = js.undefined
    
    var iOSAppLookupUrl: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* err */ Error, js.Any]] = js.undefined
    
    var shouldCheckApkHasDownloaded: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadApkEnd(value: /* path */ String => js.Any): Self = StObject.set(x, "downloadApkEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadApkEndUndefined: Self = StObject.set(x, "downloadApkEnd", js.undefined)
      
      @scala.inline
      def setDownloadApkName(value: String): Self = StObject.set(x, "downloadApkName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadApkNameUndefined: Self = StObject.set(x, "downloadApkName", js.undefined)
      
      @scala.inline
      def setDownloadDescription(value: String): Self = StObject.set(x, "downloadDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDescriptionUndefined: Self = StObject.set(x, "downloadDescription", js.undefined)
      
      @scala.inline
      def setDownloadDestDirectory(value: String): Self = StObject.set(x, "downloadDestDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDestDirectoryUndefined: Self = StObject.set(x, "downloadDestDirectory", js.undefined)
      
      @scala.inline
      def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadTitleUndefined: Self = StObject.set(x, "downloadTitle", js.undefined)
      
      @scala.inline
      def setIOSAppId(value: String): Self = StObject.set(x, "iOSAppId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIOSAppIdUndefined: Self = StObject.set(x, "iOSAppId", js.undefined)
      
      @scala.inline
      def setIOSAppLookupUrl(value: String): Self = StObject.set(x, "iOSAppLookupUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIOSAppLookupUrlUndefined: Self = StObject.set(x, "iOSAppLookupUrl", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ Error => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setShouldCheckApkHasDownloaded(value: Boolean): Self = StObject.set(x, "shouldCheckApkHasDownloaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCheckApkHasDownloadedUndefined: Self = StObject.set(x, "shouldCheckApkHasDownloaded", js.undefined)
    }
  }
  
  trait VERSIONCODE extends StObject {
    
    var VERSION_CODE: String
    
    var VERSION_NAME: String
  }
  object VERSIONCODE {
    
    @scala.inline
    def apply(VERSION_CODE: String, VERSION_NAME: String): VERSIONCODE = {
      val __obj = js.Dynamic.literal(VERSION_CODE = VERSION_CODE.asInstanceOf[js.Any], VERSION_NAME = VERSION_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[VERSIONCODE]
    }
    
    @scala.inline
    implicit class VERSIONCODEMutableBuilder[Self <: VERSIONCODE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVERSION_CODE(value: String): Self = StObject.set(x, "VERSION_CODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERSION_NAME(value: String): Self = StObject.set(x, "VERSION_NAME", value.asInstanceOf[js.Any])
    }
  }
}
