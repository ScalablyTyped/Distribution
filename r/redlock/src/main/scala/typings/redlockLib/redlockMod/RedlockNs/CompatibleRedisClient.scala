package typings
package redlockLib.redlockMod.RedlockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleRedisClient extends js.Object {
  def eval(args: js.Any*): js.Any = js.native
  def eval(args: js.Array[_]): js.Any = js.native
  def eval(
    args: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* res */ js.Any, scala.Unit]
  ): js.Any = js.native
}

