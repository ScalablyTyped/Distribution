package typings.proj4leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crs extends js.Object {
  var crs: js.UndefOr[Anon_Properties] = js.undefined
}

object Anon_Crs {
  @scala.inline
  def apply(crs: Anon_Properties = null): Anon_Crs = {
    val __obj = js.Dynamic.literal()
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Crs]
  }
}

