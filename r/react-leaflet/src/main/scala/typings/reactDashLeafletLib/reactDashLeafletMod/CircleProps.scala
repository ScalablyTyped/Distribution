package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashLeafletLib.reactDashLeafletMod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait CircleProps
  extends leafletLib.leafletMod.CircleMarkerOptions
     with PathEvents {
  var center: leafletLib.leafletMod.LatLngExpression
  var children: js.UndefOr[Children] = js.undefined
  @JSName("radius")
  var radius_CircleProps: scala.Double
}

object CircleProps {
  @scala.inline
  def apply(
    center: leafletLib.leafletMod.LatLngExpression,
    radius: scala.Double,
    attribution: java.lang.String = null,
    bubblingMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    children: Children = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    dashArray: java.lang.String | js.Array[scala.Double] = null,
    dashOffset: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    fillRule: leafletLib.leafletMod.FillRule = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    lineCap: leafletLib.leafletMod.LineCapShape = null,
    lineJoin: leafletLib.leafletMod.LineJoinShape = null,
    onadd: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    oncontextmenu: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    ondblclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmousedown: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseout: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseover: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onpopupclose: js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit] = null,
    onpopupopen: js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit] = null,
    onremove: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    renderer: leafletLib.leafletMod.Renderer = null,
    stroke: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): CircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (dashOffset != null) __obj.updateDynamic("dashOffset")(dashOffset)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (onadd != null) __obj.updateDynamic("onadd")(onadd)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu)
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick)
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown)
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout)
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover)
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(onpopupclose)
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(onpopupopen)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
}

