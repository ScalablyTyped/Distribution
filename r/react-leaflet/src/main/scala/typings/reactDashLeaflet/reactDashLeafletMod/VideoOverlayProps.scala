package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.CrossOrigin
import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.VideoOverlayOptions
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashLeaflet.reactDashLeafletMod.MapComponentProps because var conflicts: pane. Inlined leaflet */ trait VideoOverlayProps extends VideoOverlayOptions {
  var bounds: LatLngBoundsExpression
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var play: js.UndefOr[Boolean] = js.undefined
  var url: String | js.Array[String] | HTMLVideoElement
}

object VideoOverlayProps {
  @scala.inline
  def apply(
    bounds: LatLngBoundsExpression,
    url: String | js.Array[String] | HTMLVideoElement,
    alt: String = null,
    attribution: String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    errorOverlayUrl: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    keepAspectRatio: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    pane: String = null,
    play: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
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
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOverlayProps]
  }
}

