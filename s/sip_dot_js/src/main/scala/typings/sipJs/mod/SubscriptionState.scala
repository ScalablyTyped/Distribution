package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.subscriptionStateMod.SubscriptionState with String] = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.subscriptionStateMod.SubscriptionState.Initial with String = js.native
  
  /* "NotifyWait" */ val NotifyWait: typings.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait with String = js.native
  
  /* "Subscribed" */ val Subscribed: typings.sipJs.subscriptionStateMod.SubscriptionState.Subscribed with String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.subscriptionStateMod.SubscriptionState.Terminated with String = js.native
}
