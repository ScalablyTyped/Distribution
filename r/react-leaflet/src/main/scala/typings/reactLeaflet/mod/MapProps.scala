package typings.reactLeaflet.mod

import typings.leaflet.mod.CRS
import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.ErrorEvent
import typings.leaflet.mod.FitBoundsOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LayersControlEvent
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.LocationEvent
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.PopupEvent
import typings.leaflet.mod.Renderer
import typings.leaflet.mod.ResizeEvent
import typings.leaflet.mod.Zoom
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LocateOptions because var conflicts: maxZoom. Inlined enableHighAccuracy, maximumAge, setView, timeout, watch
- typings.leaflet.mod.MapOptions because var conflicts: easeLinearity, maxZoom. Inlined attributionControl, bounceAtZoomLimits, boxZoom, center, closePopupOnClick, crs, doubleClickZoom, dragging, fadeAnimation, inertia, inertiaDeceleration, inertiaMaxSpeed, keyboard, keyboardPanDelta, layers, markerZoomAnimation, maxBounds, maxBoundsViscosity, minZoom, preferCanvas, renderer, scrollWheelZoom, tap, tapTolerance, touchZoom, trackResize, transform3DLimit, wheelDebounceTime, wheelPxPerZoomLevel, worldCopyJump, zoom, zoomAnimation, zoomAnimationThreshold, zoomControl, zoomDelta, zoomSnap */ trait MapProps
  extends FitBoundsOptions
     with MapEvents {
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var boundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  var boxZoom: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[LatLngExpression] = js.undefined
  var children: Children
  var className: js.UndefOr[String] = js.undefined
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.undefined
  // Map state options
  var crs: js.UndefOr[CRS] = js.undefined
  var doubleClickZoom: js.UndefOr[Zoom] = js.undefined
  var dragging: js.UndefOr[Boolean] = js.undefined
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.undefined
  var inertiaDeceleration: js.UndefOr[Double] = js.undefined
  var inertiaMaxSpeed: js.UndefOr[Double] = js.undefined
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var keyboardPanDelta: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var markerZoomAnimation: js.UndefOr[Boolean] = js.undefined
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var maxBoundsViscosity: js.UndefOr[Double] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.undefined
  var onViewportChanged: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.undefined
  var preferCanvas: js.UndefOr[Boolean] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.undefined
  var setView: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.undefined
  var tapTolerance: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var touchZoom: js.UndefOr[Zoom] = js.undefined
  var trackResize: js.UndefOr[Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[Double] = js.undefined
  var useFlyTo: js.UndefOr[Boolean] = js.undefined
  var viewport: js.UndefOr[Viewport] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var wheelDebounceTime: js.UndefOr[Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.undefined
  var whenReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  var worldCopyJump: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[Double] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var zoomDelta: js.UndefOr[Double] = js.undefined
  var zoomSnap: js.UndefOr[Double] = js.undefined
}

object MapProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined,
    bounds: LatLngBoundsExpression = null,
    boundsOptions: FitBoundsOptions = null,
    boxZoom: js.UndefOr[Boolean] = js.undefined,
    center: LatLngExpression = null,
    children: Children = null,
    className: String = null,
    closePopupOnClick: js.UndefOr[Boolean] = js.undefined,
    crs: CRS = null,
    doubleClickZoom: Zoom = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easeLinearity: js.UndefOr[Double] = js.undefined,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    fadeAnimation: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inertia: js.UndefOr[Boolean] = js.undefined,
    inertiaDeceleration: js.UndefOr[Double] = js.undefined,
    inertiaMaxSpeed: js.UndefOr[Double] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    keyboardPanDelta: js.UndefOr[Double] = js.undefined,
    layers: js.Array[Layer] = null,
    markerZoomAnimation: js.UndefOr[Boolean] = js.undefined,
    maxBounds: LatLngBoundsExpression = null,
    maxBoundsViscosity: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    maximumAge: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    noMoveStart: js.UndefOr[Boolean] = js.undefined,
    onViewportChange: /* viewport */ Viewport => Unit = null,
    onViewportChanged: /* viewport */ Viewport => Unit = null,
    onautopanstart: /* event */ LeafletEvent => Unit = null,
    onbaselayerchange: /* event */ LayersControlEvent => Unit = null,
    onblur: /* event */ LeafletEvent => Unit = null,
    onclick: /* event */ LeafletMouseEvent => Unit = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Unit = null,
    ondblclick: /* event */ LeafletMouseEvent => Unit = null,
    ondrag: /* event */ LeafletEvent => Unit = null,
    ondragend: /* event */ DragEndEvent => Unit = null,
    ondragstart: /* event */ LeafletEvent => Unit = null,
    onfocus: /* event */ LeafletEvent => Unit = null,
    onlayeradd: /* event */ LayerEvent => Unit = null,
    onlayerremove: /* event */ LayerEvent => Unit = null,
    onload: /* event */ LeafletEvent => Unit = null,
    onlocationerror: /* event */ ErrorEvent => Unit = null,
    onlocationfound: /* event */ LocationEvent => Unit = null,
    onmousedown: /* event */ LeafletMouseEvent => Unit = null,
    onmousemove: /* event */ LeafletMouseEvent => Unit = null,
    onmouseout: /* event */ LeafletMouseEvent => Unit = null,
    onmouseover: /* event */ LeafletMouseEvent => Unit = null,
    onmouseup: /* event */ LeafletMouseEvent => Unit = null,
    onmove: /* event */ LeafletEvent => Unit = null,
    onmoveend: /* event */ LeafletEvent => Unit = null,
    onmovestart: /* event */ LeafletEvent => Unit = null,
    onoverlayadd: /* event */ LayersControlEvent => Unit = null,
    onoverlayremove: /* event */ LayersControlEvent => Unit = null,
    onpopupclose: /* event */ PopupEvent => Unit = null,
    onpopupopen: /* event */ PopupEvent => Unit = null,
    onpreclick: /* event */ LeafletMouseEvent => Unit = null,
    onresize: /* event */ ResizeEvent => Unit = null,
    onunload: /* event */ LeafletEvent => Unit = null,
    onviewreset: /* event */ LeafletEvent => Unit = null,
    onzoomend: /* event */ LeafletEvent => Unit = null,
    onzoomlevelschange: /* event */ LeafletEvent => Unit = null,
    onzoomstart: /* event */ LeafletEvent => Unit = null,
    padding: PointExpression = null,
    paddingBottomRight: PointExpression = null,
    paddingTopLeft: PointExpression = null,
    preferCanvas: js.UndefOr[Boolean] = js.undefined,
    renderer: Renderer = null,
    scrollWheelZoom: Zoom = null,
    setView: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tap: js.UndefOr[Boolean] = js.undefined,
    tapTolerance: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    touchZoom: Zoom = null,
    trackResize: js.UndefOr[Boolean] = js.undefined,
    transform3DLimit: js.UndefOr[Double] = js.undefined,
    useFlyTo: js.UndefOr[Boolean] = js.undefined,
    viewport: Viewport = null,
    watch: js.UndefOr[Boolean] = js.undefined,
    wheelDebounceTime: js.UndefOr[Double] = js.undefined,
    wheelPxPerZoomLevel: js.UndefOr[Double] = js.undefined,
    whenReady: () => Unit = null,
    worldCopyJump: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined,
    zoomAnimationThreshold: js.UndefOr[Double] = js.undefined,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomDelta: js.UndefOr[Double] = js.undefined,
    zoomSnap: js.UndefOr[Double] = js.undefined
  ): MapProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceAtZoomLimits)) __obj.updateDynamic("bounceAtZoomLimits")(bounceAtZoomLimits.get.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (boundsOptions != null) __obj.updateDynamic("boundsOptions")(boundsOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closePopupOnClick)) __obj.updateDynamic("closePopupOnClick")(closePopupOnClick.get.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (doubleClickZoom != null) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easeLinearity)) __obj.updateDynamic("easeLinearity")(easeLinearity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeAnimation)) __obj.updateDynamic("fadeAnimation")(fadeAnimation.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertiaDeceleration)) __obj.updateDynamic("inertiaDeceleration")(inertiaDeceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertiaMaxSpeed)) __obj.updateDynamic("inertiaMaxSpeed")(inertiaMaxSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardPanDelta)) __obj.updateDynamic("keyboardPanDelta")(keyboardPanDelta.get.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(markerZoomAnimation)) __obj.updateDynamic("markerZoomAnimation")(markerZoomAnimation.get.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBoundsViscosity)) __obj.updateDynamic("maxBoundsViscosity")(maxBoundsViscosity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAge)) __obj.updateDynamic("maximumAge")(maximumAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart.get.asInstanceOf[js.Any])
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1(onViewportChange))
    if (onViewportChanged != null) __obj.updateDynamic("onViewportChanged")(js.Any.fromFunction1(onViewportChanged))
    if (onautopanstart != null) __obj.updateDynamic("onautopanstart")(js.Any.fromFunction1(onautopanstart))
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1(onbaselayerchange))
    if (onblur != null) __obj.updateDynamic("onblur")(js.Any.fromFunction1(onblur))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1(ondrag))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1(ondragend))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1(ondragstart))
    if (onfocus != null) __obj.updateDynamic("onfocus")(js.Any.fromFunction1(onfocus))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1(onlayeradd))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1(onlayerremove))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onlocationerror != null) __obj.updateDynamic("onlocationerror")(js.Any.fromFunction1(onlocationerror))
    if (onlocationfound != null) __obj.updateDynamic("onlocationfound")(js.Any.fromFunction1(onlocationfound))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1(onmousemove))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(js.Any.fromFunction1(onmouseup))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1(onmove))
    if (onmoveend != null) __obj.updateDynamic("onmoveend")(js.Any.fromFunction1(onmoveend))
    if (onmovestart != null) __obj.updateDynamic("onmovestart")(js.Any.fromFunction1(onmovestart))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1(onoverlayadd))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1(onoverlayremove))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onpreclick != null) __obj.updateDynamic("onpreclick")(js.Any.fromFunction1(onpreclick))
    if (onresize != null) __obj.updateDynamic("onresize")(js.Any.fromFunction1(onresize))
    if (onunload != null) __obj.updateDynamic("onunload")(js.Any.fromFunction1(onunload))
    if (onviewreset != null) __obj.updateDynamic("onviewreset")(js.Any.fromFunction1(onviewreset))
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(js.Any.fromFunction1(onzoomend))
    if (onzoomlevelschange != null) __obj.updateDynamic("onzoomlevelschange")(js.Any.fromFunction1(onzoomlevelschange))
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(js.Any.fromFunction1(onzoomstart))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottomRight != null) __obj.updateDynamic("paddingBottomRight")(paddingBottomRight.asInstanceOf[js.Any])
    if (paddingTopLeft != null) __obj.updateDynamic("paddingTopLeft")(paddingTopLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(preferCanvas)) __obj.updateDynamic("preferCanvas")(preferCanvas.get.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (scrollWheelZoom != null) __obj.updateDynamic("scrollWheelZoom")(scrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(setView)) __obj.updateDynamic("setView")(setView.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tapTolerance)) __obj.updateDynamic("tapTolerance")(tapTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (touchZoom != null) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transform3DLimit)) __obj.updateDynamic("transform3DLimit")(transform3DLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlyTo)) __obj.updateDynamic("useFlyTo")(useFlyTo.get.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelDebounceTime)) __obj.updateDynamic("wheelDebounceTime")(wheelDebounceTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelPxPerZoomLevel)) __obj.updateDynamic("wheelPxPerZoomLevel")(wheelPxPerZoomLevel.get.asInstanceOf[js.Any])
    if (whenReady != null) __obj.updateDynamic("whenReady")(js.Any.fromFunction0(whenReady))
    if (!js.isUndefined(worldCopyJump)) __obj.updateDynamic("worldCopyJump")(worldCopyJump.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimationThreshold)) __obj.updateDynamic("zoomAnimationThreshold")(zoomAnimationThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomDelta)) __obj.updateDynamic("zoomDelta")(zoomDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomSnap)) __obj.updateDynamic("zoomSnap")(zoomSnap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProps]
  }
}

