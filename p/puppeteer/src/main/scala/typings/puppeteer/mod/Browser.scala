package typings.puppeteer.mod

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "Browser")
@js.native
open class Browser () extends EventEmitter {
  
  /**
    * Returns an array of all open browser contexts. In a newly created browser, this will
    * return a single instance of {@link BrowserContext}.
    */
  def browserContexts(): js.Array[BrowserContext] = js.native
  
  /**
    * Closes Chromium and all of its pages (if any were opened). The {@link Browser} object
    * itself is considered to be disposed and cannot be used anymore.
    */
  def close(): js.Promise[Unit] = js.native
  
  /* Excluded from this release type: _getIsPageTargetCallback */
  /**
    * Creates a new incognito browser context. This won't share cookies/cache with other
    * browser contexts.
    *
    * @example
    *
    * ```ts
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   // Create a new incognito browser context.
    *   const context = await browser.createIncognitoBrowserContext();
    *   // Create a new page in a pristine context.
    *   const page = await context.newPage();
    *   // Do stuff
    *   await page.goto('https://example.com');
    * })();
    * ```
    */
  def createIncognitoBrowserContext(): js.Promise[BrowserContext] = js.native
  def createIncognitoBrowserContext(options: BrowserContextOptions): js.Promise[BrowserContext] = js.native
  
  /**
    * Returns the default browser context. The default browser context cannot be closed.
    */
  def defaultBrowserContext(): BrowserContext = js.native
  
  /**
    * Disconnects Puppeteer from the browser, but leaves the Chromium process running.
    * After calling `disconnect`, the {@link Browser} object is considered disposed and
    * cannot be used anymore.
    */
  def disconnect(): Unit = js.native
  
  /**
    * Indicates that the browser is connected.
    */
  def isConnected(): Boolean = js.native
  
  /**
    * Promise which resolves to a new {@link Page} object. The Page is created in
    * a default browser context.
    */
  def newPage(): js.Promise[Page] = js.native
  
  /**
    * An array of all open pages inside the Browser.
    *
    * @remarks
    *
    * In case of multiple browser contexts, returns an array with all the pages in all
    * browser contexts. Non-visible pages, such as `"background_page"`, will not be listed
    * here. You can find them using {@link Target.page}.
    */
  def pages(): js.Promise[js.Array[Page]] = js.native
  
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: _attach */
  /* Excluded from this release type: _detach */
  /* Excluded from this release type: _targets */
  /**
    * The spawned browser process. Returns `null` if the browser instance was created with
    * {@link Puppeteer.connect}.
    */
  def process(): ChildProcess | Null = js.native
  
  /**
    * The target associated with the browser.
    */
  def target(): Target = js.native
  
  /* Excluded from this release type: _createPageInContext */
  /**
    * All active targets inside the Browser. In case of multiple browser contexts, returns
    * an array with all the targets in all browser contexts.
    */
  def targets(): js.Array[Target] = js.native
  
  /**
    * The browser's original user agent. Pages can override the browser user agent with
    * {@link Page.setUserAgent}.
    */
  def userAgent(): js.Promise[String] = js.native
  
  /**
    * A string representing the browser name and version.
    *
    * @remarks
    *
    * For headless Chromium, this is similar to `HeadlessChrome/61.0.3153.0`. For
    * non-headless, this is similar to `Chrome/61.0.3153.0`.
    *
    * The format of browser.version() might change with future releases of Chromium.
    */
  def version(): js.Promise[String] = js.native
  
  /**
    * Searches for a target in all browser contexts.
    *
    * @param predicate - A function to be run for every target.
    * @returns The first target found that matches the `predicate` function.
    *
    * @example
    *
    * An example of finding a target for a page opened via `window.open`:
    *
    * ```ts
    * await page.evaluate(() => window.open('https://www.example.com/'));
    * const newWindowTarget = await browser.waitForTarget(
    *   target => target.url() === 'https://www.example.com/'
    * );
    * ```
    */
  def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]]): js.Promise[Target] = js.native
  def waitForTarget(
    predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]],
    options: WaitForTargetOptions
  ): js.Promise[Target] = js.native
  
  /* Excluded from this release type: _disposeContext */
  /**
    * The browser websocket endpoint which can be used as an argument to
    * {@link Puppeteer.connect}.
    *
    * @returns The Browser websocket url.
    *
    * @remarks
    *
    * The format is `ws://${host}:${port}/devtools/browser/<id>`.
    *
    * You can find the `webSocketDebuggerUrl` from `http://${host}:${port}/json/version`.
    * Learn more about the
    * {@link https://chromedevtools.github.io/devtools-protocol | devtools protocol} and
    * the {@link
    * https://chromedevtools.github.io/devtools-protocol/#how-do-i-access-the-browser-target
    * | browser endpoint}.
    */
  def wsEndpoint(): String = js.native
}
