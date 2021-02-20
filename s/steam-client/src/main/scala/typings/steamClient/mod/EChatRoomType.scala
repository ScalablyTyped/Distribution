package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomType extends StObject
@JSImport("steam-client", "EChatRoomType")
@js.native
object EChatRoomType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomType with Double] = js.native
  
  @js.native
  sealed trait Friend extends EChatRoomType
  /* 1 */ val Friend: typings.steamClient.mod.EChatRoomType.Friend with Double = js.native
  
  @js.native
  sealed trait Lobby extends EChatRoomType
  /* 3 */ val Lobby: typings.steamClient.mod.EChatRoomType.Lobby with Double = js.native
  
  @js.native
  sealed trait MUC extends EChatRoomType
  /* 2 */ val MUC: typings.steamClient.mod.EChatRoomType.MUC with Double = js.native
}
