package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionState extends js.Object

@JSGlobal("Realm.Sync.SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  @js.native
  sealed trait Complete
    extends realmLib.RealmNs.SyncNs.SubscriptionState
  
  @js.native
  sealed trait Creating
    extends realmLib.RealmNs.SyncNs.SubscriptionState
  
  @js.native
  sealed trait Error
    extends realmLib.RealmNs.SyncNs.SubscriptionState
  
  @js.native
  sealed trait Invalidated
    extends realmLib.RealmNs.SyncNs.SubscriptionState
  
  @js.native
  sealed trait Pending
    extends realmLib.RealmNs.SyncNs.SubscriptionState
  
  /* 3 */ val Complete: Complete with scala.Double = js.native
  /* 1 */ val Creating: Creating with scala.Double = js.native
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 4 */ val Invalidated: Invalidated with scala.Double = js.native
  /* 2 */ val Pending: Pending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[realmLib.RealmNs.SyncNs.SubscriptionState with scala.Double] = js.native
}

