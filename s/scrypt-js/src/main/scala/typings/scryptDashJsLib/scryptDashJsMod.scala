package typings
package scryptDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt-js", JSImport.Namespace)
@js.native
object scryptDashJsMod extends js.Object {
  def apply(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    N: scala.Double,
    r: scala.Double,
    p: scala.Double,
    dklen: scala.Double,
    callback: js.Function3[
      /* error */ js.UndefOr[stdLib.Error | scala.Null], 
      /* progress */ scala.Double, 
      /* key */ js.UndefOr[js.Array[scala.Double]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

