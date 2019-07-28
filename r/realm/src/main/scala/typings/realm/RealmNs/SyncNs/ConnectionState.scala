package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionState extends js.Object

@JSGlobal("Realm.Sync.ConnectionState")
@js.native
object ConnectionState extends js.Object {
  @js.native
  sealed trait Connected extends ConnectionState
  
  @js.native
  sealed trait Connecting extends ConnectionState
  
  @js.native
  sealed trait Disconnected extends ConnectionState
  
  /* "connected" */ val Connected: typings.realm.RealmNs.SyncNs.ConnectionState.Connected with String = js.native
  /* "connecting" */ val Connecting: typings.realm.RealmNs.SyncNs.ConnectionState.Connecting with String = js.native
  /* "disconnected" */ val Disconnected: typings.realm.RealmNs.SyncNs.ConnectionState.Disconnected with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionState with String] = js.native
}

