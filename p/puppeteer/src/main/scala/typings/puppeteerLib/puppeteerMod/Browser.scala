package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser
  extends nodeLib.eventsMod.EventEmitter
     with TargetAwaiter {
  /**
     * Returns an array of all open browser contexts.
     * In a newly created browser, this will return a single instance of BrowserContext.
     */
  def browserContexts(): js.Array[BrowserContext] = js.native
  /**
     * Closes browser with all the pages (if any were opened).
     * The browser object itself is considered to be disposed and can not be used anymore.
     */
  def close(): stdLib.Promise[scala.Unit] = js.native
  /**
     * Creates a new incognito browser context.
     * This won't share cookies/cache with other browser contexts.
     */
  def createIncognitoBrowserContext(): stdLib.Promise[BrowserContext] = js.native
  /**
     * Returns the default browser context.
     * The default browser context can not be closed.
     */
  def defaultBrowserContext(): BrowserContext = js.native
  /**
     * Disconnects Puppeteer from the browser, but leaves the Chromium process running.
     * After calling `disconnect`, the browser object is considered disposed and cannot be used anymore.
     */
  def disconnect(): scala.Unit = js.native
  /** Promise which resolves to a new Page object. */
  def newPage(): stdLib.Promise[Page] = js.native
  /**
     * Adds the listener function to the end of the listeners array for the event named `eventName`.
     * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
     * `eventName` and listener will result in the listener being added, and called, multiple times.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("on")
  def on_disconnected(
    eventName: puppeteerLib.puppeteerLibStrings.disconnected,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds the listener function to the end of the listeners array for the event named `eventName`.
     * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
     * `eventName` and listener will result in the listener being added, and called, multiple times.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("on")
  def on_targetchanged(
    eventName: puppeteerLib.puppeteerLibStrings.targetchanged,
    handler: js.Function2[/* e */ Target, /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds the listener function to the end of the listeners array for the event named `eventName`.
     * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
     * `eventName` and listener will result in the listener being added, and called, multiple times.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("on")
  def on_targetcreated(
    eventName: puppeteerLib.puppeteerLibStrings.targetcreated,
    handler: js.Function2[/* e */ Target, /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds the listener function to the end of the listeners array for the event named `eventName`.
     * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
     * `eventName` and listener will result in the listener being added, and called, multiple times.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("on")
  def on_targetdestroyed(
    eventName: puppeteerLib.puppeteerLibStrings.targetdestroyed,
    handler: js.Function2[/* e */ Target, /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds a one time listener function for the event named `eventName`.
     * The next time `eventName` is triggered, this listener is removed and then invoked.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("once")
  def once_disconnected(
    eventName: puppeteerLib.puppeteerLibStrings.disconnected,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds a one time listener function for the event named `eventName`.
     * The next time `eventName` is triggered, this listener is removed and then invoked.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("once")
  def once_targetchanged(
    eventName: puppeteerLib.puppeteerLibStrings.targetchanged,
    handler: js.Function2[/* e */ Target, /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds a one time listener function for the event named `eventName`.
     * The next time `eventName` is triggered, this listener is removed and then invoked.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("once")
  def once_targetcreated(
    eventName: puppeteerLib.puppeteerLibStrings.targetcreated,
    handler: js.Function2[/* e */ Target, /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /**
     * Adds a one time listener function for the event named `eventName`.
     * The next time `eventName` is triggered, this listener is removed and then invoked.
     * @param event The name of the event.
     * @param handler The callback function.
     */
  @JSName("once")
  def once_targetdestroyed(
    eventName: puppeteerLib.puppeteerLibStrings.targetdestroyed,
    handler: js.Function2[/* e */ Target, /* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /** Promise which resolves to an array of all open pages. */
  def pages(): stdLib.Promise[js.Array[Page]] = js.native
  /** Spawned browser process. Returns `null` if the browser instance was created with `puppeteer.connect` method */
  def process(): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  /** A target associated with the browser. */
  def target(): Target = js.native
  /** Promise which resolves to an array of all active targets. */
  def targets(): stdLib.Promise[js.Array[Target]] = js.native
  /**
     * Promise which resolves to the browser's original user agent.
     * **NOTE** Pages can override browser user agent with `page.setUserAgent`.
     */
  def userAgent(): stdLib.Promise[java.lang.String] = js.native
  /** For headless Chromium, this is similar to HeadlessChrome/61.0.3153.0. For non-headless, this is similar to Chrome/61.0.3153.0. */
  def version(): stdLib.Promise[java.lang.String] = js.native
  /** Browser websocket endpoint which can be used as an argument to puppeteer.connect. The format is ws://${host}:${port}/devtools/browser/<id> */
  def wsEndpoint(): java.lang.String = js.native
}

