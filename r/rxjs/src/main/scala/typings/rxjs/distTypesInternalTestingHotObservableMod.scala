package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import typings.rxjs.distTypesInternalSubjectMod.Subject
import typings.rxjs.distTypesInternalTestingSubscriptionLogMod.SubscriptionLog
import typings.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalTestingHotObservableMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rxjs.distTypesInternalTestingSubscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @JSImport("rxjs/dist/types/internal/testing/HotObservable", "HotObservable")
  @js.native
  open class HotObservable[T] protected () extends Subject[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
    
    def logSubscribedFrame(): Double = js.native
    
    def logUnsubscribedFrame(index: Double): Unit = js.native
    
    var messages: js.Array[TestMessage] = js.native
    
    var scheduler: Scheduler = js.native
    
    def setup(): Unit = js.native
    
    var subscriptions: js.Array[SubscriptionLog] = js.native
  }
}
