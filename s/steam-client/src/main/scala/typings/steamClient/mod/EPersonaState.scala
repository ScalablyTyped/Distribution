package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaState extends js.Object
@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
  
  @js.native
  sealed trait Away extends EPersonaState
  /* 3 */ @js.native
  object Away extends TopLevel[Away with Double]
  
  @js.native
  sealed trait Busy extends EPersonaState
  /* 2 */ @js.native
  object Busy extends TopLevel[Busy with Double]
  
  @js.native
  sealed trait LookingToPlay extends EPersonaState
  /* 6 */ @js.native
  object LookingToPlay extends TopLevel[LookingToPlay with Double]
  
  @js.native
  sealed trait LookingToTrade extends EPersonaState
  /* 5 */ @js.native
  object LookingToTrade extends TopLevel[LookingToTrade with Double]
  
  @js.native
  sealed trait Max extends EPersonaState
  /* 7 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait Offline extends EPersonaState
  /* 0 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  @js.native
  sealed trait Online extends EPersonaState
  /* 1 */ @js.native
  object Online extends TopLevel[Online with Double]
  
  @js.native
  sealed trait Snooze extends EPersonaState
  /* 4 */ @js.native
  object Snooze extends TopLevel[Snooze with Double]
}
