package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.GridLayerOptions because var conflicts: attribution, pane. Inlined bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex */ trait GridLayerProps extends MapLayerProps {
  var bounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var keepBuffer: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var noWrap: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double | leafletLib.leafletMod.Point] = js.undefined
  var updateInterval: js.UndefOr[scala.Double] = js.undefined
  var updateWhenIdle: js.UndefOr[scala.Boolean] = js.undefined
  var updateWhenZooming: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object GridLayerProps {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    children: Children = null,
    className: java.lang.String = null,
    keepBuffer: scala.Int | scala.Double = null,
    leaflet: LeafletContext = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noWrap: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    tileSize: scala.Double | leafletLib.leafletMod.Point = null,
    updateInterval: scala.Int | scala.Double = null,
    updateWhenIdle: js.UndefOr[scala.Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): GridLayerProps = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle)
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayerProps]
  }
}

