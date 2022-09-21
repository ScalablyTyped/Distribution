package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "PuppeteerNode")
@js.native
open class PuppeteerNode () extends Puppeteer {
  
  /**
    * @param options - Set of configurable options to specify the settings of the
    * BrowserFetcher.
    * @returns A new BrowserFetcher instance.
    */
  def createBrowserFetcher(options: BrowserFetcherOptions): BrowserFetcher = js.native
  
  /**
    * @param options - Set of configurable options to set on the browser.
    * @returns The default flags that Chromium will be launched with.
    */
  def defaultArgs(): js.Array[String] = js.native
  def defaultArgs(options: BrowserLaunchArgumentOptions): js.Array[String] = js.native
  
  /**
    * @remarks
    * **NOTE** `puppeteer.executablePath()` is affected by the
    * `PUPPETEER_EXECUTABLE_PATH` and `PUPPETEER_CHROMIUM_REVISION` environment
    * variables.
    *
    * @returns A path where Puppeteer expects to find the bundled browser. The
    * browser binary might not be there if the download was skipped with the
    * `PUPPETEER_SKIP_DOWNLOAD` environment variable.
    */
  def executablePath(): String = js.native
  def executablePath(channel: String): String = js.native
  
  /* Excluded from this release type: _productName */
  /* Excluded from this release type: _productName */
  /**
    * Launches puppeteer and launches a browser instance with given arguments and
    * options when specified.
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
    * **NOTE** Puppeteer can also be used to control the Chrome browser, but it
    * works best with the version of Chromium it is bundled with. There is no
    * guarantee it will work with any other version. Use `executablePath` option
    * with extreme caution. If Google Chrome (rather than Chromium) is preferred,
    * a {@link https://www.google.com/chrome/browser/canary.html | Chrome Canary}
    * or
    * {@link https://www.chromium.org/getting-involved/dev-channel | Dev Channel}
    * build is suggested. In `puppeteer.launch([options])`, any mention of
    * Chromium also applies to Chrome. See
    * {@link https://www.howtogeek.com/202825/what%E2%80%99s-the-difference-between-chromium-and-chrome/ | this article}
    * for a description of the differences between Chromium and Chrome.
    * {@link https://chromium.googlesource.com/chromium/src/+/lkgr/docs/chromium_browser_vs_google_chrome.md | This article}
    * describes some differences for Linux users.
    *
    * @param options - Set of configurable options to set on the browser.
    * @returns Promise which resolves to browser instance.
    */
  def launch(): js.Promise[Browser] = js.native
  def launch(options: PuppeteerLaunchOptions): js.Promise[Browser] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: _launcher */
  /**
    * The name of the browser that is under automation (`"chrome"` or
    * `"firefox"`)
    *
    * @remarks
    * The product is set by the `PUPPETEER_PRODUCT` environment variable or the
    * `product` option in `puppeteer.launch([options])` and defaults to `chrome`.
    * Firefox support is experimental.
    */
  def product: String = js.native
}
