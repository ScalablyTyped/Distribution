package typings.reactCalendarHeatmap

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-calendar-heatmap", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var classForValue: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
    
    var endDate: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var gutterSize: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var monthLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    var numDays: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function2[/* e */ Any, /* value */ Any, Unit]] = js.undefined
    
    var onMouseOver: js.UndefOr[js.Function2[/* e */ Any, /* value */ Any, Unit]] = js.undefined
    
    var showMonthLabels: js.UndefOr[Boolean] = js.undefined
    
    var showOutOfRangeDays: js.UndefOr[Boolean] = js.undefined
    
    var showWeekdayLabels: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var titleForValue: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
    
    var tooltipDataAttrs: js.UndefOr[js.Object] = js.undefined
    
    var transformDayElement: js.UndefOr[js.Function3[/* rect */ Any, /* value */ Any, /* index */ Double, Any]] = js.undefined
    
    var values: js.Array[Any]
    
    var weekdayLabels: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Props {
    
    inline def apply(values: js.Array[Any]): Props = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setClassForValue(value: /* value */ Any => Any): Self = StObject.set(x, "classForValue", js.Any.fromFunction1(value))
      
      inline def setClassForValueUndefined: Self = StObject.set(x, "classForValue", js.undefined)
      
      inline def setEndDate(value: String | Double | js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setGutterSize(value: Double): Self = StObject.set(x, "gutterSize", value.asInstanceOf[js.Any])
      
      inline def setGutterSizeUndefined: Self = StObject.set(x, "gutterSize", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setMonthLabels(value: js.Array[String]): Self = StObject.set(x, "monthLabels", value.asInstanceOf[js.Any])
      
      inline def setMonthLabelsUndefined: Self = StObject.set(x, "monthLabels", js.undefined)
      
      inline def setMonthLabelsVarargs(value: String*): Self = StObject.set(x, "monthLabels", js.Array(value*))
      
      inline def setNumDays(value: Double): Self = StObject.set(x, "numDays", value.asInstanceOf[js.Any])
      
      inline def setNumDaysUndefined: Self = StObject.set(x, "numDays", js.undefined)
      
      inline def setOnClick(value: /* value */ Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseLeave(value: (/* e */ Any, /* value */ Any) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseOver(value: (/* e */ Any, /* value */ Any) => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction2(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setShowMonthLabels(value: Boolean): Self = StObject.set(x, "showMonthLabels", value.asInstanceOf[js.Any])
      
      inline def setShowMonthLabelsUndefined: Self = StObject.set(x, "showMonthLabels", js.undefined)
      
      inline def setShowOutOfRangeDays(value: Boolean): Self = StObject.set(x, "showOutOfRangeDays", value.asInstanceOf[js.Any])
      
      inline def setShowOutOfRangeDaysUndefined: Self = StObject.set(x, "showOutOfRangeDays", js.undefined)
      
      inline def setShowWeekdayLabels(value: Boolean): Self = StObject.set(x, "showWeekdayLabels", value.asInstanceOf[js.Any])
      
      inline def setShowWeekdayLabelsUndefined: Self = StObject.set(x, "showWeekdayLabels", js.undefined)
      
      inline def setStartDate(value: String | Double | js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTitleForValue(value: /* value */ Any => Any): Self = StObject.set(x, "titleForValue", js.Any.fromFunction1(value))
      
      inline def setTitleForValueUndefined: Self = StObject.set(x, "titleForValue", js.undefined)
      
      inline def setTooltipDataAttrs(value: js.Object): Self = StObject.set(x, "tooltipDataAttrs", value.asInstanceOf[js.Any])
      
      inline def setTooltipDataAttrsUndefined: Self = StObject.set(x, "tooltipDataAttrs", js.undefined)
      
      inline def setTransformDayElement(value: (/* rect */ Any, /* value */ Any, /* index */ Double) => Any): Self = StObject.set(x, "transformDayElement", js.Any.fromFunction3(value))
      
      inline def setTransformDayElementUndefined: Self = StObject.set(x, "transformDayElement", js.undefined)
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setWeekdayLabels(value: js.Array[String]): Self = StObject.set(x, "weekdayLabels", value.asInstanceOf[js.Any])
      
      inline def setWeekdayLabelsUndefined: Self = StObject.set(x, "weekdayLabels", js.undefined)
      
      inline def setWeekdayLabelsVarargs(value: String*): Self = StObject.set(x, "weekdayLabels", js.Array(value*))
    }
  }
  
  type ReactCalendarHeatmap = Component[Props, js.Object, Any]
}
