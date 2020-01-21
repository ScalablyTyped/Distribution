package typings.rdfDatasetIndexed

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-indexed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[Q /* <: BaseQuad */](): DatasetCore[Q] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q]): DatasetCore[Q] = js.native
  def apply[Q /* <: BaseQuad */](quads: js.Array[Q], dataFactory: DataFactory): DatasetCore[Q] = js.native
}

