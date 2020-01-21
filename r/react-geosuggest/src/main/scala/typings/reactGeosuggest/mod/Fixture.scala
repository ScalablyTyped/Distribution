package typings.reactGeosuggest.mod

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fixture]
  }
}

