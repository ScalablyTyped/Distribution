package typings.realm.Realm.Sync

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionState extends js.Object

@JSGlobal("Realm.Sync.SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  @js.native
  sealed trait Complete extends SubscriptionState
  
  @js.native
  sealed trait Creating extends SubscriptionState
  
  @js.native
  sealed trait Error extends SubscriptionState
  
  @js.native
  sealed trait Invalidated extends SubscriptionState
  
  @js.native
  sealed trait Pending extends SubscriptionState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionState with Double] = js.native
  /* 3 */ @js.native
  object Complete extends TopLevel[Complete with Double]
  
  /* 1 */ @js.native
  object Creating extends TopLevel[Creating with Double]
  
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 4 */ @js.native
  object Invalidated extends TopLevel[Invalidated with Double]
  
  /* 2 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
}

