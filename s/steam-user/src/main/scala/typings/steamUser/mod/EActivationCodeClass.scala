package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EActivationCodeClass extends StObject
@JSImport("steam-user", "EActivationCodeClass")
@js.native
object EActivationCodeClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EActivationCodeClass & Double] = js.native
  
  @js.native
  sealed trait DBLookup
    extends StObject
       with EActivationCodeClass
  /* 3 */ val DBLookup: typings.steamUser.mod.EActivationCodeClass.DBLookup & Double = js.native
  
  @js.native
  sealed trait Doom3CDKey
    extends StObject
       with EActivationCodeClass
  /* 2 */ val Doom3CDKey: typings.steamUser.mod.EActivationCodeClass.Doom3CDKey & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EActivationCodeClass
  /* 4294967295.0 */ val Invalid: typings.steamUser.mod.EActivationCodeClass.Invalid & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EActivationCodeClass
  /* 5 */ val Max: typings.steamUser.mod.EActivationCodeClass.Max & Double = js.native
  
  @js.native
  sealed trait Steam2010Key
    extends StObject
       with EActivationCodeClass
  /* 4 */ val Steam2010Key: typings.steamUser.mod.EActivationCodeClass.Steam2010Key & Double = js.native
  
  @js.native
  sealed trait Test
    extends StObject
       with EActivationCodeClass
  /* 2147483647 */ val Test: typings.steamUser.mod.EActivationCodeClass.Test & Double = js.native
  
  @js.native
  sealed trait ValveCDKey
    extends StObject
       with EActivationCodeClass
  /* 1 */ val ValveCDKey: typings.steamUser.mod.EActivationCodeClass.ValveCDKey & Double = js.native
  
  @js.native
  sealed trait WonCDKey
    extends StObject
       with EActivationCodeClass
  /* 0 */ val WonCDKey: typings.steamUser.mod.EActivationCodeClass.WonCDKey & Double = js.native
}
