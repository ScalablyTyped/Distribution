package typings.steam.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
  /* 0 */ @js.native
  object AccountLogonDenied extends TopLevel[AccountLogonDenied with Double]
  
}

