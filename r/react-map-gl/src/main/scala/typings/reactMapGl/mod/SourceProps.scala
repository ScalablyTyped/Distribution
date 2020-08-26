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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceProps extends js.Object {
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
  implicit class SourcePropsOps[Self <: SourceProps] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCluster(value: Boolean): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setClusterMaxZoom(value: Double): Self = this.set("clusterMaxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterMaxZoom: Self = this.set("clusterMaxZoom", js.undefined)
    @scala.inline
    def setClusterProperties(value: js.Object): Self = this.set("clusterProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterProperties: Self = this.set("clusterProperties", js.undefined)
    @scala.inline
    def setClusterRadius(value: Double): Self = this.set("clusterRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterRadius: Self = this.set("clusterRadius", js.undefined)
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    @scala.inline
    def setData(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEncoding(value: terrarium | mapbox): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setGenerateId(value: Boolean): Self = this.set("generateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLineMetrics(value: Boolean): Self = this.set("lineMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineMetrics: Self = this.set("lineMetrics", js.undefined)
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxzoom: Self = this.set("maxzoom", js.undefined)
    @scala.inline
    def setMinzoom(value: Double): Self = this.set("minzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinzoom: Self = this.set("minzoom", js.undefined)
    @scala.inline
    def setScheme(value: xyz | tms): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setTilesVarargs(value: String*): Self = this.set("tiles", js.Array(value :_*))
    @scala.inline
    def setTiles(value: js.Array[String]): Self = this.set("tiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiles: Self = this.set("tiles", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

