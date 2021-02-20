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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccentColor extends StObject {
    
    var accentColor: js.UndefOr[String] = js.native
    
    var floatingNav: js.UndefOr[Background] = js.native
    
    var headerColor: js.UndefOr[String] = js.native
    
    var selectionColor: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[Active] = js.native
    
    var todayColor: js.UndefOr[String] = js.native
    
    var weekdayColor: js.UndefOr[String] = js.native
  }
  object AccentColor {
    
    @scala.inline
    def apply(): AccentColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccentColor]
    }
    
    @scala.inline
    implicit class AccentColorMutableBuilder[Self <: AccentColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      @scala.inline
      def setFloatingNav(value: Background): Self = StObject.set(x, "floatingNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingNavUndefined: Self = StObject.set(x, "floatingNav", js.undefined)
      
      @scala.inline
      def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
      
      @scala.inline
      def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      @scala.inline
      def setTextColor(value: Active): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTodayColor(value: String): Self = StObject.set(x, "todayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayColorUndefined: Self = StObject.set(x, "todayColor", js.undefined)
      
      @scala.inline
      def setWeekdayColor(value: String): Self = StObject.set(x, "weekdayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayColorUndefined: Self = StObject.set(x, "weekdayColor", js.undefined)
    }
  }
  
  @js.native
  trait Active extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var active: js.UndefOr[String] = js.native
  }
  object Active {
    
    @scala.inline
    def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  @js.native
  trait Background extends StObject {
    
    var background: js.UndefOr[String] = js.native
    
    var chevron: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
  }
  object Background {
    
    @scala.inline
    def apply(): Background = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setChevron(value: String): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait Blank extends StObject {
    
    var blank: js.UndefOr[String] = js.native
    
    var headerFormat: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[DistanceInWords] = js.native
    
    var todayLabel: js.UndefOr[Long] = js.native
    
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
    
    var weekdays: js.UndefOr[js.Array[String]] = js.native
  }
  object Blank {
    
    @scala.inline
    def apply(): Blank = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blank]
    }
    
    @scala.inline
    implicit class BlankMutableBuilder[Self <: Blank] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlank(value: String): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlankUndefined: Self = StObject.set(x, "blank", js.undefined)
      
      @scala.inline
      def setHeaderFormat(value: String): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
      
      @scala.inline
      def setLocale(value: DistanceInWords): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setTodayLabel(value: Long): Self = StObject.set(x, "todayLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayLabelUndefined: Self = StObject.set(x, "todayLabel", js.undefined)
      
      @scala.inline
      def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
      
      @scala.inline
      def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      @scala.inline
      def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DistanceInWords extends StObject {
    
    def distanceInWords(token: js.Any, count: js.Any, options: js.Any): js.Any = js.native
    
    def format(): js.Any = js.native
  }
  object DistanceInWords {
    
    @scala.inline
    def apply(distanceInWords: (js.Any, js.Any, js.Any) => js.Any, format: () => js.Any): DistanceInWords = {
      val __obj = js.Dynamic.literal(distanceInWords = js.Any.fromFunction3(distanceInWords), format = js.Any.fromFunction0(format))
      __obj.asInstanceOf[DistanceInWords]
    }
    
    @scala.inline
    implicit class DistanceInWordsMutableBuilder[Self <: DistanceInWords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistanceInWords(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "distanceInWords", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormat(value: () => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: DateType = js.native
    
    var start: DateType = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: DateType, start: DateType): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HideYearsOnSelect extends StObject {
    
    var hideYearsOnSelect: js.UndefOr[Boolean] = js.native
    
    var layout: js.UndefOr[portrait | landscape] = js.native
    
    var overscanMonthCount: js.UndefOr[Double] = js.native
    
    var shouldHeaderAnimate: js.UndefOr[Boolean] = js.native
    
    var showHeader: js.UndefOr[Boolean] = js.native
    
    var showMonthsForYears: js.UndefOr[Boolean] = js.native
    
    var showOverlay: js.UndefOr[Boolean] = js.native
    
    var showTodayHelper: js.UndefOr[Boolean] = js.native
    
    var showWeekdays: js.UndefOr[Boolean] = js.native
    
    var todayHelperRowOffset: js.UndefOr[Double] = js.native
  }
  object HideYearsOnSelect {
    
    @scala.inline
    def apply(): HideYearsOnSelect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideYearsOnSelect]
    }
    
    @scala.inline
    implicit class HideYearsOnSelectMutableBuilder[Self <: HideYearsOnSelect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideYearsOnSelect(value: Boolean): Self = StObject.set(x, "hideYearsOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideYearsOnSelectUndefined: Self = StObject.set(x, "hideYearsOnSelect", js.undefined)
      
      @scala.inline
      def setLayout(value: portrait | landscape): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setOverscanMonthCount(value: Double): Self = StObject.set(x, "overscanMonthCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscanMonthCountUndefined: Self = StObject.set(x, "overscanMonthCount", js.undefined)
      
      @scala.inline
      def setShouldHeaderAnimate(value: Boolean): Self = StObject.set(x, "shouldHeaderAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldHeaderAnimateUndefined: Self = StObject.set(x, "shouldHeaderAnimate", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setShowMonthsForYears(value: Boolean): Self = StObject.set(x, "showMonthsForYears", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthsForYearsUndefined: Self = StObject.set(x, "showMonthsForYears", js.undefined)
      
      @scala.inline
      def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
      
      @scala.inline
      def setShowTodayHelper(value: Boolean): Self = StObject.set(x, "showTodayHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayHelperUndefined: Self = StObject.set(x, "showTodayHelper", js.undefined)
      
      @scala.inline
      def setShowWeekdays(value: Boolean): Self = StObject.set(x, "showWeekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekdaysUndefined: Self = StObject.set(x, "showWeekdays", js.undefined)
      
      @scala.inline
      def setTodayHelperRowOffset(value: Double): Self = StObject.set(x, "todayHelperRowOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayHelperRowOffsetUndefined: Self = StObject.set(x, "todayHelperRowOffset", js.undefined)
    }
  }
  
  @js.native
  trait Long extends StObject {
    
    var long: String = js.native
  }
  object Long {
    
    @scala.inline
    def apply(long: String): Long = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    }
  }
}
