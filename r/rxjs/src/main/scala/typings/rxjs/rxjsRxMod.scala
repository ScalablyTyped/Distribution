package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/Rx", JSImport.Namespace)
@js.native
object rxjsRxMod extends js.Object {
  
  val operators: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _operators */ js.Any = js.native
  
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
  @js.native
  object Scheduler extends js.Object {
    
    var animationFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    
    var asap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    
    var async: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
    
    var queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
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
  @js.native
  object Symbol extends js.Object {
    
    var iterator: js.Symbol = js.native
    
    var observable: String | js.Symbol = js.native
    
    var rxSubscriber: String | js.Symbol = js.native
  }
}
