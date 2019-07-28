package typings.proj4leaflet.proj4leafletMod.leafletMod

import typings.leaflet.leafletMod.Bounds
import typings.leaflet.leafletMod.GeoJSONOptions
import typings.leaflet.leafletMod.ImageOverlayOptions
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LatLngExpression
import typings.leaflet.leafletMod.LatLngLiteral
import typings.leaflet.leafletMod.Point
import typings.leaflet.leafletMod.PointExpression
import typings.leaflet.leafletMod.Projection
import typings.leaflet.leafletMod.Transformation
import typings.proj4.proj4Mod.InterfaceProjection
import typings.proj4leaflet.proj4leafletMod.Proj4GeoJSONFeature
import typings.proj4leaflet.proj4leafletMod.leafletMod.ProjNs.GeoJSON
import typings.proj4leaflet.proj4leafletMod.leafletMod.ProjNs.ImageOverlay
import typings.proj4leaflet.proj4leafletMod.leafletMod.ProjNs.ProjCRSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4leaflet/leaflet", "Proj")
@js.native
object ProjNs extends js.Object {
  @js.native
  class CRS protected () extends js.Object {
    def this(projection: InterfaceProjection) = this()
    def this(code: String, proj4def: String) = this()
    def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
    def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
    var code: js.UndefOr[String] = js.native
    var infinite: Boolean = js.native
    var projection: Projection = js.native
    var transformation: Transformation = js.native
    var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
    def getProjectedBounds(zoom: Double): Bounds = js.native
    def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point = js.native
    def pointToLatLng(point: PointExpression, zoom: Double): LatLng = js.native
    def project(latlng: LatLng): Point = js.native
    def project(latlng: LatLngLiteral): Point = js.native
    def scale(zoom: Double): Double = js.native
    def unproject(point: PointExpression): LatLng = js.native
    def wrapLatLng(latlng: LatLng): LatLng = js.native
    def wrapLatLng(latlng: LatLngLiteral): LatLng = js.native
    def zoom(scale: Double): Double = js.native
  }
  
  @js.native
  class GeoJSON ()
    extends typings.leaflet.leafletMod.GeoJSON[js.Any]
  
  @js.native
  class ImageOverlay ()
    extends typings.leaflet.leafletMod.ImageOverlay
  
  trait ProjCRSOptions extends js.Object {
    var bounds: js.UndefOr[Bounds] = js.undefined
    var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    var scales: js.UndefOr[js.Array[Double]] = js.undefined
    var transformation: js.UndefOr[Transformation] = js.undefined
  }
  
  def geoJson(): GeoJSON = js.native
  def geoJson(geojson: Proj4GeoJSONFeature): GeoJSON = js.native
  def geoJson(geojson: Proj4GeoJSONFeature, options: GeoJSONOptions[_]): GeoJSON = js.native
  def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay = js.native
  def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay = js.native
}

