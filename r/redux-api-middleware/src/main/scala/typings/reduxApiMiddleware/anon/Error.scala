package typings.reduxApiMiddleware.anon

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[`false`] = js.undefined
  var `type`: String | js.Symbol
}

object Error {
  @scala.inline
  def apply(`type`: String | js.Symbol, error: `false` = null): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

