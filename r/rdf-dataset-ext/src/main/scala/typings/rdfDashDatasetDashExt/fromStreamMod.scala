package typings.rdfDashDatasetDashExt

import typings.node.eventsMod.EventEmitter
import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/fromStream", JSImport.Namespace)
@js.native
object fromStreamMod extends js.Object {
  def apply[D /* <: DatasetCore[BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = js.native
}

