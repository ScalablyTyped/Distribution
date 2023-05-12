package typings.puppeteerBrowsers

import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ProfileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmBrowserDataBrowserDataMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "Browser")
  @js.native
  object Browser extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser & String] = js.native
    
    /* "chrome" */ val CHROME: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.CHROME & String = js.native
    
    /* "chromedriver" */ val CHROMEDRIVER: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.CHROMEDRIVER & String = js.native
    
    /* "chromium" */ val CHROMIUM: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.CHROMIUM & String = js.native
    
    /* "firefox" */ val FIREFOX: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.FIREFOX & String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "BrowserPlatform")
  @js.native
  object BrowserPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform & String] = js.native
    
    /* "linux" */ val LINUX: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform.LINUX & String = js.native
    
    /* "mac" */ val MAC: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform.MAC & String = js.native
    
    /* "mac_arm" */ val MAC_ARM: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform.MAC_ARM & String = js.native
    
    /* "win32" */ val WIN32: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform.WIN32 & String = js.native
    
    /* "win64" */ val WIN64: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform.WIN64 & String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "ChromeReleaseChannel")
  @js.native
  object ChromeReleaseChannel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel & String
      ] = js.native
    
    /* "beta" */ val BETA: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel.BETA & String = js.native
    
    /* "canary" */ val CANARY: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel.CANARY & String = js.native
    
    /* "dev" */ val DEV: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel.DEV & String = js.native
    
    /* "stable" */ val STABLE: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel.STABLE & String = js.native
  }
  
  inline def createProfile(browser: Browser, opts: ProfileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfile")(browser.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  object downloadPaths {
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadPaths")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadPaths.chrome")
    @js.native
    def chrome: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]] = js.native
    inline def chrome(platform: BrowserPlatform, buildId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("chrome")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def chrome_=(x: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadPaths.chromedriver")
    @js.native
    def chromedriver: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]] = js.native
    inline def chromedriver(platform: BrowserPlatform, buildId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("chromedriver")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def chromedriver_=(x: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromedriver")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadPaths.chromium")
    @js.native
    def chromium: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]] = js.native
    inline def chromium(platform: BrowserPlatform, buildId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("chromium")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def chromium_=(x: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromium")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadPaths.firefox")
    @js.native
    def firefox: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]] = js.native
    inline def firefox(platform: BrowserPlatform, buildId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("firefox")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def firefox_=(x: js.Function2[/* platform */ BrowserPlatform, /* buildId */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  }
  
  object downloadUrls {
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadUrls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadUrls.chrome")
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
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadUrls.chromedriver")
    @js.native
    def chromedriver: js.Function3[
        /* platform */ BrowserPlatform, 
        /* buildId */ String, 
        /* baseUrl */ js.UndefOr[String], 
        String
      ] = js.native
    inline def chromedriver(platform: BrowserPlatform, buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chromedriver")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chromedriver(platform: BrowserPlatform, buildId: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chromedriver")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chromedriver_=(
      x: js.Function3[
          /* platform */ BrowserPlatform, 
          /* buildId */ String, 
          /* baseUrl */ js.UndefOr[String], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromedriver")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadUrls.chromium")
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
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "downloadUrls.firefox")
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
  
  object executablePathByBrowser {
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "executablePathByBrowser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "executablePathByBrowser.chrome")
    @js.native
    def chrome: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String] = js.native
    inline def chrome(platform: BrowserPlatform, _buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chrome")(platform.asInstanceOf[js.Any], _buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chrome_=(x: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "executablePathByBrowser.chromedriver")
    @js.native
    def chromedriver: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String] = js.native
    inline def chromedriver(platform: BrowserPlatform, _buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chromedriver")(platform.asInstanceOf[js.Any], _buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chromedriver_=(x: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromedriver")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "executablePathByBrowser.chromium")
    @js.native
    def chromium: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String] = js.native
    inline def chromium(platform: BrowserPlatform, _buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chromium")(platform.asInstanceOf[js.Any], _buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def chromium_=(x: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromium")(x.asInstanceOf[js.Any])
    
    @JSImport("@puppeteer/browsers/lib/esm/browser-data/browser-data", "executablePathByBrowser.firefox")
    @js.native
    def firefox: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String] = js.native
    inline def firefox(platform: BrowserPlatform, _buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("firefox")(platform.asInstanceOf[js.Any], _buildId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def firefox_=(x: js.Function2[/* platform */ BrowserPlatform, /* _buildId */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  }
  
  inline def resolveBuildId(browser: Browser, platform: BrowserPlatform, tag: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(browser.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def resolveSystemExecutablePath(browser: Browser, platform: BrowserPlatform, channel: ChromeReleaseChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSystemExecutablePath")(browser.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
}
