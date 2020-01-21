package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[CustomMarking]
  var markingType: custom
}

object CustomMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[CustomMarking], markingType: custom): CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomMarkingProps]
  }
}

