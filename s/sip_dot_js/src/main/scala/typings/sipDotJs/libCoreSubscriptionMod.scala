package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/subscription", JSImport.Namespace)
@js.native
object libCoreSubscriptionMod extends js.Object {
  @js.native
  object SubscriptionState extends js.Object {
    /* "Active" */ val Active: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
    /* "Initial" */ val Initial: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
    /* "NotifyWait" */ val NotifyWait: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
    /* "Pending" */ val Pending: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState with String
      ] = js.native
  }
  
}

