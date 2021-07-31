package typings.reactCalendarHeatmap

import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-calendar-heatmap", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  trait Props extends StObject {
    
    var classForValue: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
    
    var endDate: js.UndefOr[String | Double | Date] = js.undefined
    
    var gutterSize: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var monthLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    var numDays: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, Unit]] = js.undefined
    
    var onMouseOver: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, Unit]] = js.undefined
    
    var showMonthLabels: js.UndefOr[Boolean] = js.undefined
    
    var showOutOfRangeDays: js.UndefOr[Boolean] = js.undefined
    
    var showWeekdayLabels: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.UndefOr[String | Double | Date] = js.undefined
    
    var titleForValue: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
    
    var tooltipDataAttrs: js.UndefOr[js.Object] = js.undefined
    
    var transformDayElement: js.UndefOr[js.Function3[/* rect */ js.Any, /* value */ js.Any, /* index */ Double, js.Any]] = js.undefined
    
    var values: js.Array[js.Any]
    
    var weekdayLabels: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(values: js.Array[js.Any]): Props = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassForValue(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "classForValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassForValueUndefined: Self = StObject.set(x, "classForValue", js.undefined)
      
      @scala.inline
      def setEndDate(value: String | Double | Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setGutterSize(value: Double): Self = StObject.set(x, "gutterSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterSizeUndefined: Self = StObject.set(x, "gutterSize", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setMonthLabels(value: js.Array[String]): Self = StObject.set(x, "monthLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthLabelsUndefined: Self = StObject.set(x, "monthLabels", js.undefined)
      
      @scala.inline
      def setMonthLabelsVarargs(value: String*): Self = StObject.set(x, "monthLabels", js.Array(value :_*))
      
      @scala.inline
      def setNumDays(value: Double): Self = StObject.set(x, "numDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDaysUndefined: Self = StObject.set(x, "numDays", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: (/* e */ js.Any, /* value */ js.Any) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: (/* e */ js.Any, /* value */ js.Any) => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setShowMonthLabels(value: Boolean): Self = StObject.set(x, "showMonthLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthLabelsUndefined: Self = StObject.set(x, "showMonthLabels", js.undefined)
      
      @scala.inline
      def setShowOutOfRangeDays(value: Boolean): Self = StObject.set(x, "showOutOfRangeDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOutOfRangeDaysUndefined: Self = StObject.set(x, "showOutOfRangeDays", js.undefined)
      
      @scala.inline
      def setShowWeekdayLabels(value: Boolean): Self = StObject.set(x, "showWeekdayLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekdayLabelsUndefined: Self = StObject.set(x, "showWeekdayLabels", js.undefined)
      
      @scala.inline
      def setStartDate(value: String | Double | Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setTitleForValue(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "titleForValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleForValueUndefined: Self = StObject.set(x, "titleForValue", js.undefined)
      
      @scala.inline
      def setTooltipDataAttrs(value: js.Object): Self = StObject.set(x, "tooltipDataAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipDataAttrsUndefined: Self = StObject.set(x, "tooltipDataAttrs", js.undefined)
      
      @scala.inline
      def setTransformDayElement(value: (/* rect */ js.Any, /* value */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "transformDayElement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformDayElementUndefined: Self = StObject.set(x, "transformDayElement", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setWeekdayLabels(value: js.Array[String]): Self = StObject.set(x, "weekdayLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayLabelsUndefined: Self = StObject.set(x, "weekdayLabels", js.undefined)
      
      @scala.inline
      def setWeekdayLabelsVarargs(value: String*): Self = StObject.set(x, "weekdayLabels", js.Array(value :_*))
    }
  }
  
  type ReactCalendarHeatmap = Component[Props, js.Object, js.Any]
}
