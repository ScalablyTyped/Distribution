package typings.rrule

import typings.rrule.distEsmSrcCacheMod.Cache
import typings.rrule.distEsmSrcCacheMod.CacheKeys
import typings.rrule.distEsmSrcIterresultMod.IterArgs
import typings.rrule.distEsmSrcNlpI18nMod.Language
import typings.rrule.distEsmSrcNlpTotextMod.DateFormatter
import typings.rrule.distEsmSrcNlpTotextMod.GetText
import typings.rrule.distEsmSrcRruleMod.RRule
import typings.rrule.distEsmSrcTypesMod.Frequency
import typings.rrule.distEsmSrcTypesMod.IterResultType
import typings.rrule.distEsmSrcTypesMod.Options
import typings.rrule.distEsmSrcTypesMod.ParsedOptions
import typings.rrule.distEsmSrcTypesMod.QueryMethodTypes
import typings.rrule.distEsmSrcTypesMod.QueryMethods
import typings.rrule.distEsmSrcWeekdayMod.Weekday
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
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/rrule", JSImport.Namespace)
@js.native
object distEsmSrcRruleMod extends js.Object {
  @js.native
  trait RRule extends QueryMethods {
    var _cache: Cache | Null = js.native
    var _cacheGet: js.Any = js.native
    var options: ParsedOptions = js.native
    var origOptions: Partial[Options] = js.native
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[Date], args: Partial[IterArgs]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: Partial[IterArgs]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Date, args: Partial[IterArgs]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[Date], args: Partial[IterArgs]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: Partial[IterArgs]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Date, args: Partial[IterArgs]): Unit = js.native
    /* protected */ def _iter[M /* <: QueryMethodTypes */](iterResult: typings.rrule.distEsmSrcIterresultMod.default[M]): IterResultType[M] = js.native
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
    /**
      * Returns the number of recurrences in this set. It will have go trough
      * the whole recurrence, if this hasn't been done before.
      */
    def count(): Double = js.native
    def isFullyConvertibleToText(): Boolean = js.native
    /**
      * Will convert all rules described in nlp:ToText
      * to text.
      */
    def toText(): String = js.native
    def toText(gettext: GetText): String = js.native
    def toText(gettext: GetText, language: Language): String = js.native
    def toText(gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
  }
  
  @js.native
  class default () extends RRule {
    def this(options: Partial[Options]) = this()
    def this(options: Partial[Options], noCache: Boolean) = this()
    /* CompleteClass */
    override def after(date: Date, inc: Boolean): Date = js.native
    /* CompleteClass */
    override def all(): js.Array[Date] = js.native
    /* CompleteClass */
    override def before(date: Date, inc: Boolean): Date = js.native
    /* CompleteClass */
    override def between(after: Date, before: Date, inc: Boolean): js.Array[Date] = js.native
  }
  
  val DEFAULT_OPTIONS: Options = js.native
  val defaultKeys: js.Array[
    until | bymonthday | freq | dtstart | interval | wkst | count | tzid | bysetpos | bymonth | bynmonthday | byyearday | byweekno | byweekday | bynweekday | byhour | byminute | bysecond | byeaster
  ] = js.native
  @js.native
  object Days extends js.Object {
    var FR: Weekday = js.native
    var MO: Weekday = js.native
    var SA: Weekday = js.native
    var SU: Weekday = js.native
    var TH: Weekday = js.native
    var TU: Weekday = js.native
    var WE: Weekday = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DAILY: Frequency = js.native
    val FR: Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: Frequency = js.native
    val MINUTELY: Frequency = js.native
    val MO: Weekday = js.native
    val MONTHLY: Frequency = js.native
    val SA: Weekday = js.native
    val SECONDLY: Frequency = js.native
    val SU: Weekday = js.native
    val TH: Weekday = js.native
    val TU: Weekday = js.native
    val WE: Weekday = js.native
    val WEEKLY: Frequency = js.native
    val YEARLY: Frequency = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
    def fromString(str: String): RRule = js.native
    def fromText(text: String): RRule = js.native
    def fromText(text: String, language: Language): RRule = js.native
    def optionsToString(options: Partial[Options]): String = js.native
    def parseString(rfcString: String): Partial[Options] = js.native
    def parseText(text: String): Partial[Options] | Null = js.native
    def parseText(text: String, language: Language): Partial[Options] | Null = js.native
  }
  
}

