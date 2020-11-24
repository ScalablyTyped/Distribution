package typings.rrule

import typings.rrule.i18nMod.Language
import typings.rrule.typesMod.ByWeekday
import typings.rrule.weekdayMod.Weekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Namespace)
@js.native
object totextMod extends js.Object {
  
  @js.native
  trait ToText extends js.Object {
    
    def DAILY(): Unit = js.native
    
    def HOURLY(): Unit = js.native
    
    def MINUTELY(): Unit = js.native
    
    def MONTHLY(): Unit = js.native
    
    def WEEKLY(): Unit = js.native
    
    def YEARLY(): Unit = js.native
    
    var _byhour: js.Any = js.native
    
    var _bymonth: js.Any = js.native
    
    var _bymonthday: js.Any = js.native
    
    var _byweekday: js.Any = js.native
    
    def add(s: String): this.type = js.native
    
    var bymonthday: js.Any = js.native
    
    var byweekday: js.Any = js.native
    
    var dateFormatter: js.Any = js.native
    
    var gettext: js.Any = js.native
    
    def isFullyConvertible(): Boolean = js.native
    
    var language: js.Any = js.native
    
    def list(arr: js.Array[ByWeekday]): String = js.native
    def list(
      arr: js.Array[ByWeekday],
      callback: js.UndefOr[scala.Nothing],
      finalDelim: js.UndefOr[scala.Nothing],
      delim: String
    ): String = js.native
    def list(arr: js.Array[ByWeekday], callback: js.UndefOr[scala.Nothing], finalDelim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: js.UndefOr[scala.Nothing], finalDelim: String, delim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText, finalDelim: js.UndefOr[scala.Nothing], delim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText, finalDelim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText, finalDelim: String, delim: String): String = js.native
    def list(arr: ByWeekday): String = js.native
    def list(
      arr: ByWeekday,
      callback: js.UndefOr[scala.Nothing],
      finalDelim: js.UndefOr[scala.Nothing],
      delim: String
    ): String = js.native
    def list(arr: ByWeekday, callback: js.UndefOr[scala.Nothing], finalDelim: String): String = js.native
    def list(arr: ByWeekday, callback: js.UndefOr[scala.Nothing], finalDelim: String, delim: String): String = js.native
    def list(arr: ByWeekday, callback: GetText): String = js.native
    def list(arr: ByWeekday, callback: GetText, finalDelim: js.UndefOr[scala.Nothing], delim: String): String = js.native
    def list(arr: ByWeekday, callback: GetText, finalDelim: String): String = js.native
    def list(arr: ByWeekday, callback: GetText, finalDelim: String, delim: String): String = js.native
    
    def monthtext(m: Double): String = js.native
    
    def nth(n: String): String = js.native
    def nth(n: Double): String = js.native
    
    var options: js.Any = js.native
    
    var origOptions: js.Any = js.native
    
    def plural(n: Double): Boolean = js.native
    
    var rrule: js.Any = js.native
    
    var text: js.Any = js.native
    
    def weekdaytext(wday: Double): String = js.native
    def weekdaytext(wday: Weekday): String = js.native
  }
  
  @js.native
  class default protected () extends ToText {
    def this(rrule: typings.rrule.mod.default) = this()
    def this(rrule: typings.rrule.mod.default, gettext: GetText) = this()
    def this(rrule: typings.rrule.mod.default, gettext: js.UndefOr[scala.Nothing], language: Language) = this()
    def this(rrule: typings.rrule.mod.default, gettext: GetText, language: Language) = this()
    def this(
      rrule: typings.rrule.mod.default,
      gettext: js.UndefOr[scala.Nothing],
      language: js.UndefOr[scala.Nothing],
      dateFormatter: DateFormatter
    ) = this()
    def this(
      rrule: typings.rrule.mod.default,
      gettext: js.UndefOr[scala.Nothing],
      language: Language,
      dateFormatter: DateFormatter
    ) = this()
    def this(
      rrule: typings.rrule.mod.default,
      gettext: GetText,
      language: js.UndefOr[scala.Nothing],
      dateFormatter: DateFormatter
    ) = this()
    def this(
      rrule: typings.rrule.mod.default,
      gettext: GetText,
      language: Language,
      dateFormatter: DateFormatter
    ) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var IMPLEMENTED: js.Array[js.Array[String]] = js.native
    
    /**
      * Test whether the rrule can be fully converted to text.
      * @param {RRule} rrule
      * @return {Boolean}
      */
    def isFullyConvertible(rrule: typings.rrule.mod.default): Boolean = js.native
  }
  
  type DateFormatter = js.Function3[/* year */ Double, /* month */ String, /* day */ Double, String]
  
  type GetText = js.Function1[/* id */ String | Double | Weekday, String]
}
