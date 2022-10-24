package typings.reactWidgets

import typings.reactWidgets.anon.Culture
import typings.reactWidgets.anon.CultureUndefined
import typings.reactWidgets.esmLocalizationMod.DateTimePart
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIntlLocalizerMod {
  
  /**
    * A `react-widgets` Localizer using native `Intl` APIs.
    *
    */
  @JSImport("react-widgets/esm/IntlLocalizer", "DateLocalizer")
  @js.native
  open class DateLocalizer ()
    extends StObject
       with IntlDateLocalizer {
    def this(param0: Culture) = this()
  }
  
  /**
    * A number localization strategy based on `Intl.NumberFormat`.
    */
  @JSImport("react-widgets/esm/IntlLocalizer", "NumberLocalizer")
  @js.native
  open class NumberLocalizer ()
    extends StObject
       with IntlNumberLocalizer {
    def this(param0: CultureUndefined) = this()
  }
  
  /**
    * A `react-widgets` Localizer using native `Intl` APIs.
    *
    */
  /* Inlined parent react-widgets.react-widgets/esm/Localization.DateLocalizer<std.Intl.DateTimeFormatOptions> */
  @js.native
  trait IntlDateLocalizer extends StObject {
    
    var century: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def century(date: js.Date): String = js.native
    def century(date: js.Date, format: UserDateFormat): String = js.native
    
    var culture: js.UndefOr[String] = js.native
    
    var date: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def date(date: js.Date): String = js.native
    def date(date: js.Date, format: UserDateFormat): String = js.native
    
    var datetime: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def datetime(date: js.Date): String = js.native
    def datetime(date: js.Date, format: UserDateFormat): String = js.native
    
    var dayOfMonth: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def dayOfMonth(date: js.Date): String = js.native
    def dayOfMonth(date: js.Date, format: UserDateFormat): String = js.native
    
    var decade: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def decade(date: js.Date): String = js.native
    def decade(date: js.Date, format: UserDateFormat): String = js.native
    
    def firstOfWeek(): Double = js.native
    
    def footer(date: js.Date): String = js.native
    def footer(date: js.Date, format: UserDateFormat): String = js.native
    
    var header: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def header(date: js.Date): String = js.native
    def header(date: js.Date, format: UserDateFormat): String = js.native
    
    var month: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def month(date: js.Date): String = js.native
    def month(date: js.Date, format: UserDateFormat): String = js.native
    
    def parse(dateString: String, format: DateTimeFormatOptions): js.Date | Null = js.native
    def parse(value: String): js.Date | Null = js.native
    
    var time: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def time(date: js.Date): String = js.native
    def time(date: js.Date, format: UserDateFormat): String = js.native
    
    def toFormattedParts(date: js.Date): js.Array[DateTimePart] = js.native
    def toFormattedParts(date: js.Date, format: DateTimeFormatOptions): js.Array[DateTimePart] = js.native
    
    var weekday: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def weekday(date: js.Date): String = js.native
    def weekday(date: js.Date, format: UserDateFormat): String = js.native
    
    var year: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[DateTimeFormatOptions], String] = js.native
    def year(date: js.Date): String = js.native
    def year(date: js.Date, format: UserDateFormat): String = js.native
  }
  
  /**
    * A number localization strategy based on `Intl.NumberFormat`.
    */
  @js.native
  trait IntlNumberLocalizer
    extends StObject
       with typings.reactWidgets.esmLocalizationMod.NumberLocalizer[NumberFormatOptions] {
    
    var culture: js.UndefOr[String] = js.native
    
    def format(num: Double, format: UserNumberFormat): String = js.native
  }
  
  type UserDateFormat = DateTimeFormatOptions | (js.Function2[/* date */ js.Date, /* culture */ js.UndefOr[String], String])
  
  type UserNumberFormat = NumberFormatOptions | (js.Function2[/* num */ Double, /* culture */ js.UndefOr[String], String])
}
