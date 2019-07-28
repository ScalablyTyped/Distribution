package typings.steam.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Online extends EPersonaState
  
  /* 0 */ val Online: typings.steam.steamMod.EPersonaState.Online with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
}

