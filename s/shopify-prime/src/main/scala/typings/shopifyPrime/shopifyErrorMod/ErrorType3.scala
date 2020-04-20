package typings.shopifyPrime.shopifyErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorType3 extends js.Object {
  var error: String
  var error_description: String
}

object ErrorType3 {
  @scala.inline
  def apply(error: String, error_description: String): ErrorType3 = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorType3]
  }
}

