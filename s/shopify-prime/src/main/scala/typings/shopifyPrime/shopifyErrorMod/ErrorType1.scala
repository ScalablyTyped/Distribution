package typings.shopifyPrime.shopifyErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorType1 extends js.Object {
  var errors: String = js.native
}

object ErrorType1 {
  @scala.inline
  def apply(errors: String): ErrorType1 = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorType1]
  }
  @scala.inline
  implicit class ErrorType1Ops[Self <: ErrorType1] (val x: Self) extends AnyVal {
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
    def setErrors(value: String): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

