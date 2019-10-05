package typings.realm.Realm.Sync

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
  
  /* 3 */ val Complete: typings.realm.Realm.Sync.SubscriptionState.Complete with Double = js.native
  /* 1 */ val Creating: typings.realm.Realm.Sync.SubscriptionState.Creating with Double = js.native
  /* 0 */ val Error: typings.realm.Realm.Sync.SubscriptionState.Error with Double = js.native
  /* 4 */ val Invalidated: typings.realm.Realm.Sync.SubscriptionState.Invalidated with Double = js.native
  /* 2 */ val Pending: typings.realm.Realm.Sync.SubscriptionState.Pending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionState with Double] = js.native
}

