package typings.rrule.cacheMod

import typings.rrule.anon.PartialIterArgs
import typings.rrule.iterresultMod.IterArgs
import typings.rrule.rruleBooleans.`false`
import typings.rrule.rruleStrings.all
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/cache", "Cache")
@js.native
class Cache () extends js.Object {
  
  /**
    * @param {String} what - all/before/after/between
    * @param {Array,Date} value - an array of dates, one date, or null
    * @param {Object?} args - _iter arguments
    */
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
  
  /**
    * @return false - not in the cache
    *         null  - cached, but zero occurrences (before/after)
    *         Date  - cached (before/after)
    *         []    - cached, but zero occurrences (all/between)
    *         [Date1, DateN] - cached (all/between)
    */
  def _cacheGet(what: CacheKeys): Date | js.Array[Date] | `false` | Null = js.native
  def _cacheGet(what: CacheKeys, args: PartialIterArgs): Date | js.Array[Date] | `false` | Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: all): Date | js.Array[Date] | `false` | Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: all, args: PartialIterArgs): Date | js.Array[Date] | `false` | Null = js.native
  
  var after: js.Array[IterArgs] = js.native
  
  var all: js.Array[Date] | PartialIterArgs | `false` = js.native
  
  var before: js.Array[IterArgs] = js.native
  
  var between: js.Array[IterArgs] = js.native
}
