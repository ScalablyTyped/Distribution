package typings.steam.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaState extends js.Object
@JSImport("steam", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
  
  @js.native
  sealed trait Online extends EPersonaState
  /* 0 */ @js.native
  object Online extends TopLevel[Online with Double]
}
