package typings.rdfDatasetExt

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext/equals", JSImport.Namespace)
@js.native
object equalsMod extends js.Object {
  def apply(a: DatasetCore[BaseQuad], b: DatasetCore[BaseQuad]): Boolean = js.native
}

