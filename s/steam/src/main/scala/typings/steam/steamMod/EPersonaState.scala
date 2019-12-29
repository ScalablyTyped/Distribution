package typings.steam.steamMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Online extends EPersonaState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
  /* 0 */ @js.native
  object Online extends TopLevel[Online with Double]
  
}

