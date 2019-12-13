package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetFactory[Q /* <: BaseQuad */] extends DatasetCoreFactory[Q] {
  def dataset(quads: Dataset[Q]): Dataset[Q] = js.native
}

