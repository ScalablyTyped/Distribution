package typings.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SubscriptionState")
@js.native
object SubscriptionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.subscriptionSubscriptionMod.SubscriptionState & String] = js.native
  
  /* "Active" */ val Active: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Active & String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Initial & String = js.native
  
  /* "NotifyWait" */ val NotifyWait: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.NotifyWait & String = js.native
  
  /* "Pending" */ val Pending: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Pending & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState.Terminated & String = js.native
}
