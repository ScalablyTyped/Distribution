package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionState extends js.Object

@JSGlobal("Realm.Sync.ConnectionState")
@js.native
object ConnectionState extends js.Object {
  @js.native
  sealed trait Connected
    extends realmLib.RealmNs.SyncNs.ConnectionState
  
  @js.native
  sealed trait Connecting
    extends realmLib.RealmNs.SyncNs.ConnectionState
  
  @js.native
  sealed trait Disconnected
    extends realmLib.RealmNs.SyncNs.ConnectionState
  
  /* "connected" */ val Connected: Connected with java.lang.String = js.native
  /* "connecting" */ val Connecting: Connecting with java.lang.String = js.native
  /* "disconnected" */ val Disconnected: Disconnected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.SyncNs.ConnectionState with java.lang.String] = js.native
}

