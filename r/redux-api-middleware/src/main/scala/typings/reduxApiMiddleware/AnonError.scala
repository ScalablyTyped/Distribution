package typings.reduxApiMiddleware

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[`false`] = js.undefined
  var `type`: String | js.Symbol
}

object AnonError {
  @scala.inline
  def apply(`type`: String | js.Symbol, error: `false` = null): AnonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

