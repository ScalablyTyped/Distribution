package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Network.Cookie
import typings.devtoolsProtocol.mod.Protocol.Network.CookieParam
import typings.devtoolsProtocol.mod.Protocol.Network.DeleteCookiesRequest
import typings.node.Buffer
import typings.puppeteerCore.anon.ClickCount
import typings.puppeteerCore.anon.Content
import typings.puppeteerCore.anon.Delay
import typings.puppeteerCore.anon.Hidden
import typings.puppeteerCore.anon.IsScreenUnlocked
import typings.puppeteerCore.anon.Path
import typings.puppeteerCore.anon.PollingTimeout
import typings.puppeteerCore.anon.RunBeforeUnload
import typings.puppeteerCore.anon.Timeout
import typings.puppeteerCore.anon.Viewport
import typings.puppeteerCore.anon.Visible
import typings.puppeteerCore.anon.WaitForOptionsrefererstriReferer
import typings.puppeteerCore.commonAccessibilityMod.Accessibility
import typings.puppeteerCore.commonBrowserMod.Browser
import typings.puppeteerCore.commonBrowserMod.BrowserContext
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonCoverageMod.Coverage
import typings.puppeteerCore.commonEvalTypesMod.EvaluateFn
import typings.puppeteerCore.commonEvalTypesMod.EvaluateFnReturnType
import typings.puppeteerCore.commonEvalTypesMod.EvaluateHandleFn
import typings.puppeteerCore.commonEvalTypesMod.SerializableOrJSHandle
import typings.puppeteerCore.commonEvalTypesMod.UnwrapPromiseLike
import typings.puppeteerCore.commonEvalTypesMod.WrapElementHandle
import typings.puppeteerCore.commonEventEmitterMod.EventEmitter
import typings.puppeteerCore.commonFileChooserMod.FileChooser
import typings.puppeteerCore.commonFrameManagerMod.Frame
import typings.puppeteerCore.commonHttprequestMod.HTTPRequest
import typings.puppeteerCore.commonHttpresponseMod.HTTPResponse
import typings.puppeteerCore.commonInputMod.Keyboard
import typings.puppeteerCore.commonInputMod.Mouse
import typings.puppeteerCore.commonInputMod.Touchscreen
import typings.puppeteerCore.commonJshandleMod.ElementHandle
import typings.puppeteerCore.commonJshandleMod.JSHandle
import typings.puppeteerCore.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import typings.puppeteerCore.commonNetworkManagerMod.Credentials
import typings.puppeteerCore.commonPdfoptionsMod.PDFOptions
import typings.puppeteerCore.commonTargetMod.Target
import typings.puppeteerCore.commonTracingMod.Tracing
import typings.puppeteerCore.commonWebWorkerMod.WebWorker
import typings.puppeteerCore.puppeteerCoreStrings.achromatopsia
import typings.puppeteerCore.puppeteerCoreStrings.blurredVision
import typings.puppeteerCore.puppeteerCoreStrings.close
import typings.puppeteerCore.puppeteerCoreStrings.console
import typings.puppeteerCore.puppeteerCoreStrings.deuteranopia
import typings.puppeteerCore.puppeteerCoreStrings.dialog
import typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import typings.puppeteerCore.puppeteerCoreStrings.error
import typings.puppeteerCore.puppeteerCoreStrings.frameattached
import typings.puppeteerCore.puppeteerCoreStrings.framedetached
import typings.puppeteerCore.puppeteerCoreStrings.framenavigated
import typings.puppeteerCore.puppeteerCoreStrings.jpeg
import typings.puppeteerCore.puppeteerCoreStrings.load
import typings.puppeteerCore.puppeteerCoreStrings.metrics
import typings.puppeteerCore.puppeteerCoreStrings.none
import typings.puppeteerCore.puppeteerCoreStrings.pageerror
import typings.puppeteerCore.puppeteerCoreStrings.png
import typings.puppeteerCore.puppeteerCoreStrings.popup
import typings.puppeteerCore.puppeteerCoreStrings.protanopia
import typings.puppeteerCore.puppeteerCoreStrings.request
import typings.puppeteerCore.puppeteerCoreStrings.requestfailed
import typings.puppeteerCore.puppeteerCoreStrings.requestfinished
import typings.puppeteerCore.puppeteerCoreStrings.response
import typings.puppeteerCore.puppeteerCoreStrings.tritanopia
import typings.puppeteerCore.puppeteerCoreStrings.workercreated
import typings.puppeteerCore.puppeteerCoreStrings.workerdestroyed
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonPageMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Page", "Page")
  @js.native
  class Page protected () extends EventEmitter {
    /**
      * @internal
      */
    def this(client: CDPSession, target: Target, ignoreHTTPSErrors: Boolean) = this()
    
    /**
      * Runs `document.querySelector` within the page. If no element matches the
      * selector, the return value resolves to `null`.
      *
      * @remarks
      * Shortcut for {@link Frame.$ | Page.mainFrame().$(selector) }.
      *
      * @param selector - A
      * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
      * to query page for.
      */
    @JSName("$")
    def $(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * This method runs `document.querySelector` within the page and passes the
      * result as the first argument to the `pageFunction`.
      *
      * @remarks
      *
      * If no element is found matching `selector`, the method will throw an error.
      *
      * If `pageFunction` returns a promise `$eval` will wait for the promise to
      * resolve and then return its value.
      *
      * @example
      *
      * ```
      * const searchValue = await page.$eval('#search', el => el.value);
      * const preloadHref = await page.$eval('link[rel=preload]', el => el.href);
      * const html = await page.$eval('.main-container', el => el.outerHTML);
      * ```
      *
      * If you are using TypeScript, you may have to provide an explicit type to the
      * first argument of the `pageFunction`.
      * By default it is typed as `Element`, but you may need to provide a more
      * specific sub-type:
      *
      * @example
      *
      * ```
      * // if you don't provide HTMLInputElement here, TS will error
      * // as `value` is not on `Element`
      * const searchValue = await page.$eval('#search', (el: HTMLInputElement) => el.value);
      * ```
      *
      * The compiler should be able to infer the return type
      * from the `pageFunction` you provide. If it is unable to, you can use the generic
      * type to tell the compiler what return type you expect from `$eval`:
      *
      * @example
      *
      * ```
      * // The compiler can infer the return type in this case, but if it can't
      * // or if you want to be more explicit, provide it as the generic type.
      * const searchValue = await page.$eval<string>(
      *  '#search', (el: HTMLInputElement) => el.value
      * );
      * ```
      *
      * @param selector - the
      * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
      * to query for
      * @param pageFunction - the function to be evaluated in the page context.
      * Will be passed the result of `document.querySelector(selector)` as its
      * first argument.
      * @param args - any additional arguments to pass through to `pageFunction`.
      *
      * @returns The result of calling `pageFunction`. If it returns an element it
      * is wrapped in an {@link ElementHandle}, else the raw value itself is
      * returned.
      */
    @JSName("$eval")
    def $eval[ReturnType](
      selector: String,
      pageFunction: js.Function2[/* element */ Element, /* repeated */ js.Any, ReturnType | js.Promise[ReturnType]],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    @JSName("$$")
    def DollarDollar(selector: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    /**
      * This method runs `Array.from(document.querySelectorAll(selector))` within
      * the page and passes the result as the first argument to the `pageFunction`.
      *
      * @remarks
      *
      * If `pageFunction` returns a promise `$$eval` will wait for the promise to
      * resolve and then return its value.
      *
      * @example
      *
      * ```
      * // get the amount of divs on the page
      * const divCount = await page.$$eval('div', divs => divs.length);
      *
      * // get the text content of all the `.options` elements:
      * const options = await page.$$eval('div > span.options', options => {
      *   return options.map(option => option.textContent)
      * });
      * ```
      *
      * If you are using TypeScript, you may have to provide an explicit type to the
      * first argument of the `pageFunction`.
      * By default it is typed as `Element[]`, but you may need to provide a more
      * specific sub-type:
      *
      * @example
      *
      * ```
      * // if you don't provide HTMLInputElement here, TS will error
      * // as `value` is not on `Element`
      * await page.$$eval('input', (elements: HTMLInputElement[]) => {
      *   return elements.map(e => e.value);
      * });
      * ```
      *
      * The compiler should be able to infer the return type
      * from the `pageFunction` you provide. If it is unable to, you can use the generic
      * type to tell the compiler what return type you expect from `$$eval`:
      *
      * @example
      *
      * ```
      * // The compiler can infer the return type in this case, but if it can't
      * // or if you want to be more explicit, provide it as the generic type.
      * const allInputValues = await page.$$eval<string[]>(
      *  'input', (elements: HTMLInputElement[]) => elements.map(e => e.textContent)
      * );
      * ```
      *
      * @param selector the
      * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
      * to query for
      * @param pageFunction the function to be evaluated in the page context. Will
      * be passed the result of `Array.from(document.querySelectorAll(selector))`
      * as its first argument.
      * @param args any additional arguments to pass through to `pageFunction`.
      *
      * @returns The result of calling `pageFunction`. If it returns an element it
      * is wrapped in an {@link ElementHandle}, else the raw value itself is
      * returned.
      */
    @JSName("$$eval")
    def DollarDollareval[ReturnType](
      selector: String,
      pageFunction: js.Function2[
          /* elements */ js.Array[Element], 
          /* repeated */ js.Any, 
          ReturnType | js.Promise[ReturnType]
        ],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    var _accessibility: js.Any = js.native
    
    var _addConsoleMessage: js.Any = js.native
    
    var _buildMetricsObject: js.Any = js.native
    
    var _client: js.Any = js.native
    
    var _closed: js.Any = js.native
    
    var _coverage: js.Any = js.native
    
    var _disconnectPromise: js.Any = js.native
    
    var _emitMetrics: js.Any = js.native
    
    var _emulationManager: js.Any = js.native
    
    var _fileChooserInterceptors: js.Any = js.native
    
    var _frameManager: js.Any = js.native
    
    var _go: js.Any = js.native
    
    var _handleException: js.Any = js.native
    
    var _initialize: js.Any = js.native
    
    var _javascriptEnabled: js.Any = js.native
    
    var _keyboard: js.Any = js.native
    
    var _mouse: js.Any = js.native
    
    var _onBindingCalled: js.Any = js.native
    
    var _onConsoleAPI: js.Any = js.native
    
    var _onDialog: js.Any = js.native
    
    var _onFileChooser: js.Any = js.native
    
    var _onLogEntryAdded: js.Any = js.native
    
    var _onTargetCrashed: js.Any = js.native
    
    var _pageBindings: js.Any = js.native
    
    var _screenshotTask: js.Any = js.native
    
    var _screenshotTaskQueue: js.Any = js.native
    
    var _sessionClosePromise: js.Any = js.native
    
    var _target: js.Any = js.native
    
    var _timeoutSettings: js.Any = js.native
    
    var _touchscreen: js.Any = js.native
    
    var _tracing: js.Any = js.native
    
    var _viewport: js.Any = js.native
    
    var _workers: js.Any = js.native
    
    def accessibility: Accessibility = js.native
    
    def addScriptTag(options: Content): js.Promise[ElementHandle[Element]] = js.native
    
    def addStyleTag(options: Path): js.Promise[ElementHandle[Element]] = js.native
    
    def authenticate(credentials: Credentials): js.Promise[Unit] = js.native
    
    def bringToFront(): js.Promise[Unit] = js.native
    
    /**
      * @returns The browser this page belongs to.
      */
    def browser(): Browser = js.native
    
    /**
      * @returns The browser context that the page belongs to
      */
    def browserContext(): BrowserContext = js.native
    
    def click(selector: String): js.Promise[Unit] = js.native
    def click(selector: String, options: ClickCount): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(options: RunBeforeUnload): js.Promise[Unit] = js.native
    
    def content(): js.Promise[String] = js.native
    
    /**
      * If no URLs are specified, this method returns cookies for the current page
      * URL. If URLs are specified, only cookies for those URLs are returned.
      */
    def cookies(urls: String*): js.Promise[js.Array[Cookie]] = js.native
    
    def coverage: Coverage = js.native
    
    def deleteCookie(cookies: DeleteCookiesRequest*): js.Promise[Unit] = js.native
    
    def emulate(options: Viewport): js.Promise[Unit] = js.native
    
    /**
      * Emulates the idle state.
      * If no arguments set, clears idle state emulation.
      *
      * @example
      * ```js
      * // set idle emulation
      * await page.emulateIdleState({isUserActive: true, isScreenUnlocked: false});
      *
      * // do some checks here
      * ...
      *
      * // clear idle emulation
      * await page.emulateIdleState();
      * ```
      *
      * @param overrides Mock idle state. If not set, clears idle overrides
      * @param isUserActive Mock isUserActive
      * @param isScreenUnlocked Mock isScreenUnlocked
      */
    def emulateIdleState(): js.Promise[Unit] = js.native
    def emulateIdleState(overrides: IsScreenUnlocked): js.Promise[Unit] = js.native
    
    def emulateMediaFeatures(): js.Promise[Unit] = js.native
    def emulateMediaFeatures(features: js.Array[MediaFeature]): js.Promise[Unit] = js.native
    
    def emulateMediaType(): js.Promise[Unit] = js.native
    def emulateMediaType(`type`: String): js.Promise[Unit] = js.native
    
    def emulateTimezone(): js.Promise[Unit] = js.native
    def emulateTimezone(timezoneId: String): js.Promise[Unit] = js.native
    
    /**
      * Simulates the given vision deficiency on the page.
      *
      * @example
      * ```js
      * const puppeteer = require('puppeteer');
      *
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   await page.goto('https://v8.dev/blog/10-years');
      *
      *   await page.emulateVisionDeficiency('achromatopsia');
      *   await page.screenshot({ path: 'achromatopsia.png' });
      *
      *   await page.emulateVisionDeficiency('deuteranopia');
      *   await page.screenshot({ path: 'deuteranopia.png' });
      *
      *   await page.emulateVisionDeficiency('blurredVision');
      *   await page.screenshot({ path: 'blurred-vision.png' });
      *
      *   await browser.close();
      * })();
      * ```
      *
      * @param type - the type of deficiency to simulate, or `'none'` to reset.
      */
    def emulateVisionDeficiency(): js.Promise[Unit] = js.native
    def emulateVisionDeficiency(`type`: none | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia): js.Promise[Unit] = js.native
    
    /**
      * @remarks
      *
      * Evaluates a function in the page's context and returns the result.
      *
      * If the function passed to `page.evaluteHandle` returns a Promise, the
      * function will wait for the promise to resolve and return its value.
      *
      * @example
      *
      * ```js
      * const result = await frame.evaluate(() => {
      *   return Promise.resolve(8 * 7);
      * });
      * console.log(result); // prints "56"
      * ```
      *
      * You can pass a string instead of a function (although functions are
      * recommended as they are easier to debug and use with TypeScript):
      *
      * @example
      * ```
      * const aHandle = await page.evaluate('1 + 2');
      * ```
      *
      * To get the best TypeScript experience, you should pass in as the
      * generic the type of `pageFunction`:
      *
      * ```
      * const aHandle = await page.evaluate<() => number>(() => 2);
      * ```
      *
      * @example
      *
      * {@link ElementHandle} instances (including {@link JSHandle}s) can be passed
      * as arguments to the `pageFunction`:
      *
      * ```
      * const bodyHandle = await page.$('body');
      * const html = await page.evaluate(body => body.innerHTML, bodyHandle);
      * await bodyHandle.dispose();
      * ```
      *
      * @param pageFunction - a function that is run within the page
      * @param args - arguments to be passed to the pageFunction
      *
      * @returns the return value of `pageFunction`.
      */
    def evaluate[T /* <: EvaluateFn[js.Any] */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[UnwrapPromiseLike[EvaluateFnReturnType[T]]] = js.native
    
    /**
      * @remarks
      *
      * The only difference between {@link Page.evaluate | page.evaluate} and
      * `page.evaluateHandle` is that `evaluateHandle` will return the value
      * wrapped in an in-page object.
      *
      * If the function passed to `page.evaluteHandle` returns a Promise, the
      * function will wait for the promise to resolve and return its value.
      *
      * You can pass a string instead of a function (although functions are
      * recommended as they are easier to debug and use with TypeScript):
      *
      * @example
      * ```
      * const aHandle = await page.evaluateHandle('document')
      * ```
      *
      * @example
      * {@link JSHandle} instances can be passed as arguments to the `pageFunction`:
      * ```
      * const aHandle = await page.evaluateHandle(() => document.body);
      * const resultHandle = await page.evaluateHandle(body => body.innerHTML, aHandle);
      * console.log(await resultHandle.jsonValue());
      * await resultHandle.dispose();
      * ```
      *
      * Most of the time this function returns a {@link JSHandle},
      * but if `pageFunction` returns a reference to an element,
      * you instead get an {@link ElementHandle} back:
      *
      * @example
      * ```
      * const button = await page.evaluateHandle(() => document.querySelector('button'));
      * // can call `click` because `button` is an `ElementHandle`
      * await button.click();
      * ```
      *
      * The TypeScript definitions assume that `evaluateHandle` returns
      *  a `JSHandle`, but if you know it's going to return an
      * `ElementHandle`, pass it as the generic argument:
      *
      * ```
      * const button = await page.evaluateHandle<ElementHandle>(...);
      * ```
      *
      * @param pageFunction - a function that is run within the page
      * @param args - arguments to be passed to the pageFunction
      */
    def evaluateHandle[HandlerType /* <: JSHandle */](pageFunction: EvaluateHandleFn, args: SerializableOrJSHandle*): js.Promise[HandlerType] = js.native
    
    def evaluateOnNewDocument(pageFunction: String, args: js.Any*): js.Promise[Unit] = js.native
    def evaluateOnNewDocument(pageFunction: js.Function, args: js.Any*): js.Promise[Unit] = js.native
    
    def exposeFunction(name: String, puppeteerFunction: js.Function): js.Promise[Unit] = js.native
    
    def focus(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @returns An array of all frames attached to the page.
      */
    def frames(): js.Array[Frame] = js.native
    
    def goBack(): js.Promise[HTTPResponse | Null] = js.native
    def goBack(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
    
    def goForward(): js.Promise[HTTPResponse | Null] = js.native
    def goForward(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
    
    def goto(url: String): js.Promise[HTTPResponse] = js.native
    def goto(url: String, options: WaitForOptionsrefererstriReferer): js.Promise[HTTPResponse] = js.native
    
    def hover(selector: String): js.Promise[Unit] = js.native
    
    def isClosed(): Boolean = js.native
    
    /**
      * @returns `true` if the page has JavaScript enabled, `false` otherwise.
      */
    def isJavaScriptEnabled(): Boolean = js.native
    
    def keyboard: Keyboard = js.native
    
    /**
      * @returns The page's main frame.
      */
    def mainFrame(): Frame = js.native
    
    def metrics(): js.Promise[Metrics] = js.native
    
    def mouse: Mouse = js.native
    
    /**
      * Generatees a PDF of the page with the `print` CSS media type.
      * @remarks
      *
      * IMPORTANT: PDF generation is only supported in Chrome headless mode.
      *
      * To generate a PDF with the `screen` media type, call
      * {@link Page.emulateMediaType | `page.emulateMediaType('screen')`} before
      * calling `page.pdf()`.
      *
      * By default, `page.pdf()` generates a pdf with modified colors for printing.
      * Use the
      * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/-webkit-print-color-adjust | `-webkit-print-color-adjust`}
      * property to force rendering of exact colors.
      *
      *
      * @param options - options for generating the PDF.
      */
    def pdf(): js.Promise[Buffer] = js.native
    def pdf(options: PDFOptions): js.Promise[Buffer] = js.native
    
    /**
      * This method iterates the JavaScript heap and finds all objects with the
      * given prototype.
      *
      * @remarks
      *
      * @example
      *
      * ```js
      * // Create a Map object
      * await page.evaluate(() => window.map = new Map());
      * // Get a handle to the Map object prototype
      * const mapPrototype = await page.evaluateHandle(() => Map.prototype);
      * // Query all map instances into an array
      * const mapInstances = await page.queryObjects(mapPrototype);
      * // Count amount of map objects in heap
      * const count = await page.evaluate(maps => maps.length, mapInstances);
      * await mapInstances.dispose();
      * await mapPrototype.dispose();
      * ```
      * @param prototypeHandle - a handle to the object prototype.
      */
    def queryObjects(prototypeHandle: JSHandle): js.Promise[JSHandle] = js.native
    
    def reload(): js.Promise[HTTPResponse | Null] = js.native
    def reload(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
    
    def screenshot(): js.Promise[Buffer | String | Unit] = js.native
    def screenshot(options: ScreenshotOptions): js.Promise[Buffer | String | Unit] = js.native
    
    def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
    
    def setBypassCSP(enabled: Boolean): js.Promise[Unit] = js.native
    
    def setCacheEnabled(): js.Promise[Unit] = js.native
    def setCacheEnabled(enabled: Boolean): js.Promise[Unit] = js.native
    
    def setContent(html: String): js.Promise[Unit] = js.native
    def setContent(html: String, options: WaitForOptions): js.Promise[Unit] = js.native
    
    def setCookie(cookies: CookieParam*): js.Promise[Unit] = js.native
    
    /**
      * @param timeout - Maximum navigation time in milliseconds.
      */
    def setDefaultNavigationTimeout(timeout: Double): Unit = js.native
    
    /**
      * @param timeout - Maximum time in milliseconds.
      */
    def setDefaultTimeout(timeout: Double): Unit = js.native
    
    def setExtraHTTPHeaders(headers: Record[String, String]): js.Promise[Unit] = js.native
    
    /**
      * Sets the page's geolocation.
      *
      * @remarks
      * Consider using {@link BrowserContext.overridePermissions} to grant
      * permissions for the page to read its geolocation.
      *
      * @example
      * ```js
      * await page.setGeolocation({latitude: 59.95, longitude: 30.31667});
      * ```
      */
    def setGeolocation(options: GeolocationOptions): js.Promise[Unit] = js.native
    
    def setJavaScriptEnabled(enabled: Boolean): js.Promise[Unit] = js.native
    
    /**
      * @param enabled - When `true`, enables offline mode for the page.
      */
    def setOfflineMode(enabled: Boolean): js.Promise[Unit] = js.native
    
    /**
      * @param value - Whether to enable request interception.
      *
      * @remarks
      * Activating request interception enables {@link HTTPRequest.abort},
      * {@link HTTPRequest.continue} and {@link HTTPRequest.respond} methods.  This
      * provides the capability to modify network requests that are made by a page.
      *
      * Once request interception is enabled, every request will stall unless it's
      * continued, responded or aborted.
      *
      * **NOTE** Enabling request interception disables page caching.
      *
      * @example
      * An example of a naïve request interceptor that aborts all image requests:
      * ```js
      * const puppeteer = require('puppeteer');
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   await page.setRequestInterception(true);
      *   page.on('request', interceptedRequest => {
      *     if (interceptedRequest.url().endsWith('.png') ||
      *         interceptedRequest.url().endsWith('.jpg'))
      *       interceptedRequest.abort();
      *     else
      *       interceptedRequest.continue();
      *     });
      *   await page.goto('https://example.com');
      *   await browser.close();
      * })();
      * ```
      */
    def setRequestInterception(value: Boolean): js.Promise[Unit] = js.native
    
    def setUserAgent(userAgent: String): js.Promise[Unit] = js.native
    
    def setViewport(viewport: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport): js.Promise[Unit] = js.native
    
    def tap(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @returns A target this page was created from.
      */
    def target(): Target = js.native
    
    def title(): js.Promise[String] = js.native
    
    def touchscreen: Touchscreen = js.native
    
    def tracing: Tracing = js.native
    
    def `type`(selector: String, text: String): js.Promise[Unit] = js.native
    def `type`(selector: String, text: String, options: Delay): js.Promise[Unit] = js.native
    
    def url(): String = js.native
    
    def viewport(): typings.puppeteerCore.commonPuppeteerViewportMod.Viewport | Null = js.native
    
    def waitFor(selectorOrFunctionOrTimeout: String, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    /**
      * @remarks
      *
      * This method behaves differently depending on the first parameter. If it's a
      * `string`, it will be treated as a `selector` or `xpath` (if the string
      * starts with `//`). This method then is a shortcut for
      * {@link Page.waitForSelector} or {@link Page.waitForXPath}.
      *
      * If the first argument is a function this method is a shortcut for
      * {@link Page.waitForFunction}.
      *
      * If the first argument is a `number`, it's treated as a timeout in
      * milliseconds and the method returns a promise which resolves after the
      * timeout.
      *
      * @param selectorOrFunctionOrTimeout - a selector, predicate or timeout to
      * wait for.
      * @param options - optional waiting parameters.
      * @param args - arguments to pass to `pageFunction`.
      *
      * @deprecated Don't use this method directly. Instead use the more explicit
      * methods available: {@link Page.waitForSelector},
      * {@link Page.waitForXPath}, {@link Page.waitForFunction} or
      * {@link Page.waitForTimeout}.
      */
    def waitFor(selectorOrFunctionOrTimeout: String, options: Hidden, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitFor(selectorOrFunctionOrTimeout: js.Function, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitFor(selectorOrFunctionOrTimeout: js.Function, options: Hidden, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitFor(selectorOrFunctionOrTimeout: Double, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitFor(selectorOrFunctionOrTimeout: Double, options: Hidden, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    
    /**
      * @param options - Optional waiting parameters
      * @returns Resolves after a page requests a file picker.
      */
    def waitForFileChooser(): js.Promise[FileChooser] = js.native
    def waitForFileChooser(options: WaitTimeoutOptions): js.Promise[FileChooser] = js.native
    
    def waitForFunction(pageFunction: String, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: String, options: PollingTimeout, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: js.Function, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: js.Function, options: PollingTimeout, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    
    def waitForNavigation(): js.Promise[HTTPResponse | Null] = js.native
    def waitForNavigation(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
    
    def waitForRequest(urlOrPredicate: String): js.Promise[HTTPRequest] = js.native
    def waitForRequest(urlOrPredicate: String, options: Timeout): js.Promise[HTTPRequest] = js.native
    def waitForRequest(urlOrPredicate: js.Function): js.Promise[HTTPRequest] = js.native
    def waitForRequest(urlOrPredicate: js.Function, options: Timeout): js.Promise[HTTPRequest] = js.native
    
    def waitForResponse(urlOrPredicate: String): js.Promise[HTTPResponse] = js.native
    def waitForResponse(urlOrPredicate: String, options: Timeout): js.Promise[HTTPResponse] = js.native
    def waitForResponse(urlOrPredicate: js.Function): js.Promise[HTTPResponse] = js.native
    def waitForResponse(urlOrPredicate: js.Function, options: Timeout): js.Promise[HTTPResponse] = js.native
    
    def waitForSelector(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
    def waitForSelector(selector: String, options: Visible): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * Causes your script to wait for the given number of milliseconds.
      *
      * @remarks
      *
      * It's generally recommended to not wait for a number of seconds, but instead
      * use {@link Page.waitForSelector}, {@link Page.waitForXPath} or
      * {@link Page.waitForFunction} to wait for exactly the conditions you want.
      *
      * @example
      *
      * Wait for 1 second:
      *
      * ```
      * await page.waitForTimeout(1000);
      * ```
      *
      * @param milliseconds - the number of milliseconds to wait.
      */
    def waitForTimeout(milliseconds: Double): js.Promise[Unit] = js.native
    
    def waitForXPath(xpath: String): js.Promise[ElementHandle[Element] | Null] = js.native
    def waitForXPath(xpath: String, options: Visible): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * @returns all of the dedicated
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorkers}
      * associated with the page.
      */
    def workers(): js.Array[WebWorker] = js.native
  }
  /* static members */
  object Page {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Page", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    @scala.inline
    def create(client: CDPSession, target: Target, ignoreHTTPSErrors: Boolean): js.Promise[Page] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Page]]
    @scala.inline
    def create(
      client: CDPSession,
      target: Target,
      ignoreHTTPSErrors: Boolean,
      defaultViewport: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
    ): js.Promise[Page] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Page]]
  }
  
  trait GeolocationOptions extends StObject {
    
    /**
      * Optional non-negative accuracy value.
      */
    var accuracy: js.UndefOr[Double] = js.undefined
    
    /**
      * Longitude between -180 and 180.
      */
    var latitude: Double
    
    /**
      * Latitude between -90 and 90.
      */
    var longitude: Double
  }
  object GeolocationOptions {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): GeolocationOptions = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeolocationOptions]
    }
    
    @scala.inline
    implicit class GeolocationOptionsMutableBuilder[Self <: GeolocationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaFeature extends StObject {
    
    var name: String
    
    var value: String
  }
  object MediaFeature {
    
    @scala.inline
    def apply(name: String, value: String): MediaFeature = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaFeature]
    }
    
    @scala.inline
    implicit class MediaFeatureMutableBuilder[Self <: MediaFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metrics extends StObject {
    
    var Documents: js.UndefOr[Double] = js.undefined
    
    var Frames: js.UndefOr[Double] = js.undefined
    
    var JSEventListeners: js.UndefOr[Double] = js.undefined
    
    var JSHeapTotalSize: js.UndefOr[Double] = js.undefined
    
    var JSHeapUsedSize: js.UndefOr[Double] = js.undefined
    
    var LayoutCount: js.UndefOr[Double] = js.undefined
    
    var LayoutDuration: js.UndefOr[Double] = js.undefined
    
    var Nodes: js.UndefOr[Double] = js.undefined
    
    var RecalcStyleCount: js.UndefOr[Double] = js.undefined
    
    var RecalcStyleDuration: js.UndefOr[Double] = js.undefined
    
    var ScriptDuration: js.UndefOr[Double] = js.undefined
    
    var TaskDuration: js.UndefOr[Double] = js.undefined
    
    var Timestamp: js.UndefOr[Double] = js.undefined
  }
  object Metrics {
    
    @scala.inline
    def apply(): Metrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocuments(value: Double): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
      
      @scala.inline
      def setFrames(value: Double): Self = StObject.set(x, "Frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesUndefined: Self = StObject.set(x, "Frames", js.undefined)
      
      @scala.inline
      def setJSEventListeners(value: Double): Self = StObject.set(x, "JSEventListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSEventListenersUndefined: Self = StObject.set(x, "JSEventListeners", js.undefined)
      
      @scala.inline
      def setJSHeapTotalSize(value: Double): Self = StObject.set(x, "JSHeapTotalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSHeapTotalSizeUndefined: Self = StObject.set(x, "JSHeapTotalSize", js.undefined)
      
      @scala.inline
      def setJSHeapUsedSize(value: Double): Self = StObject.set(x, "JSHeapUsedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSHeapUsedSizeUndefined: Self = StObject.set(x, "JSHeapUsedSize", js.undefined)
      
      @scala.inline
      def setLayoutCount(value: Double): Self = StObject.set(x, "LayoutCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutCountUndefined: Self = StObject.set(x, "LayoutCount", js.undefined)
      
      @scala.inline
      def setLayoutDuration(value: Double): Self = StObject.set(x, "LayoutDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutDurationUndefined: Self = StObject.set(x, "LayoutDuration", js.undefined)
      
      @scala.inline
      def setNodes(value: Double): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
      
      @scala.inline
      def setRecalcStyleCount(value: Double): Self = StObject.set(x, "RecalcStyleCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecalcStyleCountUndefined: Self = StObject.set(x, "RecalcStyleCount", js.undefined)
      
      @scala.inline
      def setRecalcStyleDuration(value: Double): Self = StObject.set(x, "RecalcStyleDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecalcStyleDurationUndefined: Self = StObject.set(x, "RecalcStyleDuration", js.undefined)
      
      @scala.inline
      def setScriptDuration(value: Double): Self = StObject.set(x, "ScriptDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptDurationUndefined: Self = StObject.set(x, "ScriptDuration", js.undefined)
      
      @scala.inline
      def setTaskDuration(value: Double): Self = StObject.set(x, "TaskDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskDurationUndefined: Self = StObject.set(x, "TaskDuration", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.close
    - typings.puppeteerCore.puppeteerCoreStrings.console
    - typings.puppeteerCore.puppeteerCoreStrings.dialog
    - typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
    - typings.puppeteerCore.puppeteerCoreStrings.error
    - typings.puppeteerCore.puppeteerCoreStrings.frameattached
    - typings.puppeteerCore.puppeteerCoreStrings.framedetached
    - typings.puppeteerCore.puppeteerCoreStrings.framenavigated
    - typings.puppeteerCore.puppeteerCoreStrings.load
    - typings.puppeteerCore.puppeteerCoreStrings.metrics
    - typings.puppeteerCore.puppeteerCoreStrings.pageerror
    - typings.puppeteerCore.puppeteerCoreStrings.popup
    - typings.puppeteerCore.puppeteerCoreStrings.request
    - typings.puppeteerCore.puppeteerCoreStrings.requestfailed
    - typings.puppeteerCore.puppeteerCoreStrings.requestfinished
    - typings.puppeteerCore.puppeteerCoreStrings.response
    - typings.puppeteerCore.puppeteerCoreStrings.workercreated
    - typings.puppeteerCore.puppeteerCoreStrings.workerdestroyed
  */
  trait PageEmittedEvents extends StObject
  object PageEmittedEvents {
    
    /** Emitted when the page closes. */
    @scala.inline
    def Close: close = "close".asInstanceOf[close]
    
    /**
      * Emitted when JavaScript within the page calls one of console API methods,
      * e.g. `console.log` or `console.dir`. Also emitted if the page throws an
      * error or a warning.
      *
      * @remarks
      *
      * A `console` event provides a {@link ConsoleMessage} representing the
      * console message that was logged.
      *
      * @example
      * An example of handling `console` event:
      * ```js
      * page.on('console', msg => {
      *   for (let i = 0; i < msg.args().length; ++i)
      *    console.log(`${i}: ${msg.args()[i]}`);
      *  });
      *  page.evaluate(() => console.log('hello', 5, {foo: 'bar'}));
      * ```
      */
    @scala.inline
    def Console: console = "console".asInstanceOf[console]
    
    /**
      * Emitted when the JavaScript
      * {@link https://developer.mozilla.org/en-US/docs/Web/Events/DOMContentLoaded | DOMContentLoaded } event is dispatched.
      */
    @scala.inline
    def DOMContentLoaded: domcontentloaded_ = "domcontentloaded".asInstanceOf[domcontentloaded_]
    
    /**
      * Emitted when a JavaScript dialog appears, such as `alert`, `prompt`,
      * `confirm` or `beforeunload`. Puppeteer can respond to the dialog via
      * {@link Dialog.accept} or {@link Dialog.dismiss}.
      */
    @scala.inline
    def Dialog: dialog = "dialog".asInstanceOf[dialog]
    
    /**
      * Emitted when the page crashes. Will contain an `Error`.
      */
    @scala.inline
    def Error: error = "error".asInstanceOf[error]
    
    /** Emitted when a frame is attached. Will contain a {@link Frame}. */
    @scala.inline
    def FrameAttached: frameattached = "frameattached".asInstanceOf[frameattached]
    
    /** Emitted when a frame is detached. Will contain a {@link Frame}. */
    @scala.inline
    def FrameDetached: framedetached = "framedetached".asInstanceOf[framedetached]
    
    /** Emitted when a frame is navigated to a new URL. Will contain a {@link Frame}. */
    @scala.inline
    def FrameNavigated: framenavigated = "framenavigated".asInstanceOf[framenavigated]
    
    /**
      * Emitted when the JavaScript
      * {@link https://developer.mozilla.org/en-US/docs/Web/Events/load | load}
      * event is dispatched.
      */
    @scala.inline
    def Load: load = "load".asInstanceOf[load]
    
    /**
      * Emitted when the JavaScript code makes a call to `console.timeStamp`. For
      * the list of metrics see {@link Page.metrics | page.metrics}.
      *
      * @remarks
      * Contains an object with two properties:
      * - `title`: the title passed to `console.timeStamp`
      * - `metrics`: objec containing metrics as key/value pairs. The values will
      *   be `number`s.
      */
    @scala.inline
    def Metrics: metrics = "metrics".asInstanceOf[metrics]
    
    /**
      * Emitted when an uncaught exception happens within the page.
      * Contains an `Error`.
      */
    @scala.inline
    def PageError: pageerror = "pageerror".asInstanceOf[pageerror]
    
    /**
      * Emitted when the page opens a new tab or window.
      *
      * Contains a {@link Page} corresponding to the popup window.
      *
      * @example
      *
      * ```js
      * const [popup] = await Promise.all([
      *   new Promise(resolve => page.once('popup', resolve)),
      *   page.click('a[target=_blank]'),
      * ]);
      * ```
      *
      * ```js
      * const [popup] = await Promise.all([
      *   new Promise(resolve => page.once('popup', resolve)),
      *   page.evaluate(() => window.open('https://example.com')),
      * ]);
      * ```
      */
    @scala.inline
    def Popup: popup = "popup".asInstanceOf[popup]
    
    /**
      * Emitted when a page issues a request and contains a {@link HTTPRequest}.
      *
      * @remarks
      * The object is readonly. See {@Page.setRequestInterception} for intercepting
      * and mutating requests.
      */
    @scala.inline
    def Request: request = "request".asInstanceOf[request]
    
    /**
      * Emitted when a request fails, for example by timing out.
      *
      * Contains a {@link HTTPRequest}.
      *
      * @remarks
      *
      * NOTE: HTTP Error responses, such as 404 or 503, are still successful
      * responses from HTTP standpoint, so request will complete with
      * `requestfinished` event and not with `requestfailed`.
      */
    @scala.inline
    def RequestFailed: requestfailed = "requestfailed".asInstanceOf[requestfailed]
    
    /**
      * Emitted when a request finishes successfully. Contains a {@link HTTPRequest}.
      */
    @scala.inline
    def RequestFinished: requestfinished = "requestfinished".asInstanceOf[requestfinished]
    
    /**
      * Emitted when a response is received. Contains a {@link HTTPResponse}.
      */
    @scala.inline
    def Response: response = "response".asInstanceOf[response]
    
    /**
      * Emitted when a dedicated
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorker}
      * is spawned by the page.
      */
    @scala.inline
    def WorkerCreated: workercreated = "workercreated".asInstanceOf[workercreated]
    
    /**
      * Emitted when a dedicated
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorker}
      * is destroyed by the page.
      */
    @scala.inline
    def WorkerDestroyed: workerdestroyed = "workerdestroyed".asInstanceOf[workerdestroyed]
  }
  
  trait ScreenshotClip extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ScreenshotClip {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): ScreenshotClip = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenshotClip]
    }
    
    @scala.inline
    implicit class ScreenshotClipMutableBuilder[Self <: ScreenshotClip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScreenshotOptions extends StObject {
    
    var clip: js.UndefOr[ScreenshotClip] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fullPage: js.UndefOr[Boolean] = js.undefined
    
    var omitBackground: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[png | jpeg] = js.undefined
  }
  object ScreenshotOptions {
    
    @scala.inline
    def apply(): ScreenshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenshotOptions]
    }
    
    @scala.inline
    implicit class ScreenshotOptionsMutableBuilder[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: ScreenshotClip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
      
      @scala.inline
      def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setType(value: png | jpeg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait WaitForOptions extends StObject {
    
    /**
      * Maximum wait time in milliseconds, defaults to 30 seconds, pass `0` to
      * disable the timeout.
      *
      * @remarks
      * The default value can be changed by using the
      * {@link Page.setDefaultTimeout} or {@link Page.setDefaultNavigationTimeout}
      * methods.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var waitUntil: js.UndefOr[PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]] = js.undefined
  }
  object WaitForOptions {
    
    @scala.inline
    def apply(): WaitForOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForOptions]
    }
    
    @scala.inline
    implicit class WaitForOptionsMutableBuilder[Self <: WaitForOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWaitUntil(value: PuppeteerLifeCycleEvent | js.Array[PuppeteerLifeCycleEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
      
      @scala.inline
      def setWaitUntilVarargs(value: PuppeteerLifeCycleEvent*): Self = StObject.set(x, "waitUntil", js.Array(value :_*))
    }
  }
  
  trait WaitTimeoutOptions extends StObject {
    
    /**
      * Maximum wait time in milliseconds, defaults to 30 seconds, pass `0` to
      * disable the timeout.
      *
      * @remarks
      * The default value can be changed by using the
      * {@link Page.setDefaultTimeout} method.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object WaitTimeoutOptions {
    
    @scala.inline
    def apply(): WaitTimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitTimeoutOptions]
    }
    
    @scala.inline
    implicit class WaitTimeoutOptionsMutableBuilder[Self <: WaitTimeoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
