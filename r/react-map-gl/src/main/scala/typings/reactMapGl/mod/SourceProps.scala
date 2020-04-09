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

trait SourceProps extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  var buffer: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var cluster: js.UndefOr[Boolean] = js.undefined
  var clusterMaxZoom: js.UndefOr[Double] = js.undefined
  var clusterProperties: js.UndefOr[js.Object] = js.undefined
  var clusterRadius: js.UndefOr[Double] = js.undefined
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var data: js.UndefOr[
    (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
  ] = js.undefined
  var encoding: js.UndefOr[terrarium | mapbox] = js.undefined
  var generateId: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lineMetrics: js.UndefOr[Boolean] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var scheme: js.UndefOr[xyz | tms] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
  var `type`: String
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object SourceProps {
  @scala.inline
  def apply(
    `type`: String,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    buffer: Int | Double = null,
    children: ReactNode = null,
    cluster: js.UndefOr[Boolean] = js.undefined,
    clusterMaxZoom: Int | Double = null,
    clusterProperties: js.Object = null,
    clusterRadius: Int | Double = null,
    coordinates: js.Array[js.Array[Double]] = null,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    encoding: terrarium | mapbox = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    scheme: xyz | tms = null,
    tileSize: Int | Double = null,
    tiles: js.Array[String] = null,
    tolerance: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null
  ): SourceProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(cluster)) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (clusterMaxZoom != null) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.asInstanceOf[js.Any])
    if (clusterProperties != null) __obj.updateDynamic("clusterProperties")(clusterProperties.asInstanceOf[js.Any])
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProps]
  }
}

