package typings.shopifyPrime.shopifyErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorType3 extends js.Object {
  var error: String = js.native
  var error_description: String = js.native
}

object ErrorType3 {
  @scala.inline
  def apply(error: String, error_description: String): ErrorType3 = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorType3]
  }
  @scala.inline
  implicit class ErrorType3Ops[Self <: ErrorType3] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_description(value: String): Self = this.set("error_description", value.asInstanceOf[js.Any])
  }
  
}

