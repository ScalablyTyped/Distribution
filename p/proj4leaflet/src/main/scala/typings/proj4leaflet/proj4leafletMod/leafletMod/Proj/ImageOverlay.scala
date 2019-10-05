package typings.proj4leaflet.proj4leafletMod.leafletMod.Proj

import typings.leaflet.leafletMod.ImageOverlayOptions
import typings.leaflet.leafletMod.LatLngBoundsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.ImageOverlay")
@js.native
class ImageOverlay ()
  extends typings.leaflet.leafletMod.ImageOverlay

@JSImport("leaflet", "Proj.imageOverlay")
@js.native
object imageOverlay extends js.Object {
  def apply(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay = js.native
  def apply(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay = js.native
}

