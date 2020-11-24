package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/subscription-state", JSImport.Namespace)
@js.native
object subscriptionStateMod extends js.Object {
  
  @js.native
  sealed trait SubscriptionState extends js.Object
  @js.native
  object SubscriptionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    
    @js.native
    sealed trait Initial extends SubscriptionState
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    /* "NotifyWait" */ @js.native
    object NotifyWait extends TopLevel[NotifyWait with String]
    
    @js.native
    sealed trait Subscribed extends SubscriptionState
    /* "Subscribed" */ @js.native
    object Subscribed extends TopLevel[Subscribed with String]
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
  }
}
