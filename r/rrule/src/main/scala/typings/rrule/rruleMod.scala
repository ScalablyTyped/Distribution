package typings.rrule

import typings.rrule.distEsmSrcNlpI18nMod.Language
import typings.rrule.distEsmSrcRrulestrMod.RRuleStrOptions
import typings.rrule.distEsmSrcTypesMod.Options
import typings.rrule.distEsmSrcWeekdayMod.WeekdayStr
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule", JSImport.Namespace)
@js.native
object rruleMod extends js.Object {
  @js.native
  class RRule ()
    extends typings.rrule.distEsmSrcRruleMod.default {
    def this(options: Partial[Options]) = this()
    def this(options: Partial[Options], noCache: Boolean) = this()
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class RRuleSet ()
    extends typings.rrule.distEsmSrcRrulesetMod.default {
    def this(noCache: Boolean) = this()
  }
  
  @js.native
  class Weekday protected ()
    extends typings.rrule.distEsmSrcWeekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  
  @js.native
  class default ()
    extends typings.rrule.distEsmSrcRruleMod.default {
    def this(options: Partial[Options]) = this()
    def this(options: Partial[Options], noCache: Boolean) = this()
  }
  
  def rrulestr(s: String): typings.rrule.distEsmSrcRruleMod.default | typings.rrule.distEsmSrcRrulesetMod.default = js.native
  def rrulestr(s: String, options: Partial[RRuleStrOptions]): typings.rrule.distEsmSrcRruleMod.default | typings.rrule.distEsmSrcRrulesetMod.default = js.native
  @js.native
  object Frequency extends js.Object {
    /* 3 */ val DAILY: typings.rrule.distEsmSrcTypesMod.Frequency.DAILY with Double = js.native
    /* 4 */ val HOURLY: typings.rrule.distEsmSrcTypesMod.Frequency.HOURLY with Double = js.native
    /* 5 */ val MINUTELY: typings.rrule.distEsmSrcTypesMod.Frequency.MINUTELY with Double = js.native
    /* 1 */ val MONTHLY: typings.rrule.distEsmSrcTypesMod.Frequency.MONTHLY with Double = js.native
    /* 6 */ val SECONDLY: typings.rrule.distEsmSrcTypesMod.Frequency.SECONDLY with Double = js.native
    /* 2 */ val WEEKLY: typings.rrule.distEsmSrcTypesMod.Frequency.WEEKLY with Double = js.native
    /* 0 */ val YEARLY: typings.rrule.distEsmSrcTypesMod.Frequency.YEARLY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rrule.distEsmSrcTypesMod.Frequency with Double] = js.native
  }
  
  /* static members */
  @js.native
  object RRule extends js.Object {
    val DAILY: String | Double = js.native
    val FR: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TH: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TU: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WE: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
    def fromString(str: String): typings.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String): typings.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String, language: Language): typings.rrule.distEsmSrcRruleMod.RRule = js.native
    def optionsToString(options: Partial[Options]): String = js.native
    def parseString(rfcString: String): Partial[Options] = js.native
    def parseText(text: String): Partial[Options] | Null = js.native
    def parseText(text: String, language: Language): Partial[Options] | Null = js.native
  }
  
  /* static members */
  @js.native
  object Weekday extends js.Object {
    def fromStr(str: WeekdayStr): typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DAILY: String | Double = js.native
    val FR: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TH: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TU: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WE: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
    def fromString(str: String): typings.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String): typings.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String, language: Language): typings.rrule.distEsmSrcRruleMod.RRule = js.native
    def optionsToString(options: Partial[Options]): String = js.native
    def parseString(rfcString: String): Partial[Options] = js.native
    def parseText(text: String): Partial[Options] | Null = js.native
    def parseText(text: String, language: Language): Partial[Options] | Null = js.native
  }
  
}

