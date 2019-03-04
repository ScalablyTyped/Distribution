package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashLeafletLib.reactDashLeafletMod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait MarkerProps
  extends leafletLib.leafletMod.MarkerOptions
     with MarkerEvents {
  var children: js.UndefOr[Children] = js.undefined
  var position: leafletLib.leafletMod.LatLngExpression
}

object MarkerProps {
  @scala.inline
  def apply(
    position: leafletLib.leafletMod.LatLngExpression,
    alt: java.lang.String = null,
    attribution: java.lang.String = null,
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanPadding: leafletLib.leafletMod.PointExpression = null,
    autoPanSpeed: scala.Int | scala.Double = null,
    bubblingMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    children: Children = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onadd: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    oncontextmenu: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    ondblclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    ondrag: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    ondragend: js.Function1[/* event */ leafletLib.leafletMod.DragEndEvent, scala.Unit] = null,
    ondragstart: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onmousedown: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseout: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseover: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmove: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onpopupclose: js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit] = null,
    onpopupopen: js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit] = null,
    onremove: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    riseOffset: scala.Int | scala.Double = null,
    riseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    zIndexOffset: scala.Int | scala.Double = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanSpeed != null) __obj.updateDynamic("autoPanSpeed")(autoPanSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (onadd != null) __obj.updateDynamic("onadd")(onadd)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu)
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick)
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag)
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend)
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart)
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown)
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout)
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover)
    if (onmove != null) __obj.updateDynamic("onmove")(onmove)
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(onpopupclose)
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(onpopupopen)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (riseOffset != null) __obj.updateDynamic("riseOffset")(riseOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOnHover)) __obj.updateDynamic("riseOnHover")(riseOnHover)
    if (title != null) __obj.updateDynamic("title")(title)
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

