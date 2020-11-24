package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuadReduceIteratee[A, Q /* <: BaseQuad */] extends js.Object {
  
  /**
    * A callable function that can be executed on an accumulator and quad and returns a new accumulator.
    */
  def run(accumulator: A, quad: Q, dataset: Dataset[Q, Q]): A = js.native
}
object QuadReduceIteratee {
  
  @scala.inline
  def apply[A, Q /* <: BaseQuad */](run: (A, Q, Dataset[Q, Q]) => A): QuadReduceIteratee[A, Q] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
    __obj.asInstanceOf[QuadReduceIteratee[A, Q]]
  }
  
  @scala.inline
  implicit class QuadReduceIterateeOps[Self <: QuadReduceIteratee[_, _], A, Q /* <: BaseQuad */] (val x: Self with (QuadReduceIteratee[A, Q])) extends AnyVal {
    
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
    def setRun(value: (A, Q, Dataset[Q, Q]) => A): Self = this.set("run", js.Any.fromFunction3(value))
  }
}
