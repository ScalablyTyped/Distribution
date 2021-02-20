package typings.reactLeafletMarkercluster

import typings.leaflet.mod.Layer
import typings.leafletMarkercluster.mod.MarkerClusterGroupOptions
import typings.reactLeaflet.mod.MapLayer
import typings.reactLeaflet.mod.MapLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-markercluster", JSImport.Default)
  @js.native
  class default[P /* <: MarkerClusterGroupProps */] () extends MapLayer[P, Layer]
  
  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  
  type MarkerClusterGroupProps = MapLayerProps with MarkerClusterGroupOptions
}
