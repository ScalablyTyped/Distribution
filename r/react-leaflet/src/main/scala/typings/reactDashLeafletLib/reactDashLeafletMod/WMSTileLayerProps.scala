package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.WMSOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined crs, format, layers, styles, transparent, uppercase, version */ trait WMSTileLayerProps
  extends GridLayerProps
     with TileLayerEvents {
  var crs: js.UndefOr[leafletLib.leafletMod.CRS] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[java.lang.String] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var uppercase: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WMSTileLayerProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    attribution: java.lang.String = null,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    children: Children = null,
    className: java.lang.String = null,
    crossOrigin: leafletLib.leafletMod.CrossOrigin = null,
    crs: leafletLib.leafletMod.CRS = null,
    detectRetina: js.UndefOr[scala.Boolean] = js.undefined,
    errorTileUrl: java.lang.String = null,
    format: java.lang.String = null,
    keepBuffer: scala.Int | scala.Double = null,
    layers: java.lang.String = null,
    leaflet: LeafletContext = null,
    maxNativeZoom: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minNativeZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noWrap: js.UndefOr[scala.Boolean] = js.undefined,
    onload: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onloading: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    ontileerror: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    ontileload: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    ontileloadstart: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    ontileunload: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    styles: java.lang.String = null,
    subdomains: java.lang.String | js.Array[java.lang.String] = null,
    tileSize: scala.Double | leafletLib.leafletMod.Point = null,
    tms: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    updateInterval: scala.Int | scala.Double = null,
    updateWhenIdle: js.UndefOr[scala.Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[scala.Boolean] = js.undefined,
    uppercase: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null,
    zoomOffset: scala.Int | scala.Double = null,
    zoomReverse: js.UndefOr[scala.Boolean] = js.undefined
  ): WMSTileLayerProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl)
    if (format != null) __obj.updateDynamic("format")(format)
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (maxNativeZoom != null) __obj.updateDynamic("maxNativeZoom")(maxNativeZoom.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minNativeZoom != null) __obj.updateDynamic("minNativeZoom")(minNativeZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (onloading != null) __obj.updateDynamic("onloading")(onloading)
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(ontileerror)
    if (ontileload != null) __obj.updateDynamic("ontileload")(ontileload)
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(ontileloadstart)
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(ontileunload)
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

