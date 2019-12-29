package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Away extends EPersonaState
  
  @js.native
  sealed trait Busy extends EPersonaState
  
  @js.native
  sealed trait LookingToPlay extends EPersonaState
  
  @js.native
  sealed trait LookingToTrade extends EPersonaState
  
  @js.native
  sealed trait Max extends EPersonaState
  
  @js.native
  sealed trait Offline extends EPersonaState
  
  @js.native
  sealed trait Online extends EPersonaState
  
  @js.native
  sealed trait Snooze extends EPersonaState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
  /* 3 */ @js.native
  object Away extends TopLevel[Away with Double]
  
  /* 2 */ @js.native
  object Busy extends TopLevel[Busy with Double]
  
  /* 6 */ @js.native
  object LookingToPlay extends TopLevel[LookingToPlay with Double]
  
  /* 5 */ @js.native
  object LookingToTrade extends TopLevel[LookingToTrade with Double]
  
  /* 7 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 0 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 1 */ @js.native
  object Online extends TopLevel[Online with Double]
  
  /* 4 */ @js.native
  object Snooze extends TopLevel[Snooze with Double]
  
}

