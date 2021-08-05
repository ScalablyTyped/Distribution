package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object umdMod {
  
  /**
    * @typedef {Object} Rx.Scheduler
    * @property {Scheduler} queue Schedules on a queue in the current event frame
    * (trampoline scheduler). Use this for iteration operations.
    * @property {Scheduler} asap Schedules on the micro task queue, which is the same
    * queue used for promises. Basically after the current job, but before the next
    * job. Use this for asynchronous conversions.
    * @property {Scheduler} async Schedules work with `setInterval`. Use this for
    * time-based operations.
    * @property {Scheduler} animationFrame Schedules work with `requestAnimationFrame`.
    * Use this for synchronizing with the platform's painting
    */
  object Scheduler {
    
    @JSImport("rxjs-compat/umd", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs-compat/umd", "Scheduler.animationFrame")
    @js.native
    def animationFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    inline def animationFrame_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs-compat/umd", "Scheduler.asap")
    @js.native
    def asap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    inline def asap_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asap")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs-compat/umd", "Scheduler.async")
    @js.native
    def async: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    inline def async_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs-compat/umd", "Scheduler.queue")
    @js.native
    def queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    inline def queue_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queue")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @typedef {Object} Rx.Symbol
    * @property {Symbol|string} rxSubscriber A symbol to use as a property name to
    * retrieve an "Rx safe" Observer from an object. "Rx safety" can be defined as
    * an object that has all of the traits of an Rx Subscriber, including the
    * ability to add and remove subscriptions to the subscription chain and
    * guarantees involving event triggering (can't "next" after unsubscription,
    * etc).
    * @property {Symbol|string} observable A symbol to use as a property name to
    * retrieve an Observable as defined by the [ECMAScript "Observable" spec](https://github.com/zenparsing/es-observable).
    * @property {Symbol|string} iterator The ES6 symbol to use as a property name
    * to retrieve an iterator from an object.
    */
  object Symbol {
    
    @JSImport("rxjs-compat/umd", "Symbol")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs-compat/umd", "Symbol.iterator")
    @js.native
    def iterator: js.Symbol = js.native
    inline def iterator_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterator")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs-compat/umd", "Symbol.observable")
    @js.native
    def observable: String | js.Symbol = js.native
    inline def observable_=(x: String | js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observable")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs-compat/umd", "Symbol.rxSubscriber")
    @js.native
    def rxSubscriber: String | js.Symbol = js.native
    inline def rxSubscriber_=(x: String | js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rxSubscriber")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs-compat/umd", "ajax")
  @js.native
  val ajax: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ajax */ js.Any = js.native
  
  @JSImport("rxjs-compat/umd", "operators")
  @js.native
  val operators: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _operators */ js.Any = js.native
  
  @JSImport("rxjs-compat/umd", "testing")
  @js.native
  val testing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _testing */ js.Any = js.native
  
  @JSImport("rxjs-compat/umd", "webSocket")
  @js.native
  val webSocket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _webSocket */ js.Any = js.native
}
