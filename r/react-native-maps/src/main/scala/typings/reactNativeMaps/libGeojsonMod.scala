package typings.reactNativeMaps

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.geojson.mod.MultiPoint
import typings.geojson.mod.MultiPolygon
import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageURISource
import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.reactNativeMaps.libSharedTypesMod.LineCapType
import typings.reactNativeMaps.libSharedTypesMod.LineJoinType
import typings.reactNativeMaps.reactNativeMapsStrings.point
import typings.reactNativeMaps.reactNativeMapsStrings.polygon_
import typings.reactNativeMaps.reactNativeMapsStrings.polyline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeojsonMod {
  
  @JSImport("react-native-maps/lib/Geojson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GeojsonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AnyLineStringOverlay extends StObject {
    
    var coordinates: js.Array[LatLng]
    
    var feature: Feature[LineString | MultiLineString, GeoJsonProperties]
    
    var `type`: polyline_
  }
  object AnyLineStringOverlay {
    
    inline def apply(coordinates: js.Array[LatLng], feature: Feature[LineString | MultiLineString, GeoJsonProperties]): AnyLineStringOverlay = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("polyline")
      __obj.asInstanceOf[AnyLineStringOverlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnyLineStringOverlay] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[LatLng]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: LatLng*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setFeature(value: Feature[LineString | MultiLineString, GeoJsonProperties]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setType(value: polyline_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnyPointOverlay extends StObject {
    
    var coordinates: LatLng
    
    var feature: Feature[Point | MultiPoint, GeoJsonProperties]
    
    var `type`: point
  }
  object AnyPointOverlay {
    
    inline def apply(coordinates: LatLng, feature: Feature[Point | MultiPoint, GeoJsonProperties]): AnyPointOverlay = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("point")
      __obj.asInstanceOf[AnyPointOverlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnyPointOverlay] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: LatLng): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: Feature[Point | MultiPoint, GeoJsonProperties]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnyPolygonOverlay extends StObject {
    
    var coordinates: js.Array[LatLng]
    
    var feature: Feature[Polygon | MultiPolygon, GeoJsonProperties]
    
    var holes: js.UndefOr[js.Array[js.Array[LatLng]]] = js.undefined
    
    var `type`: polygon_
  }
  object AnyPolygonOverlay {
    
    inline def apply(coordinates: js.Array[LatLng], feature: Feature[Polygon | MultiPolygon, GeoJsonProperties]): AnyPolygonOverlay = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("polygon")
      __obj.asInstanceOf[AnyPolygonOverlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnyPolygonOverlay] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[LatLng]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: LatLng*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setFeature(value: Feature[Polygon | MultiPolygon, GeoJsonProperties]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setHoles(value: js.Array[js.Array[LatLng]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
      
      inline def setHolesUndefined: Self = StObject.set(x, "holes", js.undefined)
      
      inline def setHolesVarargs(value: js.Array[LatLng]*): Self = StObject.set(x, "holes", js.Array(value*))
      
      inline def setType(value: polygon_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeojsonProps extends StObject {
    
    /**
      * The pincolor used on markers
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * The fill color to use for the path.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /**
      * [Geojson](https://geojson.org/) description of object.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var geojson: FeatureCollection[Geometry, GeoJsonProperties]
    
    /**
      * A custom image to be used as the marker's icon. Only local image resources are allowed to be
      * used.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var image: js.UndefOr[ImageURISource | ImageRequireSource] = js.undefined
    
    /**
      * The line cap style to apply to the open ends of the path.
      * The default style is `round`.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var lineCap: js.UndefOr[LineCapType] = js.undefined
    
    /**
      * An array of numbers specifying the dash pattern to use for the path.
      *
      * The array contains one or more numbers that indicate the lengths (measured in points) of the
      * line segments and gaps in the pattern. The values in the array alternate, starting with the
      * first line segment length, followed by the first gap length, followed by the second line
      * segment length, and so on.
      *
      * This property is set to `null` by default, which indicates no line dash pattern.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var lineDashPattern: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The offset (in points) at which to start drawing the dash pattern.
      *
      * Use this property to start drawing a dashed line partway through a segment or gap. For
      * example, a phase value of 6 for the patter 5-2-3-2 would cause drawing to begin in the
      * middle of the first gap.
      *
      * The default value of this property is 0.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var lineDashPhase: js.UndefOr[Double] = js.undefined
    
    /**
      * The line join style to apply to corners of the path.
      * The default style is `round`.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var lineJoin: js.UndefOr[LineJoinType] = js.undefined
    
    /**
      * Component to render in place of the default marker when the overlay type is a `point`
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var markerComponent: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The limiting value that helps avoid spikes at junctions between connected line segments.
      * The miter limit helps you avoid spikes in paths that use the `miter` `lineJoin` style. If
      * the ratio of the miter length—that is, the diagonal length of the miter join—to the line
      * thickness exceeds the miter limit, the joint is converted to a bevel join. The default
      * miter limit is 10, which results in the conversion of miters whose angle at the joint
      * is less than 11 degrees.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback that is called when the user presses any of the overlays
      */
    var onPress: js.UndefOr[js.Function1[/* event */ OverlayPressEvent, Unit]] = js.undefined
    
    /**
      * The stroke color to use for the path.
      *
      * @platform — iOS: Supported
      * @platform — Android: Supported
      */
    var strokeColor: js.UndefOr[String] = js.undefined
    
    /**
      * The stroke width to use for the path.
      *
      * @platform — iOS: Supported
      * @platform — Android: Supported
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Make the `Polygon` or `Polyline` tappable
      *
      * @platform — iOS: Google Maps only
      * @platform — Android: Supported
      */
    var tappable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The title of the marker. This is only used if the <Marker /> component has no children that
      * are a `<Callout />`, in which case the default callout behavior will be used, which
      * will show both the `title` and the `description`, if provided.
      *
      * @platform — iOS: Supported
      * @platform — Android: Supported
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Sets whether this marker should track view changes.
      * It's recommended to turn it off whenever it's possible to improve custom marker performance.
      * This is the default value for all point markers in your geojson data. It can be overriden
      * on a per point basis by adding a `trackViewChanges` property to the `properties` object on the point.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var tracksViewChanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The order in which this tile overlay is drawn with respect to other overlays. An overlay
      * with a larger z-index is drawn over overlays with smaller z-indices. The order of overlays
      * with the same z-index is arbitrary. The default zIndex is 0.
      *
      * @platform iOS: Apple Maps: [Marker], Google Maps: [Marker, Polygon, Polyline]
      * @platform Android: Supported
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object GeojsonProps {
    
    inline def apply(geojson: FeatureCollection[Geometry, GeoJsonProperties]): GeojsonProps = {
      val __obj = js.Dynamic.literal(geojson = geojson.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeojsonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeojsonProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setGeojson(value: FeatureCollection[Geometry, GeoJsonProperties]): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ImageURISource | ImageRequireSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLineCap(value: LineCapType): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDashPattern(value: js.Array[Double]): Self = StObject.set(x, "lineDashPattern", value.asInstanceOf[js.Any])
      
      inline def setLineDashPatternUndefined: Self = StObject.set(x, "lineDashPattern", js.undefined)
      
      inline def setLineDashPatternVarargs(value: Double*): Self = StObject.set(x, "lineDashPattern", js.Array(value*))
      
      inline def setLineDashPhase(value: Double): Self = StObject.set(x, "lineDashPhase", value.asInstanceOf[js.Any])
      
      inline def setLineDashPhaseUndefined: Self = StObject.set(x, "lineDashPhase", js.undefined)
      
      inline def setLineJoin(value: LineJoinType): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setMarkerComponent(value: ReactNode): Self = StObject.set(x, "markerComponent", value.asInstanceOf[js.Any])
      
      inline def setMarkerComponentUndefined: Self = StObject.set(x, "markerComponent", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setOnPress(value: /* event */ OverlayPressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
      
      inline def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTracksViewChanges(value: Boolean): Self = StObject.set(x, "tracksViewChanges", value.asInstanceOf[js.Any])
      
      inline def setTracksViewChangesUndefined: Self = StObject.set(x, "tracksViewChanges", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait OverlayPressEvent extends StObject {
    
    var coordinates: LatLng | js.Array[LatLng]
    
    var feature: Feature[
        LineString | MultiLineString | MultiPoint | MultiPolygon | Point | Polygon, 
        GeoJsonProperties
      ]
    
    var holes: js.UndefOr[js.Array[js.Array[LatLng]]] = js.undefined
    
    var `type`: point | polyline_ | polygon_
  }
  object OverlayPressEvent {
    
    inline def apply(
      coordinates: LatLng | js.Array[LatLng],
      feature: Feature[
          LineString | MultiLineString | MultiPoint | MultiPolygon | Point | Polygon, 
          GeoJsonProperties
        ],
      `type`: point | polyline_ | polygon_
    ): OverlayPressEvent = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayPressEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayPressEvent] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: LatLng | js.Array[LatLng]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: LatLng*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setFeature(
        value: Feature[
              LineString | MultiLineString | MultiPoint | MultiPolygon | Point | Polygon, 
              GeoJsonProperties
            ]
      ): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setHoles(value: js.Array[js.Array[LatLng]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
      
      inline def setHolesUndefined: Self = StObject.set(x, "holes", js.undefined)
      
      inline def setHolesVarargs(value: js.Array[LatLng]*): Self = StObject.set(x, "holes", js.Array(value*))
      
      inline def setType(value: point | polyline_ | polygon_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
