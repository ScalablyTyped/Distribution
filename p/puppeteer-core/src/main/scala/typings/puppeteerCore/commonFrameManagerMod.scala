package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Page.FrameTree
import typings.devtoolsProtocol.mod.Protocol.Page.LifecycleEventEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import typings.puppeteerCore.anon.ClickCount
import typings.puppeteerCore.anon.Delay
import typings.puppeteerCore.anon.RefererTimeout
import typings.puppeteerCore.anon.TimeoutWaitUntil
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonDomworldMod.DOMWorld
import typings.puppeteerCore.commonDomworldMod.WaitForSelectorOptions
import typings.puppeteerCore.commonEvalTypesMod.EvaluateFn
import typings.puppeteerCore.commonEvalTypesMod.EvaluateFnReturnType
import typings.puppeteerCore.commonEvalTypesMod.EvaluateHandleFn
import typings.puppeteerCore.commonEvalTypesMod.SerializableOrJSHandle
import typings.puppeteerCore.commonEvalTypesMod.UnwrapPromiseLike
import typings.puppeteerCore.commonEvalTypesMod.WrapElementHandle
import typings.puppeteerCore.commonEventEmitterMod.EventEmitter
import typings.puppeteerCore.commonExecutionContextMod.ExecutionContext
import typings.puppeteerCore.commonHttpresponseMod.HTTPResponse
import typings.puppeteerCore.commonJshandleMod.ElementHandle
import typings.puppeteerCore.commonJshandleMod.JSHandle
import typings.puppeteerCore.commonNetworkManagerMod.NetworkManager
import typings.puppeteerCore.commonPageMod.Page
import typings.puppeteerCore.commonTimeoutSettingsMod.TimeoutSettings
import typings.std.Element
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonFrameManagerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "Frame")
  @js.native
  class Frame protected () extends StObject {
    def this(frameManager: FrameManager, parentFrame: Null, frameId: String) = this()
    /**
      * @internal
      */
    def this(frameManager: FrameManager, parentFrame: Frame, frameId: String) = this()
    
    /**
      * This method queries the frame for the given selector.
      *
      * @param selector - a selector to query for.
      * @returns A promise which resolves to an `ElementHandle` pointing at the
      * element, or `null` if it was not found.
      */
    @JSName("$")
    def $(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * @remarks
      *
      * This method runs `document.querySelector` within
      * the frame and passes it as the first argument to `pageFunction`.
      *
      * If `pageFunction` returns a Promise, then `frame.$eval` would wait for
      * the promise to resolve and return its value.
      *
      * @example
      *
      * ```js
      * const searchValue = await frame.$eval('#search', el => el.value);
      * ```
      *
      * @param selector - the selector to query for
      * @param pageFunction - the function to be evaluated in the frame's context
      * @param args - additional arguments to pass to `pageFuncton`
      */
    @JSName("$eval")
    def $eval[ReturnType](
      selector: String,
      pageFunction: js.Function2[/* element */ Element, /* repeated */ js.Any, ReturnType | js.Promise[ReturnType]],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    /**
      * This method evaluates the given XPath expression and returns the results.
      *
      * @param expression - the XPath expression to evaluate.
      */
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    /**
      * This runs `document.querySelectorAll` in the frame and returns the result.
      *
      * @param selector - a selector to search for
      * @returns An array of element handles pointing to the found frame elements.
      */
    @JSName("$$")
    def DollarDollar(selector: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    /**
      * @remarks
      *
      * This method runs `Array.from(document.querySelectorAll(selector))` within
      * the frame and passes it as the first argument to `pageFunction`.
      *
      * If `pageFunction` returns a Promise, then `frame.$$eval` would wait for
      * the promise to resolve and return its value.
      *
      * @example
      *
      * ```js
      * const divsCounts = await frame.$$eval('div', divs => divs.length);
      * ```
      *
      * @param selector - the selector to query for
      * @param pageFunction - the function to be evaluated in the frame's context
      * @param args - additional arguments to pass to `pageFuncton`
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
    
    /**
      * @internal
      */
    var _childFrames: Set[Frame] = js.native
    
    /**
      * @internal
      */
    def _detach(): Unit = js.native
    
    /* private */ var _detached: js.Any = js.native
    
    /**
      * @internal
      */
    var _frameManager: FrameManager = js.native
    
    /**
      * @internal
      */
    var _id: String = js.native
    
    /**
      * @internal
      */
    var _lifecycleEvents: Set[String] = js.native
    
    /**
      * @internal
      */
    var _loaderId: String = js.native
    
    /**
      * @internal
      */
    var _mainWorld: DOMWorld = js.native
    
    /**
      * @internal
      */
    var _name: js.UndefOr[String] = js.native
    
    /**
      * @internal
      */
    def _navigated(framePayload: typings.devtoolsProtocol.mod.Protocol.Page.Frame): Unit = js.native
    
    /**
      * @internal
      */
    def _navigatedWithinDocument(url: String): Unit = js.native
    
    /**
      * @internal
      */
    def _onLifecycleEvent(loaderId: String, name: String): Unit = js.native
    
    /**
      * @internal
      */
    def _onLoadingStopped(): Unit = js.native
    
    /* private */ var _parentFrame: js.Any = js.native
    
    /**
      * @internal
      */
    var _secondaryWorld: DOMWorld = js.native
    
    /* private */ var _url: js.Any = js.native
    
    /**
      * Adds a `<script>` tag into the page with the desired url or content.
      *
      * @param options - configure the script to add to the page.
      *
      * @returns a promise that resolves to the added tag when the script's
      * `onload` event fires or when the script content was injected into the
      * frame.
      */
    def addScriptTag(options: FrameAddScriptTagOptions): js.Promise[ElementHandle[Element]] = js.native
    
    /**
      * Adds a `<link rel="stylesheet">` tag into the page with the desired url or
      * a `<style type="text/css">` tag with the content.
      *
      * @param options - configure the CSS to add to the page.
      *
      * @returns a promise that resolves to the added tag when the stylesheets's
      * `onload` event fires or when the CSS content was injected into the
      * frame.
      */
    def addStyleTag(options: FrameAddStyleTagOptions): js.Promise[ElementHandle[Element]] = js.native
    
    /**
      * @returns an array of child frames.
      */
    def childFrames(): js.Array[Frame] = js.native
    
    /**
      *
      * This method clicks the first element found that matches `selector`.
      *
      * @remarks
      *
      * This method scrolls the element into view if needed, and then uses
      * {@link Page.mouse} to click in the center of the element. If there's no
      * element matching `selector`, the method throws an error.
      *
      * Bear in mind that if `click()` triggers a navigation event and there's a
      * separate `page.waitForNavigation()` promise to be resolved, you may end up
      * with a race condition that yields unexpected results. The correct pattern
      * for click and wait for navigation is the following:
      *
      * ```javascript
      * const [response] = await Promise.all([
      *   page.waitForNavigation(waitOptions),
      *   frame.click(selector, clickOptions),
      * ]);
      * ```
      * @param selector - the selector to search for to click. If there are
      * multiple elements, the first will be clicked.
      */
    def click(selector: String): js.Promise[Unit] = js.native
    def click(selector: String, options: ClickCount): js.Promise[Unit] = js.native
    
    /**
      * @returns the full HTML contents of the frame, including the doctype.
      */
    def content(): js.Promise[String] = js.native
    
    /**
      * @remarks
      *
      * This method behaves identically to {@link Page.evaluate} except it's run
      * within the context of the `frame`, rather than the entire page.
      *
      * @param pageFunction - a function that is run within the frame
      * @param args - arguments to be passed to the pageFunction
      */
    def evaluate[T /* <: EvaluateFn[js.Any] */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[UnwrapPromiseLike[EvaluateFnReturnType[T]]] = js.native
    
    /**
      * @remarks
      *
      * The only difference between {@link Frame.evaluate} and
      * `frame.evaluateHandle` is that `evaluateHandle` will return the value
      * wrapped in an in-page object.
      *
      * This method behaves identically to {@link Page.evaluateHandle} except it's
      * run within the context of the `frame`, rather than the entire page.
      *
      * @param pageFunction - a function that is run within the frame
      * @param args - arguments to be passed to the pageFunction
      */
    def evaluateHandle[HandlerType /* <: JSHandle */](pageFunction: EvaluateHandleFn, args: SerializableOrJSHandle*): js.Promise[HandlerType] = js.native
    
    /**
      * @returns a promise that resolves to the frame's default execution context.
      */
    def executionContext(): js.Promise[ExecutionContext] = js.native
    
    /**
      * This method fetches an element with `selector` and focuses it.
      *
      * @remarks
      * If there's no element matching `selector`, the method throws an error.
      *
      * @param selector - the selector for the element to focus. If there are
      * multiple elements, the first will be focused.
      */
    def focus(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @remarks
      *
      * `frame.goto` will throw an error if:
      * - there's an SSL error (e.g. in case of self-signed certificates).
      *
      * - target URL is invalid.
      *
      * - the `timeout` is exceeded during navigation.
      *
      * - the remote server does not respond or is unreachable.
      *
      * - the main resource failed to load.
      *
      * `frame.goto` will not throw an error when any valid HTTP status code is
      * returned by the remote server, including 404 "Not Found" and 500 "Internal
      * Server Error".  The status code for such responses can be retrieved by
      * calling {@link HTTPResponse.status}.
      *
      * NOTE: `frame.goto` either throws an error or returns a main resource
      * response. The only exceptions are navigation to `about:blank` or
      * navigation to the same URL with a different hash, which would succeed and
      * return `null`.
      *
      * NOTE: Headless mode doesn't support navigation to a PDF document. See
      * the {@link https://bugs.chromium.org/p/chromium/issues/detail?id=761295 | upstream
      * issue}.
      *
      * @param url - the URL to navigate the frame to. This should include the
      * scheme, e.g. `https://`.
      * @param options - navigation options. `waitUntil` is useful to define when
      * the navigation should be considered successful - see the docs for
      * {@link PuppeteerLifeCycleEvent} for more details.
      *
      * @returns A promise which resolves to the main resource response. In case of
      * multiple redirects, the navigation will resolve with the response of the
      * last redirect.
      */
    def goto(url: String): js.Promise[HTTPResponse | Null] = js.native
    def goto(url: String, options: RefererTimeout): js.Promise[HTTPResponse | Null] = js.native
    
    /**
      * This method fetches an element with `selector`, scrolls it into view if
      * needed, and then uses {@link Page.mouse} to hover over the center of the
      * element.
      *
      * @remarks
      * If there's no element matching `selector`, the method throws an
      *
      * @param selector - the selector for the element to hover. If there are
      * multiple elements, the first will be hovered.
      */
    def hover(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @returns `true` if the frame has been detached, or `false` otherwise.
      */
    def isDetached(): Boolean = js.native
    
    /**
      * @remarks
      *
      * If the name is empty, it returns the `id` attribute instead.
      *
      * Note: This value is calculated once when the frame is created, and will not
      * update if the attribute is changed later.
      *
      * @returns the frame's `name` attribute as specified in the tag.
      */
    def name(): String = js.native
    
    /**
      * @returns the parent `Frame`, if any. Detached and main frames return `null`.
      */
    def parentFrame(): Frame | Null = js.native
    
    /**
      * Triggers a `change` and `input` event once all the provided options have
      * been selected.
      *
      * @remarks
      *
      * If there's no `<select>` element matching `selector`, the
      * method throws an error.
      *
      * @example
      * ```js
      * frame.select('select#colors', 'blue'); // single selection
      * frame.select('select#colors', 'red', 'green', 'blue'); // multiple selections
      * ```
      *
      * @param selector - a selector to query the frame for
      * @param values - an array of values to select. If the `<select>` has the
      * `multiple` attribute, all values are considered, otherwise only the first
      * one is taken into account.
      * @returns the list of values that were successfully selected.
      */
    def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
    
    /**
      * Set the content of the frame.
      *
      * @param html - HTML markup to assign to the page.
      * @param options - options to configure how long before timing out and at
      * what point to consider the content setting successful.
      */
    def setContent(html: String): js.Promise[Unit] = js.native
    def setContent(html: String, options: TimeoutWaitUntil): js.Promise[Unit] = js.native
    
    /**
      * This method fetches an element with `selector`, scrolls it into view if
      * needed, and then uses {@link Page.touchscreen} to tap in the center of the
      * element.
      *
      * @remarks
      *
      * If there's no element matching `selector`, the method throws an error.
      *
      * @param selector - the selector to tap.
      * @returns a promise that resolves when the element has been tapped.
      */
    def tap(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @returns the frame's title.
      */
    def title(): js.Promise[String] = js.native
    
    /**
      * Sends a `keydown`, `keypress`/`input`, and `keyup` event for each character
      * in the text.
      *
      * @remarks
      * To press a special key, like `Control` or `ArrowDown`, use
      * {@link Keyboard.press}.
      *
      * @example
      * ```js
      * await frame.type('#mytextarea', 'Hello'); // Types instantly
      * await frame.type('#mytextarea', 'World', {delay: 100}); // Types slower, like a user
      * ```
      *
      * @param selector - the selector for the element to type into. If there are
      * multiple the first will be used.
      * @param text - text to type into the element
      * @param options - takes one option, `delay`, which sets the time to wait
      * between key presses in milliseconds. Defaults to `0`.
      *
      * @returns a promise that resolves when the typing is complete.
      */
    def `type`(selector: String, text: String): js.Promise[Unit] = js.native
    def `type`(selector: String, text: String, options: Delay): js.Promise[Unit] = js.native
    
    /**
      * @returns the frame's URL.
      */
    def url(): String = js.native
    
    def waitFor(selectorOrFunctionOrTimeout: String, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle | Null] = js.native
    /**
      * @remarks
      *
      * This method behaves differently depending on the first parameter. If it's a
      * `string`, it will be treated as a `selector` or `xpath` (if the string
      * starts with `//`). This method then is a shortcut for
      * {@link Frame.waitForSelector} or {@link Frame.waitForXPath}.
      *
      * If the first argument is a function this method is a shortcut for
      * {@link Frame.waitForFunction}.
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
      * methods available: {@link Frame.waitForSelector},
      * {@link Frame.waitForXPath}, {@link Frame.waitForFunction} or
      * {@link Frame.waitForTimeout}.
      */
    def waitFor(
      selectorOrFunctionOrTimeout: String,
      options: Record[String, js.Any],
      args: SerializableOrJSHandle*
    ): js.Promise[JSHandle | Null] = js.native
    def waitFor(selectorOrFunctionOrTimeout: js.Function, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle | Null] = js.native
    def waitFor(
      selectorOrFunctionOrTimeout: js.Function,
      options: Record[String, js.Any],
      args: SerializableOrJSHandle*
    ): js.Promise[JSHandle | Null] = js.native
    def waitFor(selectorOrFunctionOrTimeout: Double, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle | Null] = js.native
    def waitFor(
      selectorOrFunctionOrTimeout: Double,
      options: Record[String, js.Any],
      args: SerializableOrJSHandle*
    ): js.Promise[JSHandle | Null] = js.native
    
    def waitForFunction(pageFunction: String, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: String, options: FrameWaitForFunctionOptions, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    def waitForFunction(pageFunction: js.Function, options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    /**
      * @remarks
      *
      * @example
      *
      * The `waitForFunction` can be used to observe viewport size change:
      * ```js
      * const puppeteer = require('puppeteer');
      *
      * (async () => {
      * .  const browser = await puppeteer.launch();
      * .  const page = await browser.newPage();
      * .  const watchDog = page.mainFrame().waitForFunction('window.innerWidth < 100');
      * .  page.setViewport({width: 50, height: 50});
      * .  await watchDog;
      * .  await browser.close();
      * })();
      * ```
      *
      * To pass arguments from Node.js to the predicate of `page.waitForFunction` function:
      *
      * ```js
      * const selector = '.foo';
      * await frame.waitForFunction(
      *   selector => !!document.querySelector(selector),
      *   {}, // empty options object
      *   selector
      *);
      * ```
      *
      * @param pageFunction - the function to evaluate in the frame context.
      * @param options - options to configure the polling method and timeout.
      * @param args - arguments to pass to the `pageFunction`.
      * @returns the promise which resolve when the `pageFunction` returns a truthy value.
      */
    def waitForFunction(pageFunction: js.Function, options: FrameWaitForFunctionOptions, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    
    /**
      * @remarks
      *
      * This resolves when the frame navigates to a new URL. It is useful for when
      * you run code which will indirectly cause the frame to navigate. Consider
      * this example:
      *
      * ```js
      * const [response] = await Promise.all([
      *   // The navigation promise resolves after navigation has finished
      *   frame.waitForNavigation(),
      *   // Clicking the link will indirectly cause a navigation
      *   frame.click('a.my-link'),
      * ]);
      * ```
      *
      * Usage of the {@link https://developer.mozilla.org/en-US/docs/Web/API/History_API | History API} to change the URL is considered a navigation.
      *
      * @param options - options to configure when the navigation is consided finished.
      * @returns a promise that resolves when the frame navigates to a new URL.
      */
    def waitForNavigation(): js.Promise[HTTPResponse | Null] = js.native
    def waitForNavigation(options: TimeoutWaitUntil): js.Promise[HTTPResponse | Null] = js.native
    
    /**
      * @remarks
      *
      *
      * Wait for the `selector` to appear in page. If at the moment of calling the
      * method the `selector` already exists, the method will return immediately.
      * If the selector doesn't appear after the `timeout` milliseconds of waiting,
      * the function will throw.
      *
      * This method works across navigations.
      *
      * @example
      * ```js
      * const puppeteer = require('puppeteer');
      *
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   let currentURL;
      *   page.mainFrame()
      *   .waitForSelector('img')
      *   .then(() => console.log('First URL with image: ' + currentURL));
      *
      *   for (currentURL of ['https://example.com', 'https://google.com', 'https://bbc.com']) {
      *     await page.goto(currentURL);
      *   }
      *   await browser.close();
      * })();
      * ```
      * @param selector - the selector to wait for.
      * @param options - options to define if the element should be visible and how
      * long to wait before timing out.
      * @returns a promise which resolves when an element matching the selector
      * string is added to the DOM.
      */
    def waitForSelector(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
    def waitForSelector(selector: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * Causes your script to wait for the given number of milliseconds.
      *
      * @remarks
      * It's generally recommended to not wait for a number of seconds, but instead
      * use {@link Frame.waitForSelector}, {@link Frame.waitForXPath} or
      * {@link Frame.waitForFunction} to wait for exactly the conditions you want.
      *
      * @example
      *
      * Wait for 1 second:
      *
      * ```
      * await frame.waitForTimeout(1000);
      * ```
      *
      * @param milliseconds - the number of milliseconds to wait.
      */
    def waitForTimeout(milliseconds: Double): js.Promise[Unit] = js.native
    
    /**
      * @remarks
      * Wait for the `xpath` to appear in page. If at the moment of calling the
      * method the `xpath` already exists, the method will return immediately. If
      * the xpath doesn't appear after the `timeout` milliseconds of waiting, the
      * function will throw.
      *
      * For a code example, see the example for {@link Frame.waitForSelector}. That
      * function behaves identically other than taking a CSS selector rather than
      * an XPath.
      *
      * @param xpath - the XPath expression to wait for.
      * @param options  - options to configure the visiblity of the element and how
      * long to wait before timing out.
      */
    def waitForXPath(xpath: String): js.Promise[ElementHandle[Element] | Null] = js.native
    def waitForXPath(xpath: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element] | Null] = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManager")
  @js.native
  class FrameManager protected () extends EventEmitter {
    def this(client: CDPSession, page: Page, ignoreHTTPSErrors: Boolean, timeoutSettings: TimeoutSettings) = this()
    
    var _client: CDPSession = js.native
    
    /* private */ var _contextIdToContext: js.Any = js.native
    
    def _ensureIsolatedWorld(name: String): js.Promise[Unit] = js.native
    
    /* private */ var _frames: js.Any = js.native
    
    def _handleFrameTree(frameTree: FrameTree): Unit = js.native
    
    /* private */ var _isolatedWorlds: js.Any = js.native
    
    /* private */ var _mainFrame: js.Any = js.native
    
    /* private */ var _networkManager: js.Any = js.native
    
    def _onExecutionContextCreated(contextPayload: ExecutionContextDescription): Unit = js.native
    
    /* private */ var _onExecutionContextDestroyed: js.Any = js.native
    
    /* private */ var _onExecutionContextsCleared: js.Any = js.native
    
    def _onFrameAttached(frameId: String): Unit = js.native
    def _onFrameAttached(frameId: String, parentFrameId: String): Unit = js.native
    
    def _onFrameDetached(frameId: String): Unit = js.native
    
    /* private */ var _onFrameMoved: js.Any = js.native
    
    def _onFrameNavigated(framePayload: typings.devtoolsProtocol.mod.Protocol.Page.Frame): Unit = js.native
    
    def _onFrameNavigatedWithinDocument(frameId: String, url: String): Unit = js.native
    
    def _onFrameStoppedLoading(frameId: String): Unit = js.native
    
    def _onLifecycleEvent(event: LifecycleEventEvent): Unit = js.native
    
    /* private */ var _page: js.Any = js.native
    
    /* private */ var _removeFramesRecursively: js.Any = js.native
    
    var _timeoutSettings: TimeoutSettings = js.native
    
    def executionContextById(contextId: Double): ExecutionContext = js.native
    
    def frame(frameId: String): Frame | Null = js.native
    
    def frames(): js.Array[Frame] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def mainFrame(): Frame = js.native
    
    def navigateFrame(frame: Frame, url: String): js.Promise[HTTPResponse | Null] = js.native
    def navigateFrame(frame: Frame, url: String, options: RefererTimeout): js.Promise[HTTPResponse | Null] = js.native
    
    def networkManager(): NetworkManager = js.native
    
    def page(): Page = js.native
    
    def waitForFrameNavigation(frame: Frame): js.Promise[HTTPResponse | Null] = js.native
    def waitForFrameNavigation(frame: Frame, options: TimeoutWaitUntil): js.Promise[HTTPResponse | Null] = js.native
  }
  
  object FrameManagerEmittedEvents {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.ExecutionContextCreated")
    @js.native
    def ExecutionContextCreated: js.Symbol = js.native
    inline def ExecutionContextCreated_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExecutionContextCreated")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.ExecutionContextDestroyed")
    @js.native
    def ExecutionContextDestroyed: js.Symbol = js.native
    inline def ExecutionContextDestroyed_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExecutionContextDestroyed")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameAttached")
    @js.native
    def FrameAttached: js.Symbol = js.native
    inline def FrameAttached_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameAttached")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameDetached")
    @js.native
    def FrameDetached: js.Symbol = js.native
    inline def FrameDetached_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameDetached")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameNavigated")
    @js.native
    def FrameNavigated: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameNavigatedWithinDocument")
    @js.native
    def FrameNavigatedWithinDocument: js.Symbol = js.native
    inline def FrameNavigatedWithinDocument_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameNavigatedWithinDocument")(x.asInstanceOf[js.Any])
    
    inline def FrameNavigated_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameNavigated")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.LifecycleEvent")
    @js.native
    def LifecycleEvent: js.Symbol = js.native
    inline def LifecycleEvent_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LifecycleEvent")(x.asInstanceOf[js.Any])
  }
  
  trait FrameAddScriptTagOptions extends StObject {
    
    /**
      * Raw JavaScript content to be injected into the frame.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * The path to a JavaScript file to be injected into the frame.
      * @remarks
      * If `path` is a relative path, it is resolved relative to the current
      * working directory (`process.cwd()` in Node.js).
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Set the script's `type`. Use `module` in order to load an ES2015 module.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * the URL of the script to be added.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object FrameAddScriptTagOptions {
    
    inline def apply(): FrameAddScriptTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameAddScriptTagOptions]
    }
    
    extension [Self <: FrameAddScriptTagOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FrameAddStyleTagOptions extends StObject {
    
    /**
      * Raw CSS content to be injected into the frame.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * The path to a CSS file to be injected into the frame.
      * @remarks
      * If `path` is a relative path, it is resolved relative to the current
      * working directory (`process.cwd()` in Node.js).
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * the URL of the CSS file to be added.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object FrameAddStyleTagOptions {
    
    inline def apply(): FrameAddStyleTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameAddStyleTagOptions]
    }
    
    extension [Self <: FrameAddStyleTagOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FrameWaitForFunctionOptions extends StObject {
    
    /**
      * An interval at which the `pageFunction` is executed, defaults to `raf`. If
      * `polling` is a number, then it is treated as an interval in milliseconds at
      * which the function would be executed. If `polling` is a string, then it can
      * be one of the following values:
      *
      * - `raf` - to constantly execute `pageFunction` in `requestAnimationFrame`
      *   callback. This is the tightest polling mode which is suitable to observe
      *   styling changes.
      *
      * - `mutation` - to execute `pageFunction` on every DOM mutation.
      */
    var polling: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Maximum time to wait in milliseconds. Defaults to `30000` (30 seconds).
      * Pass `0` to disable the timeout. Puppeteer's default timeout can be changed
      * using {@link Page.setDefaultTimeout}.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FrameWaitForFunctionOptions {
    
    inline def apply(): FrameWaitForFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameWaitForFunctionOptions]
    }
    
    extension [Self <: FrameWaitForFunctionOptions](x: Self) {
      
      inline def setPolling(value: String | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
