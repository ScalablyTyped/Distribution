package typings.steam.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EResult extends js.Object

@JSImport("steam", "EResult")
@js.native
object EResult extends js.Object {
  @js.native
  sealed trait AccountLogonDenied extends EResult
  
  /* 0 */ val AccountLogonDenied: typings.steam.steamMod.EResult.AccountLogonDenied with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
}

