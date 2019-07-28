package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.reactDashMapDashGl.Anon_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapError extends js.Object {
  var error: js.UndefOr[Anon_Message] = js.undefined
  var status: Double
}

object MapError {
  @scala.inline
  def apply(status: Double, error: Anon_Message = null): MapError = {
    val __obj = js.Dynamic.literal(status = status)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MapError]
  }
}

