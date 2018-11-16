package typings
package redlockLib.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redlock", "Lock")
@js.native
class Lock protected ()
  extends redlockLib.redlockMod.RedlockNs.Lock {
  def this(redlock: Redlock, resource: java.lang.String, value: java.lang.String, expiration: scala.Double) = this()
  def this(redlock: Redlock, resource: java.lang.String, value: scala.Null, expiration: scala.Double) = this()
}

