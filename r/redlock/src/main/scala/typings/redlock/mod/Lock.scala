package typings.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object of this type is returned when a resource is successfully locked.
  * It contains convenience methods `unlock` and `extend` which perform
  * the associated Redlock method on itself.
  */
@JSImport("redlock", "Lock")
@js.native
class Lock protected () extends js.Object {
  def this(redlock: Redlock, resource: String, value: String, expiration: Double, attempts: Double) = this()
  def this(redlock: Redlock, resource: String, value: Null, expiration: Double, attempts: Double) = this()
  var attempts: Double = js.native
  var expiration: Double = js.native
  var redlock: Redlock = js.native
  var resource: String = js.native
  var value: String | Null = js.native
  def extend(ttl: Double): typings.bluebird.mod.^[Lock] = js.native
  def extend(ttl: Double, callback: Callback[Lock]): typings.bluebird.mod.^[Lock] = js.native
  def unlock(): typings.bluebird.mod.^[Unit] = js.native
  def unlock(callback: Callback[Unit]): typings.bluebird.mod.^[Unit] = js.native
}

