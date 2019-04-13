package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserContext
  extends nodeLib.eventsMod.EventEmitter
     with TargetAwaiter {
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /** The browser this browser context belongs to. */
  def browser(): Browser = js.native
  /**
    * Clears all permission overrides for the browser context.
    */
  def clearPermissionOverrides(): js.Promise[scala.Unit] = js.native
  /** Closes the browser context. All the targets that belong to the browser context will be closed. */
  def close(): js.Promise[scala.Unit] = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /**
    * Returns whether BrowserContext is incognito.
    * The default browser context is the only non-incognito browser context.
    */
  def isIncognito(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /** Creates a new page in the browser context. */
  def newPage(): js.Promise[Page] = js.native
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
  def on_targetchanged(
    eventName: puppeteerLib.puppeteerLibStrings.targetchanged,
    handler: js.Function2[/* e */ Target, /* repeated */ js.Any, scala.Unit]
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
    handler: js.Function2[/* e */ Target, /* repeated */ js.Any, scala.Unit]
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
    handler: js.Function2[/* e */ Target, /* repeated */ js.Any, scala.Unit]
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
  def once_targetchanged(
    eventName: puppeteerLib.puppeteerLibStrings.targetchanged,
    handler: js.Function2[/* e */ Target, /* repeated */ js.Any, scala.Unit]
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
    handler: js.Function2[/* e */ Target, /* repeated */ js.Any, scala.Unit]
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
    handler: js.Function2[/* e */ Target, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    *
    * @param origin The origin to grant permissions to, e.g. "https://example.com".
    * @param permissions An array of permissions to grant.
    * All permissions that are not listed here will be automatically denied.
    */
  def overridePermissions(origin: java.lang.String, permissions: js.Array[Permission]): js.Promise[scala.Unit] = js.native
  /** Promise which resolves to an array of all open pages. */
  def pages(): js.Promise[js.Array[Page]] = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
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
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  /** An array of all active targets inside the browser context. */
  def targets(): js.Array[Target] = js.native
}

