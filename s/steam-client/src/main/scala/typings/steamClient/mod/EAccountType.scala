package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountType extends StObject
@JSImport("steam-client", "EAccountType")
@js.native
object EAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountType & Double] = js.native
  
  @js.native
  sealed trait AnonGameServer
    extends StObject
       with EAccountType
  /* 4 */ val AnonGameServer: typings.steamClient.mod.EAccountType.AnonGameServer & Double = js.native
  
  @js.native
  sealed trait AnonUser
    extends StObject
       with EAccountType
  /* 10 */ val AnonUser: typings.steamClient.mod.EAccountType.AnonUser & Double = js.native
  
  @js.native
  sealed trait Chat
    extends StObject
       with EAccountType
  /* 8 */ val Chat: typings.steamClient.mod.EAccountType.Chat & Double = js.native
  
  @js.native
  sealed trait Clan
    extends StObject
       with EAccountType
  /* 7 */ val Clan: typings.steamClient.mod.EAccountType.Clan & Double = js.native
  
  @js.native
  sealed trait ConsoleUser
    extends StObject
       with EAccountType
  /* 9 */ val ConsoleUser: typings.steamClient.mod.EAccountType.ConsoleUser & Double = js.native
  
  @js.native
  sealed trait ContentServer
    extends StObject
       with EAccountType
  /* 6 */ val ContentServer: typings.steamClient.mod.EAccountType.ContentServer & Double = js.native
  
  @js.native
  sealed trait GameServer
    extends StObject
       with EAccountType
  /* 3 */ val GameServer: typings.steamClient.mod.EAccountType.GameServer & Double = js.native
  
  @js.native
  sealed trait Individual
    extends StObject
       with EAccountType
  /* 1 */ val Individual: typings.steamClient.mod.EAccountType.Individual & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EAccountType
  /* 0 */ val Invalid: typings.steamClient.mod.EAccountType.Invalid & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EAccountType
  /* 11 */ val Max: typings.steamClient.mod.EAccountType.Max & Double = js.native
  
  @js.native
  sealed trait Multiseat
    extends StObject
       with EAccountType
  /* 2 */ val Multiseat: typings.steamClient.mod.EAccountType.Multiseat & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EAccountType
  /* 5 */ val Pending: typings.steamClient.mod.EAccountType.Pending & Double = js.native
}
