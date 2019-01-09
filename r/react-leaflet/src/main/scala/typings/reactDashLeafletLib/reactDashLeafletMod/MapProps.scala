package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.LocateOptions because var conflicts: maxZoom. Inlined enableHighAccuracy, maximumAge, setView, timeout, watch- leafletLib.leafletMod.MapOptions because var conflicts: easeLinearity, maxZoom. Inlined attributionControl, bounceAtZoomLimits, boxZoom, center, closePopupOnClick, crs, doubleClickZoom, dragging, fadeAnimation, inertia, inertiaDeceleration, inertiaMaxSpeed, keyboard, keyboardPanDelta, layers, markerZoomAnimation, maxBounds, maxBoundsViscosity, minZoom, preferCanvas, renderer, scrollWheelZoom, tap, tapTolerance, touchZoom, trackResize, transform3DLimit, wheelDebounceTime, wheelPxPerZoomLevel, worldCopyJump, zoom, zoomAnimation, zoomAnimationThreshold, zoomControl, zoomDelta, zoomSnap */ trait MapProps
  extends leafletLib.leafletMod.FitBoundsOptions
     with MapEvents {
  // Control options
  var attributionControl: js.UndefOr[scala.Boolean] = js.undefined
  var bounceAtZoomLimits: js.UndefOr[scala.Boolean] = js.undefined
  var bounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var boundsOptions: js.UndefOr[leafletLib.leafletMod.FitBoundsOptions] = js.undefined
  var boxZoom: js.UndefOr[scala.Boolean] = js.undefined
  var center: js.UndefOr[leafletLib.leafletMod.LatLngExpression] = js.undefined
  var children: js.UndefOr[Children] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  // Interaction options
  var closePopupOnClick: js.UndefOr[scala.Boolean] = js.undefined
  // Map state options
  var crs: js.UndefOr[leafletLib.leafletMod.CRS] = js.undefined
  var doubleClickZoom: js.UndefOr[leafletLib.leafletMod.Zoom] = js.undefined
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  // Animation options
  var fadeAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  // Panning inertia options
  var inertia: js.UndefOr[scala.Boolean] = js.undefined
  var inertiaDeceleration: js.UndefOr[scala.Double] = js.undefined
  var inertiaMaxSpeed: js.UndefOr[scala.Double] = js.undefined
  // Keyboard navigation options
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardPanDelta: js.UndefOr[scala.Double] = js.undefined
  var layers: js.UndefOr[js.Array[leafletLib.leafletMod.Layer]] = js.undefined
  var markerZoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var maxBounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var maxBoundsViscosity: js.UndefOr[scala.Double] = js.undefined
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var preferCanvas: js.UndefOr[scala.Boolean] = js.undefined
  var renderer: js.UndefOr[leafletLib.leafletMod.Renderer] = js.undefined
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[leafletLib.leafletMod.Zoom] = js.undefined
  var setView: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  // Touch interaction options
  var tap: js.UndefOr[scala.Boolean] = js.undefined
  var tapTolerance: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var touchZoom: js.UndefOr[leafletLib.leafletMod.Zoom] = js.undefined
  var trackResize: js.UndefOr[scala.Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[scala.Double] = js.undefined
  var useFlyTo: js.UndefOr[scala.Boolean] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  var wheelDebounceTime: js.UndefOr[scala.Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var worldCopyJump: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[scala.Double] = js.undefined
  var zoomControl: js.UndefOr[scala.Boolean] = js.undefined
  var zoomDelta: js.UndefOr[scala.Double] = js.undefined
  var zoomSnap: js.UndefOr[scala.Double] = js.undefined
}

