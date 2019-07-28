package typings.scryptDashJs

import typings.node.Buffer
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt-js", JSImport.Namespace)
@js.native
object scryptDashJsMod extends js.Object {
  def apply(
    password: Buffer | js.Array[Double] | Uint8Array,
    salt: Buffer | js.Array[Double] | Uint8Array,
    N: Double,
    r: Double,
    p: Double,
    dklen: Double,
    callback: js.Function3[
      /* error */ js.UndefOr[Error | Null], 
      /* progress */ Double, 
      /* key */ js.UndefOr[js.Array[Double]], 
      Unit
    ]
  ): Unit = js.native
}

