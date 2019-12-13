package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadRunIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad.
    */
  def run(quad: Q, dataset: Dataset[Q]): Unit
}

object QuadRunIteratee {
  @scala.inline
  def apply[Q /* <: BaseQuad */](run: (Q, Dataset[Q]) => Unit): QuadRunIteratee[Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction2(run))
  
    __obj.asInstanceOf[QuadRunIteratee[Q]]
  }
}

