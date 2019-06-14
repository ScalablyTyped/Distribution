package typings
package steamLib.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatMemberStateChange extends js.Object

@JSImport("steam", "EChatMemberStateChange")
@js.native
object EChatMemberStateChange extends js.Object {
  @js.native
  sealed trait Kicked
    extends steamLib.steamMod.EChatMemberStateChange
  
  /* 0 */ val Kicked: Kicked with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamLib.steamMod.EChatMemberStateChange with scala.Double] = js.native
}

