package typings.puppeteerBrowsers

import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libEsmCacheMod.InstalledBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInstallMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/install", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canDownload(options: InstallOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canDownload")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def install(options: InstallOptions): js.Promise[InstalledBrowser] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InstalledBrowser]]
  
  trait InstallOptions extends StObject {
    
    /**
      * Determines the host that will be used for downloading.
      *
      * @defaultValue Either
      *
      * - https://edgedl.me.gvt1.com/edgedl/chrome/chrome-for-testing or
      * - https://archive.mozilla.org/pub/firefox/nightly/latest-mozilla-central
      *
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Determines which browser to install.
      */
    var browser: Browser
    
    /**
      * Determines which buildId to dowloand. BuildId should uniquely identify
      * binaries and they are used for caching.
      */
    var buildId: String
    
    /**
      * Determines the path to download browsers to.
      */
    var cacheDir: String
    
    /**
      * Provides information about the progress of the download.
      */
    var downloadProgressCallback: js.UndefOr[js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit]] = js.undefined
    
    /**
      * Determines which platform the browser will be suited for.
      *
      * @defaultValue **Auto-detected.**
      */
    var platform: js.UndefOr[BrowserPlatform] = js.undefined
    
    /**
      * Whether to unpack and install browser archives.
      *
      * @defaultValue `true`
      */
    var unpack: js.UndefOr[Boolean] = js.undefined
  }
  object InstallOptions {
    
    inline def apply(browser: Browser, buildId: String, cacheDir: String): InstallOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], cacheDir = cacheDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      inline def setDownloadProgressCallback(value: (/* downloadedBytes */ Double, /* totalBytes */ Double) => Unit): Self = StObject.set(x, "downloadProgressCallback", js.Any.fromFunction2(value))
      
      inline def setDownloadProgressCallbackUndefined: Self = StObject.set(x, "downloadProgressCallback", js.undefined)
      
      inline def setPlatform(value: BrowserPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setUnpack(value: Boolean): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
      
      inline def setUnpackUndefined: Self = StObject.set(x, "unpack", js.undefined)
    }
  }
}
