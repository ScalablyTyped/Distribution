package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[MultiPeriodMarking] = js.native
  var markingType: `multi-period` = js.native
}

object MultiPeriodMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
  @scala.inline
  implicit class MultiPeriodMarkingPropsOps[Self <: MultiPeriodMarkingProps] (val x: Self) extends AnyVal {
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
    def setMarkedDates(value: StringDictionary[MultiPeriodMarking]): Self = this.set("markedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkingType(value: `multi-period`): Self = this.set("markingType", value.asInstanceOf[js.Any])
  }
  
}

