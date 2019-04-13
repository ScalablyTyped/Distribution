package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EUniverse extends js.Object

@JSImport("steam-client", "EUniverse")
@js.native
object EUniverse extends js.Object {
  @js.native
  sealed trait Beta
    extends steamDashClientLib.steamDashClientMod.EUniverse
  
  @js.native
  sealed trait Dev
    extends steamDashClientLib.steamDashClientMod.EUniverse
  
  @js.native
  sealed trait Internal
    extends steamDashClientLib.steamDashClientMod.EUniverse
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EUniverse
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EUniverse
  
  @js.native
  sealed trait Public
    extends steamDashClientLib.steamDashClientMod.EUniverse
  
  /* 2 */ val Beta: Beta with scala.Double = js.native
  /* 4 */ val Dev: Dev with scala.Double = js.native
  /* 3 */ val Internal: Internal with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 5 */ val Max: Max with scala.Double = js.native
  /* 1 */ val Public: Public with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EUniverse with scala.Double] = js.native
}

