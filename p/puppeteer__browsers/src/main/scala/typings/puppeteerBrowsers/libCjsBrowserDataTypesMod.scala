package typings.puppeteerBrowsers

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsBrowserDataTypesMod {
  
  @js.native
  sealed trait Browser extends StObject
  @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "Browser")
  @js.native
  object Browser extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Browser & String] = js.native
    
    @js.native
    sealed trait CHROME
      extends StObject
         with Browser
    /* "chrome" */ val CHROME: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.CHROME & String = js.native
    
    @js.native
    sealed trait CHROMEDRIVER
      extends StObject
         with Browser
    /* "chromedriver" */ val CHROMEDRIVER: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.CHROMEDRIVER & String = js.native
    
    @js.native
    sealed trait CHROMIUM
      extends StObject
         with Browser
    /* "chromium" */ val CHROMIUM: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.CHROMIUM & String = js.native
    
    @js.native
    sealed trait FIREFOX
      extends StObject
         with Browser
    /* "firefox" */ val FIREFOX: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.FIREFOX & String = js.native
  }
  
  @js.native
  sealed trait BrowserPlatform extends StObject
  @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "BrowserPlatform")
  @js.native
  object BrowserPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BrowserPlatform & String] = js.native
    
    @js.native
    sealed trait LINUX
      extends StObject
         with BrowserPlatform
    /* "linux" */ val LINUX: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.LINUX & String = js.native
    
    @js.native
    sealed trait MAC
      extends StObject
         with BrowserPlatform
    /* "mac" */ val MAC: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.MAC & String = js.native
    
    @js.native
    sealed trait MAC_ARM
      extends StObject
         with BrowserPlatform
    /* "mac_arm" */ val MAC_ARM: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.MAC_ARM & String = js.native
    
    @js.native
    sealed trait WIN32
      extends StObject
         with BrowserPlatform
    /* "win32" */ val WIN32: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.WIN32 & String = js.native
    
    @js.native
    sealed trait WIN64
      extends StObject
         with BrowserPlatform
    /* "win64" */ val WIN64: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.WIN64 & String = js.native
  }
  
  @js.native
  sealed trait BrowserTag extends StObject
  @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "BrowserTag")
  @js.native
  object BrowserTag extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BrowserTag & String] = js.native
    
    @js.native
    sealed trait BETA
      extends StObject
         with BrowserTag
    /* "beta" */ val BETA: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserTag.BETA & String = js.native
    
    @js.native
    sealed trait CANARY
      extends StObject
         with BrowserTag
    /* "canary" */ val CANARY: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserTag.CANARY & String = js.native
    
    @js.native
    sealed trait DEV
      extends StObject
         with BrowserTag
    /* "dev" */ val DEV: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserTag.DEV & String = js.native
    
    @js.native
    sealed trait LATEST
      extends StObject
         with BrowserTag
    /* "latest" */ val LATEST: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserTag.LATEST & String = js.native
    
    @js.native
    sealed trait STABLE
      extends StObject
         with BrowserTag
    /* "stable" */ val STABLE: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserTag.STABLE & String = js.native
  }
  
  @js.native
  sealed trait ChromeReleaseChannel extends StObject
  @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "ChromeReleaseChannel")
  @js.native
  object ChromeReleaseChannel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChromeReleaseChannel & String] = js.native
    
    @js.native
    sealed trait BETA
      extends StObject
         with ChromeReleaseChannel
    /* "beta" */ val BETA: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.BETA & String = js.native
    
    @js.native
    sealed trait CANARY
      extends StObject
         with ChromeReleaseChannel
    /* "canary" */ val CANARY: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.CANARY & String = js.native
    
    @js.native
    sealed trait DEV
      extends StObject
         with ChromeReleaseChannel
    /* "dev" */ val DEV: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.DEV & String = js.native
    
    @js.native
    sealed trait STABLE
      extends StObject
         with ChromeReleaseChannel
    /* "stable" */ val STABLE: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.STABLE & String = js.native
  }
  
  object downloadUrls {
    
    @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "downloadUrls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "downloadUrls.chrome")
    @js.native
    def chrome: js.Function3[
        /* platform */ BrowserPlatform, 
        /* buildId */ String, 
        /* baseUrl */ js.UndefOr[String], 
        String
      ] = js.native
    inline def chrome(platform: BrowserPlatform, buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chrome")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chrome(platform: BrowserPlatform, buildId: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chrome")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chrome_=(
      x: js.Function3[
          /* platform */ BrowserPlatform, 
          /* buildId */ String, 
          /* baseUrl */ js.UndefOr[String], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "downloadUrls.chromium")
    @js.native
    def chromium: js.Function3[
        /* platform */ BrowserPlatform, 
        /* buildId */ String, 
        /* baseUrl */ js.UndefOr[String], 
        String
      ] = js.native
    inline def chromium(platform: BrowserPlatform, buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chromium")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chromium(platform: BrowserPlatform, buildId: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chromium")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chromium_=(
      x: js.Function3[
          /* platform */ BrowserPlatform, 
          /* buildId */ String, 
          /* baseUrl */ js.UndefOr[String], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromium")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/cjs/browser-data/types", "downloadUrls.firefox")
    @js.native
    def firefox: js.Function3[
        /* platform */ BrowserPlatform, 
        /* buildId */ String, 
        /* baseUrl */ js.UndefOr[String], 
        String
      ] = js.native
    inline def firefox(platform: BrowserPlatform, buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("firefox")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def firefox(platform: BrowserPlatform, buildId: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("firefox")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def firefox_=(
      x: js.Function3[
          /* platform */ BrowserPlatform, 
          /* buildId */ String, 
          /* baseUrl */ js.UndefOr[String], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  }
  
  trait ProfileOptions extends StObject {
    
    var path: String
    
    var preferences: Record[String, Any]
  }
  object ProfileOptions {
    
    inline def apply(path: String, preferences: Record[String, Any]): ProfileOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProfileOptions] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPreferences(value: Record[String, Any]): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    }
  }
}
