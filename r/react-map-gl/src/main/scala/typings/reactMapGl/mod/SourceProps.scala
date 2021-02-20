package typings.reactMapGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.react.mod.ReactNode
import typings.reactMapGl.reactMapGlStrings.mapbox
import typings.reactMapGl.reactMapGlStrings.terrarium
import typings.reactMapGl.reactMapGlStrings.tms
import typings.reactMapGl.reactMapGlStrings.xyz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceProps extends StObject {
  
  var attribution: js.UndefOr[String] = js.native
  
  var bounds: js.UndefOr[js.Array[Double]] = js.native
  
  var buffer: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var cluster: js.UndefOr[Boolean] = js.native
  
  var clusterMaxZoom: js.UndefOr[Double] = js.native
  
  var clusterProperties: js.UndefOr[js.Object] = js.native
  
  var clusterRadius: js.UndefOr[Double] = js.native
  
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var data: js.UndefOr[
    (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
  ] = js.native
  
  var encoding: js.UndefOr[terrarium | mapbox] = js.native
  
  var generateId: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var lineMetrics: js.UndefOr[Boolean] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var scheme: js.UndefOr[xyz | tms] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var tiles: js.UndefOr[js.Array[String]] = js.native
  
  var tolerance: js.UndefOr[Double] = js.native
  
  var `type`: String = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object SourceProps {
  
  @scala.inline
  def apply(`type`: String): SourceProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProps]
  }
  
  @scala.inline
  implicit class SourcePropsMutableBuilder[Self <: SourceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCluster(value: Boolean): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMaxZoom(value: Double): Self = StObject.set(x, "clusterMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMaxZoomUndefined: Self = StObject.set(x, "clusterMaxZoom", js.undefined)
    
    @scala.inline
    def setClusterProperties(value: js.Object): Self = StObject.set(x, "clusterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterPropertiesUndefined: Self = StObject.set(x, "clusterProperties", js.undefined)
    
    @scala.inline
    def setClusterRadius(value: Double): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setData(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEncoding(value: terrarium | mapbox): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setGenerateId(value: Boolean): Self = StObject.set(x, "generateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLineMetrics(value: Boolean): Self = StObject.set(x, "lineMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineMetricsUndefined: Self = StObject.set(x, "lineMetrics", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    @scala.inline
    def setScheme(value: xyz | tms): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    @scala.inline
    def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value :_*))
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
