package typings.sipDotJs.libCoreTransportMod

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.Anon_MsgOverrideEvent
import typings.sipDotJs.libCoreLogMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transport", "Transport")
@js.native
abstract class Transport protected () extends EventEmitter {
  /**
    * Constructor
    * @param logger - Logger.
    * @param options - Options bucket. Deprecated.
    */
  def this(logger: Logger) = this()
  def this(logger: Logger, options: js.Any) = this()
  var logger: Logger = js.native
  var server: js.Any = js.native
  def afterConnected(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Returns the promise designated by the child layer then emits a connected event.
    * Automatically emits an event upon resolution, unless overrideEvent is set. If you
    * override the event in this fashion, you should emit it in your implementation of connectPromise
    * @param options - Options bucket.
    */
  def connect(): js.Promise[Unit] = js.native
  def connect(options: js.Any): js.Promise[Unit] = js.native
  /**
    * Called by connect, must return a promise
    * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
    * @param options - Options bucket.
    */
  /* protected */ def connectPromise(options: js.Any): js.Promise[_] = js.native
  /**
    * Returns the promise designated by the child layer then emits a
    * disconnected event. Automatically emits an event upon resolution,
    * unless overrideEvent is set. If you override the event in this fashion,
    * you should emit it in your implementation of disconnectPromise
    * @param options - Options bucket
    */
  def disconnect(): js.Promise[Unit] = js.native
  def disconnect(options: js.Any): js.Promise[Unit] = js.native
  /**
    * Called by disconnect, must return a promise
    * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
    * @param options - Options bucket.
    */
  /* protected */ def disconnectPromise(options: js.Any): js.Promise[_] = js.native
  /**
    * Returns true if the transport is connected
    */
  def isConnected(): Boolean = js.native
  /**
    * To be called when a message is received
    * @param e - Event
    */
  /* protected */ def onMessage(e: js.Any): Unit = js.native
  /**
    * Sends a message then emits a 'messageSent' event. Automatically emits an
    * event upon resolution, unless data.overrideEvent is set. If you override
    * the event in this fashion, you should emit it in your implementation of sendPromise
    * Rejects with an Error if message fails to send.
    * @param message - Message.
    * @param options - Options bucket.
    */
  def send(message: String): js.Promise[Unit] = js.native
  def send(message: String, options: js.Any): js.Promise[Unit] = js.native
  /**
    * Called by send.
    * @param message - Message.
    * @param options - Options bucket.
    */
  /* protected */ def sendPromise(message: String): js.Promise[Anon_MsgOverrideEvent] = js.native
  /* protected */ def sendPromise(message: String, options: js.Any): js.Promise[Anon_MsgOverrideEvent] = js.native
  /**
    * Returns a promise which resolves once the UA is connected. DEPRECATION WARNING: just use afterConnected()
    */
  def waitForConnected(): js.Promise[Unit] = js.native
}

