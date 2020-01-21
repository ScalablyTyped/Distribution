package typings.puppeteer.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.eventsMod.EventEmitter
import typings.puppeteer.puppeteerStrings.disconnected
import typings.puppeteer.puppeteerStrings.targetchanged
import typings.puppeteer.puppeteerStrings.targetcreated
import typings.puppeteer.puppeteerStrings.targetdestroyed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser
  extends EventEmitter
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
  def close(): js.Promise[Unit] = js.native
  /**
    * Creates a new incognito browser context.
    * This won't share cookies/cache with other browser contexts.
    */
  def createIncognitoBrowserContext(): js.Promise[BrowserContext] = js.native
  /**
    * Returns the default browser context.
    * The default browser context can not be closed.
    */
  def defaultBrowserContext(): BrowserContext = js.native
  /**
    * Disconnects Puppeteer from the browser, but leaves the Chromium process running.
    * After calling `disconnect`, the browser object is considered disposed and cannot be used anymore.
    */
  def disconnect(): Unit = js.native
  /** Indicates that the browser is connected. */
  def isConnected(): Boolean = js.native
  /** Promise which resolves to a new Page object. */
  def newPage(): js.Promise[Page] = js.native
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_disconnected(
    eventName: disconnected,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_targetchanged(eventName: targetchanged, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_targetcreated(eventName: targetcreated, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_targetdestroyed(eventName: targetdestroyed, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_disconnected(
    eventName: disconnected,
    handler: js.Function2[/* e */ js.UndefOr[scala.Nothing], /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_targetchanged(eventName: targetchanged, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_targetcreated(eventName: targetcreated, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_targetdestroyed(eventName: targetdestroyed, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  /** Promise which resolves to an array of all open pages. */
  def pages(): js.Promise[js.Array[Page]] = js.native
  /** Spawned browser process. Returns `null` if the browser instance was created with `puppeteer.connect` method */
  def process(): ChildProcess = js.native
  /** A target associated with the browser. */
  def target(): Target = js.native
  /** Promise which resolves to an array of all active targets. */
  def targets(): js.Promise[js.Array[Target]] = js.native
  /**
    * Promise which resolves to the browser's original user agent.
    * **NOTE** Pages can override browser user agent with `page.setUserAgent`.
    */
  def userAgent(): js.Promise[String] = js.native
  /** For headless Chromium, this is similar to HeadlessChrome/61.0.3153.0. For non-headless, this is similar to Chrome/61.0.3153.0. */
  def version(): js.Promise[String] = js.native
  /** Browser websocket endpoint which can be used as an argument to puppeteer.connect. The format is ws://${host}:${port}/devtools/browser/<id> */
  def wsEndpoint(): String = js.native
}

