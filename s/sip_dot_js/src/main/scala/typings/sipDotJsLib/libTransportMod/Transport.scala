package typings
package sipDotJsLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Transport", "Transport")
@js.native
abstract class Transport protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(logger: sipDotJsLib.libLoggerFactoryMod.Logger, options: js.Any) = this()
  var logger: sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  var server: js.Any = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def afterConnected(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Returns the promise designated by the child layer then emits a connected event.
    * Automatically emits an event upon resolution, unless overrideEvent is set. If you
    * override the event in this fashion, you should emit it in your implementation of connectPromise
    * @param {Object} [options]
    * @returns {Promise}
    */
  def connect(): js.Promise[scala.Unit] = js.native
  def connect(options: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Called by connect, must return a promise
    * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
    * @abstract
    * @private
    * @param {Object} [options]
    * @returns {Promise}
    */
  /* protected */ def connectPromise(options: js.Any): js.Promise[_] = js.native
  /**
    * Returns the promise designated by the child layer then emits a
    * disconnected event. Automatically emits an event upon resolution,
    * unless overrideEvent is set. If you override the event in this fashion,
    * you should emit it in your implementation of disconnectPromise
    * @param {Object} [options]
    * @returns {Promise}
    */
  def disconnect(): js.Promise[scala.Unit] = js.native
  def disconnect(options: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Called by disconnect, must return a promise
    * promise must resolve to an object. object supports 1 parameter: overrideEvent - Boolean
    * @abstract
    * @private
    * @param {Object} [options]
    * @returns {Promise}
    */
  /* protected */ def disconnectPromise(options: js.Any): js.Promise[_] = js.native
  /**
    * Returns true if the transport is connected
    * @returns {Boolean}
    */
  def isConnected(): scala.Boolean = js.native
  /**
    * To be called when a message is received
    * @param {Event} e
    */
  /* protected */ def onMessage(e: js.Any): scala.Unit = js.native
  /**
    * Sends a message then emits a 'messageSent' event. Automatically emits an
    * event upon resolution, unless data.overrideEvent is set. If you override
    * the event in this fashion, you should emit it in your implementation of sendPromise
    * @param {String} msg
    * @param {Object} options
    * @returns {Promise}
    */
  def send(msg: java.lang.String): js.Promise[scala.Unit] = js.native
  def send(msg: java.lang.String, options: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Called by send, must return a promise
    * promise must resolve to an object. object supports 2 parameters: msg - string (mandatory)
    * and overrideEvent - Boolean (optional)
    * @abstract
    * @private
    * @param {String} msg
    * @param {Object} [options]
    * @returns {Promise}
    */
  /* protected */ def sendPromise(msg: java.lang.String): js.Promise[_] = js.native
  /* protected */ def sendPromise(msg: java.lang.String, options: js.Any): js.Promise[_] = js.native
  /**
    * Returns a promise which resolves once the UA is connected. DEPRECATION WARNING: just use afterConnected()
    * @returns {Promise}
    */
  def waitForConnected(): js.Promise[scala.Unit] = js.native
}

