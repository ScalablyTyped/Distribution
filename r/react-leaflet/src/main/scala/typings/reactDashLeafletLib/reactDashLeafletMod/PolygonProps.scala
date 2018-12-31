package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonProps
  extends leafletLib.leafletMod.PolylineOptions
     with PathEvents {
  var children: js.UndefOr[Children] = js.undefined
  var popupContainer: js.UndefOr[leafletLib.leafletMod.FeatureGroup[_]] = js.undefined
  var positions: js.Array[leafletLib.leafletMod.LatLngExpression] | js.Array[js.Array[leafletLib.leafletMod.LatLngExpression]] | js.Array[js.Array[js.Array[leafletLib.leafletMod.LatLngExpression]]]
}

