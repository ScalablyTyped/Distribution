package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait PBKDF2Params extends js.Object {
  var iter: js.UndefOr[Double] = js.native
  var salt: js.UndefOr[BitArray_] = js.native
}

object PBKDF2Params {
  @scala.inline
  def apply(): PBKDF2Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PBKDF2Params]
  }
  @scala.inline
  implicit class PBKDF2ParamsOps[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIter(value: Double): Self = this.set("iter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIter: Self = this.set("iter", js.undefined)
    @scala.inline
    def setSaltVarargs(value: Double*): Self = this.set("salt", js.Array(value :_*))
    @scala.inline
    def setSalt(value: BitArray_): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
  
}

