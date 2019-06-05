package typings
package sipDotJsLib.libCoreSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/subscription", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  /* "Active" */ val Active: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active with java.lang.String = js.native
  /* "Initial" */ val Initial: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial with java.lang.String = js.native
  /* "NotifyWait" */ val NotifyWait: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait with java.lang.String = js.native
  /* "Pending" */ val Pending: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending with java.lang.String = js.native
  /* "Terminated" */ val Terminated: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState with java.lang.String
  ] = js.native
}

