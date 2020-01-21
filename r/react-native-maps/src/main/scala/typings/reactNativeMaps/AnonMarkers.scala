package typings.reactNativeMaps

import typings.reactNativeMaps.mod.KmlMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMarkers extends js.Object {
  var markers: js.Array[KmlMarker]
}

object AnonMarkers {
  @scala.inline
  def apply(markers: js.Array[KmlMarker]): AnonMarkers = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMarkers]
  }
}

