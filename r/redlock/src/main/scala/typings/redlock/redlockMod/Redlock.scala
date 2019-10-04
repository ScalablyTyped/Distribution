package typings.redlock.redlockMod

import typings.bluebird.bluebirdMod.Disposer
import typings.node.eventsMod.EventEmitter
import typings.redlock.redlockStrings.clientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit all the EventEmitter methods, like `on`, and `off`.
  */
@js.native
trait Redlock extends EventEmitter {
  /**
    * Attach a reference to Lock, which allows the application to use instanceof to ensure type.
    */
  var Lock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.Lock */ js.Any = js.native
  /**
    * Attach a reference to LockError, which allows the application to use instanceof to ensure type.
    */
  var LockError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.LockError */ js.Any = js.native
  var driftFactor: Double = js.native
  var retryCount: Double = js.native
  var retryDelay: Double = js.native
  var retryJitter: Double = js.native
  var servers: js.Array[CompatibleRedisClient] = js.native
  /**
    * This method locks a resource using the redlock algorithm.
    *
    * ```js
    * redlock.lock(
    *   'some-resource',       // the resource to lock
    *   2000,                  // ttl in ms
    *   function(err, lock) {  // callback function (optional)
    *     ...
    *   }
    * )
    * ```
    *
    * @param resource - one or more resources to lock
    * @param ttl - how long to keep the lock (milliseconds)
    */
  def acquire(resource: String, ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def acquire(resource: String, ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def acquire(resource: js.Array[String], ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def acquire(resource: js.Array[String], ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  /*
    * Functions inherited from EventEmitter
    * https://nodejs.org/api/events.html#events_class_eventemitter
    */
  /**
    * Subscribe to `clientError` events.
    * Alias for `on(event, listener)` function.
    */
  @JSName("addListener")
  def addListener_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * This method locks a resource using the redlock algorithm,
    * and returns a bluebird disposer.
    *
    * ```js
    * using(
    *     redlock.disposer(
    *         'some-resource',       // the resource to lock
    *         2000                   // ttl in ms
    *     ),
    *     function(lock) {
    *         ...
    *     }
    * );
    * ```
    *
    * @param resource - one or more resources to lock
    * @param ttl - how long to keep the lock (milliseconds)
    * @param errorHandler -- handle any errors when disposer tries to unlock the resource
    */
  def disposer(resource: String, ttl: Double): Disposer[Lock] = js.native
  def disposer(resource: String, ttl: Double, errorHandler: Callback[Unit]): Disposer[Lock] = js.native
  /**
    * This method extends a valid lock by the provided `ttl`.
    *
    * @param lock - the lock whose lease to extend
    * @param ttl - the new time to live value (milliseconds) from now
    * @param callback - be notified when lock's lease is extended
    */
  def extend(lock: Lock, ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def extend(lock: Lock, ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  /**
    * This method locks a resource using the redlock algorithm.
    *
    * ```js
    * redlock.lock(
    *   'some-resource',       // the resource to lock
    *   2000,                  // ttl in ms
    *   function(err, lock) {  // callback function (optional)
    *     ...
    *   }
    * )
    * ```
    *
    * @param resource - one or more resources to lock
    * @param ttl - how long to keep the lock (milliseconds)
    */
  def lock(resource: String, ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: String, ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: js.Array[String], ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: js.Array[String], ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  /**
    * Subscribe to `clientError` events.
    * Your callback is invoked every time this event is emitted.
    */
  @JSName("on")
  def on_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Subscribe to `clientError` events.
    * Your callback is invoked only once for this event.
    */
  @JSName("once")
  def once_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * This method runs `.quit()` on all client connections.
    */
  def quit(): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def quit(callback: Callback[Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * This method unlocks the provided lock from all servers still persisting it. It will fail
    * with an error if it is unable to release the lock on a quorum of nodes, but will make no
    * attempt to restore the lock on nodes that failed to release. It is safe to re-attempt an
    * unlock or to ignore the error, as the lock will automatically expire after its timeout.
    *
    * @param lock - the lock to release
    * @param callback - be notified once lock has been released by the clients
    */
  def release(lock: Lock): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def release(lock: Lock, callback: Callback[Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Unsubscribe from the `clientError` event.
    */
  @JSName("removeListener")
  def removeListener_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * This method unlocks the provided lock from all servers still persisting it. It will fail
    * with an error if it is unable to release the lock on a quorum of nodes, but will make no
    * attempt to restore the lock on nodes that failed to release. It is safe to re-attempt an
    * unlock or to ignore the error, as the lock will automatically expire after its timeout.
    *
    * @param lock - the lock to release
    * @param callback - be notified once lock has been released by the clients
    */
  def unlock(lock: Lock): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def unlock(lock: Lock, callback: Callback[Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
}

