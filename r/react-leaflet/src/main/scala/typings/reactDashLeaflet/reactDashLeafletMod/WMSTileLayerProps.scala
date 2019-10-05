package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.CRS
import typings.leaflet.leafletMod.CrossOrigin
import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LeafletEvent
import typings.leaflet.leafletMod.TileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.leaflet.leafletMod.GridLayerOptions because Already inherited
- typings.leaflet.leafletMod.TileLayerOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined accessToken, crossOrigin, detectRetina, errorTileUrl, id, maxNativeZoom, minNativeZoom, subdomains, tms, zoomOffset, zoomReverse
- typings.leaflet.leafletMod.WMSOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined crs, format, layers, styles, transparent, uppercase, version */ trait WMSTileLayerProps
  extends GridLayerProps
     with TileLayerEvents {
  var accessToken: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  var crs: js.UndefOr[CRS] = js.undefined
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var errorTileUrl: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[String] = js.undefined
  var maxNativeZoom: js.UndefOr[Double] = js.undefined
  var minNativeZoom: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tms: js.UndefOr[Boolean] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var uppercase: js.UndefOr[Boolean] = js.undefined
  var url: String
  var version: js.UndefOr[String] = js.undefined
  var zoomOffset: js.UndefOr[Double] = js.undefined
  var zoomReverse: js.UndefOr[Boolean] = js.undefined
}

object WMSTileLayerProps {
  @scala.inline
  def apply(
    url: String,
    accessToken: String = null,
    attribution: String = null,
    bounds: LatLngBoundsExpression = null,
    children: Children = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    crs: CRS = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorTileUrl: String = null,
    format: String = null,
    id: String = null,
    keepBuffer: Int | Double = null,
    layers: String = null,
    leaflet: LeafletContext = null,
    maxNativeZoom: Int | Double = null,
    maxZoom: Int | Double = null,
    minNativeZoom: Int | Double = null,
    minZoom: Int | Double = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    onload: /* event */ LeafletEvent => Unit = null,
    onloading: /* event */ LeafletEvent => Unit = null,
    ontileerror: /* event */ TileEvent => Unit = null,
    ontileload: /* event */ TileEvent => Unit = null,
    ontileloadstart: /* event */ TileEvent => Unit = null,
    ontileunload: /* event */ TileEvent => Unit = null,
    opacity: Int | Double = null,
    pane: String = null,
    styles: String = null,
    subdomains: String | js.Array[String] = null,
    tileSize: Double | typings.leaflet.leafletMod.Point = null,
    tms: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    updateInterval: Int | Double = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
    uppercase: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    zIndex: Int | Double = null,
    zoomOffset: Int | Double = null,
    zoomReverse: js.UndefOr[Boolean] = js.undefined
  ): WMSTileLayerProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (maxNativeZoom != null) __obj.updateDynamic("maxNativeZoom")(maxNativeZoom.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minNativeZoom != null) __obj.updateDynamic("minNativeZoom")(minNativeZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onloading != null) __obj.updateDynamic("onloading")(js.Any.fromFunction1(onloading))
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(js.Any.fromFunction1(ontileerror))
    if (ontileload != null) __obj.updateDynamic("ontileload")(js.Any.fromFunction1(ontileload))
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(js.Any.fromFunction1(ontileloadstart))
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(js.Any.fromFunction1(ontileunload))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(tms)) __obj.updateDynamic("tms")(tms)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle)
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming)
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase)
    if (version != null) __obj.updateDynamic("version")(version)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomOffset != null) __obj.updateDynamic("zoomOffset")(zoomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse)
    __obj.asInstanceOf[WMSTileLayerProps]
  }
}

