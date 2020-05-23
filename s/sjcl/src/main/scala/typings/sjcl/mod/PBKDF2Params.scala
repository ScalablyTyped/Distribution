package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait PBKDF2Params extends js.Object {
  var iter: js.UndefOr[Double] = js.undefined
  var salt: js.UndefOr[BitArray_] = js.undefined
}

object PBKDF2Params {
  @scala.inline
  def apply(iter: js.UndefOr[Double] = js.undefined, salt: BitArray_ = null): PBKDF2Params = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iter)) __obj.updateDynamic("iter")(iter.get.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBKDF2Params]
  }
}

