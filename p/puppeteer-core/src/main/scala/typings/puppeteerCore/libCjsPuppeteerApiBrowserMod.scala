package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Browser.PermissionType
import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.node.childProcessMod.ChildProcess
import typings.puppeteerCore.libCjsPuppeteerApiBrowserContextMod.BrowserContext
import typings.puppeteerCore.libCjsPuppeteerApiPageMod.Page
import typings.puppeteerCore.libCjsPuppeteerCommonEventEmitterMod.EventEmitter
import typings.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target
import typings.puppeteerCore.puppeteerCoreStrings.camera_
import typings.puppeteerCore.puppeteerCoreStrings.disconnected
import typings.puppeteerCore.puppeteerCoreStrings.targetchanged_
import typings.puppeteerCore.puppeteerCoreStrings.targetcreated
import typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerApiBrowserMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api/Browser", "Browser")
  @js.native
  /**
    * @internal
    */
  open class Browser () extends EventEmitter {
    
    /**
      * @internal
      */
    def _attach(): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    def _createPageInContext(): js.Promise[Page] = js.native
    def _createPageInContext(contextId: String): js.Promise[Page] = js.native
    
    /**
      * @internal
      */
    def _detach(): Unit = js.native
    
    /**
      * @internal
      */
    def _disposeContext(): js.Promise[Unit] = js.native
    def _disposeContext(contextId: String): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    def _getIsPageTargetCallback(): js.UndefOr[IsPageTargetCallback] = js.native
    
    /**
      * @internal
      */
    def _targets: Map[String, Target] = js.native
    
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
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api/Browser", "WEB_PERMISSION_TO_PROTOCOL_PERMISSION")
  @js.native
  val WEB_PERMISSION_TO_PROTOCOL_PERMISSION: Map[Permission, PermissionType] = js.native
  
  type BrowserCloseCallback = js.Function0[js.Promise[Unit] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.targetchanged_
    - typings.puppeteerCore.puppeteerCoreStrings.targetcreated
    - typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
  */
  trait BrowserContextEmittedEvents extends StObject
  object BrowserContextEmittedEvents {
    
    /**
      * Emitted when the url of a target inside the browser context changes.
      * Contains a {@link Target} instance.
      */
    inline def TargetChanged: targetchanged_ = "targetchanged".asInstanceOf[targetchanged_]
    
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
  
  trait BrowserContextOptions extends StObject {
    
    /**
      * Bypass the proxy for the given list of hosts.
      */
    var proxyBypassList: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Proxy server with optional port to use for all requests.
      * Username and password can be set in `Page.authenticate`.
      */
    var proxyServer: js.UndefOr[String] = js.undefined
  }
  object BrowserContextOptions {
    
    inline def apply(): BrowserContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserContextOptions] (val x: Self) extends AnyVal {
      
      inline def setProxyBypassList(value: js.Array[String]): Self = StObject.set(x, "proxyBypassList", value.asInstanceOf[js.Any])
      
      inline def setProxyBypassListUndefined: Self = StObject.set(x, "proxyBypassList", js.undefined)
      
      inline def setProxyBypassListVarargs(value: String*): Self = StObject.set(x, "proxyBypassList", js.Array(value*))
      
      inline def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
      
      inline def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.disconnected
    - typings.puppeteerCore.puppeteerCoreStrings.targetchanged_
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
    inline def TargetChanged: targetchanged_ = "targetchanged".asInstanceOf[targetchanged_]
    
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
  
  type IsPageTargetCallback = js.Function1[/* target */ TargetInfo, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.geolocation
    - typings.puppeteerCore.puppeteerCoreStrings.midi
    - typings.puppeteerCore.puppeteerCoreStrings.notifications
    - typings.puppeteerCore.puppeteerCoreStrings.camera_
    - typings.puppeteerCore.puppeteerCoreStrings.microphone
    - typings.puppeteerCore.puppeteerCoreStrings.`background-sync`
    - typings.puppeteerCore.puppeteerCoreStrings.`ambient-light-sensor`
    - typings.puppeteerCore.puppeteerCoreStrings.accelerometer
    - typings.puppeteerCore.puppeteerCoreStrings.gyroscope
    - typings.puppeteerCore.puppeteerCoreStrings.magnetometer
    - typings.puppeteerCore.puppeteerCoreStrings.`accessibility-events`
    - typings.puppeteerCore.puppeteerCoreStrings.`clipboard-read`
    - typings.puppeteerCore.puppeteerCoreStrings.`clipboard-write`
    - typings.puppeteerCore.puppeteerCoreStrings.`payment-handler`
    - typings.puppeteerCore.puppeteerCoreStrings.`persistent-storage`
    - typings.puppeteerCore.puppeteerCoreStrings.`idle-detection`
    - typings.puppeteerCore.puppeteerCoreStrings.`midi-sysex`
  */
  trait Permission extends StObject
  object Permission {
    
    inline def accelerometer: typings.puppeteerCore.puppeteerCoreStrings.accelerometer = "accelerometer".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.accelerometer]
    
    inline def `accessibility-events`: typings.puppeteerCore.puppeteerCoreStrings.`accessibility-events` = "accessibility-events".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`accessibility-events`]
    
    inline def `ambient-light-sensor`: typings.puppeteerCore.puppeteerCoreStrings.`ambient-light-sensor` = "ambient-light-sensor".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`ambient-light-sensor`]
    
    inline def `background-sync`: typings.puppeteerCore.puppeteerCoreStrings.`background-sync` = "background-sync".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`background-sync`]
    
    inline def camera: camera_ = "camera".asInstanceOf[camera_]
    
    inline def `clipboard-read`: typings.puppeteerCore.puppeteerCoreStrings.`clipboard-read` = "clipboard-read".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`clipboard-read`]
    
    inline def `clipboard-write`: typings.puppeteerCore.puppeteerCoreStrings.`clipboard-write` = "clipboard-write".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`clipboard-write`]
    
    inline def geolocation: typings.puppeteerCore.puppeteerCoreStrings.geolocation = "geolocation".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.geolocation]
    
    inline def gyroscope: typings.puppeteerCore.puppeteerCoreStrings.gyroscope = "gyroscope".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.gyroscope]
    
    inline def `idle-detection`: typings.puppeteerCore.puppeteerCoreStrings.`idle-detection` = "idle-detection".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`idle-detection`]
    
    inline def magnetometer: typings.puppeteerCore.puppeteerCoreStrings.magnetometer = "magnetometer".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.magnetometer]
    
    inline def microphone: typings.puppeteerCore.puppeteerCoreStrings.microphone = "microphone".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.microphone]
    
    inline def midi: typings.puppeteerCore.puppeteerCoreStrings.midi = "midi".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.midi]
    
    inline def `midi-sysex`: typings.puppeteerCore.puppeteerCoreStrings.`midi-sysex` = "midi-sysex".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`midi-sysex`]
    
    inline def notifications: typings.puppeteerCore.puppeteerCoreStrings.notifications = "notifications".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.notifications]
    
    inline def `payment-handler`: typings.puppeteerCore.puppeteerCoreStrings.`payment-handler` = "payment-handler".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`payment-handler`]
    
    inline def `persistent-storage`: typings.puppeteerCore.puppeteerCoreStrings.`persistent-storage` = "persistent-storage".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`persistent-storage`]
  }
  
  type TargetFilterCallback = js.Function1[/* target */ TargetInfo, Boolean]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitForTargetOptions] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
