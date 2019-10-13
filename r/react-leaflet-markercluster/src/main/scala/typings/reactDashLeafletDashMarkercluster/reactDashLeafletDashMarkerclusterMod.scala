package typings.reactDashLeafletDashMarkercluster

import typings.leaflet.leafletMod.Layer
import typings.leafletDotMarkercluster.leafletMod.MarkerClusterGroupOptions
import typings.reactDashLeaflet.reactDashLeafletMod.MapLayer
import typings.reactDashLeaflet.reactDashLeafletMod.MapLayerProps
import typings.reactDashLeafletDashMarkercluster.reactDashLeafletDashMarkerclusterMod.MarkerClusterGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet-markercluster", JSImport.Namespace)
@js.native
object reactDashLeafletDashMarkerclusterMod extends js.Object {
  @js.native
  class default[P /* <: MarkerClusterGroupProps */] () extends MapLayer[P, Layer]
  
  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  type MarkerClusterGroupProps = MapLayerProps with MarkerClusterGroupOptions
}

