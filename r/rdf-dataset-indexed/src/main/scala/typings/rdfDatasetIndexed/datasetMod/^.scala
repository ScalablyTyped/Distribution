package typings.rdfDatasetIndexed.datasetMod

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Dataset
import typings.rdfJs.mod.DatasetFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSImport("rdf-dataset-indexed/dataset", JSImport.Namespace)
@js.native
class ^[Q /* <: BaseQuad */, InQuad /* <: BaseQuad */] () extends js.Object {
  def this(quads: js.Array[Q]) = this()
  def this(
    quads: js.UndefOr[scala.Nothing],
    factory: (DataFactory[Quad, Quad]) with (DatasetFactory[Quad, Quad, Dataset[Quad, Quad]])
  ) = this()
  def this(
    quads: js.Array[Q],
    factory: (DataFactory[Quad, Quad]) with (DatasetFactory[Quad, Quad, Dataset[Quad, Quad]])
  ) = this()
}
