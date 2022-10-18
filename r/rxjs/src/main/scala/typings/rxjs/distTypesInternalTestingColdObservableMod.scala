package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTestingSubscriptionLogMod.SubscriptionLog
import typings.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalTestingColdObservableMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rxjs.distTypesInternalTestingSubscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @JSImport("rxjs/dist/types/internal/testing/ColdObservable", "ColdObservable")
  @js.native
  open class ColdObservable[T] protected () extends Observable[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
    
    def logSubscribedFrame(): Double = js.native
    
    def logUnsubscribedFrame(index: Double): Unit = js.native
    
    var messages: js.Array[TestMessage] = js.native
    
    def scheduleMessages(subscriber: Subscriber[Any]): Unit = js.native
    
    var scheduler: Scheduler = js.native
    
    var subscriptions: js.Array[SubscriptionLog] = js.native
  }
}
