package typings.proj4leaflet.mod.leafletAugmentingMod.Proj

import typings.leaflet.mod.GeoJSONOptions
import typings.proj4leaflet.mod.Proj4GeoJSONFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Proj.geoJson")
@js.native
object geoJson extends js.Object {
  
  def apply(): GeoJSON_ = js.native
  def apply(geojson: js.UndefOr[scala.Nothing], options: GeoJSONOptions[_]): GeoJSON_ = js.native
  def apply(geojson: Proj4GeoJSONFeature): GeoJSON_ = js.native
  def apply(geojson: Proj4GeoJSONFeature, options: GeoJSONOptions[_]): GeoJSON_ = js.native
}
