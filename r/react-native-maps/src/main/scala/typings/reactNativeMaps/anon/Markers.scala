package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.KmlMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Markers extends js.Object {
  var markers: js.Array[KmlMarker]
}

object Markers {
  @scala.inline
  def apply(markers: js.Array[KmlMarker]): Markers = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markers]
  }
}

