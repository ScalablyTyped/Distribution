package typings.steam.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends js.Object
@JSImport("steam", "EResult")
@js.native
object EResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
  
  @js.native
  sealed trait AccountLogonDenied extends EResult
  /* 0 */ @js.native
  object AccountLogonDenied extends TopLevel[AccountLogonDenied with Double]
}
