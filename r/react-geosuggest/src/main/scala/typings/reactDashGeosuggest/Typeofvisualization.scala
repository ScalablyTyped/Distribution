package typings.reactDashGeosuggest

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googlemaps.googleNs.mapsNs.visualizationNs.HeatmapLayer
import typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEngineLayer
import typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEngineLayerOptions
import typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEventListener
import typings.googlemaps.googleNs.mapsNs.visualizationNs.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofvisualization extends js.Object {
  var HeatmapLayer: Instantiable0[typings.googlemaps.googleNs.mapsNs.visualizationNs.HeatmapLayer]
  var MapsEngineLayer: Instantiable1[
    /* options */ MapsEngineLayerOptions, 
    typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEngineLayer
  ]
  var MapsEventListener: Instantiable0[typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEventListener]
  var MouseEvent: Instantiable0[typings.googlemaps.googleNs.mapsNs.visualizationNs.MouseEvent]
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

