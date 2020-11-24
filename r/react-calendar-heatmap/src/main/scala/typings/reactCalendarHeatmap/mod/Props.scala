package typings.reactCalendarHeatmap.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var classForValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  var endDate: js.UndefOr[String | Double | Date] = js.native
  
  var gutterSize: js.UndefOr[Double] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var monthLabels: js.UndefOr[js.Array[String]] = js.native
  
  var numDays: js.UndefOr[Double] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, Unit]] = js.native
  
  var onMouseOver: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, Unit]] = js.native
  
  var showMonthLabels: js.UndefOr[Boolean] = js.native
  
  var showOutOfRangeDays: js.UndefOr[Boolean] = js.native
  
  var showWeekdayLabels: js.UndefOr[Boolean] = js.native
  
  var startDate: js.UndefOr[String | Double | Date] = js.native
  
  var titleForValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  var tooltipDataAttrs: js.UndefOr[js.Object] = js.native
  
  var transformDayElement: js.UndefOr[js.Function3[/* rect */ js.Any, /* value */ js.Any, /* index */ Double, _]] = js.native
  
  var values: js.Array[_] = js.native
  
  var weekdayLabels: js.UndefOr[js.Array[String]] = js.native
}
object Props {
  
  @scala.inline
  def apply(values: js.Array[_]): Props = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassForValue(value: /* value */ js.Any => _): Self = this.set("classForValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClassForValue: Self = this.set("classForValue", js.undefined)
    
    @scala.inline
    def setEndDate(value: String | Double | Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setGutterSize(value: Double): Self = this.set("gutterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutterSize: Self = this.set("gutterSize", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setMonthLabelsVarargs(value: String*): Self = this.set("monthLabels", js.Array(value :_*))
    
    @scala.inline
    def setMonthLabels(value: js.Array[String]): Self = this.set("monthLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthLabels: Self = this.set("monthLabels", js.undefined)
    
    @scala.inline
    def setNumDays(value: Double): Self = this.set("numDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumDays: Self = this.set("numDays", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* value */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: (/* e */ js.Any, /* value */ js.Any) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: (/* e */ js.Any, /* value */ js.Any) => Unit): Self = this.set("onMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setShowMonthLabels(value: Boolean): Self = this.set("showMonthLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonthLabels: Self = this.set("showMonthLabels", js.undefined)
    
    @scala.inline
    def setShowOutOfRangeDays(value: Boolean): Self = this.set("showOutOfRangeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOutOfRangeDays: Self = this.set("showOutOfRangeDays", js.undefined)
    
    @scala.inline
    def setShowWeekdayLabels(value: Boolean): Self = this.set("showWeekdayLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekdayLabels: Self = this.set("showWeekdayLabels", js.undefined)
    
    @scala.inline
    def setStartDate(value: String | Double | Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTitleForValue(value: /* value */ js.Any => _): Self = this.set("titleForValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitleForValue: Self = this.set("titleForValue", js.undefined)
    
    @scala.inline
    def setTooltipDataAttrs(value: js.Object): Self = this.set("tooltipDataAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipDataAttrs: Self = this.set("tooltipDataAttrs", js.undefined)
    
    @scala.inline
    def setTransformDayElement(value: (/* rect */ js.Any, /* value */ js.Any, /* index */ Double) => _): Self = this.set("transformDayElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransformDayElement: Self = this.set("transformDayElement", js.undefined)
    
    @scala.inline
    def setWeekdayLabelsVarargs(value: String*): Self = this.set("weekdayLabels", js.Array(value :_*))
    
    @scala.inline
    def setWeekdayLabels(value: js.Array[String]): Self = this.set("weekdayLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdayLabels: Self = this.set("weekdayLabels", js.undefined)
  }
}
