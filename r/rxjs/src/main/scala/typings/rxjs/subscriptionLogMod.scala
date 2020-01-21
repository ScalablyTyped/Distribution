package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/SubscriptionLog", JSImport.Namespace)
@js.native
object subscriptionLogMod extends js.Object {
  @js.native
  class SubscriptionLog protected () extends js.Object {
    def this(subscribedFrame: Double) = this()
    def this(subscribedFrame: Double, unsubscribedFrame: Double) = this()
    var subscribedFrame: Double = js.native
    var unsubscribedFrame: Double = js.native
  }
  
}

