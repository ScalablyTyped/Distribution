package typings.rrule

import typings.rrule.i18nMod.Language
import typings.rrule.typesMod.ByWeekday
import typings.rrule.weekdayMod.Weekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object totextMod {
  
  @JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ToText {
    def this(rrule: typings.rrule.mod.default) = this()
    def this(rrule: typings.rrule.mod.default, gettext: GetText) = this()
    def this(rrule: typings.rrule.mod.default, gettext: Unit, language: Language) = this()
    def this(rrule: typings.rrule.mod.default, gettext: GetText, language: Language) = this()
    def this(rrule: typings.rrule.mod.default, gettext: Unit, language: Unit, dateFormatter: DateFormatter) = this()
    def this(rrule: typings.rrule.mod.default, gettext: Unit, language: Language, dateFormatter: DateFormatter) = this()
    def this(rrule: typings.rrule.mod.default, gettext: GetText, language: Unit, dateFormatter: DateFormatter) = this()
    def this(
      rrule: typings.rrule.mod.default,
      gettext: GetText,
      language: Language,
      dateFormatter: DateFormatter
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/src/nlp/totext", "default.IMPLEMENTED")
    @js.native
    def IMPLEMENTED: js.Array[js.Array[String]] = js.native
    inline def IMPLEMENTED_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPLEMENTED")(x.asInstanceOf[js.Any])
    
    /**
      * Test whether the rrule can be fully converted to text.
      * @param {RRule} rrule
      * @return {Boolean}
      */
    inline def isFullyConvertible(rrule: typings.rrule.mod.default): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullyConvertible")(rrule.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  type DateFormatter = js.Function3[/* year */ Double, /* month */ String, /* day */ Double, String]
  
  type GetText = js.Function1[/* id */ String | Double | Weekday, String]
  
  @js.native
  trait ToText extends StObject {
    
    def DAILY(): Unit = js.native
    
    def HOURLY(): Unit = js.native
    
    def MINUTELY(): Unit = js.native
    
    def MONTHLY(): Unit = js.native
    
    def WEEKLY(): Unit = js.native
    
    def YEARLY(): Unit = js.native
    
    /* private */ var _byhour: js.Any = js.native
    
    /* private */ var _bymonth: js.Any = js.native
    
    /* private */ var _bymonthday: js.Any = js.native
    
    /* private */ var _byweekday: js.Any = js.native
    
    def add(s: String): this.type = js.native
    
    /* private */ var bymonthday: js.Any = js.native
    
    /* private */ var byweekday: js.Any = js.native
    
    /* private */ var dateFormatter: js.Any = js.native
    
    /* private */ var gettext: js.Any = js.native
    
    def isFullyConvertible(): Boolean = js.native
    
    /* private */ var language: js.Any = js.native
    
    def list(arr: js.Array[ByWeekday]): String = js.native
    def list(arr: js.Array[ByWeekday], callback: Unit, finalDelim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: Unit, finalDelim: String, delim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: Unit, finalDelim: Unit, delim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText, finalDelim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText, finalDelim: String, delim: String): String = js.native
    def list(arr: js.Array[ByWeekday], callback: GetText, finalDelim: Unit, delim: String): String = js.native
    def list(arr: ByWeekday): String = js.native
    def list(arr: ByWeekday, callback: Unit, finalDelim: String): String = js.native
    def list(arr: ByWeekday, callback: Unit, finalDelim: String, delim: String): String = js.native
    def list(arr: ByWeekday, callback: Unit, finalDelim: Unit, delim: String): String = js.native
    def list(arr: ByWeekday, callback: GetText): String = js.native
    def list(arr: ByWeekday, callback: GetText, finalDelim: String): String = js.native
    def list(arr: ByWeekday, callback: GetText, finalDelim: String, delim: String): String = js.native
    def list(arr: ByWeekday, callback: GetText, finalDelim: Unit, delim: String): String = js.native
    
    def monthtext(m: Double): String = js.native
    
    def nth(n: String): String = js.native
    def nth(n: Double): String = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var origOptions: js.Any = js.native
    
    def plural(n: Double): Boolean = js.native
    
    /* private */ var rrule: js.Any = js.native
    
    /* private */ var text: js.Any = js.native
    
    def weekdaytext(wday: Double): String = js.native
    def weekdaytext(wday: Weekday): String = js.native
  }
}
