package typings.reactLeafletMarkercluster

import typings.leaflet.mod.Layer
import typings.leafletMarkercluster.mod.MarkerClusterGroupOptions
import typings.reactLeaflet.mod.MapLayer
import typings.reactLeaflet.mod.MapLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet-markercluster", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default[P /* <: MarkerClusterGroupProps */] () extends MapLayer[P, Layer]
  
  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  
  type MarkerClusterGroupProps = MapLayerProps with MarkerClusterGroupOptions
}
