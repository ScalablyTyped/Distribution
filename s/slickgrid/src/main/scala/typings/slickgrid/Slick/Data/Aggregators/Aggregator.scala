package typings.slickgrid.Slick.Data.Aggregators

import typings.slickgrid.Slick.GroupTotals
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregator[T /* <: SlickData */] extends js.Object {
  var field: String
  def accumulate(item: T): Unit
  def init(): Unit
  def storeResult(groupTotals: GroupTotals[T]): Unit
}

object Aggregator {
  @scala.inline
  def apply[T](accumulate: T => Unit, field: String, init: () => Unit, storeResult: GroupTotals[T] => Unit): Aggregator[T] = {
    val __obj = js.Dynamic.literal(accumulate = js.Any.fromFunction1(accumulate), field = field.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), storeResult = js.Any.fromFunction1(storeResult))
    __obj.asInstanceOf[Aggregator[T]]
  }
}

