package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatRoomType extends js.Object

@JSImport("steam-client", "EChatRoomType")
@js.native
object EChatRoomType extends js.Object {
  @js.native
  sealed trait Friend extends EChatRoomType
  
  @js.native
  sealed trait Lobby extends EChatRoomType
  
  @js.native
  sealed trait MUC extends EChatRoomType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomType with Double] = js.native
  /* 1 */ @js.native
  object Friend extends TopLevel[Friend with Double]
  
  /* 3 */ @js.native
  object Lobby extends TopLevel[Lobby with Double]
  
  /* 2 */ @js.native
  object MUC extends TopLevel[MUC with Double]
  
}

