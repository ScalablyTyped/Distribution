package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashLeafletLib.reactDashLeafletMod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait ImageOverlayProps
  extends leafletLib.leafletMod.ImageOverlayOptions {
  var bounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression] = js.undefined
  var children: js.UndefOr[Children] = js.undefined
  var url: java.lang.String | reactLib.HTMLImageElement
}

object ImageOverlayProps {
  @scala.inline
  def apply(
    url: java.lang.String | reactLib.HTMLImageElement,
    alt: java.lang.String = null,
    attribution: java.lang.String = null,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    bubblingMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    children: Children = null,
    className: java.lang.String = null,
    crossOrigin: leafletLib.leafletMod.CrossOrigin = null,
    errorOverlayUrl: java.lang.String = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): ImageOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOverlayProps]
  }
}

