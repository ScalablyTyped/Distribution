package typings
package rruleLib.distEsmRruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RRule
  extends rruleLib.distEsmTypesMod.QueryMethods {
  var _cache: rruleLib.distEsmCacheMod.Cache | scala.Null = js.native
  var _cacheGet: js.Any = js.native
  var _len: scala.Double = js.native
  var _string: js.Any = js.native
  var emitResult: js.Any = js.native
  var options: rruleLib.distEsmTypesMod.ParsedOptions = js.native
  var origOptions: stdLib.Partial[rruleLib.distEsmTypesMod.Options] = js.native
  var rezoneIfNeeded: js.Any = js.native
  var timeset: js.Array[rruleLib.distEsmDateutilMod.defaultNs.Time] | scala.Null = js.native
  def _cacheAdd(what: rruleLib.distEsmCacheMod.CacheKeys): scala.Unit = js.native
  def _cacheAdd(what: rruleLib.distEsmCacheMod.CacheKeys, value: js.Array[stdLib.Date]): scala.Unit = js.native
  def _cacheAdd(
    what: rruleLib.distEsmCacheMod.CacheKeys,
    value: js.Array[stdLib.Date],
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  def _cacheAdd(
    what: rruleLib.distEsmCacheMod.CacheKeys,
    value: scala.Null,
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  def _cacheAdd(what: rruleLib.distEsmCacheMod.CacheKeys, value: stdLib.Date): scala.Unit = js.native
  def _cacheAdd(
    what: rruleLib.distEsmCacheMod.CacheKeys,
    value: stdLib.Date,
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: rruleLib.rruleLibStrings.all): scala.Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: rruleLib.rruleLibStrings.all, value: js.Array[stdLib.Date]): scala.Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(
    what: rruleLib.rruleLibStrings.all,
    value: js.Array[stdLib.Date],
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(
    what: rruleLib.rruleLibStrings.all,
    value: scala.Null,
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: rruleLib.rruleLibStrings.all, value: stdLib.Date): scala.Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(
    what: rruleLib.rruleLibStrings.all,
    value: stdLib.Date,
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  def _iter(iterResult: rruleLib.distEsmIterresultMod.default): stdLib.Date | js.Array[stdLib.Date] | scala.Null = js.native
  /**
    * Returns the first recurrence after the given datetime instance.
    * The inc keyword defines what happens if dt is an occurrence.
    * With inc == True, if dt itself is an occurrence, it will be returned.
    * @return Date or null
    */
  def after(dt: stdLib.Date): stdLib.Date = js.native
  def all(iterator: js.Function2[/* d */ stdLib.Date, /* len */ scala.Double, scala.Boolean]): js.Array[stdLib.Date] = js.native
  /**
    * Returns the last recurrence before the given datetime instance.
    * The inc keyword defines what happens if dt is an occurrence.
    * With inc == True, if dt itself is an occurrence, it will be returned.
    * @return Date or null
    */
  def before(dt: stdLib.Date): stdLib.Date = js.native
  /**
    * Returns all the occurrences of the rrule between after and before.
    * The inc keyword defines what happens if after and/or before are
    * themselves occurrences. With inc == True, they will be included in the
    * list, if they are found in the recurrence set.
    * @return Array
    */
  def between(after: stdLib.Date, before: stdLib.Date): js.Array[stdLib.Date] = js.native
  def between(
    after: stdLib.Date,
    before: stdLib.Date,
    inc: scala.Boolean,
    iterator: js.Function2[/* d */ stdLib.Date, /* len */ scala.Double, scala.Boolean]
  ): js.Array[stdLib.Date] = js.native
  /**
    * Returns the number of recurrences in this set. It will have go trough
    * the whole recurrence, if this hasn't been done before.
    */
  def count(): scala.Double = js.native
  def isFullyConvertibleToText(): scala.Boolean = js.native
  /**
    * Will convert all rules described in nlp:ToText
    * to text.
    */
  def toText(): java.lang.String = js.native
  def toText(gettext: rruleLib.distEsmNlpTotextMod.GetText): java.lang.String = js.native
  def toText(gettext: rruleLib.distEsmNlpTotextMod.GetText, language: rruleLib.distEsmNlpI18nMod.Language): java.lang.String = js.native
}

