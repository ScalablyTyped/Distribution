package typings.reactSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasError extends js.Object {
  var hasError: Boolean
  var isLoading: Boolean
}

object AnonHasError {
  @scala.inline
  def apply(hasError: Boolean, isLoading: Boolean): AnonHasError = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHasError]
  }
}

