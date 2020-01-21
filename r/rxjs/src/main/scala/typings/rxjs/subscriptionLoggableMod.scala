package typings.rxjs

import typings.rxjs.schedulerMod.Scheduler
import typings.rxjs.subscriptionLogMod.SubscriptionLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/SubscriptionLoggable", JSImport.Namespace)
@js.native
object subscriptionLoggableMod extends js.Object {
  @js.native
  class SubscriptionLoggable () extends js.Object {
    var scheduler: Scheduler = js.native
    var subscriptions: js.Array[SubscriptionLog] = js.native
    def logSubscribedFrame(): Double = js.native
    def logUnsubscribedFrame(index: Double): Unit = js.native
  }
  
}

