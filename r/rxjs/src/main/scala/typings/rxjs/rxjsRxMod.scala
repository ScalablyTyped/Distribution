package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxjsRxMod {
  
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
    
    @JSImport("rxjs/Rx", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/Rx", "Scheduler.animationFrame")
    @js.native
    def animationFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    @scala.inline
    def animationFrame_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/Rx", "Scheduler.asap")
    @js.native
    def asap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    @scala.inline
    def asap_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asap")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/Rx", "Scheduler.async")
    @js.native
    def async: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    @scala.inline
    def async_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/Rx", "Scheduler.queue")
    @js.native
    def queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    @scala.inline
    def queue_=(
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
    
    @JSImport("rxjs/Rx", "Symbol")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/Rx", "Symbol.iterator")
    @js.native
    def iterator: js.Symbol = js.native
    @scala.inline
    def iterator_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterator")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/Rx", "Symbol.observable")
    @js.native
    def observable: String | js.Symbol = js.native
    @scala.inline
    def observable_=(x: String | js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observable")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/Rx", "Symbol.rxSubscriber")
    @js.native
    def rxSubscriber: String | js.Symbol = js.native
    @scala.inline
    def rxSubscriber_=(x: String | js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rxSubscriber")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/Rx", "operators")
  @js.native
  val operators: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _operators */ js.Any = js.native
}
