package typings.rxjs

import typings.rxjs.schedulerMod.Scheduler
import typings.rxjs.subscriptionLogMod.SubscriptionLog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionLoggableMod {
  
  @JSImport("rxjs/internal/testing/SubscriptionLoggable", "SubscriptionLoggable")
  @js.native
  class SubscriptionLoggable () extends StObject {
    
    def logSubscribedFrame(): Double = js.native
    
    def logUnsubscribedFrame(index: Double): Unit = js.native
    
    var scheduler: Scheduler = js.native
    
    var subscriptions: js.Array[SubscriptionLog] = js.native
  }
}
