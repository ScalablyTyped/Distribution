package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryData extends js.Object {
  var entries: HistoryEntries
  var index: scala.Double
  var length: scala.Double
}

object HistoryData {
  @scala.inline
  def apply(entries: HistoryEntries, index: scala.Double, length: scala.Double): HistoryData = {
    val __obj = js.Dynamic.literal(entries = entries, index = index, length = length)
  
    __obj.asInstanceOf[HistoryData]
  }
}

