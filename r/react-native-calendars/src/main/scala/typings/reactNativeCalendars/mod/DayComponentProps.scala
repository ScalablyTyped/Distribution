package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.reactNativeCalendarsBooleans.`false`
import typings.reactNativeCalendars.reactNativeCalendarsStrings._empty
import typings.reactNativeCalendars.reactNativeCalendarsStrings.disabled
import typings.reactNativeCalendars.reactNativeCalendarsStrings.selected
import typings.reactNativeCalendars.reactNativeCalendarsStrings.today
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayComponentProps extends js.Object {
  
  var date: DateObject = js.native
  
  var marking: `false` | js.Array[Marking] = js.native
  
  def onLongPress(date: DateObject): js.Any = js.native
  
  def onPress(date: DateObject): js.Any = js.native
  
  var state: _empty | selected | disabled | today = js.native
  
  var theme: CalendarTheme = js.native
}
object DayComponentProps {
  
  @scala.inline
  def apply(
    date: DateObject,
    marking: `false` | js.Array[Marking],
    onLongPress: DateObject => js.Any,
    onPress: DateObject => js.Any,
    state: _empty | selected | disabled | today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], marking = marking.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction1(onLongPress), onPress = js.Any.fromFunction1(onPress), state = state.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayComponentProps]
  }
  
  @scala.inline
  implicit class DayComponentPropsOps[Self <: DayComponentProps] (val x: Self) extends AnyVal {
    
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
    def setDate(value: DateObject): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingVarargs(value: Marking*): Self = this.set("marking", js.Array(value :_*))
    
    @scala.inline
    def setMarking(value: `false` | js.Array[Marking]): Self = this.set("marking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLongPress(value: DateObject => js.Any): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPress(value: DateObject => js.Any): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: _empty | selected | disabled | today): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: CalendarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
