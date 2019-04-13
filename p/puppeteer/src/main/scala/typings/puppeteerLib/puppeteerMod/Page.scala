package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page
  extends nodeLib.eventsMod.EventEmitter
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
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def authenticate(): js.Promise[scala.Unit] = js.native
  /**
    * Provide credentials for http authentication.
    * To disable authentication, pass `null`.
    */
  def authenticate(credentials: AuthOptions): js.Promise[scala.Unit] = js.native
  /** Brings page to front (activates tab). */
  def bringToFront(): js.Promise[scala.Unit] = js.native
  /** Get the browser the page belongs to. */
  def browser(): Browser = js.native
  /** Get the browser context that the page belongs to. */
  def browserContext(): BrowserContext = js.native
  /** Closes the current page. */
  def close(): js.Promise[scala.Unit] = js.native
  def close(options: PageCloseOptions): js.Promise[scala.Unit] = js.native
  /**
    * Gets the cookies.
    * If no URLs are specified, this method returns cookies for the current page URL.
    * If URLs are specified, only cookies for those URLs are returned.
    */
  def cookies(urls: java.lang.String*): js.Promise[js.Array[Cookie]] = js.native
  /**
    * Deletes the specified cookies.
    */
  def deleteCookie(cookies: DeleteCookie*): js.Promise[scala.Unit] = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /** Emulates given device metrics and user agent. This method is a shortcut for `setUserAgent` and `setViewport`.  */
  def emulate(options: EmulateOptions): js.Promise[scala.Unit] = js.native
  def emulateMedia(): js.Promise[scala.Unit] = js.native
  /** Emulates the media. */
  def emulateMedia(mediaType: MediaType): js.Promise[scala.Unit] = js.native
  /**
    * Adds a function which would be invoked in one of the following scenarios: whenever the page is navigated; whenever the child frame is attached or navigated.
    * The function is invoked after the document was created but before any of its scripts were run. This is useful to amend JavaScript environment, e.g. to seed Math.random.
    * @param fn The function to be evaluated in browser context.
    * @param args The arguments to pass to the `fn`.
    */
  def evaluateOnNewDocument(fn: EvaluateFn, args: SerializableOrJSHandle*): js.Promise[scala.Unit] = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /**
    * The method adds a function called name on the page's `window` object.
    * When called, the function executes `puppeteerFunction` in node.js and returns a
    * Promise which resolves to the return value of `puppeteerFunction`.
    * @param name The name of the function on the window object.
    * @param fn Callback function which will be called in Puppeteer's context.
    */
  def exposeFunction(name: java.lang.String, puppeteerFunction: js.Function1[/* repeated */ js.Any, _]): js.Promise[scala.Unit] = js.native
  /** An array of all frames attached to the page. */
  def frames(): js.Array[Frame] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /**
    * Navigate to the previous page in history.
    * @param options The navigation parameters.
    */
  def goBack(): js.Promise[Response | scala.Null] = js.native
  def goBack(options: NavigationOptions): js.Promise[Response | scala.Null] = js.native
  /**
    * Navigate to the next page in history.
    * @param options The navigation parameters.
    */
  def goForward(): js.Promise[Response | scala.Null] = js.native
  def goForward(options: NavigationOptions): js.Promise[Response | scala.Null] = js.native
  /** Indicates that the page has been closed. */
  def isClosed(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /** Page is guaranteed to have a main frame which persists during navigation's. */
  def mainFrame(): Frame = js.native
  /** Gets the page metrics. */
  def metrics(): js.Promise[Metrics] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_close(
    eventName: puppeteerLib.puppeteerLibStrings.close,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_console(
    eventName: puppeteerLib.puppeteerLibStrings.console,
    handler: js.Function2[/* e */ ConsoleMessage, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_dialog(
    eventName: puppeteerLib.puppeteerLibStrings.dialog,
    handler: js.Function2[/* e */ Dialog, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_domcontentloaded(
    eventName: puppeteerLib.puppeteerLibStrings.domcontentloaded,
    handler: js.Function2[/* e */ scala.Nothing, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_error(
    eventName: puppeteerLib.puppeteerLibStrings.error,
    handler: js.Function2[/* e */ stdLib.Error, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_frameattached(
    eventName: puppeteerLib.puppeteerLibStrings.frameattached,
    handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_framedetached(
    eventName: puppeteerLib.puppeteerLibStrings.framedetached,
    handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_framenavigated(
    eventName: puppeteerLib.puppeteerLibStrings.framenavigated,
    handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_load(
    eventName: puppeteerLib.puppeteerLibStrings.load,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_metrics(
    eventName: puppeteerLib.puppeteerLibStrings.metrics,
    handler: js.Function2[/* e */ puppeteerLib.Anon_Metrics, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_pageerror(
    eventName: puppeteerLib.puppeteerLibStrings.pageerror,
    handler: js.Function2[/* e */ stdLib.Error, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_popup(
    eventName: puppeteerLib.puppeteerLibStrings.popup,
    handler: js.Function2[/* e */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_request(
    eventName: puppeteerLib.puppeteerLibStrings.request,
    handler: js.Function2[/* e */ Request, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_requestfailed(
    eventName: puppeteerLib.puppeteerLibStrings.requestfailed,
    handler: js.Function2[/* e */ Request, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_requestfinished(
    eventName: puppeteerLib.puppeteerLibStrings.requestfinished,
    handler: js.Function2[/* e */ Request, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_response(
    eventName: puppeteerLib.puppeteerLibStrings.response,
    handler: js.Function2[/* e */ Response, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_workercreated(
    eventName: puppeteerLib.puppeteerLibStrings.workercreated,
    handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_workerdestroyed(
    eventName: puppeteerLib.puppeteerLibStrings.workerdestroyed,
    handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_close(
    eventName: puppeteerLib.puppeteerLibStrings.close,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_console(
    eventName: puppeteerLib.puppeteerLibStrings.console,
    handler: js.Function2[/* e */ ConsoleMessage, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_dialog(
    eventName: puppeteerLib.puppeteerLibStrings.dialog,
    handler: js.Function2[/* e */ Dialog, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_domcontentloaded(
    eventName: puppeteerLib.puppeteerLibStrings.domcontentloaded,
    handler: js.Function2[/* e */ scala.Nothing, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_error(
    eventName: puppeteerLib.puppeteerLibStrings.error,
    handler: js.Function2[/* e */ stdLib.Error, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_frameattached(
    eventName: puppeteerLib.puppeteerLibStrings.frameattached,
    handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_framedetached(
    eventName: puppeteerLib.puppeteerLibStrings.framedetached,
    handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_framenavigated(
    eventName: puppeteerLib.puppeteerLibStrings.framenavigated,
    handler: js.Function2[/* e */ Frame, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_load(
    eventName: puppeteerLib.puppeteerLibStrings.load,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_metrics(
    eventName: puppeteerLib.puppeteerLibStrings.metrics,
    handler: js.Function2[/* e */ puppeteerLib.Anon_Metrics, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_pageerror(
    eventName: puppeteerLib.puppeteerLibStrings.pageerror,
    handler: js.Function2[/* e */ stdLib.Error, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_popup(
    eventName: puppeteerLib.puppeteerLibStrings.popup,
    handler: js.Function2[/* e */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_request(
    eventName: puppeteerLib.puppeteerLibStrings.request,
    handler: js.Function2[/* e */ Request, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_requestfailed(
    eventName: puppeteerLib.puppeteerLibStrings.requestfailed,
    handler: js.Function2[/* e */ Request, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_requestfinished(
    eventName: puppeteerLib.puppeteerLibStrings.requestfinished,
    handler: js.Function2[/* e */ Request, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_response(
    eventName: puppeteerLib.puppeteerLibStrings.response,
    handler: js.Function2[/* e */ Response, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_workercreated(
    eventName: puppeteerLib.puppeteerLibStrings.workercreated,
    handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_workerdestroyed(
    eventName: puppeteerLib.puppeteerLibStrings.workerdestroyed,
    handler: js.Function2[/* e */ Worker, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Generates a PDF of the page with `print` css media.
    * To generate a pdf with `screen` media, call `page.emulateMedia('screen')` before calling `page.pdf()`:
    * @param options The PDF parameters.
    */
  def pdf(): js.Promise[nodeLib.Buffer] = js.native
  def pdf(options: PDFOptions): js.Promise[nodeLib.Buffer] = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * The method iterates JavaScript heap and finds all the objects with the given prototype.
    * @param prototypeHandle A handle to the object prototype.
    */
  def queryObjects(prototypeHandle: JSHandle): js.Promise[JSHandle] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /**
    * Reloads the current page.
    * @param options The navigation parameters.
    */
  def reload(): js.Promise[Response] = js.native
  def reload(options: NavigationOptions): js.Promise[Response] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Captures a screenshot of the page.
    * @param options The screenshot options.
    */
  def screenshot(): js.Promise[java.lang.String] = js.native
  def screenshot(options: Base64ScreenShotOptions): js.Promise[java.lang.String] = js.native
  def screenshot(options: BinaryScreenShotOptions): js.Promise[nodeLib.Buffer] = js.native
  def screenshot(options: ScreenshotOptions): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
    * Toggles bypassing page's Content-Security-Policy.
    * NOTE CSP bypassing happens at the moment of CSP initialization rather then evaluation.
    * Usually this means that page.setBypassCSP should be called before navigating to the domain.
    * @param enabled sets bypassing of page's Content-Security-Policy.
    */
  def setBypassCSP(enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Determines whether cache is enabled on the page.
    * @param [enabled=true] Whether or not to enable cache on the page.
    */
  def setCacheEnabled(): js.Promise[scala.Unit] = js.native
  def setCacheEnabled(enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Sets the cookies on the page.
    * @param cookies The cookies to set.
    */
  def setCookie(cookies: SetCookie*): js.Promise[scala.Unit] = js.native
  /**
    * This setting will change the default maximum navigation time of 30 seconds for the following methods:
    * - `page.goto`
    * - `page.goBack`
    * - `page.goForward`
    * - `page.reload`
    * - `page.waitForNavigation`
    */
  def setDefaultNavigationTimeout(timeout: scala.Double): scala.Unit = js.native
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
  def setDefaultTimeout(timeout: scala.Double): scala.Unit = js.native
  /**
    * The extra HTTP headers will be sent with every request the page initiates.
    * @param headers An object containing additional http headers to be sent with every request. All header values must be strings.
    */
  def setExtraHTTPHeaders(headers: Headers): js.Promise[scala.Unit] = js.native
  /**
    * Sets the page's geolocation.
    */
  def setGeolocation(options: GeoOptions): js.Promise[scala.Unit] = js.native
  /**
    * Determines whether JavaScript is enabled on the page.
    * @param enable Whether or not to enable JavaScript on the page.
    */
  def setJavaScriptEnabled(enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  /**
    * Determines whether the offline mode is enabled.
    * @param enabled When `true`, enables the offline mode for the page.
    */
  def setOfflineMode(enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Determines whether the request interception is enabled.
    * @param enabled When `true` the methods `request.abort`, `request.continue` and `request.respond` must be used.
    */
  def setRequestInterception(enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Specifies the User-Agent used in this page.
    * @param userAgent The user-agent to be used in the page.
    */
  def setUserAgent(userAgent: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Sets the viewport of the page.
    * @param viewport The viewport parameters.
    */
  def setViewport(viewport: Viewport): js.Promise[scala.Unit] = js.native
  /** @returns The target this page was created from */
  def target(): Target = js.native
  /** Gets the page viewport. */
  def viewport(): Viewport = js.native
  def waitForRequest(urlOrPredicate: java.lang.String): js.Promise[Request] = js.native
  def waitForRequest(urlOrPredicate: java.lang.String, options: Timeoutable): js.Promise[Request] = js.native
  def waitForRequest(urlOrPredicate: js.Function1[/* req */ Request, scala.Boolean]): js.Promise[Request] = js.native
  def waitForRequest(urlOrPredicate: js.Function1[/* req */ Request, scala.Boolean], options: Timeoutable): js.Promise[Request] = js.native
  def waitForResponse(urlOrPredicate: java.lang.String): js.Promise[Response] = js.native
  def waitForResponse(urlOrPredicate: java.lang.String, options: Timeoutable): js.Promise[Response] = js.native
  def waitForResponse(urlOrPredicate: js.Function1[/* res */ Response, scala.Boolean]): js.Promise[Response] = js.native
  def waitForResponse(urlOrPredicate: js.Function1[/* res */ Response, scala.Boolean], options: Timeoutable): js.Promise[Response] = js.native
  /** This method returns all of the dedicated WebWorkers associated with the page. */
  def workers(): js.Array[Worker] = js.native
}

