package typings.shapefile.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shapefile", "open")
@js.native
object open extends js.Object {
  
  def apply(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def apply(shp: Openable, dbf: js.UndefOr[Openable], options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def apply(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
}
