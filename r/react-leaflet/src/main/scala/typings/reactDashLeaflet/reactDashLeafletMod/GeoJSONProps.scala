package typings.reactDashLeaflet.reactDashLeafletMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeoJsonObject
import typings.geojson.geojsonMod.GeometryObject
import typings.leaflet.leafletMod.FillRule
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LayerEvent
import typings.leaflet.leafletMod.LeafletEvent
import typings.leaflet.leafletMod.LeafletMouseEvent
import typings.leaflet.leafletMod.LineCapShape
import typings.leaflet.leafletMod.LineJoinShape
import typings.leaflet.leafletMod.PathOptions
import typings.leaflet.leafletMod.PopupEvent
import typings.leaflet.leafletMod.Renderer
import typings.leaflet.leafletMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.leaflet.leafletMod.LayerOptions because Already inherited
- typings.leaflet.leafletMod.GeoJSONOptions because var conflicts: attribution, pane. Inlined coordsToLatLng, filter, onEachFeature, pointToLayer, style
- typings.reactDashLeaflet.reactDashLeafletMod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onmouseout, onmouseover. Inlined onlayeradd, onlayerremove */ trait GeoJSONProps extends PathProps {
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      typings.leaflet.leafletMod.LatLng
    ]
  ] = js.undefined
  var data: GeoJsonObject
  /**
    * A Function that will be used to decide whether to show a feature or not.
    *
    * The default is to show all features:
    *
    * ```
    * function (geoJsonFeature) {
    *     return true;
    * }
    * ```
    */
  var filter: js.UndefOr[js.Function1[/* geoJsonFeature */ Feature[GeometryObject, js.Any], Boolean]] = js.undefined
  /**
    * A Function that will be called once for each created Feature, after it
    * has been created and styled. Useful for attaching events and popups to features.
    *
    * The default is to do nothing with the newly created layers:
    *
    * ```
    * function (feature, layer) {}
    * ```
    */
  var onEachFeature: js.UndefOr[
    js.Function2[/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer, Unit]
  ] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  /**
    * A Function defining how GeoJSON points spawn Leaflet layers.
    * It is internally called when data is added, passing the GeoJSON point
    * feature and its LatLng.
    *
    * The default is to spawn a default Marker:
    *
    * ```
    * function(geoJsonPoint, latlng) {
    *     return L.marker(latlng);
    * }
    * ```
    */
  var pointToLayer: js.UndefOr[
    js.Function2[
      /* geoJsonPoint */ Feature[typings.geojson.geojsonMod.Point, js.Any], 
      /* latlng */ typings.leaflet.leafletMod.LatLng, 
      Layer
    ]
  ] = js.undefined
   // should import GeoJSON typings
  /**
    * PathOptions or a Function defining the Path options for styling GeoJSON lines and polygons,
    * called internally when data is added.
    *
    * The default value is to not override any defaults:
    *
    * ```
    * function (geoJsonFeature) {
    *     return {}
    * }
    * ```
    */
  var style: js.UndefOr[PathOptions | StyleFunction[js.Any]] = js.undefined
}

object GeoJSONProps {
  @scala.inline
  def apply(
    data: GeoJsonObject,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    className: String = null,
    color: String = null,
    coordsToLatLng: /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) => typings.leaflet.leafletMod.LatLng = null,
    dashArray: String | js.Array[Double] = null,
    dashOffset: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    fillRule: FillRule = null,
    filter: /* geoJsonFeature */ Feature[GeometryObject, js.Any] => Boolean = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    lineCap: LineCapShape = null,
    lineJoin: LineJoinShape = null,
    onEachFeature: (/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer) => Unit = null,
    onadd: /* event */ LeafletEvent => Unit = null,
    onclick: /* event */ LeafletMouseEvent => Unit = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Unit = null,
    ondblclick: /* event */ LeafletMouseEvent => Unit = null,
    onlayeradd: /* event */ LayerEvent => Unit = null,
    onlayerremove: /* event */ LayerEvent => Unit = null,
    onmousedown: /* event */ LeafletMouseEvent => Unit = null,
    onmouseout: /* event */ LeafletMouseEvent => Unit = null,
    onmouseover: /* event */ LeafletMouseEvent => Unit = null,
    onpopupclose: /* event */ PopupEvent => Unit = null,
    onpopupopen: /* event */ PopupEvent => Unit = null,
    onremove: /* event */ LeafletEvent => Unit = null,
    opacity: Int | Double = null,
    pane: String = null,
    pointToLayer: (/* geoJsonPoint */ Feature[typings.geojson.geojsonMod.Point, js.Any], /* latlng */ typings.leaflet.leafletMod.LatLng) => Layer = null,
    renderer: Renderer = null,
    stroke: js.UndefOr[Boolean] = js.undefined,
    style: PathOptions | StyleFunction[js.Any] = null,
    weight: Int | Double = null
  ): GeoJSONProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (coordsToLatLng != null) __obj.updateDynamic("coordsToLatLng")(js.Any.fromFunction1(coordsToLatLng))
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (dashOffset != null) __obj.updateDynamic("dashOffset")(dashOffset)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (onEachFeature != null) __obj.updateDynamic("onEachFeature")(js.Any.fromFunction2(onEachFeature))
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1(onadd))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1(onlayeradd))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1(onlayerremove))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1(onremove))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (pointToLayer != null) __obj.updateDynamic("pointToLayer")(js.Any.fromFunction2(pointToLayer))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONProps]
  }
}

