package typings.shopifyPrime.shopifyErrorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorType2 extends js.Object {
  var errors: StringDictionary[String | js.Array[String]] = js.native
}

object ErrorType2 {
  @scala.inline
  def apply(errors: StringDictionary[String | js.Array[String]]): ErrorType2 = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorType2]
  }
  @scala.inline
  implicit class ErrorType2Ops[Self <: ErrorType2] (val x: Self) extends AnyVal {
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
    def setErrors(value: StringDictionary[String | js.Array[String]]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

