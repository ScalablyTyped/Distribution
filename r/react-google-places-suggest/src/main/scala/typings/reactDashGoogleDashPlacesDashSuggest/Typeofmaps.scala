package typings.reactDashGoogleDashPlacesDashSuggest

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.googlemaps.googleNs.mapsNs.BicyclingLayer
import typings.googlemaps.googleNs.mapsNs.Circle
import typings.googlemaps.googleNs.mapsNs.Data
import typings.googlemaps.googleNs.mapsNs.DirectionsRenderer
import typings.googlemaps.googleNs.mapsNs.DirectionsService
import typings.googlemaps.googleNs.mapsNs.DistanceMatrixService
import typings.googlemaps.googleNs.mapsNs.ElevationService
import typings.googlemaps.googleNs.mapsNs.FusionTablesLayer
import typings.googlemaps.googleNs.mapsNs.FusionTablesLayerOptions
import typings.googlemaps.googleNs.mapsNs.Geocoder
import typings.googlemaps.googleNs.mapsNs.GroundOverlay
import typings.googlemaps.googleNs.mapsNs.ImageMapType
import typings.googlemaps.googleNs.mapsNs.ImageMapTypeOptions
import typings.googlemaps.googleNs.mapsNs.InfoWindow
import typings.googlemaps.googleNs.mapsNs.KmlLayer
import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.MVCArray
import typings.googlemaps.googleNs.mapsNs.MVCObject
import typings.googlemaps.googleNs.mapsNs.Map
import typings.googlemaps.googleNs.mapsNs.MapCanvasProjection
import typings.googlemaps.googleNs.mapsNs.MapTypeRegistry
import typings.googlemaps.googleNs.mapsNs.MapTypeStyle
import typings.googlemaps.googleNs.mapsNs.MaxZoomService
import typings.googlemaps.googleNs.mapsNs.OverlayView
import typings.googlemaps.googleNs.mapsNs.Point
import typings.googlemaps.googleNs.mapsNs.Polygon
import typings.googlemaps.googleNs.mapsNs.Polyline
import typings.googlemaps.googleNs.mapsNs.Rectangle
import typings.googlemaps.googleNs.mapsNs.SaveWidget
import typings.googlemaps.googleNs.mapsNs.Size
import typings.googlemaps.googleNs.mapsNs.StreetViewCoverageLayer
import typings.googlemaps.googleNs.mapsNs.StreetViewPanorama
import typings.googlemaps.googleNs.mapsNs.StreetViewService
import typings.googlemaps.googleNs.mapsNs.StyledMapType
import typings.googlemaps.googleNs.mapsNs.TrafficLayer
import typings.googlemaps.googleNs.mapsNs.TransitLayer
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaps extends js.Object {
  /***** Layers *****/
  var BicyclingLayer: Instantiable0[typings.googlemaps.googleNs.mapsNs.BicyclingLayer]
  /** A circle on the Earth's surface; also known as a "spherical cap". */
  var Circle: Instantiable0[typings.googlemaps.googleNs.mapsNs.Circle]
  /***** Data *****/
  var Data: Instantiable0[typings.googlemaps.googleNs.mapsNs.Data]
  val DataNs: TypeofData
  var DirectionsRenderer: Instantiable0[typings.googlemaps.googleNs.mapsNs.DirectionsRenderer]
  var DirectionsService: Instantiable0[typings.googlemaps.googleNs.mapsNs.DirectionsService]
  var DistanceMatrixService: Instantiable0[typings.googlemaps.googleNs.mapsNs.DistanceMatrixService]
  var ElevationService: Instantiable0[typings.googlemaps.googleNs.mapsNs.ElevationService]
  var FusionTablesLayer: Instantiable1[
    /* options */ FusionTablesLayerOptions, 
    typings.googlemaps.googleNs.mapsNs.FusionTablesLayer
  ]
  /***** Services *****/
  var Geocoder: Instantiable0[typings.googlemaps.googleNs.mapsNs.Geocoder]
  var GroundOverlay: Instantiable2[
    /* url */ String, 
    /* bounds */ LatLngBounds, 
    typings.googlemaps.googleNs.mapsNs.GroundOverlay
  ]
  var ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, typings.googlemaps.googleNs.mapsNs.ImageMapType]
  /**
    * An overlay that looks like a bubble and is often connected to a marker.
    * This class extends MVCObject.
    */
  var InfoWindow: Instantiable0[typings.googlemaps.googleNs.mapsNs.InfoWindow]
  var KmlLayer: Instantiable0[typings.googlemaps.googleNs.mapsNs.KmlLayer]
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
  var LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, typings.googlemaps.googleNs.mapsNs.LatLng]
  /**
    * A LatLngBounds instance represents a rectangle in geographical coordinates,
    * including one that crosses the 180 degrees longitudinal meridian.
    */
  var LatLngBounds: Instantiable0[typings.googlemaps.googleNs.mapsNs.LatLngBounds]
  /** This class extends MVCObject. */
  var MVCArray: Instantiable0[typings.googlemaps.googleNs.mapsNs.MVCArray[js.Object]]
  /***** MVC *****/
  /** Base class implementing KVO. */
  var MVCObject: Instantiable0[typings.googlemaps.googleNs.mapsNs.MVCObject]
  /***** Map *****/
  var Map: Instantiable1[/* mapDiv */ Element, typings.googlemaps.googleNs.mapsNs.Map]
  var MapCanvasProjection: Instantiable0[typings.googlemaps.googleNs.mapsNs.MapCanvasProjection]
  var MapTypeRegistry: Instantiable0[typings.googlemaps.googleNs.mapsNs.MapTypeRegistry]
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
    */
  var Marker: TypeofClassMarker
  var MaxZoomService: Instantiable0[typings.googlemaps.googleNs.mapsNs.MaxZoomService]
  var OverlayView: Instantiable0[typings.googlemaps.googleNs.mapsNs.OverlayView]
  var Point: Instantiable2[/* x */ Double, /* y */ Double, typings.googlemaps.googleNs.mapsNs.Point]
  var Polygon: Instantiable0[typings.googlemaps.googleNs.mapsNs.Polygon]
  var Polyline: Instantiable0[typings.googlemaps.googleNs.mapsNs.Polyline]
  var Rectangle: Instantiable0[typings.googlemaps.googleNs.mapsNs.Rectangle]
  var SaveWidget: Instantiable1[/* container */ Node, typings.googlemaps.googleNs.mapsNs.SaveWidget]
  var Size: Instantiable2[/* width */ Double, /* height */ Double, typings.googlemaps.googleNs.mapsNs.Size]
  var StreetViewCoverageLayer: Instantiable0[typings.googlemaps.googleNs.mapsNs.StreetViewCoverageLayer]
  /***** Street View *****/
  var StreetViewPanorama: Instantiable1[/* container */ Element, typings.googlemaps.googleNs.mapsNs.StreetViewPanorama]
  var StreetViewService: Instantiable0[typings.googlemaps.googleNs.mapsNs.StreetViewService]
  var StyledMapType: Instantiable1[
    /* styles */ js.Array[MapTypeStyle], 
    typings.googlemaps.googleNs.mapsNs.StyledMapType
  ]
  var TrafficLayer: Instantiable0[typings.googlemaps.googleNs.mapsNs.TrafficLayer]
  var TransitLayer: Instantiable0[typings.googlemaps.googleNs.mapsNs.TransitLayer]
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
    BicyclingLayer: Instantiable0[BicyclingLayer],
    Circle: Instantiable0[Circle],
    Data: Instantiable0[Data],
    DataNs: TypeofData,
    DirectionsRenderer: Instantiable0[DirectionsRenderer],
    DirectionsService: Instantiable0[DirectionsService],
    DistanceMatrixService: Instantiable0[DistanceMatrixService],
    ElevationService: Instantiable0[ElevationService],
    FusionTablesLayer: Instantiable1[/* options */ FusionTablesLayerOptions, FusionTablesLayer],
    Geocoder: Instantiable0[Geocoder],
    GroundOverlay: Instantiable2[/* url */ String, /* bounds */ LatLngBounds, GroundOverlay],
    ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, ImageMapType],
    InfoWindow: Instantiable0[InfoWindow],
    KmlLayer: Instantiable0[KmlLayer],
    LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, LatLng],
    LatLngBounds: Instantiable0[LatLngBounds],
    MVCArray: Instantiable0[MVCArray[js.Object]],
    MVCObject: Instantiable0[MVCObject],
    Map: Instantiable1[/* mapDiv */ Element, Map],
    MapCanvasProjection: Instantiable0[MapCanvasProjection],
    MapTypeRegistry: Instantiable0[MapTypeRegistry],
    Marker: TypeofClassMarker,
    MaxZoomService: Instantiable0[MaxZoomService],
    OverlayView: Instantiable0[OverlayView],
    Point: Instantiable2[/* x */ Double, /* y */ Double, Point],
    Polygon: Instantiable0[Polygon],
    Polyline: Instantiable0[Polyline],
    Rectangle: Instantiable0[Rectangle],
    SaveWidget: Instantiable1[/* container */ Node, SaveWidget],
    Size: Instantiable2[/* width */ Double, /* height */ Double, Size],
    StreetViewCoverageLayer: Instantiable0[StreetViewCoverageLayer],
    StreetViewPanorama: Instantiable1[/* container */ Element, StreetViewPanorama],
    StreetViewService: Instantiable0[StreetViewService],
    StyledMapType: Instantiable1[/* styles */ js.Array[MapTypeStyle], StyledMapType],
    TrafficLayer: Instantiable0[TrafficLayer],
    TransitLayer: Instantiable0[TransitLayer],
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

