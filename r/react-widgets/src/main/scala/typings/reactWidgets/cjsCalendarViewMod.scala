package typings.reactWidgets

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.reactWidgetsStrings.century
import typings.reactWidgets.reactWidgetsStrings.decade
import typings.reactWidgets.reactWidgetsStrings.month
import typings.reactWidgets.reactWidgetsStrings.year
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCalendarViewMod {
  
  object default {
    
    inline def apply(hasClassNameFocusedItemOnKeyDownChildrenLabelledby: CalendarViewProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasClassNameFocusedItemOnKeyDownChildrenLabelledby.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs/CalendarView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-widgets/cjs/CalendarView", "default.Body")
    @js.native
    def Body: js.Function1[/* props */ AllHTMLAttributes[HTMLTableSectionElement], Element] = js.native
    inline def Body_=(x: js.Function1[/* props */ AllHTMLAttributes[HTMLTableSectionElement], Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    /* was `typeof CalendarViewCell` */
    inline def Cell(hasOnChangeMinMaxDateUnitDisabledSelectedFocusedItemViewUnitChildrenLabel: CellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(hasOnChangeMinMaxDateUnitDisabledSelectedFocusedItemViewUnitChildrenLabel.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs/CalendarView", "default.Row")
    @js.native
    def Row: js.Function1[/* props */ AllHTMLAttributes[HTMLTableRowElement], Element] = js.native
    inline def Row_=(x: js.Function1[/* props */ AllHTMLAttributes[HTMLTableRowElement], Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  trait CalendarViewProps extends StObject {
    
    var `aria-labelledby`: String
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var focusedItem: js.Date
    
    var id: String
    
    var onKeyDown: KeyboardEventHandler[HTMLTableElement]
  }
  object CalendarViewProps {
    
    inline def apply(
      `aria-labelledby`: String,
      focusedItem: js.Date,
      id: String,
      onKeyDown: KeyboardEvent[HTMLTableElement] => Unit
    ): CalendarViewProps = {
      val __obj = js.Dynamic.literal(focusedItem = focusedItem.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown))
      __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarViewProps]
    }
    
    extension [Self <: CalendarViewProps](x: Self) {
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFocusedItem(value: js.Date): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLTableElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    }
  }
  
  trait CellProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var date: js.Date
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusedItem: js.UndefOr[js.Date] = js.undefined
    
    var label: String
    
    var max: js.Date
    
    var min: js.Date
    
    var now: js.UndefOr[js.Date] = js.undefined
    
    def onChange(date: js.Date): Unit
    
    var selected: js.UndefOr[js.Date | Null] = js.undefined
    
    var unit: DateUnit
    
    var viewUnit: month | year | decade | century
  }
  object CellProps {
    
    inline def apply(
      date: js.Date,
      label: String,
      max: js.Date,
      min: js.Date,
      onChange: js.Date => Unit,
      unit: DateUnit,
      viewUnit: month | year | decade | century
    ): CellProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), unit = unit.asInstanceOf[js.Any], viewUnit = viewUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusedItem(value: js.Date): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setNow(value: js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setOnChange(value: js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedNull: Self = StObject.set(x, "selected", null)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setUnit(value: DateUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setViewUnit(value: month | year | decade | century): Self = StObject.set(x, "viewUnit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.second
    - typings.reactWidgets.reactWidgetsStrings.minutes
    - typings.reactWidgets.reactWidgetsStrings.hours
    - typings.reactWidgets.reactWidgetsStrings.day
    - typings.reactWidgets.reactWidgetsStrings.week
    - typings.reactWidgets.reactWidgetsStrings.month
    - typings.reactWidgets.reactWidgetsStrings.year
    - typings.reactWidgets.reactWidgetsStrings.decade
    - typings.reactWidgets.reactWidgetsStrings.century
  */
  trait DateUnit extends StObject
  object DateUnit {
    
    inline def century: typings.reactWidgets.reactWidgetsStrings.century = "century".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.century]
    
    inline def day: typings.reactWidgets.reactWidgetsStrings.day = "day".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.day]
    
    inline def decade: typings.reactWidgets.reactWidgetsStrings.decade = "decade".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.decade]
    
    inline def hours: typings.reactWidgets.reactWidgetsStrings.hours = "hours".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.hours]
    
    inline def minutes: typings.reactWidgets.reactWidgetsStrings.minutes = "minutes".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.minutes]
    
    inline def month: typings.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.month]
    
    inline def second: typings.reactWidgets.reactWidgetsStrings.second = "second".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.second]
    
    inline def week: typings.reactWidgets.reactWidgetsStrings.week = "week".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.week]
    
    inline def year: typings.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.year]
  }
}
