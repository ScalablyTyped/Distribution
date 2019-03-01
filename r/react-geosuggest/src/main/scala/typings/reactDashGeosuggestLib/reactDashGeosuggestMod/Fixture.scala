package typings
package reactDashGeosuggestLib.reactDashGeosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixture extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var location: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLng] = js.undefined
}

object Fixture {
  @scala.inline
  def apply(
    label: java.lang.String,
    className: java.lang.String = null,
    location: googlemapsLib.googleNs.mapsNs.LatLng = null
  ): Fixture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (className != null) __obj.updateDynamic("className")(className)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Fixture]
  }
}

