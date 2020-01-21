package typings.proj4leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrs extends js.Object {
  var crs: js.UndefOr[AnonProperties] = js.undefined
}

object AnonCrs {
  @scala.inline
  def apply(crs: AnonProperties = null): AnonCrs = {
    val __obj = js.Dynamic.literal()
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrs]
  }
}

