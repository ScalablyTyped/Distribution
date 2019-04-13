package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EServerFlags extends js.Object

@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends js.Object {
  @js.native
  sealed trait Active
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  @js.native
  sealed trait Dedicated
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  @js.native
  sealed trait Linux
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  @js.native
  sealed trait Passworded
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  @js.native
  sealed trait Private
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  @js.native
  sealed trait Secure
    extends steamDashClientLib.steamDashClientMod.EServerFlags
  
  /* 1 */ val Active: Active with scala.Double = js.native
  /* 4 */ val Dedicated: Dedicated with scala.Double = js.native
  /* 8 */ val Linux: Linux with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val Passworded: Passworded with scala.Double = js.native
  /* 32 */ val Private: Private with scala.Double = js.native
  /* 2 */ val Secure: Secure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EServerFlags with scala.Double] = js.native
}

