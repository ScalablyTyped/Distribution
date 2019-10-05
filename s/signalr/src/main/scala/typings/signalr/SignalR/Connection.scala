package typings.signalr.SignalR

import typings.jquery.JQueryPromise
import typings.std.JSON
import typings.std.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var ajaxDataType: String = js.native
  var clientProtocol: String = js.native
  var contentType: String = js.native
  /**
    * This should be set by the server in response to the negotiate request (30s default)
    */
  var disconnectTimeout: Double = js.native
  var hub: typings.signalr.SignalR.Hub.Connection = js.native
  var id: String = js.native
  var json: JSON = js.native
  /**
    * Warn user of slow connection if we breach the X% mark of the keep alive timeout
    */
  var keepAliveWarnAt: Double = js.native
  var lastError: ConnectionError = js.native
  var logging: Boolean = js.native
  var qs: String | js.Object = js.native
  var reconnectDelay: Double = js.native
  /**
    * This should be set by the server in response to the negotiate request
    */
  var reconnectWindow: Double = js.native
  var resources: Resources = js.native
  var state: Double = js.native
  var transportConnectTimeout: Double = js.native
  var url: String = js.native
  /**
    * Adds a callback that will be invoked when the client detects a slow connection
    *
    * @param calback A callback function to execute when the connection is slow
    */
  def connectionSlow(callback: js.Function0[Unit]): Connection = js.native
  /**
    * Adds a callback that will be invoked when the client disconnects
    *
    * @param calback A callback function to execute when the connection is broken
    */
  def disconnected(callback: js.Function0[Unit]): Connection = js.native
  /**
    * Adds a callback that will be invoked after an error occurs with the connection
    *
    * @param calback A callback function to execute when an error occurs on the connection
    */
  def error(callback: js.Function1[/* error */ ConnectionError, Unit]): Connection = js.native
  /**
    * Checks if url is cross domain
    *
    * @param url The base URL
    * @param against An optional argument to compare the URL against, if not specified it will be set to window.location. If specified it must contain a protocol and a host property.
    */
  def isCrossDomain(url: String): Boolean = js.native
  def isCrossDomain(url: String, against: SimplifyLocation): Boolean = js.native
  def isCrossDomain(url: String, against: Location): Boolean = js.native
  def log(msg: String): Connection = js.native
  /**
    * Adds a callback that will be invoked after anything is received over the connection
    *
    * @param calback A callback function to execute when any data is received on the connection
    */
  def received(callback: js.Function1[/* data */ js.Any, Unit]): Connection = js.native
  /**
    * Adds a callback that will be invoked when the underlying transport reconnects
    *
    * @param calback A callback function to execute when the connection is restored
    */
  def reconnected(callback: js.Function0[Unit]): Connection = js.native
  /**
    * Adds a callback that will be invoked when the underlying transport begins reconnecting
    *
    * @param calback A callback function to execute when the connection enters a reconnecting state
    */
  def reconnecting(callback: js.Function0[Unit]): Connection = js.native
  /**
    * Sends data over the connection
    *
    * @param options Options map
    * @param calback The data to send over the connection
    */
  def send(data: String): Connection = js.native
  /**
    * Starts the connection
    */
  def start(): JQueryPromise[_] = js.native
  /**
    * Starts the connection
    *
    * @param callback A callback function to execute when the connection has started
    */
  def start(callback: js.Function0[Unit]): JQueryPromise[_] = js.native
  /**
    * Starts the connection
    *
    * @param options Options map
    */
  def start(options: ConnectionOptions): JQueryPromise[_] = js.native
  /**
    * Starts the connection
    *
    * @param options Options map
    * @param calback A callback function to execute when the connection has started
    */
  def start(options: ConnectionOptions, callback: js.Function0[Unit]): JQueryPromise[_] = js.native
  /**
    * Adds a callback that will be invoked before anything is sent over the connection
    *
    * @param calback A callback function to execute before the connection is fully instantiated.
    */
  def starting(callback: js.Function0[Unit]): Connection = js.native
  /**
    * Adds a callback that will be invoked when the connection state changes
    *
    * @param calback A callback function to execute when the connection state changes
    */
  def stateChanged(callback: js.Function1[/* change */ StateChanged, Unit]): Connection = js.native
  /**
    * Stops listening
    *
    * @param async Whether or not to asynchronously abort the connection
    * @param notifyServer Whether we want to notify the server that we are aborting the connection
    */
  def stop(): Connection = js.native
  def stop(async: Boolean): Connection = js.native
  def stop(async: Boolean, notifyServer: Boolean): Connection = js.native
}

