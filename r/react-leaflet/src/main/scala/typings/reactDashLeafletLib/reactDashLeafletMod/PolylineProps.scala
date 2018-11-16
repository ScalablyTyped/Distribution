package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PolylineProps
  extends leafletLib.leafletMod.PolylineOptions
     with PathEvents {
  var children: js.UndefOr[Children] = js.undefined
  var positions: js.Array[leafletLib.leafletMod.LatLngExpression] | js.Array[js.Array[leafletLib.leafletMod.LatLngExpression]]
}

