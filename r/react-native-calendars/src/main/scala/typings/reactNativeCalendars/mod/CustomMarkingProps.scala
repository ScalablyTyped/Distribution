package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[CustomMarking] = js.native
  var markingType: custom = js.native
}

object CustomMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[CustomMarking], markingType: custom): CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarkingProps]
  }
  @scala.inline
  implicit class CustomMarkingPropsOps[Self <: CustomMarkingProps] (val x: Self) extends AnyVal {
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
    def setMarkedDates(value: StringDictionary[CustomMarking]): Self = this.set("markedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkingType(value: custom): Self = this.set("markingType", value.asInstanceOf[js.Any])
  }
  
}

