package typings
package steamLib.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Online
    extends steamLib.steamMod.EPersonaState
  
  /* 0 */ val Online: Online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamLib.steamMod.EPersonaState with scala.Double] = js.native
}

