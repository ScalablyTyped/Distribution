package typings
package redlockLib.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redlock", JSImport.Namespace)
@js.native
class namespaced protected () extends Redlock {
  def this(clients: js.Array[redlockLib.redlockMod.RedlockNs.CompatibleRedisClient]) = this()
  def this(clients: js.Array[redlockLib.redlockMod.RedlockNs.CompatibleRedisClient], options: redlockLib.redlockMod.RedlockNs.Options) = this()
}

