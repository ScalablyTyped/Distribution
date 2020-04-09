package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  /**
    * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
    * properties in this object may not be valid.
    */
  var error: js.UndefOr[Double] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(error: Int | Double = null): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

