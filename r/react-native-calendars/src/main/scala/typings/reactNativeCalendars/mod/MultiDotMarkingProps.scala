package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiDotMarkingProps extends _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiDotMarking] = js.native
  
  var markingType: `multi-dot` = js.native
}
object MultiDotMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
  
  @scala.inline
  implicit class MultiDotMarkingPropsOps[Self <: MultiDotMarkingProps] (val x: Self) extends AnyVal {
    
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
    def setMarkedDates(value: StringDictionary[MultiDotMarking]): Self = this.set("markedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingType(value: `multi-dot`): Self = this.set("markingType", value.asInstanceOf[js.Any])
  }
}
