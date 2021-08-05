package typings.reactInfiniteCalendar

import typings.reactInfiniteCalendar.mod.DateType
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.landscape
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccentColor extends StObject {
    
    var accentColor: js.UndefOr[String] = js.undefined
    
    var floatingNav: js.UndefOr[Background] = js.undefined
    
    var headerColor: js.UndefOr[String] = js.undefined
    
    var selectionColor: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[Active] = js.undefined
    
    var todayColor: js.UndefOr[String] = js.undefined
    
    var weekdayColor: js.UndefOr[String] = js.undefined
  }
  object AccentColor {
    
    inline def apply(): AccentColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccentColor]
    }
    
    extension [Self <: AccentColor](x: Self) {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setFloatingNav(value: Background): Self = StObject.set(x, "floatingNav", value.asInstanceOf[js.Any])
      
      inline def setFloatingNavUndefined: Self = StObject.set(x, "floatingNav", js.undefined)
      
      inline def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
      
      inline def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
      
      inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setTextColor(value: Active): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTodayColor(value: String): Self = StObject.set(x, "todayColor", value.asInstanceOf[js.Any])
      
      inline def setTodayColorUndefined: Self = StObject.set(x, "todayColor", js.undefined)
      
      inline def setWeekdayColor(value: String): Self = StObject.set(x, "weekdayColor", value.asInstanceOf[js.Any])
      
      inline def setWeekdayColorUndefined: Self = StObject.set(x, "weekdayColor", js.undefined)
    }
  }
  
  trait Active extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var active: js.UndefOr[String] = js.undefined
  }
  object Active {
    
    inline def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  trait Background extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var chevron: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
  }
  object Background {
    
    inline def apply(): Background = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Background]
    }
    
    extension [Self <: Background](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setChevron(value: String): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
      
      inline def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait Blank extends StObject {
    
    var blank: js.UndefOr[String] = js.undefined
    
    var headerFormat: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[DistanceInWords] = js.undefined
    
    var todayLabel: js.UndefOr[Long] = js.undefined
    
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Blank {
    
    inline def apply(): Blank = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blank]
    }
    
    extension [Self <: Blank](x: Self) {
      
      inline def setBlank(value: String): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
      
      inline def setBlankUndefined: Self = StObject.set(x, "blank", js.undefined)
      
      inline def setHeaderFormat(value: String): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
      
      inline def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
      
      inline def setLocale(value: DistanceInWords): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setTodayLabel(value: Long): Self = StObject.set(x, "todayLabel", value.asInstanceOf[js.Any])
      
      inline def setTodayLabelUndefined: Self = StObject.set(x, "todayLabel", js.undefined)
      
      inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
  
  trait DistanceInWords extends StObject {
    
    def distanceInWords(token: js.Any, count: js.Any, options: js.Any): js.Any
    
    def format(): js.Any
  }
  object DistanceInWords {
    
    inline def apply(distanceInWords: (js.Any, js.Any, js.Any) => js.Any, format: () => js.Any): DistanceInWords = {
      val __obj = js.Dynamic.literal(distanceInWords = js.Any.fromFunction3(distanceInWords), format = js.Any.fromFunction0(format))
      __obj.asInstanceOf[DistanceInWords]
    }
    
    extension [Self <: DistanceInWords](x: Self) {
      
      inline def setDistanceInWords(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "distanceInWords", js.Any.fromFunction3(value))
      
      inline def setFormat(value: () => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
    }
  }
  
  trait End extends StObject {
    
    var end: DateType
    
    var start: DateType
  }
  object End {
    
    inline def apply(end: DateType, start: DateType): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait HideYearsOnSelect extends StObject {
    
    var hideYearsOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var layout: js.UndefOr[portrait | landscape] = js.undefined
    
    var overscanMonthCount: js.UndefOr[Double] = js.undefined
    
    var shouldHeaderAnimate: js.UndefOr[Boolean] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var showMonthsForYears: js.UndefOr[Boolean] = js.undefined
    
    var showOverlay: js.UndefOr[Boolean] = js.undefined
    
    var showTodayHelper: js.UndefOr[Boolean] = js.undefined
    
    var showWeekdays: js.UndefOr[Boolean] = js.undefined
    
    var todayHelperRowOffset: js.UndefOr[Double] = js.undefined
  }
  object HideYearsOnSelect {
    
    inline def apply(): HideYearsOnSelect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideYearsOnSelect]
    }
    
    extension [Self <: HideYearsOnSelect](x: Self) {
      
      inline def setHideYearsOnSelect(value: Boolean): Self = StObject.set(x, "hideYearsOnSelect", value.asInstanceOf[js.Any])
      
      inline def setHideYearsOnSelectUndefined: Self = StObject.set(x, "hideYearsOnSelect", js.undefined)
      
      inline def setLayout(value: portrait | landscape): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setOverscanMonthCount(value: Double): Self = StObject.set(x, "overscanMonthCount", value.asInstanceOf[js.Any])
      
      inline def setOverscanMonthCountUndefined: Self = StObject.set(x, "overscanMonthCount", js.undefined)
      
      inline def setShouldHeaderAnimate(value: Boolean): Self = StObject.set(x, "shouldHeaderAnimate", value.asInstanceOf[js.Any])
      
      inline def setShouldHeaderAnimateUndefined: Self = StObject.set(x, "shouldHeaderAnimate", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowMonthsForYears(value: Boolean): Self = StObject.set(x, "showMonthsForYears", value.asInstanceOf[js.Any])
      
      inline def setShowMonthsForYearsUndefined: Self = StObject.set(x, "showMonthsForYears", js.undefined)
      
      inline def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
      
      inline def setShowTodayHelper(value: Boolean): Self = StObject.set(x, "showTodayHelper", value.asInstanceOf[js.Any])
      
      inline def setShowTodayHelperUndefined: Self = StObject.set(x, "showTodayHelper", js.undefined)
      
      inline def setShowWeekdays(value: Boolean): Self = StObject.set(x, "showWeekdays", value.asInstanceOf[js.Any])
      
      inline def setShowWeekdaysUndefined: Self = StObject.set(x, "showWeekdays", js.undefined)
      
      inline def setTodayHelperRowOffset(value: Double): Self = StObject.set(x, "todayHelperRowOffset", value.asInstanceOf[js.Any])
      
      inline def setTodayHelperRowOffsetUndefined: Self = StObject.set(x, "todayHelperRowOffset", js.undefined)
    }
  }
  
  trait Long extends StObject {
    
    var long: String
  }
  object Long {
    
    inline def apply(long: String): Long = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    extension [Self <: Long](x: Self) {
      
      inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    }
  }
}
