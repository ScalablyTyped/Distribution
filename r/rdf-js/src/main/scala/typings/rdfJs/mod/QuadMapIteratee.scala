package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadMapIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad and returns a quad.
    *
    * The returned quad can be the given quad or a new one.
    */
  def map(quad: Q, dataset: Dataset[Q, Q]): Q
}

object QuadMapIteratee {
  @scala.inline
  def apply[Q](map: (Q, Dataset[Q, Q]) => Q): QuadMapIteratee[Q] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[QuadMapIteratee[Q]]
  }
}

