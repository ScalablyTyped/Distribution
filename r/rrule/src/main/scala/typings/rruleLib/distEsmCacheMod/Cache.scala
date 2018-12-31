package typings
package rruleLib.distEsmCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/cache", "Cache")
@js.native
class Cache () extends js.Object {
  var after: js.Array[rruleLib.distEsmIterresultMod.IterArgs] = js.native
  var all: js.Array[stdLib.Date] | stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs] | rruleLib.rruleLibNumbers.`false` = js.native
  var before: js.Array[rruleLib.distEsmIterresultMod.IterArgs] = js.native
  var between: js.Array[rruleLib.distEsmIterresultMod.IterArgs] = js.native
  def _cacheAdd(what: CacheKeys): scala.Unit = js.native
  /**
    * @param {String} what - all/before/after/between
    * @param {Array,Date} value - an array of dates, one date, or null
    * @param {Object?} args - _iter arguments
    */
  def _cacheAdd(what: CacheKeys, value: js.Array[stdLib.Date]): scala.Unit = js.native
  def _cacheAdd(
    what: CacheKeys,
    value: js.Array[stdLib.Date],
    args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]
  ): scala.Unit = js.native
  def _cacheAdd(what: CacheKeys, value: scala.Null, args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]): scala.Unit = js.native
  def _cacheAdd(what: CacheKeys, value: stdLib.Date): scala.Unit = js.native
  def _cacheAdd(what: CacheKeys, value: stdLib.Date, args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]): scala.Unit = js.native
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
  /**
    * @return false - not in the cache
    *         null  - cached, but zero occurrences (before/after)
    *         Date  - cached (before/after)
    *         []    - cached, but zero occurrences (all/between)
    *         [Date1, DateN] - cached (all/between)
    */
  def _cacheGet(what: CacheKeys): stdLib.Date | js.Array[stdLib.Date] | rruleLib.rruleLibNumbers.`false` | scala.Null = js.native
  def _cacheGet(what: CacheKeys, args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]): stdLib.Date | js.Array[stdLib.Date] | rruleLib.rruleLibNumbers.`false` | scala.Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: rruleLib.rruleLibStrings.all): stdLib.Date | js.Array[stdLib.Date] | rruleLib.rruleLibNumbers.`false` | scala.Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: rruleLib.rruleLibStrings.all, args: stdLib.Partial[rruleLib.distEsmIterresultMod.IterArgs]): stdLib.Date | js.Array[stdLib.Date] | rruleLib.rruleLibNumbers.`false` | scala.Null = js.native
}

