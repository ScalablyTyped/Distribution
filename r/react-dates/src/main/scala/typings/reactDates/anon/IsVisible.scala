package typings.reactDates.anon

import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsVisible extends js.Object {
  var isVisible: Boolean
  var month: momentObj
  def onMonthSelect(currentMonth: momentObj, newMonthVal: String): Unit
  def onYearSelect(currentMonth: momentObj, newYearVal: String): Unit
}

object IsVisible {
  @scala.inline
  def apply(
    isVisible: Boolean,
    month: momentObj,
    onMonthSelect: (momentObj, String) => Unit,
    onYearSelect: (momentObj, String) => Unit
  ): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], onMonthSelect = js.Any.fromFunction2(onMonthSelect), onYearSelect = js.Any.fromFunction2(onYearSelect))
    __obj.asInstanceOf[IsVisible]
  }
}

