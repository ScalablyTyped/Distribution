package typings.reactMapGl.mod

import typings.reactMapGl.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapError extends js.Object {
  var error: js.UndefOr[AnonMessage] = js.undefined
  var status: Double
}

object MapError {
  @scala.inline
  def apply(status: Double, error: AnonMessage = null): MapError = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapError]
  }
}

