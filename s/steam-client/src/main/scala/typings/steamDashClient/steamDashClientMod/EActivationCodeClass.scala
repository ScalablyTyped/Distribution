package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.DBLookup
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Doom3CDKey
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Invalid
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Max
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Steam2010Key
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.Test
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.ValveCDKey
import typings.steamDashClient.steamDashClientMod.EActivationCodeClass.WonCDKey
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EActivationCodeClass with Double] = js.native
  /* 3 */ @js.native
  object DBLookup extends TopLevel[DBLookup with Double]
  
  /* 2 */ @js.native
  object Doom3CDKey extends TopLevel[Doom3CDKey with Double]
  
  /* 4294967295.0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 4 */ @js.native
  object Steam2010Key extends TopLevel[Steam2010Key with Double]
  
  /* 2147483647 */ @js.native
  object Test extends TopLevel[Test with Double]
  
  /* 1 */ @js.native
  object ValveCDKey extends TopLevel[ValveCDKey with Double]
  
  /* 0 */ @js.native
  object WonCDKey extends TopLevel[WonCDKey with Double]
  
}

