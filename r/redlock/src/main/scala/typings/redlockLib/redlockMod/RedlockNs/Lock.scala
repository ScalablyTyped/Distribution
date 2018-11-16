package typings
package redlockLib.redlockMod.RedlockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lock extends js.Object {
  var expiration: scala.Double = js.native
  var redlock: redlockLib.redlockMod.Redlock = js.native
  var resource: java.lang.String = js.native
  var value: java.lang.String | scala.Null = js.native
  def extend(ttl: scala.Double): bluebirdLib.bluebirdMod.namespaced[Lock] = js.native
  def extend(ttl: scala.Double, callback: Callback[Lock]): bluebirdLib.bluebirdMod.namespaced[Lock] = js.native
  def unlock(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def unlock(callback: Callback[scala.Unit]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
}

