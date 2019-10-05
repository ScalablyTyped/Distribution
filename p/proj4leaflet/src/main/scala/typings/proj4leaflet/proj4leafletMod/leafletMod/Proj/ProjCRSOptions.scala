package typings.proj4leaflet.proj4leafletMod.leafletMod.Proj

import typings.leaflet.leafletMod.Bounds
import typings.leaflet.leafletMod.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjCRSOptions extends js.Object {
  var bounds: js.UndefOr[Bounds] = js.undefined
  var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var scales: js.UndefOr[js.Array[Double]] = js.undefined
  var transformation: js.UndefOr[Transformation] = js.undefined
}

object ProjCRSOptions {
  @scala.inline
  def apply(
    bounds: Bounds = null,
    origin: js.Tuple2[Double, Double] = null,
    resolutions: js.Array[Double] = null,
    scales: js.Array[Double] = null,
    transformation: Transformation = null
  ): ProjCRSOptions = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (transformation != null) __obj.updateDynamic("transformation")(transformation)
    __obj.asInstanceOf[ProjCRSOptions]
  }
}

