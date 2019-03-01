package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewOverlay extends js.Object {
  var coordinates: js.Array[reactDashNativeLib.Anon_Latitude]
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
}

object MapViewOverlay {
  @scala.inline
  def apply(
    coordinates: js.Array[reactDashNativeLib.Anon_Latitude],
    fillColor: java.lang.String = null,
    id: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null
  ): MapViewOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coordinates")(coordinates)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    __obj.asInstanceOf[MapViewOverlay]
  }
}

