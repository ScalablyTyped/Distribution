package typings
package redlockLib.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redlock
  extends eventsLib.eventsMod.EventEmitter {
  var Lock: ScalablyTyped.runtime.Instantiable4[
    /* redlock */ Redlock, 
    /* resource */ java.lang.String, 
    /* value */ java.lang.String | scala.Null, 
    /* expiration */ scala.Double, 
    redlockLib.redlockMod.RedlockNs.Lock
  ] = js.native
  var LockError: ScalablyTyped.runtime.Instantiable1[
    /* message */ js.UndefOr[/* message */ java.lang.String], 
    redlockLib.redlockMod.RedlockNs.LockError
  ] = js.native
  var driftFactor: scala.Double = js.native
  var retryCount: scala.Double = js.native
  var retryDelay: scala.Double = js.native
  var retryJitter: scala.Double = js.native
  var servers: js.Array[redlockLib.redlockMod.RedlockNs.CompatibleRedisClient] = js.native
  def acquire(resource: java.lang.String, ttl: scala.Double): bluebirdLib.bluebirdMod.namespaced[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  def acquire(
    resource: java.lang.String,
    ttl: scala.Double,
    callback: redlockLib.redlockMod.RedlockNs.Callback[redlockLib.redlockMod.RedlockNs.Lock]
  ): bluebirdLib.bluebirdMod.namespaced[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  @JSName("addListener")
  def addListener_clientError(
    event: redlockLib.redlockLibStrings.clientError,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  def disposer(resource: java.lang.String, ttl: scala.Double): bluebirdLib.bluebirdMod.Disposer[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  def disposer(
    resource: java.lang.String,
    ttl: scala.Double,
    errorHandler: redlockLib.redlockMod.RedlockNs.Callback[scala.Unit]
  ): bluebirdLib.bluebirdMod.Disposer[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  def extend(lock: redlockLib.redlockMod.RedlockNs.Lock, ttl: scala.Double): bluebirdLib.bluebirdMod.namespaced[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  def extend(
    lock: redlockLib.redlockMod.RedlockNs.Lock,
    ttl: scala.Double,
    callback: redlockLib.redlockMod.RedlockNs.Callback[redlockLib.redlockMod.RedlockNs.Lock]
  ): bluebirdLib.bluebirdMod.namespaced[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  def lock(resource: java.lang.String, ttl: scala.Double): bluebirdLib.bluebirdMod.namespaced[redlockLib.redlockMod.RedlockNs.Lock] = js.native
  def lock(
    resource: java.lang.String,
    ttl: scala.Double,
    callback: redlockLib.redlockMod.RedlockNs.Callback[redlockLib.redlockMod.RedlockNs.Lock]
  ): bluebirdLib.bluebirdMod.namespaced[redlockLib.redlockMod.RedlockNs.Lock] = js.native
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
  def release(lock: redlockLib.redlockMod.RedlockNs.Lock): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def release(
    lock: redlockLib.redlockMod.RedlockNs.Lock,
    callback: redlockLib.redlockMod.RedlockNs.Callback[scala.Unit]
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  @JSName("removeListener")
  def removeListener_clientError(
    event: redlockLib.redlockLibStrings.clientError,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  def unlock(lock: redlockLib.redlockMod.RedlockNs.Lock): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def unlock(
    lock: redlockLib.redlockMod.RedlockNs.Lock,
    callback: redlockLib.redlockMod.RedlockNs.Callback[scala.Unit]
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
}

