package typings.sipDotJs

import org.scalablytyped.runtime.TopLevel
import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState
import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Initial
import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.NotifyWait
import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Subscribed
import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/subscription-state", JSImport.Namespace)
@js.native
object libApiSubscriptionDashStateMod extends js.Object {
  @js.native
  sealed trait SubscriptionState extends js.Object
  
  @js.native
  object SubscriptionState extends js.Object {
    @js.native
    sealed trait Initial extends SubscriptionState
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    
    @js.native
    sealed trait Subscribed extends SubscriptionState
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    /* "NotifyWait" */ @js.native
    object NotifyWait extends TopLevel[NotifyWait with String]
    
    /* "Subscribed" */ @js.native
    object Subscribed extends TopLevel[Subscribed with String]
    
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
  }
  
}

