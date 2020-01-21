package typings.proj4leaflet.mod.leafletAugmentingMod.Proj

import typings.leaflet.mod.Bounds_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngLiteral
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.Point_
import typings.leaflet.mod.Projection
import typings.leaflet.mod.Transformation
import typings.proj4.mod.InterfaceProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.CRS")
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
  def getProjectedBounds(zoom: Double): Bounds_ = js.native
  def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point_ = js.native
  def pointToLatLng(point: PointExpression, zoom: Double): LatLng_ = js.native
  def project(latlng: LatLngLiteral): Point_ = js.native
  def project(latlng: LatLng_): Point_ = js.native
  def scale(zoom: Double): Double = js.native
  def unproject(point: PointExpression): LatLng_ = js.native
  def wrapLatLng(latlng: LatLngLiteral): LatLng_ = js.native
  def wrapLatLng(latlng: LatLng_): LatLng_ = js.native
  def zoom(scale: Double): Double = js.native
}

