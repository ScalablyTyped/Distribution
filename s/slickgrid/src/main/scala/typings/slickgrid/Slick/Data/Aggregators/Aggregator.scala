package typings.slickgrid.Slick.Data.Aggregators

import typings.slickgrid.Slick.GroupTotals
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregator[T /* <: SlickData */] extends js.Object {
  
  def accumulate(item: T): Unit = js.native
  
  var field: String = js.native
  
  def init(): Unit = js.native
  
  def storeResult(groupTotals: GroupTotals[T]): Unit = js.native
}
object Aggregator {
  
  @scala.inline
  def apply[T /* <: SlickData */](accumulate: T => Unit, field: String, init: () => Unit, storeResult: GroupTotals[T] => Unit): Aggregator[T] = {
    val __obj = js.Dynamic.literal(accumulate = js.Any.fromFunction1(accumulate), field = field.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), storeResult = js.Any.fromFunction1(storeResult))
    __obj.asInstanceOf[Aggregator[T]]
  }
  
  @scala.inline
  implicit class AggregatorOps[Self <: Aggregator[_], T /* <: SlickData */] (val x: Self with Aggregator[T]) extends AnyVal {
    
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
    def setAccumulate(value: T => Unit): Self = this.set("accumulate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoreResult(value: GroupTotals[T] => Unit): Self = this.set("storeResult", js.Any.fromFunction1(value))
  }
}
