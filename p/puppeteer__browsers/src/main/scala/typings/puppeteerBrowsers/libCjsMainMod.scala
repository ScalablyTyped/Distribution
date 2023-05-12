package typings.puppeteerBrowsers

import typings.node.readlineMod.Interface
import typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser
import typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ProfileOptions
import typings.puppeteerBrowsers.libCjsCacheMod.InstalledBrowser
import typings.puppeteerBrowsers.libCjsInstallMod.InstallOptions
import typings.puppeteerBrowsers.libCjsLaunchMod.ComputeExecutablePathOptions
import typings.puppeteerBrowsers.libCjsLaunchMod.LaunchOptions
import typings.puppeteerBrowsers.libCjsLaunchMod.SystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsMainMod {
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "Browser")
  @js.native
  object Browser extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser & String] = js.native
    
    /* "chrome" */ val CHROME: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.CHROME & String = js.native
    
    /* "chromedriver" */ val CHROMEDRIVER: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.CHROMEDRIVER & String = js.native
    
    /* "chromium" */ val CHROMIUM: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.CHROMIUM & String = js.native
    
    /* "firefox" */ val FIREFOX: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.Browser.FIREFOX & String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "BrowserPlatform")
  @js.native
  object BrowserPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform & String] = js.native
    
    /* "linux" */ val LINUX: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.LINUX & String = js.native
    
    /* "mac" */ val MAC: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.MAC & String = js.native
    
    /* "mac_arm" */ val MAC_ARM: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.MAC_ARM & String = js.native
    
    /* "win32" */ val WIN32: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.WIN32 & String = js.native
    
    /* "win64" */ val WIN64: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.BrowserPlatform.WIN64 & String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "CDP_WEBSOCKET_ENDPOINT_REGEX")
  @js.native
  val CDP_WEBSOCKET_ENDPOINT_REGEX: js.RegExp = js.native
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "CLI")
  @js.native
  open class CLI ()
    extends typings.puppeteerBrowsers.libCjsCliMod.CLI {
    def this(cachePath: String) = this()
    def this(cachePath: String, rl: Interface) = this()
    def this(cachePath: Unit, rl: Interface) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "Cache")
  @js.native
  open class Cache protected ()
    extends typings.puppeteerBrowsers.libCjsCacheMod.Cache {
    def this(rootDir: String) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "ChromeReleaseChannel")
  @js.native
  object ChromeReleaseChannel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel & String
      ] = js.native
    
    /* "beta" */ val BETA: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.BETA & String = js.native
    
    /* "canary" */ val CANARY: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.CANARY & String = js.native
    
    /* "dev" */ val DEV: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.DEV & String = js.native
    
    /* "stable" */ val STABLE: typings.puppeteerBrowsers.libCjsBrowserDataTypesMod.ChromeReleaseChannel.STABLE & String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "Process")
  @js.native
  open class Process protected ()
    extends typings.puppeteerBrowsers.libCjsLaunchMod.Process {
    def this(opts: LaunchOptions) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "TimeoutError")
  @js.native
  /**
    * @internal
    */
  open class TimeoutError ()
    extends typings.puppeteerBrowsers.libCjsLaunchMod.TimeoutError {
    def this(message: String) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/cjs/main", "WEBDRIVER_BIDI_WEBSOCKET_ENDPOINT_REGEX")
  @js.native
  val WEBDRIVER_BIDI_WEBSOCKET_ENDPOINT_REGEX: js.RegExp = js.native
  
  inline def canDownload(options: InstallOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canDownload")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def computeExecutablePath(options: ComputeExecutablePathOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeExecutablePath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeSystemExecutablePath(options: SystemOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSystemExecutablePath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createProfile(browser: Browser, opts: ProfileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfile")(browser.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def detectBrowserPlatform(): js.UndefOr[BrowserPlatform] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBrowserPlatform")().asInstanceOf[js.UndefOr[BrowserPlatform]]
  
  inline def install(options: InstallOptions): js.Promise[InstalledBrowser] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InstalledBrowser]]
  
  inline def launch(opts: LaunchOptions): typings.puppeteerBrowsers.libCjsLaunchMod.Process = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteerBrowsers.libCjsLaunchMod.Process]
  
  inline def makeProgressCallback(browser: Browser, buildId: String): js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeProgressCallback")(browser.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit]]
  
  inline def resolveBuildId(browser: Browser, platform: BrowserPlatform, tag: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(browser.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
