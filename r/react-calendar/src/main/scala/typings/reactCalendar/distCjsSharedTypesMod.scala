package typings.reactCalendar

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.prev
    - typings.reactCalendar.reactCalendarStrings.prev2
    - typings.reactCalendar.reactCalendarStrings.next
    - typings.reactCalendar.reactCalendarStrings.next2
    - typings.reactCalendar.reactCalendarStrings.onChange
    - typings.reactCalendar.reactCalendarStrings.drillUp
    - typings.reactCalendar.reactCalendarStrings.drillDown
  */
  trait Action extends StObject
  object Action {
    
    inline def drillDown: typings.reactCalendar.reactCalendarStrings.drillDown = "drillDown".asInstanceOf[typings.reactCalendar.reactCalendarStrings.drillDown]
    
    inline def drillUp: typings.reactCalendar.reactCalendarStrings.drillUp = "drillUp".asInstanceOf[typings.reactCalendar.reactCalendarStrings.drillUp]
    
    inline def next: typings.reactCalendar.reactCalendarStrings.next = "next".asInstanceOf[typings.reactCalendar.reactCalendarStrings.next]
    
    inline def next2: typings.reactCalendar.reactCalendarStrings.next2 = "next2".asInstanceOf[typings.reactCalendar.reactCalendarStrings.next2]
    
    inline def onChange: typings.reactCalendar.reactCalendarStrings.onChange = "onChange".asInstanceOf[typings.reactCalendar.reactCalendarStrings.onChange]
    
    inline def prev: typings.reactCalendar.reactCalendarStrings.prev = "prev".asInstanceOf[typings.reactCalendar.reactCalendarStrings.prev]
    
    inline def prev2: typings.reactCalendar.reactCalendarStrings.prev2 = "prev2".asInstanceOf[typings.reactCalendar.reactCalendarStrings.prev2]
  }
  
  /* Inlined { readonly ARABIC :'Arabic',  readonly HEBREW :'Hebrew',  readonly ISO_8601 :'ISO 8601',  readonly US :'US'}[keyof { readonly ARABIC :'Arabic',  readonly HEBREW :'Hebrew',  readonly ISO_8601 :'ISO 8601',  readonly US :'US'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.Arabic
    - typings.reactCalendar.reactCalendarStrings.Hebrew
    - typings.reactCalendar.reactCalendarStrings.`ISO 8601`
    - typings.reactCalendar.reactCalendarStrings.US
  */
  trait CalendarType extends StObject
  object CalendarType {
    
    inline def Arabic: typings.reactCalendar.reactCalendarStrings.Arabic = "Arabic".asInstanceOf[typings.reactCalendar.reactCalendarStrings.Arabic]
    
    inline def Hebrew: typings.reactCalendar.reactCalendarStrings.Hebrew = "Hebrew".asInstanceOf[typings.reactCalendar.reactCalendarStrings.Hebrew]
    
    inline def `ISO 8601`: typings.reactCalendar.reactCalendarStrings.`ISO 8601` = ("ISO 8601").asInstanceOf[typings.reactCalendar.reactCalendarStrings.`ISO 8601`]
    
    inline def US: typings.reactCalendar.reactCalendarStrings.US = "US".asInstanceOf[typings.reactCalendar.reactCalendarStrings.US]
  }
  
  type ClassName = js.UndefOr[String | Null | (js.Array[js.UndefOr[String | Null]])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.century
    - typings.reactCalendar.reactCalendarStrings.decade
    - typings.reactCalendar.reactCalendarStrings.year
    - typings.reactCalendar.reactCalendarStrings.month
  */
  trait Detail extends StObject
  object Detail {
    
    inline def century: typings.reactCalendar.reactCalendarStrings.century = "century".asInstanceOf[typings.reactCalendar.reactCalendarStrings.century]
    
    inline def decade: typings.reactCalendar.reactCalendarStrings.decade = "decade".asInstanceOf[typings.reactCalendar.reactCalendarStrings.decade]
    
    inline def month: typings.reactCalendar.reactCalendarStrings.month = "month".asInstanceOf[typings.reactCalendar.reactCalendarStrings.month]
    
    inline def year: typings.reactCalendar.reactCalendarStrings.year = "year".asInstanceOf[typings.reactCalendar.reactCalendarStrings.year]
  }
  
  type LooseValue = LooseValuePiece | (js.Tuple2[LooseValuePiece, LooseValuePiece])
  
  type LooseValuePiece = String | js.Date | Null
  
  trait NavigationLabelArgs extends StObject {
    
    var date: js.Date
    
    var label: String
    
    var locale: js.UndefOr[String] = js.undefined
    
    var view: View
  }
  object NavigationLabelArgs {
    
    inline def apply(date: js.Date, label: String, view: View): NavigationLabelArgs = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationLabelArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationLabelArgs] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type NavigationLabelFunc = js.Function1[/* param0 */ NavigationLabelArgs, ReactNode]
  
  trait OnArgs extends StObject {
    
    var action: Action
    
    var activeStartDate: js.Date | Null
    
    var value: Value
    
    var view: View
  }
  object OnArgs {
    
    inline def apply(action: Action, view: View): OnArgs = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], activeStartDate = null, value = null)
      __obj.asInstanceOf[OnArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnArgs] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDateNull: Self = StObject.set(x, "activeStartDate", null)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type OnChangeFunc = js.Function2[
    /* value */ js.Date, 
    /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
    Unit
  ]
  
  type OnClickWeekNumberFunc = js.Function3[
    /* weekNumber */ Double, 
    /* date */ js.Date, 
    /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
    Unit
  ]
  
  type Range[T] = js.Tuple2[T, T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.century
    - typings.reactCalendar.reactCalendarStrings.decade
    - typings.reactCalendar.reactCalendarStrings.year
    - typings.reactCalendar.reactCalendarStrings.month
    - typings.reactCalendar.reactCalendarStrings.day
  */
  trait RangeType extends StObject
  object RangeType {
    
    inline def century: typings.reactCalendar.reactCalendarStrings.century = "century".asInstanceOf[typings.reactCalendar.reactCalendarStrings.century]
    
    inline def day: typings.reactCalendar.reactCalendarStrings.day = "day".asInstanceOf[typings.reactCalendar.reactCalendarStrings.day]
    
    inline def decade: typings.reactCalendar.reactCalendarStrings.decade = "decade".asInstanceOf[typings.reactCalendar.reactCalendarStrings.decade]
    
    inline def month: typings.reactCalendar.reactCalendarStrings.month = "month".asInstanceOf[typings.reactCalendar.reactCalendarStrings.month]
    
    inline def year: typings.reactCalendar.reactCalendarStrings.year = "year".asInstanceOf[typings.reactCalendar.reactCalendarStrings.year]
  }
  
  trait TileArgs extends StObject {
    
    var activeStartDate: js.Date
    
    var date: js.Date
    
    var view: View
  }
  object TileArgs {
    
    inline def apply(activeStartDate: js.Date, date: js.Date, view: View): TileArgs = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type TileClassNameFunc = js.Function1[/* args */ TileArgs, ClassName]
  
  type TileContentFunc = js.Function1[/* args */ TileArgs, ReactNode]
  
  type TileDisabledFunc = js.Function1[/* args */ TileArgs, Boolean]
  
  type Value = ValuePiece | (js.Tuple2[ValuePiece, ValuePiece])
  
  type ValuePiece = js.Date | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCalendar.reactCalendarStrings.century
    - typings.reactCalendar.reactCalendarStrings.decade
    - typings.reactCalendar.reactCalendarStrings.year
    - typings.reactCalendar.reactCalendarStrings.month
  */
  trait View extends StObject
  object View {
    
    inline def century: typings.reactCalendar.reactCalendarStrings.century = "century".asInstanceOf[typings.reactCalendar.reactCalendarStrings.century]
    
    inline def decade: typings.reactCalendar.reactCalendarStrings.decade = "decade".asInstanceOf[typings.reactCalendar.reactCalendarStrings.decade]
    
    inline def month: typings.reactCalendar.reactCalendarStrings.month = "month".asInstanceOf[typings.reactCalendar.reactCalendarStrings.month]
    
    inline def year: typings.reactCalendar.reactCalendarStrings.year = "year".asInstanceOf[typings.reactCalendar.reactCalendarStrings.year]
  }
}
