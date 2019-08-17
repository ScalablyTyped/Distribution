package typings.reactDashLeafletDashMarkercluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLeafletDashMarkerclusterMod {
  import typings.leaflet.leafletMod.Layer
  import typings.leafletDotMarkercluster.leafletMod.MarkerClusterGroupOptions
  import typings.reactDashLeaflet.reactDashLeafletMod.MapLayer
  import typings.reactDashLeaflet.reactDashLeafletMod.MapLayerProps

  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  type MarkerClusterGroupProps = MapLayerProps with MarkerClusterGroupOptions
}
