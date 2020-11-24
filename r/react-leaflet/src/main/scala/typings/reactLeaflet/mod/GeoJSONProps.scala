package typings.reactLeaflet.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.PathOptions
import typings.leaflet.mod.StyleFunction
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LayerOptions because Already inherited
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.leaflet.mod.GeoJSONOptions because var conflicts: attribution, pane. Inlined coordsToLatLng, filter, onEachFeature, pointToLayer, style
- typings.reactLeaflet.mod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onmouseout, onmouseover. Inlined onlayeradd, onlayerremove
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait GeoJSONProps
  extends PathOptions
     with PathEvents {
  
  var children: js.UndefOr[Children] = js.native
  
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ] = js.native
  
  var data: GeoJsonObject | js.Array[GeoJsonObject] = js.native
  
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
  var filter: js.UndefOr[js.Function1[/* geoJsonFeature */ Feature[GeometryObject, js.Any], Boolean]] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
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
  ] = js.native
  
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  
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
      /* geoJsonPoint */ Feature[typings.geojson.mod.Point, js.Any], 
      /* latlng */ LatLng_, 
      Layer
    ]
  ] = js.native
  
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
  var style: js.UndefOr[PathOptions | StyleFunction[js.Any]] = js.native
}
object GeoJSONProps {
  
  @scala.inline
  def apply(data: GeoJsonObject | js.Array[GeoJsonObject]): GeoJSONProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONProps]
  }
  
  @scala.inline
  implicit class GeoJSONPropsOps[Self <: GeoJSONProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: GeoJsonObject*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: GeoJsonObject | js.Array[GeoJsonObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCoordsToLatLng(value: /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) => LatLng_): Self = this.set("coordsToLatLng", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCoordsToLatLng: Self = this.set("coordsToLatLng", js.undefined)
    
    @scala.inline
    def setFilter(value: /* geoJsonFeature */ Feature[GeometryObject, js.Any] => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    
    @scala.inline
    def setOnEachFeature(value: (/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer) => Unit): Self = this.set("onEachFeature", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEachFeature: Self = this.set("onEachFeature", js.undefined)
    
    @scala.inline
    def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = this.set("onlayeradd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnlayeradd: Self = this.set("onlayeradd", js.undefined)
    
    @scala.inline
    def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = this.set("onlayerremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnlayerremove: Self = this.set("onlayerremove", js.undefined)
    
    @scala.inline
    def setPointToLayer(
      value: (/* geoJsonPoint */ Feature[typings.geojson.mod.Point, js.Any], /* latlng */ LatLng_) => Layer
    ): Self = this.set("pointToLayer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePointToLayer: Self = this.set("pointToLayer", js.undefined)
    
    @scala.inline
    def setStyleFunction1(value: /* feature */ js.UndefOr[Feature[GeometryObject, js.Any]] => PathOptions): Self = this.set("style", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: PathOptions | StyleFunction[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
