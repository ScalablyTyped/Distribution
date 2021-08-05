package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.anon.PartialRRuleStrOptions
import typings.rrule.i18nMod.Language
import typings.rrule.weekdayMod.WeekdayStr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rrule", JSImport.Default)
  @js.native
  class default ()
    extends typings.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: Unit, noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rrule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule", "default.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule", "default.FR")
    @js.native
    val FR: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule", "default.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule", "default.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule", "default.MO")
    @js.native
    val MO: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule", "default.SA")
    @js.native
    val SA: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule", "default.SU")
    @js.native
    val SU: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.TH")
    @js.native
    val TH: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.TU")
    @js.native
    val TU: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.WE")
    @js.native
    val WE: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule", "default.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    inline def fromString(str: String): typings.rrule.rruleMod.RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.rruleMod.RRule]
    
    inline def fromText(text: String): typings.rrule.rruleMod.RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.rruleMod.RRule]
    inline def fromText(text: String, language: Language): typings.rrule.rruleMod.RRule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typings.rrule.rruleMod.RRule]
    
    @JSImport("rrule", "default.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    inline def optionsToString(options: PartialOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsToString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "default.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    inline def parseString(rfcString: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(rfcString.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    inline def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    inline def parseText(text: String): PartialOptions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions | Null]
    inline def parseText(text: String, language: Language): PartialOptions | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions | Null]
  }
  
  @JSImport("rrule", "Frequency")
  @js.native
  object Frequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rrule.typesMod.Frequency & Double] = js.native
    
    /* 3 */ val DAILY: typings.rrule.typesMod.Frequency.DAILY & Double = js.native
    
    /* 4 */ val HOURLY: typings.rrule.typesMod.Frequency.HOURLY & Double = js.native
    
    /* 5 */ val MINUTELY: typings.rrule.typesMod.Frequency.MINUTELY & Double = js.native
    
    /* 1 */ val MONTHLY: typings.rrule.typesMod.Frequency.MONTHLY & Double = js.native
    
    /* 6 */ val SECONDLY: typings.rrule.typesMod.Frequency.SECONDLY & Double = js.native
    
    /* 2 */ val WEEKLY: typings.rrule.typesMod.Frequency.WEEKLY & Double = js.native
    
    /* 0 */ val YEARLY: typings.rrule.typesMod.Frequency.YEARLY & Double = js.native
  }
  
  @JSImport("rrule", "RRule")
  @js.native
  class RRule ()
    extends typings.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: Unit, noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  object RRule {
    
    @JSImport("rrule", "RRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule", "RRule.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule", "RRule.FR")
    @js.native
    val FR: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule", "RRule.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule", "RRule.MO")
    @js.native
    val MO: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.SA")
    @js.native
    val SA: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.SU")
    @js.native
    val SU: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.TH")
    @js.native
    val TH: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.TU")
    @js.native
    val TU: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.WE")
    @js.native
    val WE: typings.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    inline def fromString(str: String): typings.rrule.rruleMod.RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.rruleMod.RRule]
    
    inline def fromText(text: String): typings.rrule.rruleMod.RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.rruleMod.RRule]
    inline def fromText(text: String, language: Language): typings.rrule.rruleMod.RRule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typings.rrule.rruleMod.RRule]
    
    @JSImport("rrule", "RRule.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    inline def optionsToString(options: PartialOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsToString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "RRule.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    inline def parseString(rfcString: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(rfcString.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    inline def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    inline def parseText(text: String): PartialOptions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions | Null]
    inline def parseText(text: String, language: Language): PartialOptions | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions | Null]
  }
  
  @JSImport("rrule", "RRuleSet")
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class RRuleSet ()
    extends typings.rrule.rrulesetMod.default {
    def this(noCache: Boolean) = this()
  }
  
  @JSImport("rrule", "Weekday")
  @js.native
  class Weekday protected ()
    extends typings.rrule.weekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  /* static members */
  object Weekday {
    
    @JSImport("rrule", "Weekday")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStr(str: WeekdayStr): typings.rrule.weekdayMod.Weekday = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStr")(str.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.weekdayMod.Weekday]
  }
  
  inline def rrulestr(s: String): typings.rrule.rruleMod.default | typings.rrule.rrulesetMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.rruleMod.default | typings.rrule.rrulesetMod.default]
  inline def rrulestr(s: String, options: PartialRRuleStrOptions): typings.rrule.rruleMod.default | typings.rrule.rrulesetMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rrule.rruleMod.default | typings.rrule.rrulesetMod.default]
}
