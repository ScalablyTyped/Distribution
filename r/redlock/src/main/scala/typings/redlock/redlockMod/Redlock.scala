package typings.redlock.redlockMod

import typings.bluebird.bluebirdMod.Disposer
import typings.node.eventsMod.EventEmitter
import typings.redlock.redlockStrings.clientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redlock extends EventEmitter {
  var Lock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.Lock */ js.Any = js.native
  var LockError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.LockError */ js.Any = js.native
  var driftFactor: Double = js.native
  var retryCount: Double = js.native
  var retryDelay: Double = js.native
  var retryJitter: Double = js.native
  var servers: js.Array[CompatibleRedisClient] = js.native
  def acquire(resource: String, ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def acquire(resource: String, ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def acquire(resource: js.Array[String], ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def acquire(resource: js.Array[String], ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  @JSName("addListener")
  def addListener_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  def disposer(resource: String, ttl: Double): Disposer[Lock] = js.native
  def disposer(resource: String, ttl: Double, errorHandler: Callback[Unit]): Disposer[Lock] = js.native
  def extend(lock: Lock, ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def extend(lock: Lock, ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: String, ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: String, ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: js.Array[String], ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def lock(resource: js.Array[String], ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  @JSName("on")
  def on_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  def release(lock: Lock): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def release(lock: Lock, callback: Callback[Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  @JSName("removeListener")
  def removeListener_clientError(event: clientError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  def unlock(lock: Lock): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def unlock(lock: Lock, callback: Callback[Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
}

