package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[DotMarking] = js.native
  var markingType: js.UndefOr[simple] = js.native
}

object DotMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[DotMarking]): DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMarkingProps]
  }
  @scala.inline
  implicit class DotMarkingPropsOps[Self <: DotMarkingProps] (val x: Self) extends AnyVal {
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
    def setMarkedDates(value: StringDictionary[DotMarking]): Self = this.set("markedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkingType(value: simple): Self = this.set("markingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkingType: Self = this.set("markingType", js.undefined)
  }
  
}

