package typings
package reactDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasError extends js.Object {
  var hasError: scala.Boolean
  var isLoading: scala.Boolean
}

object Anon_HasError {
  @scala.inline
  def apply(hasError: scala.Boolean, isLoading: scala.Boolean): Anon_HasError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasError")(hasError)
    __obj.updateDynamic("isLoading")(isLoading)
    __obj.asInstanceOf[Anon_HasError]
  }
}

