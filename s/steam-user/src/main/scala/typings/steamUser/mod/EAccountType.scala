package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountType extends StObject
@JSImport("steam-user", "EAccountType")
@js.native
object EAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountType & Double] = js.native
  
  @js.native
  sealed trait AnonGameServer
    extends StObject
       with EAccountType
  /* 4 */ val AnonGameServer: typings.steamUser.mod.EAccountType.AnonGameServer & Double = js.native
  
  @js.native
  sealed trait AnonUser
    extends StObject
       with EAccountType
  /* 10 */ val AnonUser: typings.steamUser.mod.EAccountType.AnonUser & Double = js.native
  
  @js.native
  sealed trait Chat
    extends StObject
       with EAccountType
  /* 8 */ val Chat: typings.steamUser.mod.EAccountType.Chat & Double = js.native
  
  @js.native
  sealed trait Clan
    extends StObject
       with EAccountType
  /* 7 */ val Clan: typings.steamUser.mod.EAccountType.Clan & Double = js.native
  
  @js.native
  sealed trait ConsoleUser
    extends StObject
       with EAccountType
  /* 9 */ val ConsoleUser: typings.steamUser.mod.EAccountType.ConsoleUser & Double = js.native
  
  @js.native
  sealed trait ContentServer
    extends StObject
       with EAccountType
  /* 6 */ val ContentServer: typings.steamUser.mod.EAccountType.ContentServer & Double = js.native
  
  @js.native
  sealed trait GameServer
    extends StObject
       with EAccountType
  /* 3 */ val GameServer: typings.steamUser.mod.EAccountType.GameServer & Double = js.native
  
  @js.native
  sealed trait Individual
    extends StObject
       with EAccountType
  /* 1 */ val Individual: typings.steamUser.mod.EAccountType.Individual & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EAccountType
  /* 0 */ val Invalid: typings.steamUser.mod.EAccountType.Invalid & Double = js.native
  
  @js.native
  sealed trait Multiseat
    extends StObject
       with EAccountType
  /* 2 */ val Multiseat: typings.steamUser.mod.EAccountType.Multiseat & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EAccountType
  /* 5 */ val Pending: typings.steamUser.mod.EAccountType.Pending & Double = js.native
}
