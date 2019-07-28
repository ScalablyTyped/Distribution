package typings.slickgrid.SlickNs.DataNs.AggregatorsNs

import typings.slickgrid.SlickNs.GroupTotals
import typings.slickgrid.SlickNs.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.Aggregators.Aggregator")
@js.native
class Aggregator[T /* <: SlickData */] () extends js.Object {
  var field: String = js.native
  def accumulate(item: T): Unit = js.native
  def init(): Unit = js.native
  def storeResult(groupTotals: GroupTotals[T]): Unit = js.native
}

