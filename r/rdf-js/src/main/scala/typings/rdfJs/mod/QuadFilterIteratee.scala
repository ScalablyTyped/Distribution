package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadFilterIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that returns `true` if the input quad passes the test this function implements.
    */
  def test(quad: Q, dataset: Dataset[Q, Q]): Boolean
}

object QuadFilterIteratee {
  @scala.inline
  def apply[Q](test: (Q, Dataset[Q, Q]) => Boolean): QuadFilterIteratee[Q] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction2(test))
    __obj.asInstanceOf[QuadFilterIteratee[Q]]
  }
}

