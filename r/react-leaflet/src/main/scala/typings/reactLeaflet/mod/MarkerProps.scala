package typings.reactLeaflet.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.PopupEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait MarkerProps
  extends MarkerOptions
     with MarkerEvents {
  var children: js.UndefOr[Children] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var position: LatLngExpression
}

object MarkerProps {
  @scala.inline
  def apply(
    position: LatLngExpression,
    alt: String = null,
    attribution: String = null,
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanSpeed: js.UndefOr[Double] = js.undefined,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: Icon_[IconOptions] | DivIcon_ = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onadd: /* event */ LeafletEvent => Unit = null,
    onclick: /* event */ LeafletMouseEvent => Unit = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Unit = null,
    ondblclick: /* event */ LeafletMouseEvent => Unit = null,
    ondrag: /* event */ LeafletEvent => Unit = null,
    ondragend: /* event */ DragEndEvent => Unit = null,
    ondragstart: /* event */ LeafletEvent => Unit = null,
    onmousedown: /* event */ LeafletMouseEvent => Unit = null,
    onmouseout: /* event */ LeafletMouseEvent => Unit = null,
    onmouseover: /* event */ LeafletMouseEvent => Unit = null,
    onmove: /* event */ LeafletEvent => Unit = null,
    onpopupclose: /* event */ PopupEvent => Unit = null,
    onpopupopen: /* event */ PopupEvent => Unit = null,
    onremove: /* event */ LeafletEvent => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    riseOffset: js.UndefOr[Double] = js.undefined,
    riseOnHover: js.UndefOr[Boolean] = js.undefined,
    shadowPane: String = null,
    title: String = null,
    zIndexOffset: js.UndefOr[Double] = js.undefined
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.get.asInstanceOf[js.Any])
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPanSpeed)) __obj.updateDynamic("autoPanSpeed")(autoPanSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1(onadd))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1(ondrag))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1(ondragend))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1(ondragstart))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1(onmove))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1(onremove))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOffset)) __obj.updateDynamic("riseOffset")(riseOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOnHover)) __obj.updateDynamic("riseOnHover")(riseOnHover.get.asInstanceOf[js.Any])
    if (shadowPane != null) __obj.updateDynamic("shadowPane")(shadowPane.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexOffset)) __obj.updateDynamic("zIndexOffset")(zIndexOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

