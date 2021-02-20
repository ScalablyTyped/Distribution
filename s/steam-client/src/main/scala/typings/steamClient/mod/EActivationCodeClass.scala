package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EActivationCodeClass extends StObject
@JSImport("steam-client", "EActivationCodeClass")
@js.native
object EActivationCodeClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EActivationCodeClass with Double] = js.native
  
  @js.native
  sealed trait DBLookup extends EActivationCodeClass
  /* 3 */ val DBLookup: typings.steamClient.mod.EActivationCodeClass.DBLookup with Double = js.native
  
  @js.native
  sealed trait Doom3CDKey extends EActivationCodeClass
  /* 2 */ val Doom3CDKey: typings.steamClient.mod.EActivationCodeClass.Doom3CDKey with Double = js.native
  
  @js.native
  sealed trait Invalid extends EActivationCodeClass
  /* 4294967295.0 */ val Invalid: typings.steamClient.mod.EActivationCodeClass.Invalid with Double = js.native
  
  @js.native
  sealed trait Max extends EActivationCodeClass
  /* 5 */ val Max: typings.steamClient.mod.EActivationCodeClass.Max with Double = js.native
  
  @js.native
  sealed trait Steam2010Key extends EActivationCodeClass
  /* 4 */ val Steam2010Key: typings.steamClient.mod.EActivationCodeClass.Steam2010Key with Double = js.native
  
  @js.native
  sealed trait Test extends EActivationCodeClass
  /* 2147483647 */ val Test: typings.steamClient.mod.EActivationCodeClass.Test with Double = js.native
  
  @js.native
  sealed trait ValveCDKey extends EActivationCodeClass
  /* 1 */ val ValveCDKey: typings.steamClient.mod.EActivationCodeClass.ValveCDKey with Double = js.native
  
  @js.native
  sealed trait WonCDKey extends EActivationCodeClass
  /* 0 */ val WonCDKey: typings.steamClient.mod.EActivationCodeClass.WonCDKey with Double = js.native
}
