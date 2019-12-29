package typings.realm.Realm.Sync

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionState with String] = js.native
  /* "connected" */ @js.native
  object Connected extends TopLevel[Connected with String]
  
  /* "connecting" */ @js.native
  object Connecting extends TopLevel[Connecting with String]
  
  /* "disconnected" */ @js.native
  object Disconnected extends TopLevel[Disconnected with String]
  
}

