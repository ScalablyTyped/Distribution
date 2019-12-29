package typings.rdfDashDatasetDashExt

import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/toStream", JSImport.Namespace)
@js.native
object toStreamMod extends js.Object {
  def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q]): Stream[Q] = js.native
}

