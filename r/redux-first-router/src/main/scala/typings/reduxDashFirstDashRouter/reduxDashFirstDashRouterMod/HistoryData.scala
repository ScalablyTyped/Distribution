package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryData extends js.Object {
  var entries: HistoryEntries
  var index: Double
  var length: Double
}

object HistoryData {
  @scala.inline
  def apply(entries: HistoryEntries, index: Double, length: Double): HistoryData = {
    val __obj = js.Dynamic.literal(entries = entries, index = index, length = length)
  
    __obj.asInstanceOf[HistoryData]
  }
}

