package typings.reactNativeEasyUpgrade

import typings.reactNativeEasyUpgrade.anon.AllowedInMetered
import typings.reactNativeEasyUpgrade.anon.HasNewVersion
import typings.reactNativeEasyUpgrade.anon.PartialOptions
import typings.reactNativeEasyUpgrade.anon.VERSIONCODE
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-easy-upgrade", JSImport.Default)
  @js.native
  class default protected () extends AppUpgrade {
    def this(options: PartialOptions) = this()
  }
  
  @js.native
  trait AppUpgrade extends StObject {
    
    def checkApkHasDownloaded(): js.Promise[Boolean] = js.native
    def checkApkHasDownloaded(path: String): js.Promise[Boolean] = js.native
    
    /**
      * Check the ios app version info from app store.
      */
    def checkAppVersionIOS(): js.Promise[HasNewVersion] = js.native
    
    val downloadDestDirectory: String = js.native
    
    val downloadDestPath: String = js.native
    
    /**
      * download file
      * @param fileUrl
      * @param downloadConf
      */
    def downloadFile(fileUrl: String): Unit = js.native
    def downloadFile(fileUrl: String, downloadConf: AllowedInMetered): Unit = js.native
    
    val downloading: Boolean = js.native
    
    def getLocalVersionInfo(): VERSIONCODE = js.native
    
    def getNetworkStatus(): js.Promise[String] = js.native
    
    def installApk(): Unit = js.native
    def installApk(apkPath: String): Unit = js.native
    
    /**
      * navigate to app store download page.
      */
    def navigateToAppStore(): Unit = js.native
    def navigateToAppStore(trackViewUrl: String): Unit = js.native
    
    def startAppUpdate(apkUrl: String): Unit = js.native
    def startAppUpdate(apkUrl: String, appStoreUrl: String): Unit = js.native
    
    /**
      * update app and install
      * @param apkUrl
      */
    def updateAndroidApp(apkUrl: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    def downloadApkEnd(path: String): js.Any = js.native
    
    var downloadApkName: String = js.native
    
    var downloadDescription: String = js.native
    
    var downloadDestDirectory: String = js.native
    
    var downloadTitle: String = js.native
    
    var iOSAppId: String = js.native
    
    var iOSAppLookupUrl: String = js.native
    
    def onError(err: Error): js.Any = js.native
    
    var shouldCheckApkHasDownloaded: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      downloadApkEnd: String => js.Any,
      downloadApkName: String,
      downloadDescription: String,
      downloadDestDirectory: String,
      downloadTitle: String,
      iOSAppId: String,
      iOSAppLookupUrl: String,
      onError: Error => js.Any,
      shouldCheckApkHasDownloaded: Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(downloadApkEnd = js.Any.fromFunction1(downloadApkEnd), downloadApkName = downloadApkName.asInstanceOf[js.Any], downloadDescription = downloadDescription.asInstanceOf[js.Any], downloadDestDirectory = downloadDestDirectory.asInstanceOf[js.Any], downloadTitle = downloadTitle.asInstanceOf[js.Any], iOSAppId = iOSAppId.asInstanceOf[js.Any], iOSAppLookupUrl = iOSAppLookupUrl.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadApkEnd(value: String => js.Any): Self = StObject.set(x, "downloadApkEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadApkName(value: String): Self = StObject.set(x, "downloadApkName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDescription(value: String): Self = StObject.set(x, "downloadDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDestDirectory(value: String): Self = StObject.set(x, "downloadDestDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIOSAppId(value: String): Self = StObject.set(x, "iOSAppId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIOSAppLookupUrl(value: String): Self = StObject.set(x, "iOSAppLookupUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnError(value: Error => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldCheckApkHasDownloaded(value: Boolean): Self = StObject.set(x, "shouldCheckApkHasDownloaded", value.asInstanceOf[js.Any])
    }
  }
}
