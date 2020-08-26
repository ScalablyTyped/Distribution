package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadFilterIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that returns `true` if the input quad passes the test this function implements.
    */
  def test(quad: Q, dataset: Dataset[Q, Q]): Boolean = js.native
}

object QuadFilterIteratee {
  @scala.inline
  def apply[/* <: typings.rdfJs.mod.BaseQuad */ Q](test: (Q, Dataset[Q, Q]) => Boolean): QuadFilterIteratee[Q] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction2(test))
    __obj.asInstanceOf[QuadFilterIteratee[Q]]
  }
  @scala.inline
  implicit class QuadFilterIterateeOps[Self <: QuadFilterIteratee[_], /* <: typings.rdfJs.mod.BaseQuad */ Q] (val x: Self with QuadFilterIteratee[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTest(value: (Q, Dataset[Q, Q]) => Boolean): Self = this.set("test", js.Any.fromFunction2(value))
  }
  
}

