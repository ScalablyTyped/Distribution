package typings
package sipDotJsLib.libCoreSubscriptionSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionState extends js.Object

@JSImport("sip.js/lib/core/subscription/subscription", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  @js.native
  sealed trait Active
    extends sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState
  
  @js.native
  sealed trait Initial
    extends sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState
  
  @js.native
  sealed trait NotifyWait
    extends sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState
  
  @js.native
  sealed trait Pending
    extends sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState
  
  @js.native
  sealed trait Terminated
    extends sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState
  
  /* "Active" */ val Active: Active with java.lang.String = js.native
  /* "Initial" */ val Initial: Initial with java.lang.String = js.native
  /* "NotifyWait" */ val NotifyWait: NotifyWait with java.lang.String = js.native
  /* "Pending" */ val Pending: Pending with java.lang.String = js.native
  /* "Terminated" */ val Terminated: Terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState with java.lang.String
  ] = js.native
}

