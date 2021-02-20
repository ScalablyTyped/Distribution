package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionLogMod {
  
  @JSImport("rxjs/internal/testing/SubscriptionLog", "SubscriptionLog")
  @js.native
  class SubscriptionLog protected () extends StObject {
    def this(subscribedFrame: Double) = this()
    def this(subscribedFrame: Double, unsubscribedFrame: Double) = this()
    
    var subscribedFrame: Double = js.native
    
    var unsubscribedFrame: Double = js.native
  }
}
