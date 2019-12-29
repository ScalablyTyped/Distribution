package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAccountType extends js.Object

@JSImport("steam-client", "EAccountType")
@js.native
object EAccountType extends js.Object {
  @js.native
  sealed trait AnonGameServer extends EAccountType
  
  @js.native
  sealed trait AnonUser extends EAccountType
  
  @js.native
  sealed trait Chat extends EAccountType
  
  @js.native
  sealed trait Clan extends EAccountType
  
  @js.native
  sealed trait ConsoleUser extends EAccountType
  
  @js.native
  sealed trait ContentServer extends EAccountType
  
  @js.native
  sealed trait GameServer extends EAccountType
  
  @js.native
  sealed trait Individual extends EAccountType
  
  @js.native
  sealed trait Invalid extends EAccountType
  
  @js.native
  sealed trait Max extends EAccountType
  
  @js.native
  sealed trait Multiseat extends EAccountType
  
  @js.native
  sealed trait Pending extends EAccountType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountType with Double] = js.native
  /* 4 */ @js.native
  object AnonGameServer extends TopLevel[AnonGameServer with Double]
  
  /* 10 */ @js.native
  object AnonUser extends TopLevel[AnonUser with Double]
  
  /* 8 */ @js.native
  object Chat extends TopLevel[Chat with Double]
  
  /* 7 */ @js.native
  object Clan extends TopLevel[Clan with Double]
  
  /* 9 */ @js.native
  object ConsoleUser extends TopLevel[ConsoleUser with Double]
  
  /* 6 */ @js.native
  object ContentServer extends TopLevel[ContentServer with Double]
  
  /* 3 */ @js.native
  object GameServer extends TopLevel[GameServer with Double]
  
  /* 1 */ @js.native
  object Individual extends TopLevel[Individual with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 11 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 2 */ @js.native
  object Multiseat extends TopLevel[Multiseat with Double]
  
  /* 5 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
}

