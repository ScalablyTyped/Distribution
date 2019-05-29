package typings
package reactDashGeosuggestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaps extends js.Object {
  /***** Layers *****/
  var BicyclingLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.BicyclingLayer]
  /** A circle on the Earth's surface; also known as a "spherical cap". */
  var Circle: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Circle]
  /***** Data *****/
  var Data: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Data]
  val DataNs: TypeofData
  var DirectionsRenderer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.DirectionsRenderer]
  var DirectionsService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.DirectionsService]
  var DistanceMatrixService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.DistanceMatrixService]
  var ElevationService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.ElevationService]
  var FusionTablesLayer: org.scalablytyped.runtime.Instantiable1[
    /* options */ googlemapsLib.googleNs.mapsNs.FusionTablesLayerOptions, 
    googlemapsLib.googleNs.mapsNs.FusionTablesLayer
  ]
  /***** Services *****/
  var Geocoder: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Geocoder]
  var GroundOverlay: org.scalablytyped.runtime.Instantiable2[
    /* url */ java.lang.String, 
    /* bounds */ googlemapsLib.googleNs.mapsNs.LatLngBounds, 
    googlemapsLib.googleNs.mapsNs.GroundOverlay
  ]
  var ImageMapType: org.scalablytyped.runtime.Instantiable1[
    /* opts */ googlemapsLib.googleNs.mapsNs.ImageMapTypeOptions, 
    googlemapsLib.googleNs.mapsNs.ImageMapType
  ]
  /**
    * An overlay that looks like a bubble and is often connected to a marker.
    * This class extends MVCObject.
    */
  var InfoWindow: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.InfoWindow]
  var KmlLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.KmlLayer]
  /* **** Base **** */
  /**
    * A LatLng is a point in geographical coordinates: latitude and longitude.
    *
    * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or
    *   below this range will be clamped to the range [-90, 90]. This means
    *   that if the value specified is less than -90, it will be set to -90.
    *   And if the value is greater than 90, it will be set to 90.
    * * Longitude ranges between -180 and 180 degrees, inclusive. Values above
    *   or below this range will be wrapped so that they fall within the
    *   range. For example, a value of -190 will be converted to 170. A value
    *   of 190 will be converted to -170. This reflects the fact that
    *   longitudes wrap around the globe.
    *
    * Although the default map projection associates longitude with the
    * x-coordinate of the map, and latitude with the y-coordinate, the
    * latitude coordinate is always written first, followed by the longitude.
    * Notice that you cannot modify the coordinates of a LatLng. If you want
    * to compute another point, you have to create a new one.
    */
  var LatLng: org.scalablytyped.runtime.Instantiable2[/* lat */ scala.Double, /* lng */ scala.Double, googlemapsLib.googleNs.mapsNs.LatLng]
  /**
    * A LatLngBounds instance represents a rectangle in geographical coordinates,
    * including one that crosses the 180 degrees longitudinal meridian.
    */
  var LatLngBounds: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.LatLngBounds]
  /** This class extends MVCObject. */
  var MVCArray: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MVCArray[js.Object]]
  /***** MVC *****/
  /** Base class implementing KVO. */
  var MVCObject: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MVCObject]
  /***** Map *****/
  var Map: org.scalablytyped.runtime.Instantiable1[/* mapDiv */ stdLib.Element, googlemapsLib.googleNs.mapsNs.Map]
  var MapCanvasProjection: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MapCanvasProjection]
  var MapTypeRegistry: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MapTypeRegistry]
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
    */
  var Marker: TypeofClassMarker
  var MaxZoomService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MaxZoomService]
  var OverlayView: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.OverlayView]
  var Point: org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, googlemapsLib.googleNs.mapsNs.Point]
  var Polygon: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Polygon]
  var Polyline: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Polyline]
  var Rectangle: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Rectangle]
  var SaveWidget: org.scalablytyped.runtime.Instantiable1[/* container */ stdLib.Node, googlemapsLib.googleNs.mapsNs.SaveWidget]
  var Size: org.scalablytyped.runtime.Instantiable2[
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    googlemapsLib.googleNs.mapsNs.Size
  ]
  var StreetViewCoverageLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.StreetViewCoverageLayer]
  /***** Street View *****/
  var StreetViewPanorama: org.scalablytyped.runtime.Instantiable1[/* container */ stdLib.Element, googlemapsLib.googleNs.mapsNs.StreetViewPanorama]
  var StreetViewService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.StreetViewService]
  var StyledMapType: org.scalablytyped.runtime.Instantiable1[
    /* styles */ js.Array[googlemapsLib.googleNs.mapsNs.MapTypeStyle], 
    googlemapsLib.googleNs.mapsNs.StyledMapType
  ]
  var TrafficLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.TrafficLayer]
  var TransitLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.TransitLayer]
  /***** AdSense Library *****/
  val adsenseNs: Typeofadsense
  /***** Drawing Library *****/
  val drawingNs: Typeofdrawing
  var event: TypeofClassevent
  /***** Geometry Library *****/
  val geometryNs: Typeofgeometry
  /***** Places Library *****/
  val placesNs: Typeofplaces
  /***** Visualization Library *****/
  val visualizationNs: Typeofvisualization
}

object Typeofmaps {
  @scala.inline
  def apply(
    BicyclingLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.BicyclingLayer],
    Circle: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Circle],
    Data: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Data],
    DataNs: TypeofData,
    DirectionsRenderer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.DirectionsRenderer],
    DirectionsService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.DirectionsService],
    DistanceMatrixService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.DistanceMatrixService],
    ElevationService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.ElevationService],
    FusionTablesLayer: org.scalablytyped.runtime.Instantiable1[
      /* options */ googlemapsLib.googleNs.mapsNs.FusionTablesLayerOptions, 
      googlemapsLib.googleNs.mapsNs.FusionTablesLayer
    ],
    Geocoder: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Geocoder],
    GroundOverlay: org.scalablytyped.runtime.Instantiable2[
      /* url */ java.lang.String, 
      /* bounds */ googlemapsLib.googleNs.mapsNs.LatLngBounds, 
      googlemapsLib.googleNs.mapsNs.GroundOverlay
    ],
    ImageMapType: org.scalablytyped.runtime.Instantiable1[
      /* opts */ googlemapsLib.googleNs.mapsNs.ImageMapTypeOptions, 
      googlemapsLib.googleNs.mapsNs.ImageMapType
    ],
    InfoWindow: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.InfoWindow],
    KmlLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.KmlLayer],
    LatLng: org.scalablytyped.runtime.Instantiable2[/* lat */ scala.Double, /* lng */ scala.Double, googlemapsLib.googleNs.mapsNs.LatLng],
    LatLngBounds: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.LatLngBounds],
    MVCArray: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MVCArray[js.Object]],
    MVCObject: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MVCObject],
    Map: org.scalablytyped.runtime.Instantiable1[/* mapDiv */ stdLib.Element, googlemapsLib.googleNs.mapsNs.Map],
    MapCanvasProjection: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MapCanvasProjection],
    MapTypeRegistry: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MapTypeRegistry],
    Marker: TypeofClassMarker,
    MaxZoomService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.MaxZoomService],
    OverlayView: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.OverlayView],
    Point: org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, googlemapsLib.googleNs.mapsNs.Point],
    Polygon: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Polygon],
    Polyline: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Polyline],
    Rectangle: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.Rectangle],
    SaveWidget: org.scalablytyped.runtime.Instantiable1[/* container */ stdLib.Node, googlemapsLib.googleNs.mapsNs.SaveWidget],
    Size: org.scalablytyped.runtime.Instantiable2[
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      googlemapsLib.googleNs.mapsNs.Size
    ],
    StreetViewCoverageLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.StreetViewCoverageLayer],
    StreetViewPanorama: org.scalablytyped.runtime.Instantiable1[/* container */ stdLib.Element, googlemapsLib.googleNs.mapsNs.StreetViewPanorama],
    StreetViewService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.StreetViewService],
    StyledMapType: org.scalablytyped.runtime.Instantiable1[
      /* styles */ js.Array[googlemapsLib.googleNs.mapsNs.MapTypeStyle], 
      googlemapsLib.googleNs.mapsNs.StyledMapType
    ],
    TrafficLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.TrafficLayer],
    TransitLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.TransitLayer],
    adsenseNs: Typeofadsense,
    drawingNs: Typeofdrawing,
    event: TypeofClassevent,
    geometryNs: Typeofgeometry,
    placesNs: Typeofplaces,
    visualizationNs: Typeofvisualization
  ): Typeofmaps = {
    val __obj = js.Dynamic.literal(BicyclingLayer = BicyclingLayer, Circle = Circle, Data = Data, DataNs = DataNs, DirectionsRenderer = DirectionsRenderer, DirectionsService = DirectionsService, DistanceMatrixService = DistanceMatrixService, ElevationService = ElevationService, FusionTablesLayer = FusionTablesLayer, Geocoder = Geocoder, GroundOverlay = GroundOverlay, ImageMapType = ImageMapType, InfoWindow = InfoWindow, KmlLayer = KmlLayer, LatLng = LatLng, LatLngBounds = LatLngBounds, MVCArray = MVCArray, MVCObject = MVCObject, Map = Map, MapCanvasProjection = MapCanvasProjection, MapTypeRegistry = MapTypeRegistry, Marker = Marker, MaxZoomService = MaxZoomService, OverlayView = OverlayView, Point = Point, Polygon = Polygon, Polyline = Polyline, Rectangle = Rectangle, SaveWidget = SaveWidget, Size = Size, StreetViewCoverageLayer = StreetViewCoverageLayer, StreetViewPanorama = StreetViewPanorama, StreetViewService = StreetViewService, StyledMapType = StyledMapType, TrafficLayer = TrafficLayer, TransitLayer = TransitLayer, adsenseNs = adsenseNs, drawingNs = drawingNs, event = event, geometryNs = geometryNs, placesNs = placesNs, visualizationNs = visualizationNs)
  
    __obj.asInstanceOf[Typeofmaps]
  }
}

