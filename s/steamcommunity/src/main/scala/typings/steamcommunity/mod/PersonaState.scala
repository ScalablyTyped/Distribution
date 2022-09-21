package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaState extends StObject
@JSImport("steamcommunity", "PersonaState")
@js.native
object PersonaState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaState & Double] = js.native
  
  @js.native
  sealed trait Away
    extends StObject
       with PersonaState
  /* 3 */ val Away: typings.steamcommunity.mod.PersonaState.Away & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with PersonaState
  /* 2 */ val Busy: typings.steamcommunity.mod.PersonaState.Busy & Double = js.native
  
  @js.native
  sealed trait Invisible
    extends StObject
       with PersonaState
  /* 7 */ val Invisible: typings.steamcommunity.mod.PersonaState.Invisible & Double = js.native
  
  @js.native
  sealed trait LookingToPlay
    extends StObject
       with PersonaState
  /* 6 */ val LookingToPlay: typings.steamcommunity.mod.PersonaState.LookingToPlay & Double = js.native
  
  @js.native
  sealed trait LookingToTrade
    extends StObject
       with PersonaState
  /* 5 */ val LookingToTrade: typings.steamcommunity.mod.PersonaState.LookingToTrade & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with PersonaState
  /* 0 */ val Offline: typings.steamcommunity.mod.PersonaState.Offline & Double = js.native
  
  @js.native
  sealed trait Online
    extends StObject
       with PersonaState
  /* 1 */ val Online: typings.steamcommunity.mod.PersonaState.Online & Double = js.native
  
  @js.native
  sealed trait Snooze
    extends StObject
       with PersonaState
  /* 4 */ val Snooze: typings.steamcommunity.mod.PersonaState.Snooze & Double = js.native
}
