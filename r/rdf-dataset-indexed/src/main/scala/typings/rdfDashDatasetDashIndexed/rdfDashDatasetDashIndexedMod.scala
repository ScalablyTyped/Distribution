package typings.rdfDashDatasetDashIndexed

import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.DataFactory
import typings.rdfDashJs.rdfDashJsMod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-indexed", JSImport.Namespace)
@js.native
object rdfDashDatasetDashIndexedMod extends js.Object {
  def apply[Q /* <: BaseQuad */](): DatasetCore[Q] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetCore[Q] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q], dataFactory: DataFactory): DatasetCore[Q] = js.native
}

