package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetCoreFactory[Q /* <: BaseQuad */] extends js.Object {
  /**
    * Returns a new dataset and imports all quads, if given.
    */
  def dataset(): DatasetCore[Q] = js.native
  def dataset(quads: js.Array[Q]): DatasetCore[Q] = js.native
}

