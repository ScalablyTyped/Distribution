package typings
package proj4leafletLib.proj4leafletMod.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4leaflet/leaflet", "Proj")
@js.native
object ProjNs extends js.Object {
  @js.native
  class CRS protected ()
    extends leafletLib.leafletMod.CRS {
    def this(projection: proj4Lib.proj4Mod.proj4Ns.InterfaceProjection) = this()
    def this(code: java.lang.String, proj4def: java.lang.String) = this()
    def this(projection: proj4Lib.proj4Mod.proj4Ns.InterfaceProjection, options: ProjCRSOptions) = this()
    def this(code: java.lang.String, proj4def: java.lang.String, options: ProjCRSOptions) = this()
    var projection: leafletLib.leafletMod.Projection = js.native
    var transformation: leafletLib.leafletMod.Transformation = js.native
  }
  
  @js.native
  class GeoJSON ()
    extends leafletLib.leafletMod.GeoJSON[js.Any]
  
  @js.native
  class ImageOverlay ()
    extends leafletLib.leafletMod.ImageOverlay
  
  trait ProjCRSOptions extends js.Object {
    var bounds: js.UndefOr[leafletLib.leafletMod.Bounds] = js.undefined
    var origin: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
    var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
    var scales: js.UndefOr[js.Array[scala.Double]] = js.undefined
    var transformation: js.UndefOr[leafletLib.leafletMod.Transformation] = js.undefined
  }
  
  def geoJson(): GeoJSON = js.native
  def geoJson(geojson: proj4leafletLib.proj4leafletMod.Proj4GeoJSONFeature): GeoJSON = js.native
  def geoJson(
    geojson: proj4leafletLib.proj4leafletMod.Proj4GeoJSONFeature,
    options: leafletLib.leafletMod.GeoJSONOptions[_]
  ): GeoJSON = js.native
  def imageOverlay(imageUrl: java.lang.String, bounds: leafletLib.leafletMod.LatLngBoundsExpression): ImageOverlay = js.native
  def imageOverlay(
    imageUrl: java.lang.String,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    options: leafletLib.leafletMod.ImageOverlayOptions
  ): ImageOverlay = js.native
}

