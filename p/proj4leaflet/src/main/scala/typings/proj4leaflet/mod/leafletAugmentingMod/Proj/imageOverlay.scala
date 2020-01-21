package typings.proj4leaflet.mod.leafletAugmentingMod.Proj

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.imageOverlay")
@js.native
object imageOverlay extends js.Object {
  def apply(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay_ = js.native
  def apply(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay_ = js.native
}

