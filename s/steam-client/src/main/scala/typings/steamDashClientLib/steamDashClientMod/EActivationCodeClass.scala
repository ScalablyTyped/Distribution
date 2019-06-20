package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EActivationCodeClass extends js.Object

@JSImport("steam-client", "EActivationCodeClass")
@js.native
object EActivationCodeClass extends js.Object {
  @js.native
  sealed trait DBLookup
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait Doom3CDKey
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait Steam2010Key
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait Test
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait ValveCDKey
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  @js.native
  sealed trait WonCDKey
    extends steamDashClientLib.steamDashClientMod.EActivationCodeClass
  
  /* 3 */ val DBLookup: DBLookup with scala.Double = js.native
  /* 2 */ val Doom3CDKey: Doom3CDKey with scala.Double = js.native
  /* 4294967295.0 */ val Invalid: Invalid with scala.Double = js.native
  /* 5 */ val Max: Max with scala.Double = js.native
  /* 4 */ val Steam2010Key: Steam2010Key with scala.Double = js.native
  /* 2147483647 */ val Test: Test with scala.Double = js.native
  /* 1 */ val ValveCDKey: ValveCDKey with scala.Double = js.native
  /* 0 */ val WonCDKey: WonCDKey with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EActivationCodeClass with scala.Double] = js.native
}

