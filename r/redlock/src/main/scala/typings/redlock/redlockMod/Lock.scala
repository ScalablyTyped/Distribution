package typings.redlock.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redlock", "Lock")
@js.native
class Lock protected () extends js.Object {
  def this(redlock: Redlock, resource: String, value: String, expiration: Double) = this()
  def this(redlock: Redlock, resource: String, value: Null, expiration: Double) = this()
  var expiration: Double = js.native
  var redlock: Redlock = js.native
  var resource: String = js.native
  var value: String | Null = js.native
  def extend(ttl: Double): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def extend(ttl: Double, callback: Callback[Lock]): typings.bluebird.bluebirdMod.^[Lock] = js.native
  def unlock(): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def unlock(callback: Callback[Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
}

