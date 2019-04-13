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
  var children: Children
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
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, scala.Unit]] = js.undefined
  var onViewportChanged: js.UndefOr[js.Function1[/* viewport */ Viewport, scala.Unit]] = js.undefined
  var preferCanvas: js.UndefOr[scala.Boolean] = js.undefined
  var renderer: js.UndefOr[leafletLib.leafletMod.Renderer] = js.undefined
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[leafletLib.leafletMod.Zoom] = js.undefined
  var setView: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  // Touch interaction options
  var tap: js.UndefOr[scala.Boolean] = js.undefined
  var tapTolerance: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var touchZoom: js.UndefOr[leafletLib.leafletMod.Zoom] = js.undefined
  var trackResize: js.UndefOr[scala.Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[scala.Double] = js.undefined
  var useFlyTo: js.UndefOr[scala.Boolean] = js.undefined
  var viewport: js.UndefOr[Viewport] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  var wheelDebounceTime: js.UndefOr[scala.Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var whenReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var worldCopyJump: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[scala.Double] = js.undefined
  var zoomControl: js.UndefOr[scala.Boolean] = js.undefined
  var zoomDelta: js.UndefOr[scala.Double] = js.undefined
  var zoomSnap: js.UndefOr[scala.Double] = js.undefined
}

object MapProps {
  @scala.inline
  def apply(
    children: Children,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    attributionControl: js.UndefOr[scala.Boolean] = js.undefined,
    bounceAtZoomLimits: js.UndefOr[scala.Boolean] = js.undefined,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    boundsOptions: leafletLib.leafletMod.FitBoundsOptions = null,
    boxZoom: js.UndefOr[scala.Boolean] = js.undefined,
    center: leafletLib.leafletMod.LatLngExpression = null,
    className: java.lang.String = null,
    closePopupOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    crs: leafletLib.leafletMod.CRS = null,
    doubleClickZoom: leafletLib.leafletMod.Zoom = null,
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easeLinearity: scala.Int | scala.Double = null,
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    fadeAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inertia: js.UndefOr[scala.Boolean] = js.undefined,
    inertiaDeceleration: scala.Int | scala.Double = null,
    inertiaMaxSpeed: scala.Int | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardPanDelta: scala.Int | scala.Double = null,
    layers: js.Array[leafletLib.leafletMod.Layer] = null,
    markerZoomAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    maxBounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    maxBoundsViscosity: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    maximumAge: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noMoveStart: js.UndefOr[scala.Boolean] = js.undefined,
    onViewportChange: /* viewport */ Viewport => scala.Unit = null,
    onViewportChanged: /* viewport */ Viewport => scala.Unit = null,
    onautopanstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onbaselayerchange: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onblur: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    oncontextmenu: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondblclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondrag: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    ondragend: /* event */ leafletLib.leafletMod.DragEndEvent => scala.Unit = null,
    ondragstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onfocus: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onlayeradd: /* event */ leafletLib.leafletMod.LayerEvent => scala.Unit = null,
    onlayerremove: /* event */ leafletLib.leafletMod.LayerEvent => scala.Unit = null,
    onload: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onlocationerror: /* event */ leafletLib.leafletMod.ErrorEvent => scala.Unit = null,
    onlocationfound: /* event */ leafletLib.leafletMod.LocationEvent => scala.Unit = null,
    onmousedown: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmousemove: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseout: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseover: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseup: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmove: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onmoveend: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onmovestart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onoverlayadd: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onoverlayremove: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onpopupclose: /* event */ leafletLib.leafletMod.PopupEvent => scala.Unit = null,
    onpopupopen: /* event */ leafletLib.leafletMod.PopupEvent => scala.Unit = null,
    onpreclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onresize: /* event */ leafletLib.leafletMod.ResizeEvent => scala.Unit = null,
    onunload: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onviewreset: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onzoomend: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onzoomlevelschange: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onzoomstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    padding: leafletLib.leafletMod.PointExpression = null,
    paddingBottomRight: leafletLib.leafletMod.PointExpression = null,
    paddingTopLeft: leafletLib.leafletMod.PointExpression = null,
    preferCanvas: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: leafletLib.leafletMod.Renderer = null,
    scrollWheelZoom: leafletLib.leafletMod.Zoom = null,
    setView: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    tap: js.UndefOr[scala.Boolean] = js.undefined,
    tapTolerance: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    touchZoom: leafletLib.leafletMod.Zoom = null,
    trackResize: js.UndefOr[scala.Boolean] = js.undefined,
    transform3DLimit: scala.Int | scala.Double = null,
    useFlyTo: js.UndefOr[scala.Boolean] = js.undefined,
    viewport: Viewport = null,
    watch: js.UndefOr[scala.Boolean] = js.undefined,
    wheelDebounceTime: scala.Int | scala.Double = null,
    wheelPxPerZoomLevel: scala.Int | scala.Double = null,
    whenReady: () => scala.Unit = null,
    worldCopyJump: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    zoomAnimationThreshold: scala.Int | scala.Double = null,
    zoomControl: js.UndefOr[scala.Boolean] = js.undefined,
    zoomDelta: scala.Int | scala.Double = null,
    zoomSnap: scala.Int | scala.Double = null
  ): MapProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (!js.isUndefined(bounceAtZoomLimits)) __obj.updateDynamic("bounceAtZoomLimits")(bounceAtZoomLimits)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (boundsOptions != null) __obj.updateDynamic("boundsOptions")(boundsOptions)
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closePopupOnClick)) __obj.updateDynamic("closePopupOnClick")(closePopupOnClick)
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (doubleClickZoom != null) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (!js.isUndefined(fadeAnimation)) __obj.updateDynamic("fadeAnimation")(fadeAnimation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia)
    if (inertiaDeceleration != null) __obj.updateDynamic("inertiaDeceleration")(inertiaDeceleration.asInstanceOf[js.Any])
    if (inertiaMaxSpeed != null) __obj.updateDynamic("inertiaMaxSpeed")(inertiaMaxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (keyboardPanDelta != null) __obj.updateDynamic("keyboardPanDelta")(keyboardPanDelta.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (!js.isUndefined(markerZoomAnimation)) __obj.updateDynamic("markerZoomAnimation")(markerZoomAnimation)
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (maxBoundsViscosity != null) __obj.updateDynamic("maxBoundsViscosity")(maxBoundsViscosity.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart)
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
    if (!js.isUndefined(preferCanvas)) __obj.updateDynamic("preferCanvas")(preferCanvas)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (scrollWheelZoom != null) __obj.updateDynamic("scrollWheelZoom")(scrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(setView)) __obj.updateDynamic("setView")(setView)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap)
    if (tapTolerance != null) __obj.updateDynamic("tapTolerance")(tapTolerance.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (touchZoom != null) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize)
    if (transform3DLimit != null) __obj.updateDynamic("transform3DLimit")(transform3DLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlyTo)) __obj.updateDynamic("useFlyTo")(useFlyTo)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    if (wheelDebounceTime != null) __obj.updateDynamic("wheelDebounceTime")(wheelDebounceTime.asInstanceOf[js.Any])
    if (wheelPxPerZoomLevel != null) __obj.updateDynamic("wheelPxPerZoomLevel")(wheelPxPerZoomLevel.asInstanceOf[js.Any])
    if (whenReady != null) __obj.updateDynamic("whenReady")(js.Any.fromFunction0(whenReady))
    if (!js.isUndefined(worldCopyJump)) __obj.updateDynamic("worldCopyJump")(worldCopyJump)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    if (zoomAnimationThreshold != null) __obj.updateDynamic("zoomAnimationThreshold")(zoomAnimationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    if (zoomSnap != null) __obj.updateDynamic("zoomSnap")(zoomSnap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProps]
  }
}

