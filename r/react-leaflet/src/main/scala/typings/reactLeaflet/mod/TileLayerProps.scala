package typings.reactLeaflet.mod

import typings.leaflet.mod.CrossOrigin
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.Point_
import typings.leaflet.mod.TileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.GridLayerOptions because var conflicts: attribution, pane. Inlined bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex
- typings.leaflet.mod.TileLayerOptions because var conflicts: attribution, pane. Inlined accessToken, crossOrigin, detectRetina, errorTileUrl, id, maxNativeZoom, minNativeZoom, subdomains, tms, zoomOffset, zoomReverse */ trait TileLayerProps
  extends MapLayerProps
     with TileLayerEvents {
  var accessToken: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var errorTileUrl: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keepBuffer: js.UndefOr[Double] = js.undefined
  var maxNativeZoom: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minNativeZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var noWrap: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  var tileSize: js.UndefOr[Double | Point_] = js.undefined
  var tms: js.UndefOr[Boolean] = js.undefined
  var updateInterval: js.UndefOr[Double] = js.undefined
  var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  var updateWhenZooming: js.UndefOr[Boolean] = js.undefined
  var url: String
  var zIndex: js.UndefOr[Double] = js.undefined
  var zoomOffset: js.UndefOr[Double] = js.undefined
  var zoomReverse: js.UndefOr[Boolean] = js.undefined
}

object TileLayerProps {
  @scala.inline
  def apply(
    url: String,
    accessToken: String = null,
    attribution: String = null,
    bounds: LatLngBoundsExpression = null,
    children: Children = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorTileUrl: String = null,
    id: String = null,
    keepBuffer: js.UndefOr[Double] = js.undefined,
    leaflet: LeafletContext = null,
    maxNativeZoom: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minNativeZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    onload: /* event */ LeafletEvent => Unit = null,
    onloading: /* event */ LeafletEvent => Unit = null,
    ontileerror: /* event */ TileEvent => Unit = null,
    ontileload: /* event */ TileEvent => Unit = null,
    ontileloadstart: /* event */ TileEvent => Unit = null,
    ontileunload: /* event */ TileEvent => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    subdomains: String | js.Array[String] = null,
    tileSize: Double | Point_ = null,
    tms: js.UndefOr[Boolean] = js.undefined,
    updateInterval: js.UndefOr[Double] = js.undefined,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zoomOffset: js.UndefOr[Double] = js.undefined,
    zoomReverse: js.UndefOr[Boolean] = js.undefined
  ): TileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.get.asInstanceOf[js.Any])
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keepBuffer)) __obj.updateDynamic("keepBuffer")(keepBuffer.get.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNativeZoom)) __obj.updateDynamic("maxNativeZoom")(maxNativeZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minNativeZoom)) __obj.updateDynamic("minNativeZoom")(minNativeZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.get.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onloading != null) __obj.updateDynamic("onloading")(js.Any.fromFunction1(onloading))
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(js.Any.fromFunction1(ontileerror))
    if (ontileload != null) __obj.updateDynamic("ontileload")(js.Any.fromFunction1(ontileload))
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(js.Any.fromFunction1(ontileloadstart))
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(js.Any.fromFunction1(ontileunload))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(tms)) __obj.updateDynamic("tms")(tms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateInterval)) __obj.updateDynamic("updateInterval")(updateInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOffset)) __obj.updateDynamic("zoomOffset")(zoomOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerProps]
  }
}

