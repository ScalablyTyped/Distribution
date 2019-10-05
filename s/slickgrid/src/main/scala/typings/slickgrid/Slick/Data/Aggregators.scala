package typings.slickgrid.Slick.Data

import typings.slickgrid.Slick.Data.Aggregators.Aggregator
import typings.slickgrid.Slick.GroupTotals
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.Aggregators")
@js.native
object Aggregators extends js.Object {
  @js.native
  class Aggregator[T /* <: SlickData */] () extends js.Object {
    var field: String = js.native
    def accumulate(item: T): Unit = js.native
    def init(): Unit = js.native
    def storeResult(groupTotals: GroupTotals[T]): Unit = js.native
  }
  
  @js.native
  class Avg[T] () extends Aggregator[T]
  
  @js.native
  class Max[T] () extends Aggregator[T]
  
  @js.native
  class Min[T] () extends Aggregator[T]
  
  @js.native
  class Sum[T] () extends Aggregator[T]
  
}

