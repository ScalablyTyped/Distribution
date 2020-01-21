package typings.puppeteer.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.puppeteer.AnonMetrics
import typings.puppeteer.puppeteerStrings.close
import typings.puppeteer.puppeteerStrings.console
import typings.puppeteer.puppeteerStrings.dialog
import typings.puppeteer.puppeteerStrings.domcontentloaded
import typings.puppeteer.puppeteerStrings.error
import typings.puppeteer.puppeteerStrings.frameattached
import typings.puppeteer.puppeteerStrings.framedetached
import typings.puppeteer.puppeteerStrings.framenavigated
import typings.puppeteer.puppeteerStrings.load
import typings.puppeteer.puppeteerStrings.metrics
import typings.puppeteer.puppeteerStrings.pageerror
import typings.puppeteer.puppeteerStrings.popup
import typings.puppeteer.puppeteerStrings.request
import typings.puppeteer.puppeteerStrings.requestfailed
import typings.puppeteer.puppeteerStrings.requestfinished
import typings.puppeteer.puppeteerStrings.response
import typings.puppeteer.puppeteerStrings.workercreated
import typings.puppeteer.puppeteerStrings.workerdestroyed
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page
  extends EventEmitter
     with FrameBase {
  var accessibility: Accessibility = js.native
  var coverage: Coverage = js.native
  /** Returns the virtual keyboard. */
  var keyboard: Keyboard = js.native
  /** Gets the virtual mouse. */
  var mouse: Mouse = js.native
  /** Returns the virtual touchscreen object. */
  var touchscreen: Touchscreen = js.native
  /** Returns the tracing object. */
  var tracing: Tracing = js.native
  def authenticate(): js.Promise[Unit] = js.native
  /**
    * Provide credentials for http authentication.
    * To disable authentication, pass `null`.
    */
  def authenticate(credentials: AuthOptions): js.Promise[Unit] = js.native
  /** Brings page to front (activates tab). */
  def bringToFront(): js.Promise[Unit] = js.native
  /** Get the browser the page belongs to. */
  def browser(): Browser = js.native
  /** Get the browser context that the page belongs to. */
  def browserContext(): BrowserContext = js.native
  /** Closes the current page. */
  def close(): js.Promise[Unit] = js.native
  def close(options: PageCloseOptions): js.Promise[Unit] = js.native
  /**
    * Gets the cookies.
    * If no URLs are specified, this method returns cookies for the current page URL.
    * If URLs are specified, only cookies for those URLs are returned.
    */
  def cookies(urls: String*): js.Promise[js.Array[Cookie]] = js.native
  /**
    * Deletes the specified cookies.
    */
  def deleteCookie(cookies: DeleteCookie*): js.Promise[Unit] = js.native
  /** Emulates given device metrics and user agent. This method is a shortcut for `setUserAgent` and `setViewport`.  */
  def emulate(options: EmulateOptions): js.Promise[Unit] = js.native
  def emulateMediaFeatures(): js.Promise[Unit] = js.native
  /**
    * Given an array of media feature objects, emulates CSS media features on the page.
    * Passing null resets all.
    */
  def emulateMediaFeatures(features: js.Array[MediaFeature]): js.Promise[Unit] = js.native
  def emulateMediaType(): js.Promise[Unit] = js.native
  /** Emulates the media. */
  def emulateMediaType(mediaType: MediaType): js.Promise[Unit] = js.native
  def emulateTimezone(): js.Promise[Unit] = js.native
  /**
    * Changes the timezone of the page.
    * See ICU’s [metaZones.txt](https://cs.chromium.org/chromium/src/third_party/icu/source/data/misc/metaZones.txt?rcl=faee8bc70570192d82d2978a71e2a615788597d1) for a list of supported timezone IDs.
    * Passing null disables timezone emulation.
    */
  def emulateTimezone(tz: String): js.Promise[Unit] = js.native
  /**
    * Adds a function which would be invoked in one of the following scenarios: whenever the page is navigated; whenever the child frame is attached or navigated.
    * The function is invoked after the document was created but before any of its scripts were run. This is useful to amend JavaScript environment, e.g. to seed Math.random.
    * @param fn The function to be evaluated in browser context.
    * @param args The arguments to pass to the `fn`.
    */
  def evaluateOnNewDocument(fn: EvaluateFn[_], args: SerializableOrJSHandle*): js.Promise[Unit] = js.native
  /**
    * The method adds a function called name on the page's `window` object.
    * When called, the function executes `puppeteerFunction` in node.js and returns a
    * Promise which resolves to the return value of `puppeteerFunction`.
    * @param name The name of the function on the window object.
    * @param fn Callback function which will be called in Puppeteer's context.
    */
  def exposeFunction(name: String, puppeteerFunction: js.Function1[/* repeated */ js.Any, _]): js.Promise[Unit] = js.native
  /** An array of all frames attached to the page. */
  def frames(): js.Array[Frame] = js.native
  /**
    * Navigate to the previous page in history.
    * @param options The navigation parameters.
    */
  def goBack(): js.Promise[Response | Null] = js.native
  def goBack(options: NavigationOptions): js.Promise[Response | Null] = js.native
  /**
    * Navigate to the next page in history.
    * @param options The navigation parameters.
    */
  def goForward(): js.Promise[Response | Null] = js.native
  def goForward(options: NavigationOptions): js.Promise[Response | Null] = js.native
  /** Indicates that the page has been closed. */
  def isClosed(): Boolean = js.native
  /** Page is guaranteed to have a main frame which persists during navigation's. */
  def mainFrame(): Frame = js.native
  /** Gets the page metrics. */
  def metrics(): js.Promise[Metrics] = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_close(
    eventName: close,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_console(eventName: console, handler: js.Function2[/* e */ ConsoleMessage, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_dialog(eventName: dialog, handler: js.Function2[/* e */ Dialog, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_domcontentloaded(
    eventName: domcontentloaded,
    handler: js.Function2[/* e */ scala.Nothing, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(eventName: error, handler: js.Function2[/* e */ Error, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_frameattached(eventName: frameattached, handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_framedetached(eventName: framedetached, handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_framenavigated(eventName: framenavigated, handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_load(
    eventName: load,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_metrics(eventName: metrics, handler: js.Function2[/* e */ AnonMetrics, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_pageerror(eventName: pageerror, handler: js.Function2[/* e */ Error, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_popup(eventName: popup, handler: js.Function2[/* e */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_request(eventName: request, handler: js.Function2[/* e */ Request, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_requestfailed(eventName: requestfailed, handler: js.Function2[/* e */ Request, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_requestfinished(eventName: requestfinished, handler: js.Function2[/* e */ Request, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_response(eventName: response, handler: js.Function2[/* e */ Response, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_workercreated(eventName: workercreated, handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_workerdestroyed(eventName: workerdestroyed, handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_close(
    eventName: close,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_console(eventName: console, handler: js.Function2[/* e */ ConsoleMessage, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_dialog(eventName: dialog, handler: js.Function2[/* e */ Dialog, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_domcontentloaded(
    eventName: domcontentloaded,
    handler: js.Function2[/* e */ scala.Nothing, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(eventName: error, handler: js.Function2[/* e */ Error, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_frameattached(eventName: frameattached, handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_framedetached(eventName: framedetached, handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_framenavigated(eventName: framenavigated, handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_load(
    eventName: load,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_metrics(eventName: metrics, handler: js.Function2[/* e */ AnonMetrics, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_pageerror(eventName: pageerror, handler: js.Function2[/* e */ Error, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_popup(eventName: popup, handler: js.Function2[/* e */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_request(eventName: request, handler: js.Function2[/* e */ Request, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_requestfailed(eventName: requestfailed, handler: js.Function2[/* e */ Request, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_requestfinished(eventName: requestfinished, handler: js.Function2[/* e */ Request, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_response(eventName: response, handler: js.Function2[/* e */ Response, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_workercreated(eventName: workercreated, handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_workerdestroyed(eventName: workerdestroyed, handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Generates a PDF of the page with `print` css media.
    * To generate a pdf with `screen` media, call `page.emulateMedia('screen')` before calling `page.pdf()`:
    * @param options The PDF parameters.
    */
  def pdf(): js.Promise[Buffer] = js.native
  def pdf(options: PDFOptions): js.Promise[Buffer] = js.native
  /**
    * The method iterates JavaScript heap and finds all the objects with the given prototype.
    * @param prototypeHandle A handle to the object prototype.
    */
  def queryObjects(prototypeHandle: JSHandle[_]): js.Promise[JSHandle[_]] = js.native
  /**
    * Reloads the current page.
    * @param options The navigation parameters.
    */
  def reload(): js.Promise[Response] = js.native
  def reload(options: NavigationOptions): js.Promise[Response] = js.native
  /**
    * Captures a screenshot of the page.
    * @param options The screenshot options.
    */
  def screenshot(): js.Promise[String] = js.native
  def screenshot(options: Base64ScreenShotOptions): js.Promise[String] = js.native
  def screenshot(options: BinaryScreenShotOptions): js.Promise[Buffer] = js.native
  def screenshot(options: ScreenshotOptions): js.Promise[String | Buffer] = js.native
  /**
    * Toggles bypassing page's Content-Security-Policy.
    * NOTE CSP bypassing happens at the moment of CSP initialization rather then evaluation.
    * Usually this means that page.setBypassCSP should be called before navigating to the domain.
    * @param enabled sets bypassing of page's Content-Security-Policy.
    */
  def setBypassCSP(enabled: Boolean): js.Promise[Unit] = js.native
  /**
    * Determines whether cache is enabled on the page.
    * @param [enabled=true] Whether or not to enable cache on the page.
    */
  def setCacheEnabled(): js.Promise[Unit] = js.native
  def setCacheEnabled(enabled: Boolean): js.Promise[Unit] = js.native
  /**
    * Sets the cookies on the page.
    * @param cookies The cookies to set.
    */
  def setCookie(cookies: SetCookie*): js.Promise[Unit] = js.native
  /**
    * This setting will change the default maximum navigation time of 30 seconds for the following methods:
    * - `page.goto`
    * - `page.goBack`
    * - `page.goForward`
    * - `page.reload`
    * - `page.waitForNavigation`
    */
  def setDefaultNavigationTimeout(timeout: Double): Unit = js.native
  /**
    * This setting will change the default maximum time for the following methods and related shortcuts:
    * - `page.goBack`
    * - `page.goForward`
    * - `page.goto`
    * - `page.reload`
    * - `page.setContent`
    * - `page.waitFor`
    * - `page.waitForFunction`
    * - `page.waitForNavigation`
    * - `page.waitForRequest`
    * - `page.waitForResponse`
    * - `page.waitForSelector`
    * - `page.waitForXPath`
    *
    * NOTE page.setDefaultNavigationTimeout takes priority over page.setDefaultTimeout
    */
  def setDefaultTimeout(timeout: Double): Unit = js.native
  /**
    * The extra HTTP headers will be sent with every request the page initiates.
    * @param headers An object containing additional http headers to be sent with every request. All header values must be strings.
    */
  def setExtraHTTPHeaders(headers: Headers): js.Promise[Unit] = js.native
  /**
    * Sets the page's geolocation.
    */
  def setGeolocation(options: GeoOptions): js.Promise[Unit] = js.native
  /**
    * Determines whether JavaScript is enabled on the page.
    * @param enable Whether or not to enable JavaScript on the page.
    */
  def setJavaScriptEnabled(enabled: Boolean): js.Promise[Unit] = js.native
  /**
    * Determines whether the offline mode is enabled.
    * @param enabled When `true`, enables the offline mode for the page.
    */
  def setOfflineMode(enabled: Boolean): js.Promise[Unit] = js.native
  /**
    * Determines whether the request interception is enabled.
    * @param enabled When `true` the methods `request.abort`, `request.continue` and `request.respond` must be used.
    */
  def setRequestInterception(enabled: Boolean): js.Promise[Unit] = js.native
  /**
    * Specifies the User-Agent used in this page.
    * @param userAgent The user-agent to be used in the page.
    */
  def setUserAgent(userAgent: String): js.Promise[Unit] = js.native
  /**
    * Sets the viewport of the page.
    * @param viewport The viewport parameters.
    */
  def setViewport(viewport: Viewport): js.Promise[Unit] = js.native
  /** @returns The target this page was created from */
  def target(): Target = js.native
  /** Gets the page viewport. */
  def viewport(): Viewport = js.native
  /**
    * In non-headless Chromium, this method results in the native file picker dialog not showing up for the user.
    * This method is typically coupled with an action that triggers file choosing.
    * This must be called before the file chooser is launched. It will not return a currently active file chooser.
    */
  def waitForFileChooser(): js.Promise[FileChooser] = js.native
  def waitForFileChooser(options: Timeoutable): js.Promise[FileChooser] = js.native
  def waitForRequest(urlOrPredicate: String): js.Promise[Request] = js.native
  def waitForRequest(urlOrPredicate: String, options: Timeoutable): js.Promise[Request] = js.native
  def waitForRequest(urlOrPredicate: js.Function1[/* req */ Request, Boolean]): js.Promise[Request] = js.native
  def waitForRequest(urlOrPredicate: js.Function1[/* req */ Request, Boolean], options: Timeoutable): js.Promise[Request] = js.native
  def waitForResponse(urlOrPredicate: String): js.Promise[Response] = js.native
  def waitForResponse(urlOrPredicate: String, options: Timeoutable): js.Promise[Response] = js.native
  def waitForResponse(urlOrPredicate: js.Function1[/* res */ Response, Boolean]): js.Promise[Response] = js.native
  def waitForResponse(urlOrPredicate: js.Function1[/* res */ Response, Boolean], options: Timeoutable): js.Promise[Response] = js.native
  /** This method returns all of the dedicated WebWorkers associated with the page. */
  def workers(): js.Array[Worker] = js.native
}

