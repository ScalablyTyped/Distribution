package typings.rrule

import typings.rrule.distEsmNlpI18nMod.Language
import typings.rrule.distEsmRruleMod.RRule
import typings.rrule.distEsmTypesMod.ByWeekday
import typings.rrule.distEsmWeekdayMod.Weekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmNlpTotextMod {
  
  @JSImport("rrule/dist/esm/nlp/totext", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ToText {
    def this(rrule: RRule) = this()
    def this(rrule: RRule, gettext: GetText) = this()
    def this(rrule: RRule, gettext: Unit, language: Language) = this()
    def this(rrule: RRule, gettext: GetText, language: Language) = this()
    def this(rrule: RRule, gettext: Unit, language: Unit, dateFormatter: DateFormatter) = this()
    def this(rrule: RRule, gettext: Unit, language: Language, dateFormatter: DateFormatter) = this()
    def this(rrule: RRule, gettext: GetText, language: Unit, dateFormatter: DateFormatter) = this()
    def this(rrule: RRule, gettext: GetText, language: Language, dateFormatter: DateFormatter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rrule/dist/esm/nlp/totext", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/nlp/totext", "default.IMPLEMENTED")
    @js.native
    def IMPLEMENTED: js.Array[js.Array[String]] = js.native
    inline def IMPLEMENTED_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPLEMENTED")(x.asInstanceOf[js.Any])
    
    /**
      * Test whether the rrule can be fully converted to text.
      *
      * @param {RRule} rrule
      * @return {Boolean}
      */
    inline def isFullyConvertible(rrule: RRule): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullyConvertible")(rrule.asInstanceOf[js.Any]).asInstanceOf[Boolean]
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
    
    /* private */ var _byhour: Any = js.native
    
    /* private */ var _bymonth: Any = js.native
    
    /* private */ var _bymonthday: Any = js.native
    
    /* private */ var _byweekday: Any = js.native
    
    def add(s: String): this.type = js.native
    
    /* private */ var bymonthday: Any = js.native
    
    /* private */ var byweekday: Any = js.native
    
    /* private */ var dateFormatter: Any = js.native
    
    /* private */ var gettext: Any = js.native
    
    def isFullyConvertible(): Boolean = js.native
    
    /* private */ var language: Any = js.native
    
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
    
    /* private */ var options: Any = js.native
    
    /* private */ var origOptions: Any = js.native
    
    def plural(n: Double): Boolean = js.native
    
    /* private */ var rrule: Any = js.native
    
    /* private */ var text: Any = js.native
    
    def weekdaytext(wday: Double): String = js.native
    def weekdaytext(wday: Weekday): String = js.native
  }
}
