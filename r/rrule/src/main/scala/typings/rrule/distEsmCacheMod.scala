package typings.rrule

import typings.rrule.anon.PartialIterArgs
import typings.rrule.distEsmIterresultMod.IterArgs
import typings.rrule.rruleBooleans.`false`
import typings.rrule.rruleStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmCacheMod {
  
  @JSImport("rrule/dist/esm/cache", "Cache")
  @js.native
  open class Cache () extends StObject {
    
    /**
      * @param {String} what - all/before/after/between
      * @param {Array,Date} value - an array of dates, one date, or null
      * @param {Object?} args - _iter arguments
      */
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date, args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
    
    /**
      * @return false - not in the cache
      * @return null  - cached, but zero occurrences (before/after)
      * @return Date  - cached (before/after)
      * @return []    - cached, but zero occurrences (all/between)
      * @return [Date1, DateN] - cached (all/between)
      */
    def _cacheGet(what: CacheKeys): js.Date | js.Array[js.Date] | `false` | Null = js.native
    def _cacheGet(what: CacheKeys, args: PartialIterArgs): js.Date | js.Array[js.Date] | `false` | Null = js.native
    @JSName("_cacheGet")
    def _cacheGet_all(what: all): js.Date | js.Array[js.Date] | `false` | Null = js.native
    @JSName("_cacheGet")
    def _cacheGet_all(what: all, args: PartialIterArgs): js.Date | js.Array[js.Date] | `false` | Null = js.native
    
    var after: js.Array[IterArgs] = js.native
    
    var all: js.Array[js.Date] | PartialIterArgs | `false` = js.native
    
    var before: js.Array[IterArgs] = js.native
    
    var between: js.Array[IterArgs] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrule.rruleStrings.before
    - typings.rrule.rruleStrings.after
    - typings.rrule.rruleStrings.between
  */
  trait CacheKeys extends StObject
  object CacheKeys {
    
    inline def after: typings.rrule.rruleStrings.after = "after".asInstanceOf[typings.rrule.rruleStrings.after]
    
    inline def before: typings.rrule.rruleStrings.before = "before".asInstanceOf[typings.rrule.rruleStrings.before]
    
    inline def between: typings.rrule.rruleStrings.between = "between".asInstanceOf[typings.rrule.rruleStrings.between]
  }
}
