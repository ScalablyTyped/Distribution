package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EActivationCodeClass extends js.Object

@JSImport("steam-client", "EActivationCodeClass")
@js.native
object EActivationCodeClass extends js.Object {
  @js.native
  sealed trait DBLookup extends EActivationCodeClass
  
  @js.native
  sealed trait Doom3CDKey extends EActivationCodeClass
  
  @js.native
  sealed trait Invalid extends EActivationCodeClass
  
  @js.native
  sealed trait Max extends EActivationCodeClass
  
  @js.native
  sealed trait Steam2010Key extends EActivationCodeClass
  
  @js.native
  sealed trait Test extends EActivationCodeClass
  
  @js.native
  sealed trait ValveCDKey extends EActivationCodeClass
  
  @js.native
  sealed trait WonCDKey extends EActivationCodeClass
  
  /* 3 */ val DBLookup: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.DBLookup with Double = js.native
  /* 2 */ val Doom3CDKey: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Doom3CDKey with Double = js.native
  /* 4294967295.0 */ val Invalid: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Invalid with Double = js.native
  /* 5 */ val Max: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Max with Double = js.native
  /* 4 */ val Steam2010Key: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Steam2010Key with Double = js.native
  /* 2147483647 */ val Test: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Test with Double = js.native
  /* 1 */ val ValveCDKey: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.ValveCDKey with Double = js.native
  /* 0 */ val WonCDKey: typings.steamDashClient.steamDashClientMod.EActivationCodeClass.WonCDKey with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EActivationCodeClass with Double] = js.native
}

