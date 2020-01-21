package typings.reduxFirstRouter.mod

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
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HistoryData]
  }
}

