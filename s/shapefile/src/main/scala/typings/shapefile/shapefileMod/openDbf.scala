package typings.shapefile.shapefileMod

import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", "openDbf")
@js.native
object openDbf extends js.Object {
  def apply(source: Openable): js.Promise[Source[GeoJsonProperties]] = js.native
  def apply(source: Openable, options: Options): js.Promise[Source[GeoJsonProperties]] = js.native
}

