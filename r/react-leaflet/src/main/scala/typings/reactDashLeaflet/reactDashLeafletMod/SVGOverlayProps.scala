package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.CrossOrigin
import typings.leaflet.leafletMod.ImageOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashLeaflet.reactDashLeafletMod.MapComponentProps because var conflicts: pane. Inlined leaflet */ trait SVGOverlayProps extends ImageOverlayOptions {
  var children: js.UndefOr[Children] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object SVGOverlayProps {
  @scala.inline
  def apply(
    alt: String = null,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    errorOverlayUrl: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    opacity: Int | Double = null,
    pane: String = null,
    zIndex: Int | Double = null
  ): SVGOverlayProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
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
    __obj.asInstanceOf[SVGOverlayProps]
  }
}

