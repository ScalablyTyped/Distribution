package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDotMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[MultiDotMarking]
  var markingType: `multi-dot`
}

object MultiDotMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
}

