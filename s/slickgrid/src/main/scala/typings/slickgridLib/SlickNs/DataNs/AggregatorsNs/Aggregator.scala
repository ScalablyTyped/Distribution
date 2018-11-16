package typings
package slickgridLib.SlickNs.DataNs.AggregatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.Aggregators.Aggregator")
@js.native
class Aggregator[T /* <: slickgridLib.SlickNs.SlickData */] () extends js.Object {
  var field: java.lang.String = js.native
  def accumulate(item: T): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def storeResult(groupTotals: slickgridLib.SlickNs.GroupTotals[T]): scala.Unit = js.native
}

