package typings.reactDashDateDashRange.reactDashDateDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashDateDashRange.reactDashDateDashRangeStrings.Today
  - typings.reactDashDateDashRange.reactDashDateDashRangeStrings.Yesterday
  - typings.reactDashDateDashRange.reactDashDateDashRangeStrings.`Last 7 Days`
  - typings.reactDashDateDashRange.reactDashDateDashRangeStrings.`Last 30 Days`
*/
trait DateRangeIndex extends js.Object

object DateRangeIndex {
  @scala.inline
  def `Last 30 Days`: typings.reactDashDateDashRange.reactDashDateDashRangeStrings.`Last 30 Days` = this.cast("Last 30 Days")
  @scala.inline
  def `Last 7 Days`: typings.reactDashDateDashRange.reactDashDateDashRangeStrings.`Last 7 Days` = this.cast("Last 7 Days")
  @scala.inline
  def Today: typings.reactDashDateDashRange.reactDashDateDashRangeStrings.Today = this.cast("Today")
  @scala.inline
  def Yesterday: typings.reactDashDateDashRange.reactDashDateDashRangeStrings.Yesterday = this.cast("Yesterday")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

