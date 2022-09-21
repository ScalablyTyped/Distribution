package typings.reactWidgets

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.anon.PartialMessages
import typings.reactWidgets.messagesMod.ProcessedMessages
import typings.reactWidgets.messagesMod.UserProvidedMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizationMod {
  
  @JSImport("react-widgets/cjs/Localization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(hasDateNumberMessagesChildren: ProviderProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasDateNumberMessagesChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs/Localization", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def useLocalizer(): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")().asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: Unit, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: PartialMessages): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any]).asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: PartialMessages, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  }
  
  inline def useLocalizer(): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")().asInstanceOf[Localizer[Any, Any]]
  inline def useLocalizer(messages: Unit, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  inline def useLocalizer(messages: PartialMessages): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any]).asInstanceOf[Localizer[Any, Any]]
  inline def useLocalizer(messages: PartialMessages, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  
  /* Inlined {[ Key in react-widgets.react-widgets/cjs/Localization.RequiredDateMethods ]:? TFormat} */
  trait DateFormats[TFormat] extends StObject {
    
    var century: js.UndefOr[TFormat] = js.undefined
    
    var date: js.UndefOr[TFormat] = js.undefined
    
    var datetime: js.UndefOr[TFormat] = js.undefined
    
    var dayOfMonth: js.UndefOr[TFormat] = js.undefined
    
    var decade: js.UndefOr[TFormat] = js.undefined
    
    var header: js.UndefOr[TFormat] = js.undefined
    
    var month: js.UndefOr[TFormat] = js.undefined
    
    var time: js.UndefOr[TFormat] = js.undefined
    
    var weekday: js.UndefOr[TFormat] = js.undefined
    
    var year: js.UndefOr[TFormat] = js.undefined
  }
  object DateFormats {
    
    inline def apply[TFormat](): DateFormats[TFormat] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFormats[TFormat]]
    }
    
    extension [Self <: DateFormats[?], TFormat](x: Self & DateFormats[TFormat]) {
      
      inline def setCentury(value: TFormat): Self = StObject.set(x, "century", value.asInstanceOf[js.Any])
      
      inline def setCenturyUndefined: Self = StObject.set(x, "century", js.undefined)
      
      inline def setDate(value: TFormat): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDatetime(value: TFormat): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDayOfMonth(value: TFormat): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
      
      inline def setDecade(value: TFormat): Self = StObject.set(x, "decade", value.asInstanceOf[js.Any])
      
      inline def setDecadeUndefined: Self = StObject.set(x, "decade", js.undefined)
      
      inline def setHeader(value: TFormat): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMonth(value: TFormat): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setTime(value: TFormat): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setWeekday(value: TFormat): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: TFormat): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  /* Inlined {parse (dateString : string, format : TD | undefined): std.Date | null, firstOfWeek (): number} & {[ Key in react-widgets.react-widgets/cjs/Localization.RequiredDateMethods ]: (date : std.Date, format : TD | undefined): string} */
  @js.native
  trait DateLocalizer[TD] extends StObject {
    
    var century: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var date: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var datetime: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var dayOfMonth: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var decade: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    def firstOfWeek(): Double = js.native
    
    var header: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var month: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    def parse(dateString: String): js.Date | Null = js.native
    def parse(dateString: String, format: TD): js.Date | Null = js.native
    
    var time: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var weekday: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var year: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
  }
  
  trait DateTimePart extends StObject {
    
    var `type`: DateTimePartType
    
    var value: String
  }
  object DateTimePart {
    
    inline def apply(`type`: DateTimePartType, value: String): DateTimePart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimePart]
    }
    
    extension [Self <: DateTimePart](x: Self) {
      
      inline def setType(value: DateTimePartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.day
    - typings.reactWidgets.reactWidgetsStrings.dayPeriod
    - typings.reactWidgets.reactWidgetsStrings.era
    - typings.reactWidgets.reactWidgetsStrings.hour
    - typings.reactWidgets.reactWidgetsStrings.literal
    - typings.reactWidgets.reactWidgetsStrings.minute
    - typings.reactWidgets.reactWidgetsStrings.month
    - typings.reactWidgets.reactWidgetsStrings.second
    - typings.reactWidgets.reactWidgetsStrings.weekday
    - typings.reactWidgets.reactWidgetsStrings.year
    - typings.reactWidgets.reactWidgetsStrings.millisecond
  */
  trait DateTimePartType extends StObject
  object DateTimePartType {
    
    inline def day: typings.reactWidgets.reactWidgetsStrings.day = "day".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.day]
    
    inline def dayPeriod: typings.reactWidgets.reactWidgetsStrings.dayPeriod = "dayPeriod".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.dayPeriod]
    
    inline def era: typings.reactWidgets.reactWidgetsStrings.era = "era".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.era]
    
    inline def hour: typings.reactWidgets.reactWidgetsStrings.hour = "hour".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.hour]
    
    inline def literal: typings.reactWidgets.reactWidgetsStrings.literal = "literal".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.literal]
    
    inline def millisecond: typings.reactWidgets.reactWidgetsStrings.millisecond = "millisecond".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.millisecond]
    
    inline def minute: typings.reactWidgets.reactWidgetsStrings.minute = "minute".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.minute]
    
    inline def month: typings.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.month]
    
    inline def second: typings.reactWidgets.reactWidgetsStrings.second = "second".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.second]
    
    inline def weekday: typings.reactWidgets.reactWidgetsStrings.weekday = "weekday".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.weekday]
    
    inline def year: typings.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.year]
  }
  
  /* Inlined react-widgets.react-widgets/cjs/Localization.DateFormats<TD> & {  number :TN | undefined} */
  trait FormatterOverrides[TD, TN] extends StObject {
    
    var century: js.UndefOr[TD] = js.undefined
    
    var date: js.UndefOr[TD] = js.undefined
    
    var datetime: js.UndefOr[TD] = js.undefined
    
    var dayOfMonth: js.UndefOr[TD] = js.undefined
    
    var decade: js.UndefOr[TD] = js.undefined
    
    var header: js.UndefOr[TD] = js.undefined
    
    var month: js.UndefOr[TD] = js.undefined
    
    var number: js.UndefOr[TN] = js.undefined
    
    var time: js.UndefOr[TD] = js.undefined
    
    var weekday: js.UndefOr[TD] = js.undefined
    
    var year: js.UndefOr[TD] = js.undefined
  }
  object FormatterOverrides {
    
    inline def apply[TD, TN](): FormatterOverrides[TD, TN] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatterOverrides[TD, TN]]
    }
    
    extension [Self <: FormatterOverrides[?, ?], TD, TN](x: Self & (FormatterOverrides[TD, TN])) {
      
      inline def setCentury(value: TD): Self = StObject.set(x, "century", value.asInstanceOf[js.Any])
      
      inline def setCenturyUndefined: Self = StObject.set(x, "century", js.undefined)
      
      inline def setDate(value: TD): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDatetime(value: TD): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDayOfMonth(value: TD): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
      
      inline def setDecade(value: TD): Self = StObject.set(x, "decade", value.asInstanceOf[js.Any])
      
      inline def setDecadeUndefined: Self = StObject.set(x, "decade", js.undefined)
      
      inline def setHeader(value: TD): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMonth(value: TD): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setNumber(value: TN): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: TD): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setWeekday(value: TD): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: TD): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait Localizer[TD, TN] extends StObject {
    
    def decimalCharacter(): String = js.native
    
    def firstOfWeek(): Double = js.native
    
    def formatDate(value: js.Date, formatter: RequiredDateMethods): String = js.native
    def formatDate(value: js.Date, formatter: RequiredDateMethods, userFormat: TD): String = js.native
    
    def formatNumber(value: Double): String = js.native
    def formatNumber(value: Double, userFormat: TN): String = js.native
    
    var formatOverrides: FormatterOverrides[TD, TN] = js.native
    
    var messages: ProcessedMessages = js.native
    
    def parseDate(dateString: String): js.Date | Null = js.native
    def parseDate(dateString: String, format: TD): js.Date | Null = js.native
    
    def parseNumber(numberString: String): Double | Null = js.native
    def parseNumber(numberString: String, format: TN): Double | Null = js.native
  }
  
  @js.native
  trait NumberLocalizer[TN] extends StObject {
    
    def decimalCharacter(): String = js.native
    
    def format(value: Double): String = js.native
    def format(value: Double, format: TN): String = js.native
    
    def parse(numberString: String): Double | Null = js.native
    def parse(numberString: String, format: TN): Double | Null = js.native
  }
  
  trait ProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var date: js.UndefOr[DateLocalizer[Any]] = js.undefined
    
    var messages: js.UndefOr[UserProvidedMessages] = js.undefined
    
    var number: js.UndefOr[NumberLocalizer[Any]] = js.undefined
  }
  object ProviderProps {
    
    inline def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    extension [Self <: ProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDate(value: DateLocalizer[Any]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setMessages(value: UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setNumber(value: NumberLocalizer[Any]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.date
    - typings.reactWidgets.reactWidgetsStrings.time
    - typings.reactWidgets.reactWidgetsStrings.datetime
    - typings.reactWidgets.reactWidgetsStrings.header
    - typings.reactWidgets.reactWidgetsStrings.weekday
    - typings.reactWidgets.reactWidgetsStrings.dayOfMonth
    - typings.reactWidgets.reactWidgetsStrings.month
    - typings.reactWidgets.reactWidgetsStrings.year
    - typings.reactWidgets.reactWidgetsStrings.decade
    - typings.reactWidgets.reactWidgetsStrings.century
  */
  trait RequiredDateMethods extends StObject
  object RequiredDateMethods {
    
    inline def century: typings.reactWidgets.reactWidgetsStrings.century = "century".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.century]
    
    inline def date: typings.reactWidgets.reactWidgetsStrings.date = "date".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.date]
    
    inline def datetime: typings.reactWidgets.reactWidgetsStrings.datetime = "datetime".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.datetime]
    
    inline def dayOfMonth: typings.reactWidgets.reactWidgetsStrings.dayOfMonth = "dayOfMonth".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.dayOfMonth]
    
    inline def decade: typings.reactWidgets.reactWidgetsStrings.decade = "decade".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.decade]
    
    inline def header: typings.reactWidgets.reactWidgetsStrings.header = "header".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.header]
    
    inline def month: typings.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.month]
    
    inline def time: typings.reactWidgets.reactWidgetsStrings.time = "time".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.time]
    
    inline def weekday: typings.reactWidgets.reactWidgetsStrings.weekday = "weekday".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.weekday]
    
    inline def year: typings.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.year]
  }
}
