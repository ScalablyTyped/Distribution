package typings.reactNativeMaps

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaps.anon.Duration
import typings.reactNativeMaps.anon.Frame
import typings.reactNativeMaps.anon.PartialCamera
import typings.reactNativeMaps.anon.PartialNativePropsAccessibilityIgnoresInvertColors
import typings.reactNativeMaps.anon.TypeofMapView
import typings.reactNativeMaps.libMapViewDottypesMod.Address
import typings.reactNativeMaps.libMapViewDottypesMod.BoundingBox
import typings.reactNativeMaps.libMapViewDottypesMod.Camera
import typings.reactNativeMaps.libMapViewDottypesMod.ChangeEvent
import typings.reactNativeMaps.libMapViewDottypesMod.Details
import typings.reactNativeMaps.libMapViewDottypesMod.EdgePadding
import typings.reactNativeMaps.libMapViewDottypesMod.FitToOptions
import typings.reactNativeMaps.libMapViewDottypesMod.IndoorBuildingEvent
import typings.reactNativeMaps.libMapViewDottypesMod.IndoorLevelActivatedEvent
import typings.reactNativeMaps.libMapViewDottypesMod.KmlMapEvent
import typings.reactNativeMaps.libMapViewDottypesMod.LongPressEvent
import typings.reactNativeMaps.libMapViewDottypesMod.MapPressEvent
import typings.reactNativeMaps.libMapViewDottypesMod.MapStyleElement
import typings.reactNativeMaps.libMapViewDottypesMod.MapType
import typings.reactNativeMaps.libMapViewDottypesMod.MapTypes
import typings.reactNativeMaps.libMapViewDottypesMod.PanDragEvent
import typings.reactNativeMaps.libMapViewDottypesMod.PoiClickEvent
import typings.reactNativeMaps.libMapViewDottypesMod.SnapshotOptions
import typings.reactNativeMaps.libMapViewDottypesMod.UserLocationChangeEvent
import typings.reactNativeMaps.libMapViewNativeComponentMod.MapViewNativeComponentType
import typings.reactNativeMaps.libSharedTypesMod.CalloutPressEvent
import typings.reactNativeMaps.libSharedTypesMod.ClickEvent
import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.reactNativeMaps.libSharedTypesMod.MarkerDeselectEvent
import typings.reactNativeMaps.libSharedTypesMod.MarkerDragEvent
import typings.reactNativeMaps.libSharedTypesMod.MarkerDragStartEndEvent
import typings.reactNativeMaps.libSharedTypesMod.MarkerPressEvent
import typings.reactNativeMaps.libSharedTypesMod.MarkerSelectEvent
import typings.reactNativeMaps.libSharedTypesMod.Point
import typings.reactNativeMaps.libSharedTypesMod.Provider
import typings.reactNativeMaps.libSharedTypesMod.Region
import typings.reactNativeMaps.reactNativeMapsStrings.`box-none`
import typings.reactNativeMaps.reactNativeMapsStrings.`box-only`
import typings.reactNativeMaps.reactNativeMapsStrings.`no-hide-descendants`
import typings.reactNativeMaps.reactNativeMapsStrings.always
import typings.reactNativeMaps.reactNativeMapsStrings.assertive
import typings.reactNativeMaps.reactNativeMapsStrings.auto
import typings.reactNativeMaps.reactNativeMapsStrings.automatic
import typings.reactNativeMaps.reactNativeMapsStrings.balanced
import typings.reactNativeMaps.reactNativeMapsStrings.dark
import typings.reactNativeMaps.reactNativeMapsStrings.high
import typings.reactNativeMaps.reactNativeMapsStrings.light
import typings.reactNativeMaps.reactNativeMapsStrings.low
import typings.reactNativeMaps.reactNativeMapsStrings.never
import typings.reactNativeMaps.reactNativeMapsStrings.no
import typings.reactNativeMaps.reactNativeMapsStrings.none
import typings.reactNativeMaps.reactNativeMapsStrings.passive
import typings.reactNativeMaps.reactNativeMapsStrings.polite
import typings.reactNativeMaps.reactNativeMapsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapViewMod {
  
  @JSImport("react-native-maps/lib/MapView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-maps/lib/MapView", JSImport.Default)
  @js.native
  open class default protected () extends MapView {
    def this(props: MapViewProps) = this()
  }
  object default {
    
    @JSImport("react-native-maps/lib/MapView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-native-maps/lib/MapView", "default.Animated")
    @js.native
    def Animated: AnimatedComponent[TypeofMapView & (Instantiable1[/* props */ MapViewProps, MapView])] = js.native
    inline def Animated_=(x: AnimatedComponent[TypeofMapView & (Instantiable1[/* props */ MapViewProps, MapView])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animated")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-maps/lib/MapView", "AnimatedMapView")
  @js.native
  val AnimatedMapView: AnimatedComponent[TypeofMapView & (Instantiable1[/* props */ MapViewProps, MapView])] = js.native
  
  @JSImport("react-native-maps/lib/MapView", "MAP_TYPES")
  @js.native
  val MAP_TYPES: MapTypes = js.native
  
  inline def enableLatestRenderer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLatestRenderer")().asInstanceOf[Any]
  
  @js.native
  trait MapView extends Component[MapViewProps, State, Any] {
    
    /* private */ var _getHandle: Any = js.native
    
    /* private */ var _mapManagerCommand: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _onMapReady: Any = js.native
    
    /* private */ var _runCommand: Any = js.native
    
    /**
      * Convert a coordinate to address by using default Geocoder
      *
      * @param coordinate Coordinate
      * @param [coordinate.latitude] Latitude
      * @param [coordinate.longitude] Longitude
      *
      * @return Promise with return type Address
      */
    def addressForCoordinate(coordinate: LatLng): js.Promise[Address] = js.native
    
    def animateCamera(camera: PartialCamera): Unit = js.native
    def animateCamera(camera: PartialCamera, opts: Duration): Unit = js.native
    
    def animateToRegion(region: Region): Unit = js.native
    def animateToRegion(region: Region, duration: Double): Unit = js.native
    
    /**
      * Get bounding box from region
      *
      * @param region Region
      *
      * @return Object Object bounding box ({ northEast: <LatLng>, southWest: <LatLng> })
      */
    def boundingBoxForRegion(region: Region): BoundingBox = js.native
    
    /**
      * Convert a user-space point to a map coordinate
      *
      * @param point Point
      * @param [point.x] X
      * @param [point.x] Y
      *
      * @return Promise Promise with the coordinate ({ latitude: Number, longitude: Number })
      */
    def coordinateForPoint(point: Point): js.Promise[LatLng] = js.native
    
    def fitToCoordinates(): Unit = js.native
    def fitToCoordinates(coordinates: js.Array[LatLng]): Unit = js.native
    def fitToCoordinates(coordinates: js.Array[LatLng], options: FitToOptions): Unit = js.native
    def fitToCoordinates(coordinates: Unit, options: FitToOptions): Unit = js.native
    
    def fitToElements(): Unit = js.native
    def fitToElements(options: FitToOptions): Unit = js.native
    
    def fitToSuppliedMarkers(markers: js.Array[String]): Unit = js.native
    def fitToSuppliedMarkers(markers: js.Array[String], options: FitToOptions): Unit = js.native
    
    def getCamera(): js.Promise[Camera] = js.native
    
    /**
      * Get visible boudaries
      *
      * @return Promise Promise with the bounding box ({ northEast: <LatLng>, southWest: <LatLng> })
      */
    def getMapBoundaries(): js.Promise[BoundingBox] = js.native
    
    /**
      * Get markers' centers and frames in user-space coordinates
      *
      * @param onlyVisible boolean true to include only visible markers, false to include all
      *
      * @return Promise Promise with { <identifier>: { point: Point, frame: Frame } }
      */
    def getMarkersFrames(): js.Promise[StringDictionary[Frame]] = js.native
    def getMarkersFrames(onlyVisible: Boolean): js.Promise[StringDictionary[Frame]] = js.native
    
    /* private */ var map: Any = js.native
    
    /**
      * Convert a map coordinate to user-space point
      *
      * @param coordinate Coordinate
      * @param [coordinate.latitude] Latitude
      * @param [coordinate.longitude] Longitude
      *
      * @return Promise Promise with the point ({ x: Number, y: Number })
      */
    def pointForCoordinate(coordinate: LatLng): js.Promise[Point] = js.native
    
    def setCamera(camera: PartialCamera): Unit = js.native
    
    def setIndoorActiveLevelIndex(activeLevelIndex: Double): Unit = js.native
    
    def setMapBoundaries(northEast: LatLng, southWest: LatLng): Unit = js.native
    
    /**
      * @deprecated Will be removed in v2.0.0, as setNativeProps is not a thing in fabric.
      * See https://reactnative.dev/docs/new-architecture-library-intro#migrating-off-setnativeprops
      */
    def setNativeProps(props: PartialNativePropsAccessibilityIgnoresInvertColors): Unit = js.native
    
    /**
      * Takes a snapshot of the map and saves it to a picture
      * file or returns the image as a base64 encoded string.
      *
      * @param args Configuration options
      * @param [args.width] Width of the rendered map-view (when omitted actual view width is used).
      * @param [args.height] Height of the rendered map-view (when omitted actual height is used).
      * @param [args.region] Region to render (Only supported on iOS).
      * @param [args.format] Encoding format ('png', 'jpg') (default: 'png').
      * @param [args.quality] Compression quality (only used for jpg) (default: 1.0).
      * @param [args.result] Result format ('file', 'base64') (default: 'file').
      *
      * @return Promise Promise with either the file-uri or base64 encoded string
      */
    def takeSnapshot(args: SnapshotOptions): js.Promise[String] = js.native
  }
  
  trait MapViewProps
    extends StObject
       with ViewProps {
    
    /**
      * If `true` map will be cached and displayed as an image instead of being interactable, for performance usage.
      *
      * @default false
      * @platform iOS: Apple maps only
      * @platform Android: Supported
      */
    var cacheEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The camera view the map should display.
      *
      * Use the camera system, instead of the region system, if you need control over
      * the pitch or heading. Using this will ignore the `region` property.
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var camera: js.UndefOr[Camera] = js.undefined
    
    /**
      * If set, changes the position of the compass.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var compassOffset: js.UndefOr[Point] = js.undefined
    
    /**
      * Adds custom styling to the map component.
      * See [README](https://github.com/react-native-maps/react-native-maps#customizing-the-map-style) for more information.
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var customMapStyle: js.UndefOr[js.Array[MapStyleElement]] = js.undefined
    
    /**
      * If `true` the map will focus on the user's location.
      * This only works if `showsUserLocation` is true and the user has shared their location.
      *
      * @default false
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var followsUserLocation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial camera view the map should use.  Use this prop instead of `camera`
      * only if you don't want to control the camera of the map besides the initial view.
      *
      * Use the camera system, instead of the region system, if you need control over
      * the pitch or heading.
      *
      * Changing this prop after the component has mounted will not result in a camera change.
      *
      * This is similar to the `initialValue` prop of a text input.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var initialCamera: js.UndefOr[Camera] = js.undefined
    
    /**
      * The initial region to be displayed by the map.  Use this prop instead of `region`
      * only if you don't want to control the viewport of the map besides the initial region.
      *
      * Changing this prop after the component has mounted will not result in a region change.
      *
      * This is similar to the `initialValue` prop of a text input.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var initialRegion: js.UndefOr[Region] = js.undefined
    
    /**
      * The URL for KML file.
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var kmlSrc: js.UndefOr[String] = js.undefined
    
    /**
      * If set, changes the position of the "Legal" label link in Apple maps.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var legalLabelInsets: js.UndefOr[EdgePadding] = js.undefined
    
    /**
      * Enables lite mode on Android
      *
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var liteMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets loading background color.
      *
      * @default `#FFFFFF`
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var loadingBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * If `true` a loading indicator will show while the map is loading.
      *
      * @default false
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var loadingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets loading indicator color.
      *
      * @default `#606060`
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var loadingIndicatorColor: js.UndefOr[String] = js.undefined
    
    /**
      * Adds custom padding to each side of the map. Useful when map elements/markers are obscured.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var mapPadding: js.UndefOr[EdgePadding] = js.undefined
    
    /**
      * The map type to be displayed
      *
      * @default `standard`
      * @platform iOS: hybrid | mutedStandard | sattelite | standard | terrain
      * @platform Android: hybrid | none | sattelite | standard | terrain
      */
    var mapType: js.UndefOr[MapType] = js.undefined
    
    /**
      * TODO: Add documentation
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var maxDelta: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum zoom value for the map, must be between 0 and 20
      *
      * @default 20
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var maxZoomLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * TODO: Add documentation
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var minDelta: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum zoom value for the map, must be between 0 and 20
      *
      * @default 0
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var minZoomLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * If `false` the map won't move to the marker when pressed.
      *
      * @default true
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when a callout is tapped by the user.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onCalloutPress: js.UndefOr[js.Function1[/* event */ CalloutPressEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when user double taps on the map.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onDoublePress: js.UndefOr[js.Function1[/* event */ ClickEvent[js.Object], Unit]] = js.undefined
    
    /**
      * Callback that is called when an indoor building is focused/unfocused
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var onIndoorBuildingFocused: js.UndefOr[js.Function1[/* event */ IndoorBuildingEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when a level on indoor building is activated
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var onIndoorLevelActivated: js.UndefOr[js.Function1[/* event */ IndoorLevelActivatedEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called once the kml is fully loaded.
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var onKmlReady: js.UndefOr[js.Function1[/* event */ KmlMapEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when user makes a "long press" somewhere on the map.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onLongPress: js.UndefOr[js.Function1[/* event */ LongPressEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when the map has finished rendering all tiles.
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var onMapLoaded: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[js.Object], Unit]] = js.undefined
    
    /**
      * Callback that is called once the map is ready.
      *
      * Event is optional, as the first onMapReady callback is intercepted
      * on Android, and the event is not passed on.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onMapReady: js.UndefOr[js.Function1[/* event */ js.UndefOr[NativeSyntheticEvent[js.Object]], Unit]] = js.undefined
    
    /**
      * Callback that is called when a marker on the map becomes deselected.
      * This will be called when the callout for that marker is about to be hidden.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var onMarkerDeselect: js.UndefOr[js.Function1[/* event */ MarkerDeselectEvent, Unit]] = js.undefined
    
    /**
      * Callback called continuously as a marker is dragged
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MarkerDragEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when a drag on a marker finishes.
      * This is usually the point you will want to setState on the marker's coordinate again
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when the user initiates a drag on a marker (if it is draggable)
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when a marker on the map is tapped by the user.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onMarkerPress: js.UndefOr[js.Function1[/* event */ MarkerPressEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when a marker on the map becomes selected.
      * This will be called when the callout for that marker is about to be shown.
      *
      * @platform iOS: Apple Maps only.
      * @platform Android: Not supported
      */
    var onMarkerSelect: js.UndefOr[js.Function1[/* event */ MarkerSelectEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when user presses and drags the map.
      * **NOTE**: for iOS `scrollEnabled` should be set to false to trigger the event
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onPanDrag: js.UndefOr[js.Function1[/* event */ PanDragEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when user click on a POI.
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var onPoiClick: js.UndefOr[js.Function1[/* event */ PoiClickEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when user taps on the map.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onPress: js.UndefOr[js.Function1[/* event */ MapPressEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called continuously when the region changes, such as when a user is dragging the map.
      * `isGesture` property indicates if the move was from the user (true) or an animation (false).
      * **Note**: `isGesture` is supported by Google Maps only.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onRegionChange: js.UndefOr[js.Function2[/* region */ Region, /* details */ Details, Unit]] = js.undefined
    
    /**
      * Callback that is called once when the region changes, such as when the user is done moving the map.
      * `isGesture` property indicates if the move was from the user (true) or an animation (false).
      * **Note**: `isGesture` is supported by Google Maps only.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onRegionChangeComplete: js.UndefOr[js.Function2[/* region */ Region, /* details */ Details, Unit]] = js.undefined
    
    /**
      * Callback that is called when the underlying map figures our users current location
      * (coordinate also includes isFromMockProvider value for Android API 18 and above).
      * Make sure **showsUserLocation** is set to *true*.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var onUserLocationChange: js.UndefOr[js.Function1[/* event */ UserLocationChangeEvent, Unit]] = js.undefined
    
    /**
      * Indicates how/when to affect padding with safe area insets
      *
      * @platform iOS: Google Maps only
      * @platform Android: Not supported
      */
    var paddingAdjustmentBehavior: js.UndefOr[always | automatic | never] = js.undefined
    
    /**
      * If `false` the user won't be able to adjust the camera’s pitch angle.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var pitchEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The map framework to use.
      * Either `"google"` for GoogleMaps, otherwise `undefined` to use the native map framework (`MapKit` in iOS and `GoogleMaps` in android).
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var provider: js.UndefOr[Provider] = js.undefined
    
    /**
      * The region to be displayed by the map.
      * The region is defined by the center coordinates and the span of coordinates to display.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var region: js.UndefOr[Region] = js.undefined
    
    /**
      * If `false` the user won't be able to adjust the camera’s pitch angle.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var rotateEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` the map will stay centered while rotating or zooming.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var scrollDuringRotateOrZoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` the user won't be able to change the map region being displayed.
      *
      * @default true
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Boolean indicating whether the map displays extruded building information.
      *
      * @default true
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var showsBuildings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` compass won't be displayed on the map.
      *
      * @default true
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var showsCompass: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Boolean indicating whether indoor level picker should be enabled.
      *
      * @default false
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Boolean indicating whether indoor maps should be enabled.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var showsIndoors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` hide the button to move map to the current user's location.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var showsMyLocationButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` points of interest won't be displayed on the map.
      * TODO: DEPRECATED? Doesn't seem to do anything
      *
      * @default true
      * @platform iOS: Maybe Apple Maps?
      * @platform Android: Not supported
      */
    var showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Boolean indicating whether the map shows scale information.
      *
      * @default true
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var showsScale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Boolean value indicating whether the map displays traffic information.
      * TODO: Look into android support
      *
      * @default false
      * @platform iOS: Supported
      * @platform Android: Not supported?
      */
    var showsTraffic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` the users location will be displayed on the map.
      *
      * This will cause iOS to ask for location permissions.
      * For iOS see: [DOCS](https://github.com/react-native-maps/react-native-maps/blob/master/docs/installation.md#set-the-usage-description-property)
      * @default false
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var showsUserLocation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the tint color of the map. (Changes the color of the position indicator)
      *
      * @default System Blue
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var tintColor: js.UndefOr[String] = js.undefined
    
    /**
      * If `false` will hide 'Navigate' and 'Open in Maps' buttons on marker press
      *
      * @default true
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the map to the style selected.
      *
      * @default System setting
      * @platform iOS: Apple Maps only (iOS >= 13.0)
      * @platform Android: Not supported
      */
    var userInterfaceStyle: js.UndefOr[light | dark] = js.undefined
    
    /**
      * The title of the annotation for current user location.
      *
      * This only works if `showsUserLocation` is true.
      *
      * @default `My Location`
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var userLocationAnnotationTitle: js.UndefOr[String] = js.undefined
    
    /**
      * If `true` clicking user location will show the default callout for userLocation annotation.
      *
      * @default false
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var userLocationCalloutEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fastest interval the application will actively acquire locations.
      *
      * See [Google APIs documentation](https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest.html)
      *
      * @default 5000
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var userLocationFastestInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Set power priority of user location tracking.
      *
      * See [Google APIs documentation](https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest.html)
      *
      * @default `high`
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var userLocationPriority: js.UndefOr[balanced | high | low | passive] = js.undefined
    
    /**
      * Interval of user location updates in milliseconds.
      *
      * See [Google APIs documentation](https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest.html)
      *
      * @default 5000
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var userLocationUpdateInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * If `false` the zoom control at the bottom right of the map won't be visible.
      *
      * @default true
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var zoomControlEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` the user won't be able to pinch/zoom the map.
      *
      * TODO: Why is the Android reactprop defaultvalue set to false?
      *
      * @default true
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var zoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false` the user won't be able to double tap to zoom the map.
      * **Note:** But it will greatly decrease delay of tap gesture recognition.
      *
      * @default true
      * @platform iOS: Google Maps only
      * @platform Android: Not supported
      */
    var zoomTapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object MapViewProps {
    
    inline def apply(): MapViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapViewProps]
    }
    
    extension [Self <: MapViewProps](x: Self) {
      
      inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setCompassOffset(value: Point): Self = StObject.set(x, "compassOffset", value.asInstanceOf[js.Any])
      
      inline def setCompassOffsetUndefined: Self = StObject.set(x, "compassOffset", js.undefined)
      
      inline def setCustomMapStyle(value: js.Array[MapStyleElement]): Self = StObject.set(x, "customMapStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomMapStyleUndefined: Self = StObject.set(x, "customMapStyle", js.undefined)
      
      inline def setCustomMapStyleVarargs(value: MapStyleElement*): Self = StObject.set(x, "customMapStyle", js.Array(value*))
      
      inline def setFollowsUserLocation(value: Boolean): Self = StObject.set(x, "followsUserLocation", value.asInstanceOf[js.Any])
      
      inline def setFollowsUserLocationUndefined: Self = StObject.set(x, "followsUserLocation", js.undefined)
      
      inline def setInitialCamera(value: Camera): Self = StObject.set(x, "initialCamera", value.asInstanceOf[js.Any])
      
      inline def setInitialCameraUndefined: Self = StObject.set(x, "initialCamera", js.undefined)
      
      inline def setInitialRegion(value: Region): Self = StObject.set(x, "initialRegion", value.asInstanceOf[js.Any])
      
      inline def setInitialRegionUndefined: Self = StObject.set(x, "initialRegion", js.undefined)
      
      inline def setKmlSrc(value: String): Self = StObject.set(x, "kmlSrc", value.asInstanceOf[js.Any])
      
      inline def setKmlSrcUndefined: Self = StObject.set(x, "kmlSrc", js.undefined)
      
      inline def setLegalLabelInsets(value: EdgePadding): Self = StObject.set(x, "legalLabelInsets", value.asInstanceOf[js.Any])
      
      inline def setLegalLabelInsetsUndefined: Self = StObject.set(x, "legalLabelInsets", js.undefined)
      
      inline def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
      
      inline def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
      
      inline def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
      
      inline def setLoadingEnabled(value: Boolean): Self = StObject.set(x, "loadingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoadingEnabledUndefined: Self = StObject.set(x, "loadingEnabled", js.undefined)
      
      inline def setLoadingIndicatorColor(value: String): Self = StObject.set(x, "loadingIndicatorColor", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorColorUndefined: Self = StObject.set(x, "loadingIndicatorColor", js.undefined)
      
      inline def setMapPadding(value: EdgePadding): Self = StObject.set(x, "mapPadding", value.asInstanceOf[js.Any])
      
      inline def setMapPaddingUndefined: Self = StObject.set(x, "mapPadding", js.undefined)
      
      inline def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
      
      inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
      
      inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
      
      inline def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
      
      inline def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
      
      inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
      
      inline def setMoveOnMarkerPress(value: Boolean): Self = StObject.set(x, "moveOnMarkerPress", value.asInstanceOf[js.Any])
      
      inline def setMoveOnMarkerPressUndefined: Self = StObject.set(x, "moveOnMarkerPress", js.undefined)
      
      inline def setOnCalloutPress(value: /* event */ CalloutPressEvent => Unit): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1(value))
      
      inline def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
      
      inline def setOnDoublePress(value: /* event */ ClickEvent[js.Object] => Unit): Self = StObject.set(x, "onDoublePress", js.Any.fromFunction1(value))
      
      inline def setOnDoublePressUndefined: Self = StObject.set(x, "onDoublePress", js.undefined)
      
      inline def setOnIndoorBuildingFocused(value: /* event */ IndoorBuildingEvent => Unit): Self = StObject.set(x, "onIndoorBuildingFocused", js.Any.fromFunction1(value))
      
      inline def setOnIndoorBuildingFocusedUndefined: Self = StObject.set(x, "onIndoorBuildingFocused", js.undefined)
      
      inline def setOnIndoorLevelActivated(value: /* event */ IndoorLevelActivatedEvent => Unit): Self = StObject.set(x, "onIndoorLevelActivated", js.Any.fromFunction1(value))
      
      inline def setOnIndoorLevelActivatedUndefined: Self = StObject.set(x, "onIndoorLevelActivated", js.undefined)
      
      inline def setOnKmlReady(value: /* event */ KmlMapEvent => Unit): Self = StObject.set(x, "onKmlReady", js.Any.fromFunction1(value))
      
      inline def setOnKmlReadyUndefined: Self = StObject.set(x, "onKmlReady", js.undefined)
      
      inline def setOnLongPress(value: /* event */ LongPressEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMapLoaded(value: /* event */ NativeSyntheticEvent[js.Object] => Unit): Self = StObject.set(x, "onMapLoaded", js.Any.fromFunction1(value))
      
      inline def setOnMapLoadedUndefined: Self = StObject.set(x, "onMapLoaded", js.undefined)
      
      inline def setOnMapReady(value: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]] => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1(value))
      
      inline def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
      
      inline def setOnMarkerDeselect(value: /* event */ MarkerDeselectEvent => Unit): Self = StObject.set(x, "onMarkerDeselect", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDeselectUndefined: Self = StObject.set(x, "onMarkerDeselect", js.undefined)
      
      inline def setOnMarkerDrag(value: /* event */ MarkerDragEvent => Unit): Self = StObject.set(x, "onMarkerDrag", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragEnd(value: /* event */ MarkerDragStartEndEvent => Unit): Self = StObject.set(x, "onMarkerDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragEndUndefined: Self = StObject.set(x, "onMarkerDragEnd", js.undefined)
      
      inline def setOnMarkerDragStart(value: /* event */ MarkerDragStartEndEvent => Unit): Self = StObject.set(x, "onMarkerDragStart", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragStartUndefined: Self = StObject.set(x, "onMarkerDragStart", js.undefined)
      
      inline def setOnMarkerDragUndefined: Self = StObject.set(x, "onMarkerDrag", js.undefined)
      
      inline def setOnMarkerPress(value: /* event */ MarkerPressEvent => Unit): Self = StObject.set(x, "onMarkerPress", js.Any.fromFunction1(value))
      
      inline def setOnMarkerPressUndefined: Self = StObject.set(x, "onMarkerPress", js.undefined)
      
      inline def setOnMarkerSelect(value: /* event */ MarkerSelectEvent => Unit): Self = StObject.set(x, "onMarkerSelect", js.Any.fromFunction1(value))
      
      inline def setOnMarkerSelectUndefined: Self = StObject.set(x, "onMarkerSelect", js.undefined)
      
      inline def setOnPanDrag(value: /* event */ PanDragEvent => Unit): Self = StObject.set(x, "onPanDrag", js.Any.fromFunction1(value))
      
      inline def setOnPanDragUndefined: Self = StObject.set(x, "onPanDrag", js.undefined)
      
      inline def setOnPoiClick(value: /* event */ PoiClickEvent => Unit): Self = StObject.set(x, "onPoiClick", js.Any.fromFunction1(value))
      
      inline def setOnPoiClickUndefined: Self = StObject.set(x, "onPoiClick", js.undefined)
      
      inline def setOnPress(value: /* event */ MapPressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnRegionChange(value: (/* region */ Region, /* details */ Details) => Unit): Self = StObject.set(x, "onRegionChange", js.Any.fromFunction2(value))
      
      inline def setOnRegionChangeComplete(value: (/* region */ Region, /* details */ Details) => Unit): Self = StObject.set(x, "onRegionChangeComplete", js.Any.fromFunction2(value))
      
      inline def setOnRegionChangeCompleteUndefined: Self = StObject.set(x, "onRegionChangeComplete", js.undefined)
      
      inline def setOnRegionChangeUndefined: Self = StObject.set(x, "onRegionChange", js.undefined)
      
      inline def setOnUserLocationChange(value: /* event */ UserLocationChangeEvent => Unit): Self = StObject.set(x, "onUserLocationChange", js.Any.fromFunction1(value))
      
      inline def setOnUserLocationChangeUndefined: Self = StObject.set(x, "onUserLocationChange", js.undefined)
      
      inline def setPaddingAdjustmentBehavior(value: always | automatic | never): Self = StObject.set(x, "paddingAdjustmentBehavior", value.asInstanceOf[js.Any])
      
      inline def setPaddingAdjustmentBehaviorUndefined: Self = StObject.set(x, "paddingAdjustmentBehavior", js.undefined)
      
      inline def setPitchEnabled(value: Boolean): Self = StObject.set(x, "pitchEnabled", value.asInstanceOf[js.Any])
      
      inline def setPitchEnabledUndefined: Self = StObject.set(x, "pitchEnabled", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
      
      inline def setScrollDuringRotateOrZoomEnabled(value: Boolean): Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollDuringRotateOrZoomEnabledUndefined: Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setShowsBuildings(value: Boolean): Self = StObject.set(x, "showsBuildings", value.asInstanceOf[js.Any])
      
      inline def setShowsBuildingsUndefined: Self = StObject.set(x, "showsBuildings", js.undefined)
      
      inline def setShowsCompass(value: Boolean): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
      
      inline def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
      
      inline def setShowsIndoorLevelPicker(value: Boolean): Self = StObject.set(x, "showsIndoorLevelPicker", value.asInstanceOf[js.Any])
      
      inline def setShowsIndoorLevelPickerUndefined: Self = StObject.set(x, "showsIndoorLevelPicker", js.undefined)
      
      inline def setShowsIndoors(value: Boolean): Self = StObject.set(x, "showsIndoors", value.asInstanceOf[js.Any])
      
      inline def setShowsIndoorsUndefined: Self = StObject.set(x, "showsIndoors", js.undefined)
      
      inline def setShowsMyLocationButton(value: Boolean): Self = StObject.set(x, "showsMyLocationButton", value.asInstanceOf[js.Any])
      
      inline def setShowsMyLocationButtonUndefined: Self = StObject.set(x, "showsMyLocationButton", js.undefined)
      
      inline def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
      
      inline def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
      
      inline def setShowsScale(value: Boolean): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
      
      inline def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
      
      inline def setShowsTraffic(value: Boolean): Self = StObject.set(x, "showsTraffic", value.asInstanceOf[js.Any])
      
      inline def setShowsTrafficUndefined: Self = StObject.set(x, "showsTraffic", js.undefined)
      
      inline def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
      
      inline def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
      
      inline def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
      
      inline def setUserInterfaceStyle(value: light | dark): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
      
      inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
      
      inline def setUserLocationAnnotationTitle(value: String): Self = StObject.set(x, "userLocationAnnotationTitle", value.asInstanceOf[js.Any])
      
      inline def setUserLocationAnnotationTitleUndefined: Self = StObject.set(x, "userLocationAnnotationTitle", js.undefined)
      
      inline def setUserLocationCalloutEnabled(value: Boolean): Self = StObject.set(x, "userLocationCalloutEnabled", value.asInstanceOf[js.Any])
      
      inline def setUserLocationCalloutEnabledUndefined: Self = StObject.set(x, "userLocationCalloutEnabled", js.undefined)
      
      inline def setUserLocationFastestInterval(value: Double): Self = StObject.set(x, "userLocationFastestInterval", value.asInstanceOf[js.Any])
      
      inline def setUserLocationFastestIntervalUndefined: Self = StObject.set(x, "userLocationFastestInterval", js.undefined)
      
      inline def setUserLocationPriority(value: balanced | high | low | passive): Self = StObject.set(x, "userLocationPriority", value.asInstanceOf[js.Any])
      
      inline def setUserLocationPriorityUndefined: Self = StObject.set(x, "userLocationPriority", js.undefined)
      
      inline def setUserLocationUpdateInterval(value: Double): Self = StObject.set(x, "userLocationUpdateInterval", value.asInstanceOf[js.Any])
      
      inline def setUserLocationUpdateIntervalUndefined: Self = StObject.set(x, "userLocationUpdateInterval", js.undefined)
      
      inline def setZoomControlEnabled(value: Boolean): Self = StObject.set(x, "zoomControlEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomControlEnabledUndefined: Self = StObject.set(x, "zoomControlEnabled", js.undefined)
      
      inline def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
      
      inline def setZoomTapEnabled(value: Boolean): Self = StObject.set(x, "zoomTapEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomTapEnabledUndefined: Self = StObject.set(x, "zoomTapEnabled", js.undefined)
    }
  }
  
  /* Inlined react-native-maps.react-native-maps/lib/sharedTypesInternal.Modify<react-native-maps.react-native-maps/lib/MapView.MapViewProps, {  region :react-native-maps.react-native-maps/lib/MapView.MapViewProps['region'] | null | undefined,   initialRegion :react-native-maps.react-native-maps/lib/MapView.MapViewProps['initialRegion'] | null | undefined}> */
  trait ModifiedProps extends StObject {
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var cacheEnabled: js.UndefOr[Boolean] = js.undefined
    
    var camera: js.UndefOr[Camera] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var compassOffset: js.UndefOr[Point] = js.undefined
    
    var customMapStyle: js.UndefOr[js.Array[MapStyleElement]] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var followsUserLocation: js.UndefOr[Boolean] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var initialCamera: js.UndefOr[Camera] = js.undefined
    
    var initialRegion: js.UndefOr[Region | Null] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    var kmlSrc: js.UndefOr[String] = js.undefined
    
    var legalLabelInsets: js.UndefOr[EdgePadding] = js.undefined
    
    var liteMode: js.UndefOr[Boolean] = js.undefined
    
    var loadingBackgroundColor: js.UndefOr[String] = js.undefined
    
    var loadingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var loadingIndicatorColor: js.UndefOr[String] = js.undefined
    
    var mapPadding: js.UndefOr[EdgePadding] = js.undefined
    
    var mapType: js.UndefOr[MapType] = js.undefined
    
    var maxDelta: js.UndefOr[Double] = js.undefined
    
    var maxZoomLevel: js.UndefOr[Double] = js.undefined
    
    var minDelta: js.UndefOr[Double] = js.undefined
    
    var minZoomLevel: js.UndefOr[Double] = js.undefined
    
    var moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCalloutPress: js.UndefOr[js.Function1[/* event */ CalloutPressEvent, Unit]] = js.undefined
    
    var onDoublePress: js.UndefOr[js.Function1[/* event */ ClickEvent[js.Object], Unit]] = js.undefined
    
    var onIndoorBuildingFocused: js.UndefOr[js.Function1[/* event */ IndoorBuildingEvent, Unit]] = js.undefined
    
    var onIndoorLevelActivated: js.UndefOr[js.Function1[/* event */ IndoorLevelActivatedEvent, Unit]] = js.undefined
    
    var onKmlReady: js.UndefOr[js.Function1[/* event */ KmlMapEvent, Unit]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ LongPressEvent, Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMapLoaded: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[js.Object], Unit]] = js.undefined
    
    var onMapReady: js.UndefOr[js.Function1[/* event */ js.UndefOr[NativeSyntheticEvent[js.Object]], Unit]] = js.undefined
    
    var onMarkerDeselect: js.UndefOr[js.Function1[/* event */ MarkerDeselectEvent, Unit]] = js.undefined
    
    var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MarkerDragEvent, Unit]] = js.undefined
    
    var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
    
    var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
    
    var onMarkerPress: js.UndefOr[js.Function1[/* event */ MarkerPressEvent, Unit]] = js.undefined
    
    var onMarkerSelect: js.UndefOr[js.Function1[/* event */ MarkerSelectEvent, Unit]] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onPanDrag: js.UndefOr[js.Function1[/* event */ PanDragEvent, Unit]] = js.undefined
    
    var onPoiClick: js.UndefOr[js.Function1[/* event */ PoiClickEvent, Unit]] = js.undefined
    
    var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* event */ MapPressEvent, Unit]] = js.undefined
    
    var onRegionChange: js.UndefOr[js.Function2[/* region */ Region, /* details */ Details, Unit]] = js.undefined
    
    var onRegionChangeComplete: js.UndefOr[js.Function2[/* region */ Region, /* details */ Details, Unit]] = js.undefined
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onUserLocationChange: js.UndefOr[js.Function1[/* event */ UserLocationChangeEvent, Unit]] = js.undefined
    
    var paddingAdjustmentBehavior: js.UndefOr[always | automatic | never] = js.undefined
    
    var pitchEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var region: js.UndefOr[Region | Null] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    var rotateEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollDuringRotateOrZoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var showsBuildings: js.UndefOr[Boolean] = js.undefined
    
    var showsCompass: js.UndefOr[Boolean] = js.undefined
    
    var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined
    
    var showsIndoors: js.UndefOr[Boolean] = js.undefined
    
    var showsMyLocationButton: js.UndefOr[Boolean] = js.undefined
    
    var showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined
    
    var showsScale: js.UndefOr[Boolean] = js.undefined
    
    var showsTraffic: js.UndefOr[Boolean] = js.undefined
    
    var showsUserLocation: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    var userInterfaceStyle: js.UndefOr[light | dark] = js.undefined
    
    var userLocationAnnotationTitle: js.UndefOr[String] = js.undefined
    
    var userLocationCalloutEnabled: js.UndefOr[Boolean] = js.undefined
    
    var userLocationFastestInterval: js.UndefOr[Double] = js.undefined
    
    var userLocationPriority: js.UndefOr[balanced | high | low | passive] = js.undefined
    
    var userLocationUpdateInterval: js.UndefOr[Double] = js.undefined
    
    var zoomControlEnabled: js.UndefOr[Boolean] = js.undefined
    
    var zoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    var zoomTapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object ModifiedProps {
    
    inline def apply(): ModifiedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifiedProps]
    }
    
    extension [Self <: ModifiedProps](x: Self) {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setCompassOffset(value: Point): Self = StObject.set(x, "compassOffset", value.asInstanceOf[js.Any])
      
      inline def setCompassOffsetUndefined: Self = StObject.set(x, "compassOffset", js.undefined)
      
      inline def setCustomMapStyle(value: js.Array[MapStyleElement]): Self = StObject.set(x, "customMapStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomMapStyleUndefined: Self = StObject.set(x, "customMapStyle", js.undefined)
      
      inline def setCustomMapStyleVarargs(value: MapStyleElement*): Self = StObject.set(x, "customMapStyle", js.Array(value*))
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFollowsUserLocation(value: Boolean): Self = StObject.set(x, "followsUserLocation", value.asInstanceOf[js.Any])
      
      inline def setFollowsUserLocationUndefined: Self = StObject.set(x, "followsUserLocation", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setInitialCamera(value: Camera): Self = StObject.set(x, "initialCamera", value.asInstanceOf[js.Any])
      
      inline def setInitialCameraUndefined: Self = StObject.set(x, "initialCamera", js.undefined)
      
      inline def setInitialRegion(value: Region): Self = StObject.set(x, "initialRegion", value.asInstanceOf[js.Any])
      
      inline def setInitialRegionNull: Self = StObject.set(x, "initialRegion", null)
      
      inline def setInitialRegionUndefined: Self = StObject.set(x, "initialRegion", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setKmlSrc(value: String): Self = StObject.set(x, "kmlSrc", value.asInstanceOf[js.Any])
      
      inline def setKmlSrcUndefined: Self = StObject.set(x, "kmlSrc", js.undefined)
      
      inline def setLegalLabelInsets(value: EdgePadding): Self = StObject.set(x, "legalLabelInsets", value.asInstanceOf[js.Any])
      
      inline def setLegalLabelInsetsUndefined: Self = StObject.set(x, "legalLabelInsets", js.undefined)
      
      inline def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
      
      inline def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
      
      inline def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
      
      inline def setLoadingEnabled(value: Boolean): Self = StObject.set(x, "loadingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoadingEnabledUndefined: Self = StObject.set(x, "loadingEnabled", js.undefined)
      
      inline def setLoadingIndicatorColor(value: String): Self = StObject.set(x, "loadingIndicatorColor", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorColorUndefined: Self = StObject.set(x, "loadingIndicatorColor", js.undefined)
      
      inline def setMapPadding(value: EdgePadding): Self = StObject.set(x, "mapPadding", value.asInstanceOf[js.Any])
      
      inline def setMapPaddingUndefined: Self = StObject.set(x, "mapPadding", js.undefined)
      
      inline def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
      
      inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
      
      inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
      
      inline def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
      
      inline def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
      
      inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
      
      inline def setMoveOnMarkerPress(value: Boolean): Self = StObject.set(x, "moveOnMarkerPress", value.asInstanceOf[js.Any])
      
      inline def setMoveOnMarkerPressUndefined: Self = StObject.set(x, "moveOnMarkerPress", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnCalloutPress(value: /* event */ CalloutPressEvent => Unit): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1(value))
      
      inline def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
      
      inline def setOnDoublePress(value: /* event */ ClickEvent[js.Object] => Unit): Self = StObject.set(x, "onDoublePress", js.Any.fromFunction1(value))
      
      inline def setOnDoublePressUndefined: Self = StObject.set(x, "onDoublePress", js.undefined)
      
      inline def setOnIndoorBuildingFocused(value: /* event */ IndoorBuildingEvent => Unit): Self = StObject.set(x, "onIndoorBuildingFocused", js.Any.fromFunction1(value))
      
      inline def setOnIndoorBuildingFocusedUndefined: Self = StObject.set(x, "onIndoorBuildingFocused", js.undefined)
      
      inline def setOnIndoorLevelActivated(value: /* event */ IndoorLevelActivatedEvent => Unit): Self = StObject.set(x, "onIndoorLevelActivated", js.Any.fromFunction1(value))
      
      inline def setOnIndoorLevelActivatedUndefined: Self = StObject.set(x, "onIndoorLevelActivated", js.undefined)
      
      inline def setOnKmlReady(value: /* event */ KmlMapEvent => Unit): Self = StObject.set(x, "onKmlReady", js.Any.fromFunction1(value))
      
      inline def setOnKmlReadyUndefined: Self = StObject.set(x, "onKmlReady", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ LongPressEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMapLoaded(value: /* event */ NativeSyntheticEvent[js.Object] => Unit): Self = StObject.set(x, "onMapLoaded", js.Any.fromFunction1(value))
      
      inline def setOnMapLoadedUndefined: Self = StObject.set(x, "onMapLoaded", js.undefined)
      
      inline def setOnMapReady(value: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]] => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1(value))
      
      inline def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
      
      inline def setOnMarkerDeselect(value: /* event */ MarkerDeselectEvent => Unit): Self = StObject.set(x, "onMarkerDeselect", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDeselectUndefined: Self = StObject.set(x, "onMarkerDeselect", js.undefined)
      
      inline def setOnMarkerDrag(value: /* event */ MarkerDragEvent => Unit): Self = StObject.set(x, "onMarkerDrag", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragEnd(value: /* event */ MarkerDragStartEndEvent => Unit): Self = StObject.set(x, "onMarkerDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragEndUndefined: Self = StObject.set(x, "onMarkerDragEnd", js.undefined)
      
      inline def setOnMarkerDragStart(value: /* event */ MarkerDragStartEndEvent => Unit): Self = StObject.set(x, "onMarkerDragStart", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragStartUndefined: Self = StObject.set(x, "onMarkerDragStart", js.undefined)
      
      inline def setOnMarkerDragUndefined: Self = StObject.set(x, "onMarkerDrag", js.undefined)
      
      inline def setOnMarkerPress(value: /* event */ MarkerPressEvent => Unit): Self = StObject.set(x, "onMarkerPress", js.Any.fromFunction1(value))
      
      inline def setOnMarkerPressUndefined: Self = StObject.set(x, "onMarkerPress", js.undefined)
      
      inline def setOnMarkerSelect(value: /* event */ MarkerSelectEvent => Unit): Self = StObject.set(x, "onMarkerSelect", js.Any.fromFunction1(value))
      
      inline def setOnMarkerSelectUndefined: Self = StObject.set(x, "onMarkerSelect", js.undefined)
      
      inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnPanDrag(value: /* event */ PanDragEvent => Unit): Self = StObject.set(x, "onPanDrag", js.Any.fromFunction1(value))
      
      inline def setOnPanDragUndefined: Self = StObject.set(x, "onPanDrag", js.undefined)
      
      inline def setOnPoiClick(value: /* event */ PoiClickEvent => Unit): Self = StObject.set(x, "onPoiClick", js.Any.fromFunction1(value))
      
      inline def setOnPoiClickUndefined: Self = StObject.set(x, "onPoiClick", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnPress(value: /* event */ MapPressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnRegionChange(value: (/* region */ Region, /* details */ Details) => Unit): Self = StObject.set(x, "onRegionChange", js.Any.fromFunction2(value))
      
      inline def setOnRegionChangeComplete(value: (/* region */ Region, /* details */ Details) => Unit): Self = StObject.set(x, "onRegionChangeComplete", js.Any.fromFunction2(value))
      
      inline def setOnRegionChangeCompleteUndefined: Self = StObject.set(x, "onRegionChangeComplete", js.undefined)
      
      inline def setOnRegionChangeUndefined: Self = StObject.set(x, "onRegionChange", js.undefined)
      
      inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnUserLocationChange(value: /* event */ UserLocationChangeEvent => Unit): Self = StObject.set(x, "onUserLocationChange", js.Any.fromFunction1(value))
      
      inline def setOnUserLocationChangeUndefined: Self = StObject.set(x, "onUserLocationChange", js.undefined)
      
      inline def setPaddingAdjustmentBehavior(value: always | automatic | never): Self = StObject.set(x, "paddingAdjustmentBehavior", value.asInstanceOf[js.Any])
      
      inline def setPaddingAdjustmentBehaviorUndefined: Self = StObject.set(x, "paddingAdjustmentBehavior", js.undefined)
      
      inline def setPitchEnabled(value: Boolean): Self = StObject.set(x, "pitchEnabled", value.asInstanceOf[js.Any])
      
      inline def setPitchEnabledUndefined: Self = StObject.set(x, "pitchEnabled", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
      
      inline def setScrollDuringRotateOrZoomEnabled(value: Boolean): Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollDuringRotateOrZoomEnabledUndefined: Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setShowsBuildings(value: Boolean): Self = StObject.set(x, "showsBuildings", value.asInstanceOf[js.Any])
      
      inline def setShowsBuildingsUndefined: Self = StObject.set(x, "showsBuildings", js.undefined)
      
      inline def setShowsCompass(value: Boolean): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
      
      inline def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
      
      inline def setShowsIndoorLevelPicker(value: Boolean): Self = StObject.set(x, "showsIndoorLevelPicker", value.asInstanceOf[js.Any])
      
      inline def setShowsIndoorLevelPickerUndefined: Self = StObject.set(x, "showsIndoorLevelPicker", js.undefined)
      
      inline def setShowsIndoors(value: Boolean): Self = StObject.set(x, "showsIndoors", value.asInstanceOf[js.Any])
      
      inline def setShowsIndoorsUndefined: Self = StObject.set(x, "showsIndoors", js.undefined)
      
      inline def setShowsMyLocationButton(value: Boolean): Self = StObject.set(x, "showsMyLocationButton", value.asInstanceOf[js.Any])
      
      inline def setShowsMyLocationButtonUndefined: Self = StObject.set(x, "showsMyLocationButton", js.undefined)
      
      inline def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
      
      inline def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
      
      inline def setShowsScale(value: Boolean): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
      
      inline def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
      
      inline def setShowsTraffic(value: Boolean): Self = StObject.set(x, "showsTraffic", value.asInstanceOf[js.Any])
      
      inline def setShowsTrafficUndefined: Self = StObject.set(x, "showsTraffic", js.undefined)
      
      inline def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
      
      inline def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
      
      inline def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
      
      inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      inline def setUserInterfaceStyle(value: light | dark): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
      
      inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
      
      inline def setUserLocationAnnotationTitle(value: String): Self = StObject.set(x, "userLocationAnnotationTitle", value.asInstanceOf[js.Any])
      
      inline def setUserLocationAnnotationTitleUndefined: Self = StObject.set(x, "userLocationAnnotationTitle", js.undefined)
      
      inline def setUserLocationCalloutEnabled(value: Boolean): Self = StObject.set(x, "userLocationCalloutEnabled", value.asInstanceOf[js.Any])
      
      inline def setUserLocationCalloutEnabledUndefined: Self = StObject.set(x, "userLocationCalloutEnabled", js.undefined)
      
      inline def setUserLocationFastestInterval(value: Double): Self = StObject.set(x, "userLocationFastestInterval", value.asInstanceOf[js.Any])
      
      inline def setUserLocationFastestIntervalUndefined: Self = StObject.set(x, "userLocationFastestInterval", js.undefined)
      
      inline def setUserLocationPriority(value: balanced | high | low | passive): Self = StObject.set(x, "userLocationPriority", value.asInstanceOf[js.Any])
      
      inline def setUserLocationPriorityUndefined: Self = StObject.set(x, "userLocationPriority", js.undefined)
      
      inline def setUserLocationUpdateInterval(value: Double): Self = StObject.set(x, "userLocationUpdateInterval", value.asInstanceOf[js.Any])
      
      inline def setUserLocationUpdateIntervalUndefined: Self = StObject.set(x, "userLocationUpdateInterval", js.undefined)
      
      inline def setZoomControlEnabled(value: Boolean): Self = StObject.set(x, "zoomControlEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomControlEnabledUndefined: Self = StObject.set(x, "zoomControlEnabled", js.undefined)
      
      inline def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
      
      inline def setZoomTapEnabled(value: Boolean): Self = StObject.set(x, "zoomTapEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomTapEnabledUndefined: Self = StObject.set(x, "zoomTapEnabled", js.undefined)
    }
  }
  
  /* Inlined std.Omit<react-native-maps.react-native-maps/lib/MapView.ModifiedProps, 'customMapStyle' | 'onRegionChange' | 'onRegionChangeComplete'> & {  ref :react.react.RefObject<react-native-maps.react-native-maps/lib/MapViewNativeComponent.MapViewNativeComponentType>,   customMapStyleString :string | undefined,   handlePanDrag :boolean | undefined,   onChange :(e : react-native-maps.react-native-maps/lib/MapView.types.ChangeEvent): void | undefined} */
  trait NativeProps extends StObject {
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var cacheEnabled: js.UndefOr[Boolean] = js.undefined
    
    var camera: js.UndefOr[Camera] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var compassOffset: js.UndefOr[Point] = js.undefined
    
    var customMapStyleString: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var followsUserLocation: js.UndefOr[Boolean] = js.undefined
    
    var handlePanDrag: js.UndefOr[Boolean] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var initialCamera: js.UndefOr[Camera] = js.undefined
    
    var initialRegion: js.UndefOr[Region | Null] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    var kmlSrc: js.UndefOr[String] = js.undefined
    
    var legalLabelInsets: js.UndefOr[EdgePadding] = js.undefined
    
    var liteMode: js.UndefOr[Boolean] = js.undefined
    
    var loadingBackgroundColor: js.UndefOr[String] = js.undefined
    
    var loadingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var loadingIndicatorColor: js.UndefOr[String] = js.undefined
    
    var mapPadding: js.UndefOr[EdgePadding] = js.undefined
    
    var mapType: js.UndefOr[MapType] = js.undefined
    
    var maxDelta: js.UndefOr[Double] = js.undefined
    
    var maxZoomLevel: js.UndefOr[Double] = js.undefined
    
    var minDelta: js.UndefOr[Double] = js.undefined
    
    var minZoomLevel: js.UndefOr[Double] = js.undefined
    
    var moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCalloutPress: js.UndefOr[js.Function1[/* event */ CalloutPressEvent, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, Unit]] = js.undefined
    
    var onDoublePress: js.UndefOr[js.Function1[/* event */ ClickEvent[js.Object], Unit]] = js.undefined
    
    var onIndoorBuildingFocused: js.UndefOr[js.Function1[/* event */ IndoorBuildingEvent, Unit]] = js.undefined
    
    var onIndoorLevelActivated: js.UndefOr[js.Function1[/* event */ IndoorLevelActivatedEvent, Unit]] = js.undefined
    
    var onKmlReady: js.UndefOr[js.Function1[/* event */ KmlMapEvent, Unit]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ LongPressEvent, Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMapLoaded: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[js.Object], Unit]] = js.undefined
    
    var onMapReady: js.UndefOr[js.Function1[/* event */ js.UndefOr[NativeSyntheticEvent[js.Object]], Unit]] = js.undefined
    
    var onMarkerDeselect: js.UndefOr[js.Function1[/* event */ MarkerDeselectEvent, Unit]] = js.undefined
    
    var onMarkerDrag: js.UndefOr[js.Function1[/* event */ MarkerDragEvent, Unit]] = js.undefined
    
    var onMarkerDragEnd: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
    
    var onMarkerDragStart: js.UndefOr[js.Function1[/* event */ MarkerDragStartEndEvent, Unit]] = js.undefined
    
    var onMarkerPress: js.UndefOr[js.Function1[/* event */ MarkerPressEvent, Unit]] = js.undefined
    
    var onMarkerSelect: js.UndefOr[js.Function1[/* event */ MarkerSelectEvent, Unit]] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onPanDrag: js.UndefOr[js.Function1[/* event */ PanDragEvent, Unit]] = js.undefined
    
    var onPoiClick: js.UndefOr[js.Function1[/* event */ PoiClickEvent, Unit]] = js.undefined
    
    var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* event */ MapPressEvent, Unit]] = js.undefined
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onUserLocationChange: js.UndefOr[js.Function1[/* event */ UserLocationChangeEvent, Unit]] = js.undefined
    
    var paddingAdjustmentBehavior: js.UndefOr[always | automatic | never] = js.undefined
    
    var pitchEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var ref: RefObject[MapViewNativeComponentType]
    
    var region: js.UndefOr[Region | Null] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    var rotateEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollDuringRotateOrZoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var showsBuildings: js.UndefOr[Boolean] = js.undefined
    
    var showsCompass: js.UndefOr[Boolean] = js.undefined
    
    var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined
    
    var showsIndoors: js.UndefOr[Boolean] = js.undefined
    
    var showsMyLocationButton: js.UndefOr[Boolean] = js.undefined
    
    var showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined
    
    var showsScale: js.UndefOr[Boolean] = js.undefined
    
    var showsTraffic: js.UndefOr[Boolean] = js.undefined
    
    var showsUserLocation: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    var userInterfaceStyle: js.UndefOr[light | dark] = js.undefined
    
    var userLocationAnnotationTitle: js.UndefOr[String] = js.undefined
    
    var userLocationCalloutEnabled: js.UndefOr[Boolean] = js.undefined
    
    var userLocationFastestInterval: js.UndefOr[Double] = js.undefined
    
    var userLocationPriority: js.UndefOr[balanced | high | low | passive] = js.undefined
    
    var userLocationUpdateInterval: js.UndefOr[Double] = js.undefined
    
    var zoomControlEnabled: js.UndefOr[Boolean] = js.undefined
    
    var zoomEnabled: js.UndefOr[Boolean] = js.undefined
    
    var zoomTapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object NativeProps {
    
    inline def apply(ref: RefObject[MapViewNativeComponentType]): NativeProps = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setCompassOffset(value: Point): Self = StObject.set(x, "compassOffset", value.asInstanceOf[js.Any])
      
      inline def setCompassOffsetUndefined: Self = StObject.set(x, "compassOffset", js.undefined)
      
      inline def setCustomMapStyleString(value: String): Self = StObject.set(x, "customMapStyleString", value.asInstanceOf[js.Any])
      
      inline def setCustomMapStyleStringUndefined: Self = StObject.set(x, "customMapStyleString", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFollowsUserLocation(value: Boolean): Self = StObject.set(x, "followsUserLocation", value.asInstanceOf[js.Any])
      
      inline def setFollowsUserLocationUndefined: Self = StObject.set(x, "followsUserLocation", js.undefined)
      
      inline def setHandlePanDrag(value: Boolean): Self = StObject.set(x, "handlePanDrag", value.asInstanceOf[js.Any])
      
      inline def setHandlePanDragUndefined: Self = StObject.set(x, "handlePanDrag", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setInitialCamera(value: Camera): Self = StObject.set(x, "initialCamera", value.asInstanceOf[js.Any])
      
      inline def setInitialCameraUndefined: Self = StObject.set(x, "initialCamera", js.undefined)
      
      inline def setInitialRegion(value: Region): Self = StObject.set(x, "initialRegion", value.asInstanceOf[js.Any])
      
      inline def setInitialRegionNull: Self = StObject.set(x, "initialRegion", null)
      
      inline def setInitialRegionUndefined: Self = StObject.set(x, "initialRegion", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setKmlSrc(value: String): Self = StObject.set(x, "kmlSrc", value.asInstanceOf[js.Any])
      
      inline def setKmlSrcUndefined: Self = StObject.set(x, "kmlSrc", js.undefined)
      
      inline def setLegalLabelInsets(value: EdgePadding): Self = StObject.set(x, "legalLabelInsets", value.asInstanceOf[js.Any])
      
      inline def setLegalLabelInsetsUndefined: Self = StObject.set(x, "legalLabelInsets", js.undefined)
      
      inline def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
      
      inline def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
      
      inline def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
      
      inline def setLoadingEnabled(value: Boolean): Self = StObject.set(x, "loadingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoadingEnabledUndefined: Self = StObject.set(x, "loadingEnabled", js.undefined)
      
      inline def setLoadingIndicatorColor(value: String): Self = StObject.set(x, "loadingIndicatorColor", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorColorUndefined: Self = StObject.set(x, "loadingIndicatorColor", js.undefined)
      
      inline def setMapPadding(value: EdgePadding): Self = StObject.set(x, "mapPadding", value.asInstanceOf[js.Any])
      
      inline def setMapPaddingUndefined: Self = StObject.set(x, "mapPadding", js.undefined)
      
      inline def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
      
      inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
      
      inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
      
      inline def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
      
      inline def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
      
      inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
      
      inline def setMoveOnMarkerPress(value: Boolean): Self = StObject.set(x, "moveOnMarkerPress", value.asInstanceOf[js.Any])
      
      inline def setMoveOnMarkerPressUndefined: Self = StObject.set(x, "moveOnMarkerPress", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnCalloutPress(value: /* event */ CalloutPressEvent => Unit): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1(value))
      
      inline def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDoublePress(value: /* event */ ClickEvent[js.Object] => Unit): Self = StObject.set(x, "onDoublePress", js.Any.fromFunction1(value))
      
      inline def setOnDoublePressUndefined: Self = StObject.set(x, "onDoublePress", js.undefined)
      
      inline def setOnIndoorBuildingFocused(value: /* event */ IndoorBuildingEvent => Unit): Self = StObject.set(x, "onIndoorBuildingFocused", js.Any.fromFunction1(value))
      
      inline def setOnIndoorBuildingFocusedUndefined: Self = StObject.set(x, "onIndoorBuildingFocused", js.undefined)
      
      inline def setOnIndoorLevelActivated(value: /* event */ IndoorLevelActivatedEvent => Unit): Self = StObject.set(x, "onIndoorLevelActivated", js.Any.fromFunction1(value))
      
      inline def setOnIndoorLevelActivatedUndefined: Self = StObject.set(x, "onIndoorLevelActivated", js.undefined)
      
      inline def setOnKmlReady(value: /* event */ KmlMapEvent => Unit): Self = StObject.set(x, "onKmlReady", js.Any.fromFunction1(value))
      
      inline def setOnKmlReadyUndefined: Self = StObject.set(x, "onKmlReady", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ LongPressEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMapLoaded(value: /* event */ NativeSyntheticEvent[js.Object] => Unit): Self = StObject.set(x, "onMapLoaded", js.Any.fromFunction1(value))
      
      inline def setOnMapLoadedUndefined: Self = StObject.set(x, "onMapLoaded", js.undefined)
      
      inline def setOnMapReady(value: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]] => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1(value))
      
      inline def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
      
      inline def setOnMarkerDeselect(value: /* event */ MarkerDeselectEvent => Unit): Self = StObject.set(x, "onMarkerDeselect", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDeselectUndefined: Self = StObject.set(x, "onMarkerDeselect", js.undefined)
      
      inline def setOnMarkerDrag(value: /* event */ MarkerDragEvent => Unit): Self = StObject.set(x, "onMarkerDrag", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragEnd(value: /* event */ MarkerDragStartEndEvent => Unit): Self = StObject.set(x, "onMarkerDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragEndUndefined: Self = StObject.set(x, "onMarkerDragEnd", js.undefined)
      
      inline def setOnMarkerDragStart(value: /* event */ MarkerDragStartEndEvent => Unit): Self = StObject.set(x, "onMarkerDragStart", js.Any.fromFunction1(value))
      
      inline def setOnMarkerDragStartUndefined: Self = StObject.set(x, "onMarkerDragStart", js.undefined)
      
      inline def setOnMarkerDragUndefined: Self = StObject.set(x, "onMarkerDrag", js.undefined)
      
      inline def setOnMarkerPress(value: /* event */ MarkerPressEvent => Unit): Self = StObject.set(x, "onMarkerPress", js.Any.fromFunction1(value))
      
      inline def setOnMarkerPressUndefined: Self = StObject.set(x, "onMarkerPress", js.undefined)
      
      inline def setOnMarkerSelect(value: /* event */ MarkerSelectEvent => Unit): Self = StObject.set(x, "onMarkerSelect", js.Any.fromFunction1(value))
      
      inline def setOnMarkerSelectUndefined: Self = StObject.set(x, "onMarkerSelect", js.undefined)
      
      inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnPanDrag(value: /* event */ PanDragEvent => Unit): Self = StObject.set(x, "onPanDrag", js.Any.fromFunction1(value))
      
      inline def setOnPanDragUndefined: Self = StObject.set(x, "onPanDrag", js.undefined)
      
      inline def setOnPoiClick(value: /* event */ PoiClickEvent => Unit): Self = StObject.set(x, "onPoiClick", js.Any.fromFunction1(value))
      
      inline def setOnPoiClickUndefined: Self = StObject.set(x, "onPoiClick", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnPress(value: /* event */ MapPressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnUserLocationChange(value: /* event */ UserLocationChangeEvent => Unit): Self = StObject.set(x, "onUserLocationChange", js.Any.fromFunction1(value))
      
      inline def setOnUserLocationChangeUndefined: Self = StObject.set(x, "onUserLocationChange", js.undefined)
      
      inline def setPaddingAdjustmentBehavior(value: always | automatic | never): Self = StObject.set(x, "paddingAdjustmentBehavior", value.asInstanceOf[js.Any])
      
      inline def setPaddingAdjustmentBehaviorUndefined: Self = StObject.set(x, "paddingAdjustmentBehavior", js.undefined)
      
      inline def setPitchEnabled(value: Boolean): Self = StObject.set(x, "pitchEnabled", value.asInstanceOf[js.Any])
      
      inline def setPitchEnabledUndefined: Self = StObject.set(x, "pitchEnabled", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setRef(value: RefObject[MapViewNativeComponentType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
      
      inline def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
      
      inline def setScrollDuringRotateOrZoomEnabled(value: Boolean): Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollDuringRotateOrZoomEnabledUndefined: Self = StObject.set(x, "scrollDuringRotateOrZoomEnabled", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setShowsBuildings(value: Boolean): Self = StObject.set(x, "showsBuildings", value.asInstanceOf[js.Any])
      
      inline def setShowsBuildingsUndefined: Self = StObject.set(x, "showsBuildings", js.undefined)
      
      inline def setShowsCompass(value: Boolean): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
      
      inline def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
      
      inline def setShowsIndoorLevelPicker(value: Boolean): Self = StObject.set(x, "showsIndoorLevelPicker", value.asInstanceOf[js.Any])
      
      inline def setShowsIndoorLevelPickerUndefined: Self = StObject.set(x, "showsIndoorLevelPicker", js.undefined)
      
      inline def setShowsIndoors(value: Boolean): Self = StObject.set(x, "showsIndoors", value.asInstanceOf[js.Any])
      
      inline def setShowsIndoorsUndefined: Self = StObject.set(x, "showsIndoors", js.undefined)
      
      inline def setShowsMyLocationButton(value: Boolean): Self = StObject.set(x, "showsMyLocationButton", value.asInstanceOf[js.Any])
      
      inline def setShowsMyLocationButtonUndefined: Self = StObject.set(x, "showsMyLocationButton", js.undefined)
      
      inline def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
      
      inline def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
      
      inline def setShowsScale(value: Boolean): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
      
      inline def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
      
      inline def setShowsTraffic(value: Boolean): Self = StObject.set(x, "showsTraffic", value.asInstanceOf[js.Any])
      
      inline def setShowsTrafficUndefined: Self = StObject.set(x, "showsTraffic", js.undefined)
      
      inline def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
      
      inline def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
      
      inline def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
      
      inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      inline def setUserInterfaceStyle(value: light | dark): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
      
      inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
      
      inline def setUserLocationAnnotationTitle(value: String): Self = StObject.set(x, "userLocationAnnotationTitle", value.asInstanceOf[js.Any])
      
      inline def setUserLocationAnnotationTitleUndefined: Self = StObject.set(x, "userLocationAnnotationTitle", js.undefined)
      
      inline def setUserLocationCalloutEnabled(value: Boolean): Self = StObject.set(x, "userLocationCalloutEnabled", value.asInstanceOf[js.Any])
      
      inline def setUserLocationCalloutEnabledUndefined: Self = StObject.set(x, "userLocationCalloutEnabled", js.undefined)
      
      inline def setUserLocationFastestInterval(value: Double): Self = StObject.set(x, "userLocationFastestInterval", value.asInstanceOf[js.Any])
      
      inline def setUserLocationFastestIntervalUndefined: Self = StObject.set(x, "userLocationFastestInterval", js.undefined)
      
      inline def setUserLocationPriority(value: balanced | high | low | passive): Self = StObject.set(x, "userLocationPriority", value.asInstanceOf[js.Any])
      
      inline def setUserLocationPriorityUndefined: Self = StObject.set(x, "userLocationPriority", js.undefined)
      
      inline def setUserLocationUpdateInterval(value: Double): Self = StObject.set(x, "userLocationUpdateInterval", value.asInstanceOf[js.Any])
      
      inline def setUserLocationUpdateIntervalUndefined: Self = StObject.set(x, "userLocationUpdateInterval", js.undefined)
      
      inline def setZoomControlEnabled(value: Boolean): Self = StObject.set(x, "zoomControlEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomControlEnabledUndefined: Self = StObject.set(x, "zoomControlEnabled", js.undefined)
      
      inline def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
      
      inline def setZoomTapEnabled(value: Boolean): Self = StObject.set(x, "zoomTapEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomTapEnabledUndefined: Self = StObject.set(x, "zoomTapEnabled", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var isReady: Boolean
  }
  object State {
    
    inline def apply(isReady: Boolean): State = {
      val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    }
  }
}
