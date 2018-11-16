package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RectangleProps
  extends leafletLib.leafletMod.PolylineOptions
     with PathEvents {
  var bounds: leafletLib.leafletMod.LatLngBoundsExpression
  var children: js.UndefOr[Children] = js.undefined
  var popupContainer: js.UndefOr[leafletLib.leafletMod.FeatureGroup[_]] = js.undefined
}

