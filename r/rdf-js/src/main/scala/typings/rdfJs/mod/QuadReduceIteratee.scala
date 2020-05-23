package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadReduceIteratee[A, Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on an accumulator and quad and returns a new accumulator.
    */
  def run(accumulator: A, quad: Q, dataset: Dataset[Q, Q]): A
}

object QuadReduceIteratee {
  @scala.inline
  def apply[A, Q](run: (A, Q, Dataset[Q, Q]) => A): QuadReduceIteratee[A, Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
    __obj.asInstanceOf[QuadReduceIteratee[A, Q]]
  }
}

