package typings.reactSvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasError extends js.Object {
  var hasError: Boolean
  var isLoading: Boolean
}

object HasError {
  @scala.inline
  def apply(hasError: Boolean, isLoading: Boolean): HasError = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasError]
  }
}

