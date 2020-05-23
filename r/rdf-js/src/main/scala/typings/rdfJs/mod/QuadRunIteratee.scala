package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadRunIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad.
    */
  def run(quad: Q, dataset: Dataset[Q, Q]): Unit
}

object QuadRunIteratee {
  @scala.inline
  def apply[Q](run: (Q, Dataset[Q, Q]) => Unit): QuadRunIteratee[Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[QuadRunIteratee[Q]]
  }
}

