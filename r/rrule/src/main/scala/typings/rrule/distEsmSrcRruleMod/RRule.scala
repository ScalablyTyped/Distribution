package typings.rrule.distEsmSrcRruleMod

import typings.rrule.distEsmSrcCacheMod.Cache
import typings.rrule.distEsmSrcCacheMod.CacheKeys
import typings.rrule.distEsmSrcIterresultMod.IterArgs
import typings.rrule.distEsmSrcNlpI18nMod.Language
import typings.rrule.distEsmSrcNlpTotextMod.DateFormatter
import typings.rrule.distEsmSrcNlpTotextMod.GetText
import typings.rrule.distEsmSrcTypesMod.IterResultType
import typings.rrule.distEsmSrcTypesMod.Options
import typings.rrule.distEsmSrcTypesMod.ParsedOptions
import typings.rrule.distEsmSrcTypesMod.QueryMethodTypes
import typings.rrule.distEsmSrcTypesMod.QueryMethods
import typings.rrule.rruleStrings.all
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

