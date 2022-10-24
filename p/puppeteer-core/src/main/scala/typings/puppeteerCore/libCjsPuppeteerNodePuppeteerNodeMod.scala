package typings.puppeteerCore

import typings.puppeteerCore.anon.PartialBrowserFetcherOpti
import typings.puppeteerCore.anon.configurationConfiguratio
import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.Browser
import typings.puppeteerCore.libCjsPuppeteerCommonBrowserConnectorMod.BrowserConnectOptions
import typings.puppeteerCore.libCjsPuppeteerCommonConfigurationMod.Configuration
import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import typings.puppeteerCore.libCjsPuppeteerCommonPuppeteerMod.Puppeteer
import typings.puppeteerCore.libCjsPuppeteerNodeBrowserFetcherMod.BrowserFetcher
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.BrowserLaunchArgumentOptions
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.LaunchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodePuppeteerNodeMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/PuppeteerNode", "PuppeteerNode")
  @js.native
  open class PuppeteerNode protected () extends Puppeteer {
    /**
      * @internal
      */
    def this(settings: configurationConfiguratio) = this()
    
    /**
      * @internal
      */
    def browserRevision: String = js.native
    
    /**
      * @internal
      */
    var configuration: Configuration = js.native
    
    /**
      * @deprecated If you are using `puppeteer-core`, do not use this method. Just
      * construct {@link BrowserFetcher} manually.
      *
      * @param options - Set of configurable options to specify the settings of the
      * BrowserFetcher.
      *
      * @returns A new BrowserFetcher instance.
      */
    def createBrowserFetcher(options: PartialBrowserFetcherOpti): BrowserFetcher = js.native
    
    /**
      * @param options - Set of configurable options to set on the browser.
      *
      * @returns The default flags that Chromium will be launched with.
      */
    def defaultArgs(): js.Array[String] = js.native
    def defaultArgs(options: BrowserLaunchArgumentOptions): js.Array[String] = js.native
    
    /**
      * @internal
      */
    var defaultBrowserRevision: String = js.native
    
    /**
      * @returns The default download path for puppeteer. For puppeteer-core, this
      * code should never be called as it is never defined.
      *
      * @internal
      */
    def defaultDownloadPath: js.UndefOr[String] = js.native
    
    /**
      * @returns The name of the browser that will be launched by default. For
      * `puppeteer`, this is influenced by your configuration. Otherwise, it's
      * `chrome`.
      *
      * @public
      */
    def defaultProduct: Product = js.native
    
    /**
      * @returns The executable path.
      */
    def executablePath(): String = js.native
    def executablePath(channel: ChromeReleaseChannel): String = js.native
    
    /**
      * @returns The name of the browser that was last launched.
      *
      * @public
      */
    def lastLaunchedProduct: Product = js.native
    
    /**
      * Launches a browser instance with given arguments and options when
      * specified.
      *
      * @example
      * You can use `ignoreDefaultArgs` to filter out `--mute-audio` from default arguments:
      *
      * ```ts
      * const browser = await puppeteer.launch({
      *   ignoreDefaultArgs: ['--mute-audio'],
      * });
      * ```
      *
      * @remarks
      * Puppeteer can also be used to control the Chrome browser, but it works best
      * with the version of Chromium it is bundled with. There is no guarantee it
      * will work with any other version. Use `executablePath` option with extreme
      * caution. If Google Chrome (rather than Chromium) is preferred, a
      * {@link https://www.google.com/chrome/browser/canary.html | Chrome Canary}
      * or
      * {@link https://www.chromium.org/getting-involved/dev-channel | Dev Channel}
      * build is suggested. In {@link Puppeteer.launch}, any mention of Chromium
      * also applies to Chrome. See
      * {@link https://www.howtogeek.com/202825/what%E2%80%99s-the-difference-between-chromium-and-chrome/ | this article}
      * for a description of the differences between Chromium and Chrome.
      * {@link https://chromium.googlesource.com/chromium/src/+/lkgr/docs/chromium_browser_vs_google_chrome.md | This article}
      * describes some differences for Linux users.
      *
      * @param options - Options to configure launching behavior.
      */
    def launch(): js.Promise[Browser] = js.native
    def launch(options: PuppeteerLaunchOptions): js.Promise[Browser] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @deprecated Do not use as this field as it does not take into account
      * multiple browsers of different types. Use {@link defaultProduct} or
      * {@link lastLaunchedProduct}.
      *
      * @returns The name of the browser that is under automation.
      */
    def product: String = js.native
  }
  
  trait PuppeteerLaunchOptions
    extends StObject
       with LaunchOptions
       with BrowserLaunchArgumentOptions
       with BrowserConnectOptions
  object PuppeteerLaunchOptions {
    
    inline def apply(): PuppeteerLaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PuppeteerLaunchOptions]
    }
  }
}
