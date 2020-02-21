package typings.rdfDatasetExt

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/addAll", JSImport.Namespace)
@js.native
object addAllMod extends js.Object {
  def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: Iterable[Q]): D = js.native
}

