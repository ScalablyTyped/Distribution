package typings
package sipDotJsLib.libCoreTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transport", "Transport")
@js.native
abstract class Transport protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(logger: sipDotJsLib.libCoreLogMod.Logger, options: js.Any) = this()
  var logger: sipDotJsLib.libCoreLogMod.Logger = js.native
  var server: js.Any = js.native
  def afterConnected(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Returns the promise designated by the child layer then emits a connected event.
    * Automatically emits an event upon resolution, unless overrideEvent is set. If you
    * override the event in this fashion, you should emit it in your implementation of connectPromise
    * @param options - Options bucket.
    */
  def connect(): js.Promise[scala.Unit] = js.native
  def connect(options: js.Any): js.Promise[scala.Unit] = js.native
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
  def disconnect(): js.Promise[scala.Unit] = js.native
  def disconnect(options: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Called by disconnect, must return a promise
    * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
    * @param options - Options bucket.
    */
  /* protected */ def disconnectPromise(options: js.Any): js.Promise[_] = js.native
  /**
    * Returns true if the transport is connected
    */
  def isConnected(): scala.Boolean = js.native
  /**
    * To be called when a message is received
    * @param e - Event
    */
  /* protected */ def onMessage(e: js.Any): scala.Unit = js.native
  /**
    * Sends a message then emits a 'messageSent' event. Automatically emits an
    * event upon resolution, unless data.overrideEvent is set. If you override
    * the event in this fashion, you should emit it in your implementation of sendPromise
    * @param msg - Message.
    * @param options - Options bucket.
    */
  def send(msg: java.lang.String): js.Promise[scala.Unit] = js.native
  def send(msg: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Called by send, must return a promise
    * promise must resolve to an object. object supports 2 parameters: msg - string (mandatory)
    * and overrideEvent - Boolean (optional)
    * @param msg - Message.
    * @param options - Options bucket.
    */
  /* protected */ def sendPromise(msg: java.lang.String): js.Promise[_] = js.native
  /* protected */ def sendPromise(msg: java.lang.String, options: js.Any): js.Promise[_] = js.native
  /**
    * Returns a promise which resolves once the UA is connected. DEPRECATION WARNING: just use afterConnected()
    */
  def waitForConnected(): js.Promise[scala.Unit] = js.native
}

