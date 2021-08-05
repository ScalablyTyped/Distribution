package typings.puppeteerCore

import typings.node.childProcessMod.ChildProcess
import typings.puppeteerCore.anon.Timeout
import typings.puppeteerCore.connectionMod.Connection
import typings.puppeteerCore.eventEmitterMod.EventEmitter
import typings.puppeteerCore.pageMod.Page
import typings.puppeteerCore.puppeteerCoreStrings.disconnected
import typings.puppeteerCore.puppeteerCoreStrings.targetchanged
import typings.puppeteerCore.puppeteerCoreStrings.targetcreated
import typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
import typings.puppeteerCore.puppeteerViewportMod.Viewport
import typings.puppeteerCore.targetMod.Target
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Browser", "Browser")
  @js.native
  class Browser protected () extends EventEmitter {
    /**
      * @internal
      */
    def this(connection: Connection, contextIds: js.Array[String], ignoreHTTPSErrors: Boolean) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport
    ) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Unit,
      process: ChildProcess
    ) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      process: ChildProcess
    ) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Unit,
      process: Unit,
      closeCallback: BrowserCloseCallback
    ) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Unit,
      process: ChildProcess,
      closeCallback: BrowserCloseCallback
    ) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      process: Unit,
      closeCallback: BrowserCloseCallback
    ) = this()
    def this(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      process: ChildProcess,
      closeCallback: BrowserCloseCallback
    ) = this()
    
    /* private */ var _closeCallback: js.Any = js.native
    
    /* private */ var _connection: js.Any = js.native
    
    /* private */ var _contexts: js.Any = js.native
    
    /**
      * @internal
      * Used by BrowserContext directly so cannot be marked private.
      */
    def _createPageInContext(): js.Promise[Page] = js.native
    def _createPageInContext(contextId: String): js.Promise[Page] = js.native
    
    /* private */ var _defaultContext: js.Any = js.native
    
    /* private */ var _defaultViewport: js.Any = js.native
    
    /**
      * @internal
      * Used by BrowserContext directly so cannot be marked private.
      */
    def _disposeContext(): js.Promise[Unit] = js.native
    def _disposeContext(contextId: String): js.Promise[Unit] = js.native
    
    /* private */ var _getVersion: js.Any = js.native
    
    /* private */ var _ignoreHTTPSErrors: js.Any = js.native
    
    /* private */ var _process: js.Any = js.native
    
    /* private */ var _targetCreated: js.Any = js.native
    
    /* private */ var _targetDestroyed: js.Any = js.native
    
    /* private */ var _targetInfoChanged: js.Any = js.native
    
    /**
      * @internal
      * Used in Target.ts directly so cannot be marked private.
      */
    var _targets: Map[String, Target] = js.native
    
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
    
    /**
      * Creates a new incognito browser context. This won't share cookies/cache with other
      * browser contexts.
      *
      * @example
      * ```js
      * (async () => {
      *  const browser = await puppeteer.launch();
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
      * Creates a {@link Page} in the default browser context.
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
    
    /**
      * The spawned browser process. Returns `null` if the browser instance was created with
      * {@link Puppeteer.connect}.
      */
    def process(): ChildProcess | Null = js.native
    
    /**
      * The target associated with the browser.
      */
    def target(): Target = js.native
    
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
      * ```js
      * await page.evaluate(() => window.open('https://www.example.com/'));
      * const newWindowTarget = await browser.waitForTarget(target => target.url() === 'https://www.example.com/');
      * ```
      */
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean]): js.Promise[Target] = js.native
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean], options: WaitForTargetOptions): js.Promise[Target] = js.native
    
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
  /* static members */
  object Browser {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Browser", "Browser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def create(connection: Connection, contextIds: js.Array[String], ignoreHTTPSErrors: Boolean): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Unit,
      process: Unit,
      closeCallback: BrowserCloseCallback
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Unit,
      process: ChildProcess
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Unit,
      process: ChildProcess,
      closeCallback: BrowserCloseCallback
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      process: Unit,
      closeCallback: BrowserCloseCallback
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      process: ChildProcess
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
    inline def create(
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      process: ChildProcess,
      closeCallback: BrowserCloseCallback
    ): js.Promise[Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Browser]]
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Browser", "BrowserContext")
  @js.native
  class BrowserContext protected () extends EventEmitter {
    /**
      * @internal
      */
    def this(connection: Connection, browser: Browser) = this()
    def this(connection: Connection, browser: Browser, contextId: String) = this()
    
    /* private */ var _browser: js.Any = js.native
    
    /* private */ var _connection: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /**
      * The browser this browser context belongs to.
      */
    def browser(): Browser = js.native
    
    /**
      * Clears all permission overrides for the browser context.
      *
      * @example
      * ```js
      * const context = browser.defaultBrowserContext();
      * context.overridePermissions('https://example.com', ['clipboard-read']);
      * // do stuff ..
      * context.clearPermissionOverrides();
      * ```
      */
    def clearPermissionOverrides(): js.Promise[Unit] = js.native
    
    /**
      * Closes the browser context. All the targets that belong to the browser context
      * will be closed.
      *
      * @remarks
      * Only incognito browser contexts can be closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Returns whether BrowserContext is incognito.
      * The default browser context is the only non-incognito browser context.
      *
      * @remarks
      * The default browser context cannot be closed.
      */
    def isIncognito(): Boolean = js.native
    
    /**
      * Creates a new page in the browser context.
      */
    def newPage(): js.Promise[Page] = js.native
    
    /**
      * @example
      * ```js
      * const context = browser.defaultBrowserContext();
      * await context.overridePermissions('https://html5demos.com', ['geolocation']);
      * ```
      *
      * @param origin - The origin to grant permissions to, e.g. "https://example.com".
      * @param permissions - An array of permissions to grant.
      * All permissions that are not listed here will be automatically denied.
      */
    def overridePermissions(origin: String, permissions: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * An array of all pages inside the browser context.
      *
      * @returns Promise which resolves to an array of all open pages.
      * Non visible pages, such as `"background_page"`, will not be listed here.
      * You can find them using {@link Target.page | the target page}.
      */
    def pages(): js.Promise[js.Array[Page]] = js.native
    
    /**
      * An array of all active targets inside the browser context.
      */
    def targets(): js.Array[Target] = js.native
    
    /**
      * This searches for a target in this specific browser context.
      *
      * @example
      * An example of finding a target for a page opened via `window.open`:
      * ```js
      * await page.evaluate(() => window.open('https://www.example.com/'));
      * const newWindowTarget = await browserContext.waitForTarget(target => target.url() === 'https://www.example.com/');
      * ```
      *
      * @param predicate - A function to be run for every target
      * @param options - An object of options. Accepts a timout,
      * which is the maximum wait time in milliseconds.
      * Pass `0` to disable the timeout. Defaults to 30 seconds.
      * @returns Promise which resolves to the first target found
      * that matches the `predicate` function.
      */
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean]): js.Promise[Target] = js.native
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean], options: Timeout): js.Promise[Target] = js.native
  }
  
  type BrowserCloseCallback = js.Function0[js.Promise[Unit] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.targetchanged
    - typings.puppeteerCore.puppeteerCoreStrings.targetcreated
    - typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
  */
  trait BrowserContextEmittedEvents extends StObject
  object BrowserContextEmittedEvents {
    
    /**
      * Emitted when the url of a target inside the browser context changes.
      * Contains a {@link Target} instance.
      */
    inline def TargetChanged: targetchanged = "targetchanged".asInstanceOf[targetchanged]
    
    /**
      * Emitted when a target is created within the browser context, for example
      * when a new page is opened by
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Window/open | window.open}
      * or by {@link BrowserContext.newPage | browserContext.newPage}
      *
      * Contains a {@link Target} instance.
      */
    inline def TargetCreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
    
    /**
      * Emitted when a target is destroyed within the browser context, for example
      * when a page is closed. Contains a {@link Target} instance.
      */
    inline def TargetDestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.disconnected
    - typings.puppeteerCore.puppeteerCoreStrings.targetchanged
    - typings.puppeteerCore.puppeteerCoreStrings.targetcreated
    - typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
  */
  trait BrowserEmittedEvents extends StObject
  object BrowserEmittedEvents {
    
    /**
      * Emitted when Puppeteer gets disconnected from the Chromium instance. This
      * might happen because of one of the following:
      *
      * - Chromium is closed or crashed
      *
      * - The {@link Browser.disconnect | browser.disconnect } method was called.
      */
    inline def Disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
    
    /**
      * Emitted when the url of a target changes. Contains a {@link Target} instance.
      *
      * @remarks
      *
      * Note that this includes target changes in incognito browser contexts.
      */
    inline def TargetChanged: targetchanged = "targetchanged".asInstanceOf[targetchanged]
    
    /**
      * Emitted when a target is created, for example when a new page is opened by
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Window/open | window.open}
      * or by {@link Browser.newPage | browser.newPage}
      *
      * Contains a {@link Target} instance.
      *
      * @remarks
      *
      * Note that this includes target creations in incognito browser contexts.
      */
    inline def TargetCreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
    
    /**
      * Emitted when a target is destroyed, for example when a page is closed.
      * Contains a {@link Target} instance.
      *
      * @remarks
      *
      * Note that this includes target destructions in incognito browser contexts.
      */
    inline def TargetDestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
  }
  
  trait WaitForTargetOptions extends StObject {
    
    /**
      * Maximum wait time in milliseconds. Pass `0` to disable the timeout.
      * @defaultValue 30 seconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object WaitForTargetOptions {
    
    inline def apply(): WaitForTargetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForTargetOptions]
    }
    
    extension [Self <: WaitForTargetOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
