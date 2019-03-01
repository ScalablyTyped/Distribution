package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait Pbkdf2Params extends js.Object {
  var iter: js.UndefOr[scala.Double] = js.undefined
  var salt: js.UndefOr[BitArray] = js.undefined
}

object Pbkdf2Params {
  @scala.inline
  def apply(iter: scala.Int | scala.Double = null, salt: BitArray = null): Pbkdf2Params = {
    val __obj = js.Dynamic.literal()
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[Pbkdf2Params]
  }
}

