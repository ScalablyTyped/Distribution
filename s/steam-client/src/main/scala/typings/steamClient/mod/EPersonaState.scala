package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaState extends StObject
@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
  
  @js.native
  sealed trait Away extends EPersonaState
  /* 3 */ val Away: typings.steamClient.mod.EPersonaState.Away with Double = js.native
  
  @js.native
  sealed trait Busy extends EPersonaState
  /* 2 */ val Busy: typings.steamClient.mod.EPersonaState.Busy with Double = js.native
  
  @js.native
  sealed trait LookingToPlay extends EPersonaState
  /* 6 */ val LookingToPlay: typings.steamClient.mod.EPersonaState.LookingToPlay with Double = js.native
  
  @js.native
  sealed trait LookingToTrade extends EPersonaState
  /* 5 */ val LookingToTrade: typings.steamClient.mod.EPersonaState.LookingToTrade with Double = js.native
  
  @js.native
  sealed trait Max extends EPersonaState
  /* 7 */ val Max: typings.steamClient.mod.EPersonaState.Max with Double = js.native
  
  @js.native
  sealed trait Offline extends EPersonaState
  /* 0 */ val Offline: typings.steamClient.mod.EPersonaState.Offline with Double = js.native
  
  @js.native
  sealed trait Online extends EPersonaState
  /* 1 */ val Online: typings.steamClient.mod.EPersonaState.Online with Double = js.native
  
  @js.native
  sealed trait Snooze extends EPersonaState
  /* 4 */ val Snooze: typings.steamClient.mod.EPersonaState.Snooze with Double = js.native
}
