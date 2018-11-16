package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(leafletLib.leafletMod.LocateOptions because Would inherit conflicting mutable fields List(maxZoom), leafletLib.leafletMod.MapOptions because Would inherit conflicting mutable fields List(maxZoom))*/

trait MapProps
  extends leafletLib.leafletMod.FitBoundsOptions
     with MapEvents {
  var bounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var boundsOptions: js.UndefOr[leafletLib.leafletMod.FitBoundsOptions] = js.undefined
  var center: js.UndefOr[leafletLib.leafletMod.LatLngExpression] = js.undefined
  var children: js.UndefOr[Children] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var maxBounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var useFlyTo: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

