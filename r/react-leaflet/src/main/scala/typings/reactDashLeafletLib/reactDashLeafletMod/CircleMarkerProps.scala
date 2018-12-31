package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleMarkerProps
  extends leafletLib.leafletMod.CircleMarkerOptions
     with PathEvents {
  var center: leafletLib.leafletMod.LatLngExpression
  var children: js.UndefOr[Children] = js.undefined
  @JSName("radius")
  var radius_CircleMarkerProps: scala.Double
}

