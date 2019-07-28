package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EUniverse extends js.Object

@JSImport("steam-client", "EUniverse")
@js.native
object EUniverse extends js.Object {
  @js.native
  sealed trait Beta extends EUniverse
  
  @js.native
  sealed trait Dev extends EUniverse
  
  @js.native
  sealed trait Internal extends EUniverse
  
  @js.native
  sealed trait Invalid extends EUniverse
  
  @js.native
  sealed trait Max extends EUniverse
  
  @js.native
  sealed trait Public extends EUniverse
  
  /* 2 */ val Beta: typings.steamDashClient.steamDashClientMod.EUniverse.Beta with Double = js.native
  /* 4 */ val Dev: typings.steamDashClient.steamDashClientMod.EUniverse.Dev with Double = js.native
  /* 3 */ val Internal: typings.steamDashClient.steamDashClientMod.EUniverse.Internal with Double = js.native
  /* 0 */ val Invalid: typings.steamDashClient.steamDashClientMod.EUniverse.Invalid with Double = js.native
  /* 5 */ val Max: typings.steamDashClient.steamDashClientMod.EUniverse.Max with Double = js.native
  /* 1 */ val Public: typings.steamDashClient.steamDashClientMod.EUniverse.Public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUniverse with Double] = js.native
}

