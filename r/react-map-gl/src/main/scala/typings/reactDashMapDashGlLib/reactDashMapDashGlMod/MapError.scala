package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapError extends js.Object {
  var error: js.UndefOr[reactDashMapDashGlLib.Anon_Message] = js.undefined
  var status: scala.Double
}

object MapError {
  @scala.inline
  def apply(status: scala.Double, error: reactDashMapDashGlLib.Anon_Message = null): MapError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MapError]
  }
}

