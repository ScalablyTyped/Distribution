package typings
package redlockLib.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redlock
  extends nodeLib.eventsMod.EventEmitter {
  var Lock: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.Lock */ js.Any = js.native
  var LockError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Redlock.LockError */ js.Any = js.native
  var driftFactor: scala.Double = js.native
  var retryCount: scala.Double = js.native
  var retryDelay: scala.Double = js.native
  var retryJitter: scala.Double = js.native
  var servers: js.Array[CompatibleRedisClient] = js.native
  def acquire(resource: java.lang.String, ttl: scala.Double): bluebirdLib.bluebirdMod.^[Lock] = js.native
  def acquire(resource: java.lang.String, ttl: scala.Double, callback: Callback[Lock]): bluebirdLib.bluebirdMod.^[Lock] = js.native
  @JSName("addListener")
  def addListener_clientError(
    event: redlockLib.redlockLibStrings.clientError,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  def disposer(resource: java.lang.String, ttl: scala.Double): bluebirdLib.bluebirdMod.Disposer[Lock] = js.native
  def disposer(resource: java.lang.String, ttl: scala.Double, errorHandler: Callback[scala.Unit]): bluebirdLib.bluebirdMod.Disposer[Lock] = js.native
  def extend(lock: Lock, ttl: scala.Double): bluebirdLib.bluebirdMod.^[Lock] = js.native
  def extend(lock: Lock, ttl: scala.Double, callback: Callback[Lock]): bluebirdLib.bluebirdMod.^[Lock] = js.native
  def lock(resource: java.lang.String, ttl: scala.Double): bluebirdLib.bluebirdMod.^[Lock] = js.native
  def lock(resource: java.lang.String, ttl: scala.Double, callback: Callback[Lock]): bluebirdLib.bluebirdMod.^[Lock] = js.native
  @JSName("on")
  def on_clientError(
    event: redlockLib.redlockLibStrings.clientError,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_clientError(
    event: redlockLib.redlockLibStrings.clientError,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  def release(lock: Lock): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def release(lock: Lock, callback: Callback[scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  @JSName("removeListener")
  def removeListener_clientError(
    event: redlockLib.redlockLibStrings.clientError,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  def unlock(lock: Lock): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def unlock(lock: Lock, callback: Callback[scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
}

