package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait Pbkdf2Params extends js.Object {
  var iter: js.UndefOr[Double] = js.undefined
  var salt: js.UndefOr[BitArray_] = js.undefined
}

object Pbkdf2Params {
  @scala.inline
  def apply(iter: Int | Double = null, salt: BitArray_ = null): Pbkdf2Params = {
    val __obj = js.Dynamic.literal()
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pbkdf2Params]
  }
}

