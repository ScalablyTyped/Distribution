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
  
  val Online: Online with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[steamLib.steamMod.EPersonaState with java.lang.String] = js.native
}

