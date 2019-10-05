package typings.shapefile.shapefileMod

import typings.geojson.geojsonMod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", "openShp")
@js.native
object openShp extends js.Object {
  def apply(source: Openable): js.Promise[Source[GeometryObject]] = js.native
  def apply(source: Openable, options: Options): js.Promise[Source[GeometryObject]] = js.native
}

