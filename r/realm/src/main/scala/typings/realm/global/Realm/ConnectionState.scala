package typings.realm.global.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Realm.ConnectionState")
@js.native
object ConnectionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.realm.Realm.ConnectionState with String] = js.native
  
  /* "connected" */ val Connected: typings.realm.Realm.ConnectionState.Connected with String = js.native
  
  /* "connecting" */ val Connecting: typings.realm.Realm.ConnectionState.Connecting with String = js.native
  
  /* "disconnected" */ val Disconnected: typings.realm.Realm.ConnectionState.Disconnected with String = js.native
}
