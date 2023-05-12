package typings.puppeteerBrowsers

import typings.node.readlineMod.Interface
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ProfileOptions
import typings.puppeteerBrowsers.libEsmCacheMod.InstalledBrowser
import typings.puppeteerBrowsers.libEsmInstallMod.InstallOptions
import typings.puppeteerBrowsers.libEsmLaunchMod.ComputeExecutablePathOptions
import typings.puppeteerBrowsers.libEsmLaunchMod.LaunchOptions
import typings.puppeteerBrowsers.libEsmLaunchMod.SystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmMainMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "Browser")
  @js.native
  object Browser extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser & String] = js.native
    
    /* "chrome" */ val CHROME: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.CHROME & String = js.native
    
    /* "chromedriver" */ val CHROMEDRIVER: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.CHROMEDRIVER & String = js.native
    
    /* "chromium" */ val CHROMIUM: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.CHROMIUM & String = js.native
    
    /* "firefox" */ val FIREFOX: typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser.FIREFOX & String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "BrowserPlatform")
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
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "CDP_WEBSOCKET_ENDPOINT_REGEX")
  @js.native
  val CDP_WEBSOCKET_ENDPOINT_REGEX: js.RegExp = js.native
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "CLI")
  @js.native
  open class CLI ()
    extends typings.puppeteerBrowsers.libEsmCliMod.CLI {
    def this(cachePath: String) = this()
    def this(cachePath: String, rl: Interface) = this()
    def this(cachePath: Unit, rl: Interface) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "Cache")
  @js.native
  open class Cache protected ()
    extends typings.puppeteerBrowsers.libEsmCacheMod.Cache {
    def this(rootDir: String) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "ChromeReleaseChannel")
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
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "Process")
  @js.native
  open class Process protected ()
    extends typings.puppeteerBrowsers.libEsmLaunchMod.Process {
    def this(opts: LaunchOptions) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "TimeoutError")
  @js.native
  /**
    * @internal
    */
  open class TimeoutError ()
    extends typings.puppeteerBrowsers.libEsmLaunchMod.TimeoutError {
    def this(message: String) = this()
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/main", "WEBDRIVER_BIDI_WEBSOCKET_ENDPOINT_REGEX")
  @js.native
  val WEBDRIVER_BIDI_WEBSOCKET_ENDPOINT_REGEX: js.RegExp = js.native
  
  inline def canDownload(options: InstallOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canDownload")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def computeExecutablePath(options: ComputeExecutablePathOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeExecutablePath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeSystemExecutablePath(options: SystemOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSystemExecutablePath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createProfile(browser: Browser, opts: ProfileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfile")(browser.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def detectBrowserPlatform(): js.UndefOr[BrowserPlatform] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBrowserPlatform")().asInstanceOf[js.UndefOr[BrowserPlatform]]
  
  inline def install(options: InstallOptions): js.Promise[InstalledBrowser] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InstalledBrowser]]
  
  inline def launch(opts: LaunchOptions): typings.puppeteerBrowsers.libEsmLaunchMod.Process = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteerBrowsers.libEsmLaunchMod.Process]
  
  inline def makeProgressCallback(browser: Browser, buildId: String): js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeProgressCallback")(browser.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit]]
  
  inline def resolveBuildId(browser: Browser, platform: BrowserPlatform, tag: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(browser.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
