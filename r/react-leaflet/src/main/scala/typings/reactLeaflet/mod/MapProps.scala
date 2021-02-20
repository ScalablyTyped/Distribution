package typings.reactLeaflet.mod

import typings.leaflet.mod.CRS
import typings.leaflet.mod.FitBoundsOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.Layer
import typings.leaflet.mod.Renderer
import typings.leaflet.mod.Zoom
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LocateOptions because var conflicts: maxZoom. Inlined setView, enableHighAccuracy, maximumAge, timeout, watch
- typings.leaflet.mod.MapOptions because var conflicts: easeLinearity, maxZoom. Inlined attributionControl, tap, wheelDebounceTime, zoomControl, tapTolerance, layers, inertiaDeceleration, keyboardPanDelta, center, doubleClickZoom, boxZoom, maxBounds, maxBoundsViscosity, zoomSnap, zoom, minZoom, crs, inertiaMaxSpeed, renderer, scrollWheelZoom, zoomDelta, preferCanvas, dragging, closePopupOnClick, transform3DLimit, fadeAnimation, touchZoom, keyboard, zoomAnimationThreshold, worldCopyJump, wheelPxPerZoomLevel, zoomAnimation, inertia, bounceAtZoomLimits, markerZoomAnimation, trackResize */ @js.native
trait MapProps
  extends FitBoundsOptions
     with MapEvents {
  
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.native
  
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.native
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  
  var boundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  
  var boxZoom: js.UndefOr[Boolean] = js.native
  
  var center: js.UndefOr[LatLngExpression] = js.native
  
  var children: Children = js.native
  
  var className: js.UndefOr[String] = js.native
  
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.native
  
  // Map state options
  var crs: js.UndefOr[CRS] = js.native
  
  var doubleClickZoom: js.UndefOr[Zoom] = js.native
  
  var dragging: js.UndefOr[Boolean] = js.native
  
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.native
  
  var inertiaDeceleration: js.UndefOr[Double] = js.native
  
  var inertiaMaxSpeed: js.UndefOr[Double] = js.native
  
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var keyboardPanDelta: js.UndefOr[Double] = js.native
  
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  
  var markerZoomAnimation: js.UndefOr[Boolean] = js.native
  
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.native
  
  var maxBoundsViscosity: js.UndefOr[Double] = js.native
  
  var maximumAge: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.native
  
  var onViewportChanged: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.native
  
  var preferCanvas: js.UndefOr[Boolean] = js.native
  
  var renderer: js.UndefOr[Renderer] = js.native
  
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.native
  
  var setView: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.native
  
  var tapTolerance: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var touchZoom: js.UndefOr[Zoom] = js.native
  
  var trackResize: js.UndefOr[Boolean] = js.native
  
  var transform3DLimit: js.UndefOr[Double] = js.native
  
  var useFlyTo: js.UndefOr[Boolean] = js.native
  
  var viewport: js.UndefOr[Viewport] = js.native
  
  var watch: js.UndefOr[Boolean] = js.native
  
  var wheelDebounceTime: js.UndefOr[Double] = js.native
  
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.native
  
  var whenReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  var worldCopyJump: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
  
  var zoomAnimation: js.UndefOr[Boolean] = js.native
  
  var zoomAnimationThreshold: js.UndefOr[Double] = js.native
  
  var zoomControl: js.UndefOr[Boolean] = js.native
  
  var zoomDelta: js.UndefOr[Double] = js.native
  
  var zoomSnap: js.UndefOr[Double] = js.native
}
object MapProps {
  
  @scala.inline
  def apply(): MapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapProps]
  }
  
  @scala.inline
  implicit class MapPropsMutableBuilder[Self <: MapProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
    
    @scala.inline
    def setBounceAtZoomLimits(value: Boolean): Self = StObject.set(x, "bounceAtZoomLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceAtZoomLimitsUndefined: Self = StObject.set(x, "bounceAtZoomLimits", js.undefined)
    
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "boundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsOptionsUndefined: Self = StObject.set(x, "boundsOptions", js.undefined)
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setBoxZoom(value: Boolean): Self = StObject.set(x, "boxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxZoomUndefined: Self = StObject.set(x, "boxZoom", js.undefined)
    
    @scala.inline
    def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClosePopupOnClick(value: Boolean): Self = StObject.set(x, "closePopupOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosePopupOnClickUndefined: Self = StObject.set(x, "closePopupOnClick", js.undefined)
    
    @scala.inline
    def setCrs(value: CRS): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    @scala.inline
    def setDoubleClickZoom(value: Zoom): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    @scala.inline
    def setFadeAnimation(value: Boolean): Self = StObject.set(x, "fadeAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeAnimationUndefined: Self = StObject.set(x, "fadeAnimation", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInertia(value: Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInertiaDeceleration(value: Double): Self = StObject.set(x, "inertiaDeceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInertiaDecelerationUndefined: Self = StObject.set(x, "inertiaDeceleration", js.undefined)
    
    @scala.inline
    def setInertiaMaxSpeed(value: Double): Self = StObject.set(x, "inertiaMaxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInertiaMaxSpeedUndefined: Self = StObject.set(x, "inertiaMaxSpeed", js.undefined)
    
    @scala.inline
    def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardPanDelta(value: Double): Self = StObject.set(x, "keyboardPanDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardPanDeltaUndefined: Self = StObject.set(x, "keyboardPanDelta", js.undefined)
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setMarkerZoomAnimation(value: Boolean): Self = StObject.set(x, "markerZoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerZoomAnimationUndefined: Self = StObject.set(x, "markerZoomAnimation", js.undefined)
    
    @scala.inline
    def setMaxBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
    
    @scala.inline
    def setMaxBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "maxBounds", js.Array(value :_*))
    
    @scala.inline
    def setMaxBoundsViscosity(value: Double): Self = StObject.set(x, "maxBoundsViscosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBoundsViscosityUndefined: Self = StObject.set(x, "maxBoundsViscosity", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setOnViewportChange(value: /* viewport */ Viewport => Unit): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    @scala.inline
    def setOnViewportChanged(value: /* viewport */ Viewport => Unit): Self = StObject.set(x, "onViewportChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewportChangedUndefined: Self = StObject.set(x, "onViewportChanged", js.undefined)
    
    @scala.inline
    def setPreferCanvas(value: Boolean): Self = StObject.set(x, "preferCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferCanvasUndefined: Self = StObject.set(x, "preferCanvas", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setScrollWheelZoom(value: Zoom): Self = StObject.set(x, "scrollWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWheelZoomUndefined: Self = StObject.set(x, "scrollWheelZoom", js.undefined)
    
    @scala.inline
    def setSetView(value: Boolean): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapTolerance(value: Double): Self = StObject.set(x, "tapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapToleranceUndefined: Self = StObject.set(x, "tapTolerance", js.undefined)
    
    @scala.inline
    def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Zoom): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
    
    @scala.inline
    def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTransform3DLimit(value: Double): Self = StObject.set(x, "transform3DLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform3DLimitUndefined: Self = StObject.set(x, "transform3DLimit", js.undefined)
    
    @scala.inline
    def setUseFlyTo(value: Boolean): Self = StObject.set(x, "useFlyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFlyToUndefined: Self = StObject.set(x, "useFlyTo", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    @scala.inline
    def setWheelDebounceTime(value: Double): Self = StObject.set(x, "wheelDebounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelDebounceTimeUndefined: Self = StObject.set(x, "wheelDebounceTime", js.undefined)
    
    @scala.inline
    def setWheelPxPerZoomLevel(value: Double): Self = StObject.set(x, "wheelPxPerZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelPxPerZoomLevelUndefined: Self = StObject.set(x, "wheelPxPerZoomLevel", js.undefined)
    
    @scala.inline
    def setWhenReady(value: () => Unit): Self = StObject.set(x, "whenReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWhenReadyUndefined: Self = StObject.set(x, "whenReady", js.undefined)
    
    @scala.inline
    def setWorldCopyJump(value: Boolean): Self = StObject.set(x, "worldCopyJump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldCopyJumpUndefined: Self = StObject.set(x, "worldCopyJump", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = StObject.set(x, "zoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAnimationThreshold(value: Double): Self = StObject.set(x, "zoomAnimationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAnimationThresholdUndefined: Self = StObject.set(x, "zoomAnimationThreshold", js.undefined)
    
    @scala.inline
    def setZoomAnimationUndefined: Self = StObject.set(x, "zoomAnimation", js.undefined)
    
    @scala.inline
    def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    
    @scala.inline
    def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
    
    @scala.inline
    def setZoomSnap(value: Double): Self = StObject.set(x, "zoomSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomSnapUndefined: Self = StObject.set(x, "zoomSnap", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
