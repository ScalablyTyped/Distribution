package typings.realm.Realm.Sync

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
  
  /* "connected" */ val Connected: typings.realm.Realm.Sync.ConnectionState.Connected with String = js.native
  /* "connecting" */ val Connecting: typings.realm.Realm.Sync.ConnectionState.Connecting with String = js.native
  /* "disconnected" */ val Disconnected: typings.realm.Realm.Sync.ConnectionState.Disconnected with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionState with String] = js.native
}

