package typings.shapefile.mod

import typings.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shapefile", "openShp")
@js.native
object openShp extends js.Object {
  
  def apply(source: Openable): js.Promise[Source[GeometryObject]] = js.native
  def apply(source: Openable, options: Options): js.Promise[Source[GeometryObject]] = js.native
}
