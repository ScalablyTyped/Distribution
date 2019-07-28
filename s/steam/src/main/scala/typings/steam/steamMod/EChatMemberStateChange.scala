package typings.steam.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatMemberStateChange extends js.Object

@JSImport("steam", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  @js.native
  sealed trait Kicked extends EChatMemberStateChange
  
  /* 0 */ val Kicked: typings.steam.steamMod.EChatMemberStateChange.Kicked with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatMemberStateChange with Double] = js.native
}

