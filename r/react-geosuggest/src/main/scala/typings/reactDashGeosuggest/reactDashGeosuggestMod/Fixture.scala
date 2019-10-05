package typings.reactDashGeosuggest.reactDashGeosuggestMod

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixture extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var label: String
  var location: js.UndefOr[LatLng] = js.undefined
}

object Fixture {
  @scala.inline
  def apply(label: String, className: String = null, location: LatLng = null): Fixture = {
    val __obj = js.Dynamic.literal(label = label)
    if (className != null) __obj.updateDynamic("className")(className)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Fixture]
  }
}

