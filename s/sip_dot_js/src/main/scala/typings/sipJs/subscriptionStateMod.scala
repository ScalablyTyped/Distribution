package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionStateMod {
  
  @js.native
  sealed trait SubscriptionState extends StObject
  @JSImport("sip.js/lib/api/subscription-state", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    
    @js.native
    sealed trait Initial extends SubscriptionState
    /* "Initial" */ val Initial: typings.sipJs.subscriptionStateMod.SubscriptionState.Initial with String = js.native
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    /* "NotifyWait" */ val NotifyWait: typings.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait with String = js.native
    
    @js.native
    sealed trait Subscribed extends SubscriptionState
    /* "Subscribed" */ val Subscribed: typings.sipJs.subscriptionStateMod.SubscriptionState.Subscribed with String = js.native
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    /* "Terminated" */ val Terminated: typings.sipJs.subscriptionStateMod.SubscriptionState.Terminated with String = js.native
  }
}
