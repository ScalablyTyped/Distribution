package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashLeafletLib.reactDashLeafletMod.MapComponentProps because var conflicts: pane. Inlined leaflet */ trait VideoOverlayProps
  extends leafletLib.leafletMod.VideoOverlayOptions {
  var bounds: leafletLib.leafletMod.LatLngBoundsExpression
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var play: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String | js.Array[java.lang.String] | stdLib.HTMLVideoElement
}

object VideoOverlayProps {
  @scala.inline
  def apply(
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    url: java.lang.String | js.Array[java.lang.String] | stdLib.HTMLVideoElement,
    alt: java.lang.String = null,
    attribution: java.lang.String = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    bubblingMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    crossOrigin: leafletLib.leafletMod.CrossOrigin = null,
    errorOverlayUrl: java.lang.String = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    play: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): VideoOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOverlayProps]
  }
}

