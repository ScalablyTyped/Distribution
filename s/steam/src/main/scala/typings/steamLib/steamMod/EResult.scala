package typings
package steamLib.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EResult extends js.Object

@JSImport("steam", "EResult")
@js.native
object EResult extends js.Object {
  @js.native
  sealed trait AccountLogonDenied
    extends steamLib.steamMod.EResult
  
  /* 0 */ val AccountLogonDenied: AccountLogonDenied with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamLib.steamMod.EResult with scala.Double] = js.native
}

