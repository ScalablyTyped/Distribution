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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LocateOptions because var conflicts: maxZoom. Inlined enableHighAccuracy, maximumAge, setView, timeout, watch
- typings.leaflet.mod.MapOptions because var conflicts: easeLinearity, maxZoom. Inlined attributionControl, bounceAtZoomLimits, boxZoom, center, closePopupOnClick, crs, doubleClickZoom, dragging, fadeAnimation, inertia, inertiaDeceleration, inertiaMaxSpeed, keyboard, keyboardPanDelta, layers, markerZoomAnimation, maxBounds, maxBoundsViscosity, minZoom, preferCanvas, renderer, scrollWheelZoom, tap, tapTolerance, touchZoom, trackResize, transform3DLimit, wheelDebounceTime, wheelPxPerZoomLevel, worldCopyJump, zoom, zoomAnimation, zoomAnimationThreshold, zoomControl, zoomDelta, zoomSnap */ @js.native
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
  implicit class MapPropsOps[Self <: MapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributionControl(value: Boolean): Self = this.set("attributionControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributionControl: Self = this.set("attributionControl", js.undefined)
    @scala.inline
    def setBounceAtZoomLimits(value: Boolean): Self = this.set("bounceAtZoomLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceAtZoomLimits: Self = this.set("bounceAtZoomLimits", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setBoundsOptions(value: FitBoundsOptions): Self = this.set("boundsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsOptions: Self = this.set("boundsOptions", js.undefined)
    @scala.inline
    def setBoxZoom(value: Boolean): Self = this.set("boxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxZoom: Self = this.set("boxZoom", js.undefined)
    @scala.inline
    def setCenter(value: LatLngExpression): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosePopupOnClick(value: Boolean): Self = this.set("closePopupOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosePopupOnClick: Self = this.set("closePopupOnClick", js.undefined)
    @scala.inline
    def setCrs(value: CRS): Self = this.set("crs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    @scala.inline
    def setDoubleClickZoom(value: Zoom): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setFadeAnimation(value: Boolean): Self = this.set("fadeAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeAnimation: Self = this.set("fadeAnimation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInertia(value: Boolean): Self = this.set("inertia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertia: Self = this.set("inertia", js.undefined)
    @scala.inline
    def setInertiaDeceleration(value: Double): Self = this.set("inertiaDeceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertiaDeceleration: Self = this.set("inertiaDeceleration", js.undefined)
    @scala.inline
    def setInertiaMaxSpeed(value: Double): Self = this.set("inertiaMaxSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInertiaMaxSpeed: Self = this.set("inertiaMaxSpeed", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setKeyboardPanDelta(value: Double): Self = this.set("keyboardPanDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardPanDelta: Self = this.set("keyboardPanDelta", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setMarkerZoomAnimation(value: Boolean): Self = this.set("markerZoomAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerZoomAnimation: Self = this.set("markerZoomAnimation", js.undefined)
    @scala.inline
    def setMaxBoundsVarargs(value: LatLngTuple*): Self = this.set("maxBounds", js.Array(value :_*))
    @scala.inline
    def setMaxBounds(value: LatLngBoundsExpression): Self = this.set("maxBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBounds: Self = this.set("maxBounds", js.undefined)
    @scala.inline
    def setMaxBoundsViscosity(value: Double): Self = this.set("maxBoundsViscosity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBoundsViscosity: Self = this.set("maxBoundsViscosity", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setOnViewportChange(value: /* viewport */ Viewport => Unit): Self = this.set("onViewportChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewportChange: Self = this.set("onViewportChange", js.undefined)
    @scala.inline
    def setOnViewportChanged(value: /* viewport */ Viewport => Unit): Self = this.set("onViewportChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewportChanged: Self = this.set("onViewportChanged", js.undefined)
    @scala.inline
    def setPreferCanvas(value: Boolean): Self = this.set("preferCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferCanvas: Self = this.set("preferCanvas", js.undefined)
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setScrollWheelZoom(value: Zoom): Self = this.set("scrollWheelZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWheelZoom: Self = this.set("scrollWheelZoom", js.undefined)
    @scala.inline
    def setSetView(value: Boolean): Self = this.set("setView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetView: Self = this.set("setView", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    @scala.inline
    def setTapTolerance(value: Double): Self = this.set("tapTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapTolerance: Self = this.set("tapTolerance", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTouchZoom(value: Zoom): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
    @scala.inline
    def setTrackResize(value: Boolean): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTransform3DLimit(value: Double): Self = this.set("transform3DLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform3DLimit: Self = this.set("transform3DLimit", js.undefined)
    @scala.inline
    def setUseFlyTo(value: Boolean): Self = this.set("useFlyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFlyTo: Self = this.set("useFlyTo", js.undefined)
    @scala.inline
    def setViewport(value: Viewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    @scala.inline
    def setWheelDebounceTime(value: Double): Self = this.set("wheelDebounceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelDebounceTime: Self = this.set("wheelDebounceTime", js.undefined)
    @scala.inline
    def setWheelPxPerZoomLevel(value: Double): Self = this.set("wheelPxPerZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelPxPerZoomLevel: Self = this.set("wheelPxPerZoomLevel", js.undefined)
    @scala.inline
    def setWhenReady(value: () => Unit): Self = this.set("whenReady", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWhenReady: Self = this.set("whenReady", js.undefined)
    @scala.inline
    def setWorldCopyJump(value: Boolean): Self = this.set("worldCopyJump", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldCopyJump: Self = this.set("worldCopyJump", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = this.set("zoomAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomAnimation: Self = this.set("zoomAnimation", js.undefined)
    @scala.inline
    def setZoomAnimationThreshold(value: Double): Self = this.set("zoomAnimationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomAnimationThreshold: Self = this.set("zoomAnimationThreshold", js.undefined)
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
    @scala.inline
    def setZoomDelta(value: Double): Self = this.set("zoomDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomDelta: Self = this.set("zoomDelta", js.undefined)
    @scala.inline
    def setZoomSnap(value: Double): Self = this.set("zoomSnap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomSnap: Self = this.set("zoomSnap", js.undefined)
  }
  
}

