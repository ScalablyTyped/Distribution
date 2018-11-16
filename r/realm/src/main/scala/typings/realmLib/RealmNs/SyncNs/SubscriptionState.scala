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
  
  val Complete: Complete with java.lang.String = js.native
  val Creating: Creating with java.lang.String = js.native
  val Error: Error with java.lang.String = js.native
  val Invalidated: Invalidated with java.lang.String = js.native
  val Pending: Pending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.SyncNs.SubscriptionState with java.lang.String] = js.native
}

