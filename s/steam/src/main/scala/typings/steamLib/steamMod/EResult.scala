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
  
  val AccountLogonDenied: AccountLogonDenied with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[steamLib.steamMod.EResult with java.lang.String] = js.native
}

