package typings.reactInfiniteCalendar.mod

import typings.reactInfiniteCalendar.anon.AccentColor
import typings.reactInfiniteCalendar.anon.Blank
import typings.reactInfiniteCalendar.anon.End
import typings.reactInfiniteCalendar.anon.HideYearsOnSelect
import typings.reactInfiniteCalendar.reactInfiniteCalendarBooleans.`false`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.`100Percentsign`
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.auto
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.days
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.years
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactInfiniteCalendarProps extends js.Object {
  
  var Component: js.UndefOr[CalendarClass] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disabledDates: js.UndefOr[js.Array[DateType]] = js.native
  
  var disabledDays: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.native
  
  var display: js.UndefOr[days | years] = js.native
  
  var displayOptions: js.UndefOr[HideYearsOnSelect] = js.native
  
  var height: js.UndefOr[Double | auto] = js.native
  
  var interpolateSelection: js.UndefOr[js.Function2[/* date */ Date, /* selected */ js.Array[Date], js.Array[Date]]] = js.native
  
  var locale: js.UndefOr[Blank] = js.native
  
  var max: js.UndefOr[DateType] = js.native
  
  var maxDate: js.UndefOr[DateType] = js.native
  
  var min: js.UndefOr[DateType] = js.native
  
  var minDate: js.UndefOr[DateType] = js.native
  
  var onScroll: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.native
  
  var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.native
  
  var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.native
  
  var rowHeight: js.UndefOr[Double] = js.native
  
  var selected: js.UndefOr[DateType | `false` | End | js.Array[DateType]] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[AccentColor] = js.native
  
  var width: js.UndefOr[Double | auto | `100Percentsign`] = js.native
}
object ReactInfiniteCalendarProps {
  
  @scala.inline
  def apply(): ReactInfiniteCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactInfiniteCalendarProps]
  }
  
  @scala.inline
  implicit class ReactInfiniteCalendarPropsOps[Self <: ReactInfiniteCalendarProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: CalendarClass): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: DateType*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[DateType]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledDaysVarargs(value: (`0` | `1` | `2` | `3` | `4` | `5` | `6`)*): Self = this.set("disabledDays", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDays(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): Self = this.set("disabledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDays: Self = this.set("disabledDays", js.undefined)
    
    @scala.inline
    def setDisplay(value: days | years): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: HideYearsOnSelect): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | auto): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInterpolateSelection(value: (/* date */ Date, /* selected */ js.Array[Date]) => js.Array[Date]): Self = this.set("interpolateSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInterpolateSelection: Self = this.set("interpolateSelection", js.undefined)
    
    @scala.inline
    def setLocale(value: Blank): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMax(value: DateType): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxDate(value: DateType): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMin(value: DateType): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinDate(value: DateType): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* scrollTop */ Double => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollEnd(value: /* scrollTop */ Double => Unit): Self = this.set("onScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollEnd: Self = this.set("onScrollEnd", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* date */ Date) | (/* rangedDate */ RangedSelection) => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: DateType*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: DateType | `false` | End | js.Array[DateType]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: AccentColor): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | auto | `100Percentsign`): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
