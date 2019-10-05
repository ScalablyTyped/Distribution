package typings.sipDotJs

import typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState
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
    
    /* "Initial" */ val Initial: typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Initial with String = js.native
    /* "NotifyWait" */ val NotifyWait: typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.NotifyWait with String = js.native
    /* "Subscribed" */ val Subscribed: typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Subscribed with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
  }
  
}

