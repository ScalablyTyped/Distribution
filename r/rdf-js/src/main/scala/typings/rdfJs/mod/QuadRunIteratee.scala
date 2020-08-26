package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadRunIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad.
    */
  def run(quad: Q, dataset: Dataset[Q, Q]): Unit = js.native
}

object QuadRunIteratee {
  @scala.inline
  def apply[/* <: typings.rdfJs.mod.BaseQuad */ Q](run: (Q, Dataset[Q, Q]) => Unit): QuadRunIteratee[Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[QuadRunIteratee[Q]]
  }
  @scala.inline
  implicit class QuadRunIterateeOps[Self <: QuadRunIteratee[_], /* <: typings.rdfJs.mod.BaseQuad */ Q] (val x: Self with QuadRunIteratee[Q]) extends AnyVal {
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
    def setRun(value: (Q, Dataset[Q, Q]) => Unit): Self = this.set("run", js.Any.fromFunction2(value))
  }
  
}

