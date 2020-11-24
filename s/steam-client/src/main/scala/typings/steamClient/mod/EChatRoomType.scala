package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomType extends js.Object
@JSImport("steam-client", "EChatRoomType")
@js.native
object EChatRoomType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomType with Double] = js.native
  
  @js.native
  sealed trait Friend extends EChatRoomType
  /* 1 */ @js.native
  object Friend extends TopLevel[Friend with Double]
  
  @js.native
  sealed trait Lobby extends EChatRoomType
  /* 3 */ @js.native
  object Lobby extends TopLevel[Lobby with Double]
  
  @js.native
  sealed trait MUC extends EChatRoomType
  /* 2 */ @js.native
  object MUC extends TopLevel[MUC with Double]
}
