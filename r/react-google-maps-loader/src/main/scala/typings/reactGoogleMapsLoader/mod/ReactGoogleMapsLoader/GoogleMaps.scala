package typings.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader

import typings.reactGoogleMapsLoader.anon.Typeofgeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleMaps extends js.Object {
  val Data: js.Any
  // TODO find source documentation
  val adsense: js.Any
  val drawing: js.Any
  val event: js.Any
  val geometry: Typeofgeometry
  val places: js.Any
  val visualization: js.Any
}

object GoogleMaps {
  @scala.inline
  def apply(
    Data: js.Any,
    adsense: js.Any,
    drawing: js.Any,
    event: js.Any,
    geometry: Typeofgeometry,
    places: js.Any,
    visualization: js.Any
  ): GoogleMaps = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleMaps]
  }
}

