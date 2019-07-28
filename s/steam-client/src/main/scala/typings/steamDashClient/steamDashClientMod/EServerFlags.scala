package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EServerFlags extends js.Object

@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends js.Object {
  @js.native
  sealed trait Active extends EServerFlags
  
  @js.native
  sealed trait Dedicated extends EServerFlags
  
  @js.native
  sealed trait Linux extends EServerFlags
  
  @js.native
  sealed trait None extends EServerFlags
  
  @js.native
  sealed trait Passworded extends EServerFlags
  
  @js.native
  sealed trait Private extends EServerFlags
  
  @js.native
  sealed trait Secure extends EServerFlags
  
  /* 1 */ val Active: typings.steamDashClient.steamDashClientMod.EServerFlags.Active with Double = js.native
  /* 4 */ val Dedicated: typings.steamDashClient.steamDashClientMod.EServerFlags.Dedicated with Double = js.native
  /* 8 */ val Linux: typings.steamDashClient.steamDashClientMod.EServerFlags.Linux with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EServerFlags.None with Double = js.native
  /* 16 */ val Passworded: typings.steamDashClient.steamDashClientMod.EServerFlags.Passworded with Double = js.native
  /* 32 */ val Private: typings.steamDashClient.steamDashClientMod.EServerFlags.Private with Double = js.native
  /* 2 */ val Secure: typings.steamDashClient.steamDashClientMod.EServerFlags.Secure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags with Double] = js.native
}

