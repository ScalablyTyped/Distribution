package typings.rrule

import typings.rrule.distEsmSrcCacheMod.CacheKeys
import typings.rrule.distEsmSrcIterresultMod.IterArgs
import typings.rrule.rruleNumbers.`false`
import typings.rrule.rruleStrings.all
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/cache", JSImport.Namespace)
@js.native
object distEsmSrcCacheMod extends js.Object {
  @js.native
  class Cache () extends js.Object {
    var after: js.Array[IterArgs] = js.native
    var all: js.Array[Date] | Partial[IterArgs] | `false` = js.native
    var before: js.Array[IterArgs] = js.native
    var between: js.Array[IterArgs] = js.native
    def _cacheAdd(what: CacheKeys): Unit = js.native
    /**
      * @param {String} what - all/before/after/between
      * @param {Array,Date} value - an array of dates, one date, or null
      * @param {Object?} args - _iter arguments
      */
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
    /**
      * @return false - not in the cache
      *         null  - cached, but zero occurrences (before/after)
      *         Date  - cached (before/after)
      *         []    - cached, but zero occurrences (all/between)
      *         [Date1, DateN] - cached (all/between)
      */
    def _cacheGet(what: CacheKeys): Date | js.Array[Date] | `false` | Null = js.native
    def _cacheGet(what: CacheKeys, args: Partial[IterArgs]): Date | js.Array[Date] | `false` | Null = js.native
    @JSName("_cacheGet")
    def _cacheGet_all(what: all): Date | js.Array[Date] | `false` | Null = js.native
    @JSName("_cacheGet")
    def _cacheGet_all(what: all, args: Partial[IterArgs]): Date | js.Array[Date] | `false` | Null = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrule.rruleStrings.before
    - typings.rrule.rruleStrings.after
    - typings.rrule.rruleStrings.between
  */
  trait CacheKeys extends js.Object
  
}

