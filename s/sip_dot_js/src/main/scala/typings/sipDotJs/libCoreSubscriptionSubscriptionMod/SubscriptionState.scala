package typings.sipDotJs.libCoreSubscriptionSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionState extends js.Object

@JSImport("sip.js/lib/core/subscription/subscription", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  @js.native
  sealed trait Active extends SubscriptionState
  
  @js.native
  sealed trait Initial extends SubscriptionState
  
  @js.native
  sealed trait NotifyWait extends SubscriptionState
  
  @js.native
  sealed trait Pending extends SubscriptionState
  
  @js.native
  sealed trait Terminated extends SubscriptionState
  
  /* "Active" */ val Active: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
  /* "Initial" */ val Initial: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
  /* "NotifyWait" */ val NotifyWait: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
  /* "Pending" */ val Pending: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
}

