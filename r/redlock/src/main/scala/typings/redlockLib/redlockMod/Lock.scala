package typings
package redlockLib.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redlock", "Lock")
@js.native
class Lock protected () extends js.Object {
  def this(redlock: Redlock, resource: java.lang.String, value: java.lang.String, expiration: scala.Double) = this()
  def this(redlock: Redlock, resource: java.lang.String, value: scala.Null, expiration: scala.Double) = this()
  var expiration: scala.Double = js.native
  var redlock: Redlock = js.native
  var resource: java.lang.String = js.native
  var value: java.lang.String | scala.Null = js.native
  def extend(ttl: scala.Double): bluebirdLib.bluebirdMod.^[Lock] = js.native
  def extend(ttl: scala.Double, callback: Callback[Lock]): bluebirdLib.bluebirdMod.^[Lock] = js.native
  def unlock(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def unlock(callback: Callback[scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
}

