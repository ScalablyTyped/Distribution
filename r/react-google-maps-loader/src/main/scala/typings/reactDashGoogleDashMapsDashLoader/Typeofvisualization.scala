package typings.reactDashGoogleDashMapsDashLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googlemaps.google.maps.visualization.HeatmapLayer
import typings.googlemaps.google.maps.visualization.MapsEngineLayer
import typings.googlemaps.google.maps.visualization.MapsEngineLayerOptions
import typings.googlemaps.google.maps.visualization.MapsEventListener
import typings.googlemaps.google.maps.visualization.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofvisualization extends js.Object {
  var HeatmapLayer: Instantiable0[typings.googlemaps.google.maps.visualization.HeatmapLayer]
  var MapsEngineLayer: Instantiable1[
    /* options */ MapsEngineLayerOptions, 
    typings.googlemaps.google.maps.visualization.MapsEngineLayer
  ]
  var MapsEventListener: Instantiable0[typings.googlemaps.google.maps.visualization.MapsEventListener]
  var MouseEvent: Instantiable0[typings.googlemaps.google.maps.visualization.MouseEvent]
}

object Typeofvisualization {
  @scala.inline
  def apply(
    HeatmapLayer: Instantiable0[HeatmapLayer],
    MapsEngineLayer: Instantiable1[/* options */ MapsEngineLayerOptions, MapsEngineLayer],
    MapsEventListener: Instantiable0[MapsEventListener],
    MouseEvent: Instantiable0[MouseEvent]
  ): Typeofvisualization = {
    val __obj = js.Dynamic.literal(HeatmapLayer = HeatmapLayer, MapsEngineLayer = MapsEngineLayer, MapsEventListener = MapsEventListener, MouseEvent = MouseEvent)
  
    __obj.asInstanceOf[Typeofvisualization]
  }
}

