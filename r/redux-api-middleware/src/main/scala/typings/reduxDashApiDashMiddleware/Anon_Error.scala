package typings.reduxDashApiDashMiddleware

import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[`false`] = js.undefined
  var `type`: String | js.Symbol
}

object Anon_Error {
  @scala.inline
  def apply(`type`: String | js.Symbol, error: `false` = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Error]
  }
}

