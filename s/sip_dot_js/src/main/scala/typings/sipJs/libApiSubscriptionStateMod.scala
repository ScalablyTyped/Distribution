package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSubscriptionStateMod {
  
  @js.native
  sealed trait SubscriptionState extends StObject
  @JSImport("sip.js/lib/api/subscription-state", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState & String] = js.native
    
    @js.native
    sealed trait Initial
      extends StObject
         with SubscriptionState
    /* "Initial" */ val Initial: typings.sipJs.libApiSubscriptionStateMod.SubscriptionState.Initial & String = js.native
    
    @js.native
    sealed trait NotifyWait
      extends StObject
         with SubscriptionState
    /* "NotifyWait" */ val NotifyWait: typings.sipJs.libApiSubscriptionStateMod.SubscriptionState.NotifyWait & String = js.native
    
    @js.native
    sealed trait Subscribed
      extends StObject
         with SubscriptionState
    /* "Subscribed" */ val Subscribed: typings.sipJs.libApiSubscriptionStateMod.SubscriptionState.Subscribed & String = js.native
    
    @js.native
    sealed trait Terminated
      extends StObject
         with SubscriptionState
    /* "Terminated" */ val Terminated: typings.sipJs.libApiSubscriptionStateMod.SubscriptionState.Terminated & String = js.native
  }
}
