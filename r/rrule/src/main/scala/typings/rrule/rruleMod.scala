package typings.rrule

import typings.rrule.anon.PartialIterArgs
import typings.rrule.anon.PartialOptions
import typings.rrule.cacheMod.Cache
import typings.rrule.cacheMod.CacheKeys
import typings.rrule.i18nMod.Language
import typings.rrule.rruleStrings.all
import typings.rrule.rruleStrings.byeaster
import typings.rrule.rruleStrings.byhour
import typings.rrule.rruleStrings.byminute
import typings.rrule.rruleStrings.bymonth
import typings.rrule.rruleStrings.bymonthday
import typings.rrule.rruleStrings.bynmonthday
import typings.rrule.rruleStrings.bynweekday
import typings.rrule.rruleStrings.bysecond
import typings.rrule.rruleStrings.bysetpos
import typings.rrule.rruleStrings.byweekday
import typings.rrule.rruleStrings.byweekno
import typings.rrule.rruleStrings.byyearday
import typings.rrule.rruleStrings.count
import typings.rrule.rruleStrings.dtstart
import typings.rrule.rruleStrings.freq
import typings.rrule.rruleStrings.interval
import typings.rrule.rruleStrings.tzid
import typings.rrule.rruleStrings.until
import typings.rrule.rruleStrings.wkst
import typings.rrule.totextMod.DateFormatter
import typings.rrule.totextMod.GetText
import typings.rrule.typesMod.IterResultType
import typings.rrule.typesMod.Options
import typings.rrule.typesMod.ParsedOptions
import typings.rrule.typesMod.QueryMethodTypes
import typings.rrule.typesMod.QueryMethods
import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rruleMod {
  
  @JSImport("rrule/dist/esm/src/rrule", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RRule {
    def this(options: PartialOptions) = this()
    def this(options: Unit, noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
    
    /* CompleteClass */
    override def after(date: Date, inc: Boolean): Date = js.native
    
    /* CompleteClass */
    override def all(): js.Array[Date] = js.native
    
    /* CompleteClass */
    override def before(date: Date, inc: Boolean): Date = js.native
    
    /* CompleteClass */
    override def between(after: Date, before: Date, inc: Boolean): js.Array[Date] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("rrule/dist/esm/src/rrule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.FR")
    @js.native
    val FR: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.MO")
    @js.native
    val MO: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.SA")
    @js.native
    val SA: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.SU")
    @js.native
    val SU: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.TH")
    @js.native
    val TH: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.TU")
    @js.native
    val TU: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.WE")
    @js.native
    val WE: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    @scala.inline
    def fromString(str: String): RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[RRule]
    
    @scala.inline
    def fromText(text: String): RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[RRule]
    @scala.inline
    def fromText(text: String, language: Language): RRule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[RRule]
    
    @JSImport("rrule/dist/esm/src/rrule", "default.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    @scala.inline
    def optionsToString(options: PartialOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsToString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "default.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    @scala.inline
    def parseString(rfcString: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(rfcString.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
    @scala.inline
    def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def parseText(text: String): PartialOptions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions | Null]
    @scala.inline
    def parseText(text: String, language: Language): PartialOptions | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions | Null]
  }
  
  @JSImport("rrule/dist/esm/src/rrule", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: Options = js.native
  
  object Days {
    
    @JSImport("rrule/dist/esm/src/rrule", "Days")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.FR")
    @js.native
    def FR: Weekday = js.native
    @scala.inline
    def FR_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FR")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.MO")
    @js.native
    def MO: Weekday = js.native
    @scala.inline
    def MO_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MO")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.SA")
    @js.native
    def SA: Weekday = js.native
    @scala.inline
    def SA_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SA")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.SU")
    @js.native
    def SU: Weekday = js.native
    @scala.inline
    def SU_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SU")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.TH")
    @js.native
    def TH: Weekday = js.native
    @scala.inline
    def TH_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TH")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.TU")
    @js.native
    def TU: Weekday = js.native
    @scala.inline
    def TU_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TU")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.WE")
    @js.native
    def WE: Weekday = js.native
    @scala.inline
    def WE_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rrule/dist/esm/src/rrule", "defaultKeys")
  @js.native
  val defaultKeys: js.Array[
    freq | dtstart | interval | wkst | count | until | tzid | bysetpos | bymonth | bymonthday | bynmonthday | byyearday | byweekno | byweekday | bynweekday | byhour | byminute | bysecond | byeaster
  ] = js.native
  
  @js.native
  trait RRule
    extends StObject
       with QueryMethods {
    
    var _cache: Cache | Null = js.native
    
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[Date], args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Date, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[Date], args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Date, args: PartialIterArgs): Unit = js.native
    
    var _cacheGet: js.Any = js.native
    
    /* protected */ def _iter[M /* <: QueryMethodTypes */](iterResult: typings.rrule.iterresultMod.default[M]): IterResultType[M] = js.native
    
    /**
      * Returns the first recurrence after the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      * @return Date or null
      */
    def after(dt: Date): Date = js.native
    
    def all(iterator: js.Function2[/* d */ Date, /* len */ Double, Boolean]): js.Array[Date] = js.native
    
    /**
      * Returns the last recurrence before the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      * @return Date or null
      */
    def before(dt: Date): Date = js.native
    
    /**
      * Returns all the occurrences of the rrule between after and before.
      * The inc keyword defines what happens if after and/or before are
      * themselves occurrences. With inc == True, they will be included in the
      * list, if they are found in the recurrence set.
      * @return Array
      */
    def between(after: Date, before: Date): js.Array[Date] = js.native
    def between(
      after: Date,
      before: Date,
      inc: Boolean,
      iterator: js.Function2[/* d */ Date, /* len */ Double, Boolean]
    ): js.Array[Date] = js.native
    def between(
      after: Date,
      before: Date,
      inc: Unit,
      iterator: js.Function2[/* d */ Date, /* len */ Double, Boolean]
    ): js.Array[Date] = js.native
    
    /**
      * Returns the number of recurrences in this set. It will have go trough
      * the whole recurrence, if this hasn't been done before.
      */
    def count(): Double = js.native
    
    def isFullyConvertibleToText(): Boolean = js.native
    
    var options: ParsedOptions = js.native
    
    var origOptions: PartialOptions = js.native
    
    /**
      * Will convert all rules described in nlp:ToText
      * to text.
      */
    def toText(): String = js.native
    def toText(gettext: Unit, language: Unit, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: Unit, language: Language): String = js.native
    def toText(gettext: Unit, language: Language, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: GetText): String = js.native
    def toText(gettext: GetText, language: Unit, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: GetText, language: Language): String = js.native
    def toText(gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
  }
}
