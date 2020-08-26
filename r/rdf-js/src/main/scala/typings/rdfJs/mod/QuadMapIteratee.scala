package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadMapIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad and returns a quad.
    *
    * The returned quad can be the given quad or a new one.
    */
  def map(quad: Q, dataset: Dataset[Q, Q]): Q = js.native
}

object QuadMapIteratee {
  @scala.inline
  def apply[/* <: typings.rdfJs.mod.BaseQuad */ Q](map: (Q, Dataset[Q, Q]) => Q): QuadMapIteratee[Q] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[QuadMapIteratee[Q]]
  }
  @scala.inline
  implicit class QuadMapIterateeOps[Self <: QuadMapIteratee[_], /* <: typings.rdfJs.mod.BaseQuad */ Q] (val x: Self with QuadMapIteratee[Q]) extends AnyVal {
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
    def setMap(value: (Q, Dataset[Q, Q]) => Q): Self = this.set("map", js.Any.fromFunction2(value))
  }
  
}

