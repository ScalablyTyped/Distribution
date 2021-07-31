package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EServerFlags extends StObject
@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags & Double] = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with EServerFlags
  /* 1 */ val Active: typings.steamClient.mod.EServerFlags.Active & Double = js.native
  
  @js.native
  sealed trait Dedicated
    extends StObject
       with EServerFlags
  /* 4 */ val Dedicated: typings.steamClient.mod.EServerFlags.Dedicated & Double = js.native
  
  @js.native
  sealed trait Linux
    extends StObject
       with EServerFlags
  /* 8 */ val Linux: typings.steamClient.mod.EServerFlags.Linux & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EServerFlags
  /* 0 */ val None: typings.steamClient.mod.EServerFlags.None & Double = js.native
  
  @js.native
  sealed trait Passworded
    extends StObject
       with EServerFlags
  /* 16 */ val Passworded: typings.steamClient.mod.EServerFlags.Passworded & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EServerFlags
  /* 32 */ val Private: typings.steamClient.mod.EServerFlags.Private & Double = js.native
  
  @js.native
  sealed trait Secure
    extends StObject
       with EServerFlags
  /* 2 */ val Secure: typings.steamClient.mod.EServerFlags.Secure & Double = js.native
}
