package typings.reactLeaflet.mod

import typings.leaflet.mod.FillRule
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.LineCapShape
import typings.leaflet.mod.LineJoinShape
import typings.leaflet.mod.PolylineOptions
import typings.leaflet.mod.PopupEvent
import typings.leaflet.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait PolylineProps
  extends PolylineOptions
     with PathEvents {
  var children: js.UndefOr[Children] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var positions: js.Array[js.Array[LatLngExpression] | LatLngExpression]
}

object PolylineProps {
  @scala.inline
  def apply(
    positions: js.Array[js.Array[LatLngExpression] | LatLngExpression],
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    className: String = null,
    color: String = null,
    dashArray: String | js.Array[Double] = null,
    dashOffset: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    fillRule: FillRule = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    lineCap: LineCapShape = null,
    lineJoin: LineJoinShape = null,
    noClip: js.UndefOr[Boolean] = js.undefined,
    onadd: /* event */ LeafletEvent => Unit = null,
    onclick: /* event */ LeafletMouseEvent => Unit = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Unit = null,
    ondblclick: /* event */ LeafletMouseEvent => Unit = null,
    onmousedown: /* event */ LeafletMouseEvent => Unit = null,
    onmouseout: /* event */ LeafletMouseEvent => Unit = null,
    onmouseover: /* event */ LeafletMouseEvent => Unit = null,
    onpopupclose: /* event */ PopupEvent => Unit = null,
    onpopupopen: /* event */ PopupEvent => Unit = null,
    onremove: /* event */ LeafletEvent => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    renderer: Renderer = null,
    smoothFactor: js.UndefOr[Double] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): PolylineProps = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (dashOffset != null) __obj.updateDynamic("dashOffset")(dashOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(noClip)) __obj.updateDynamic("noClip")(noClip.get.asInstanceOf[js.Any])
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1(onadd))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1(onremove))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothFactor)) __obj.updateDynamic("smoothFactor")(smoothFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineProps]
  }
}

