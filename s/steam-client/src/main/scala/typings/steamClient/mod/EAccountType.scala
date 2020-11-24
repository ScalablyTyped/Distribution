package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountType extends js.Object
@JSImport("steam-client", "EAccountType")
@js.native
object EAccountType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountType with Double] = js.native
  
  @js.native
  sealed trait AnonGameServer extends EAccountType
  /* 4 */ @js.native
  object AnonGameServer extends TopLevel[AnonGameServer with Double]
  
  @js.native
  sealed trait AnonUser extends EAccountType
  /* 10 */ @js.native
  object AnonUser extends TopLevel[AnonUser with Double]
  
  @js.native
  sealed trait Chat extends EAccountType
  /* 8 */ @js.native
  object Chat extends TopLevel[Chat with Double]
  
  @js.native
  sealed trait Clan extends EAccountType
  /* 7 */ @js.native
  object Clan extends TopLevel[Clan with Double]
  
  @js.native
  sealed trait ConsoleUser extends EAccountType
  /* 9 */ @js.native
  object ConsoleUser extends TopLevel[ConsoleUser with Double]
  
  @js.native
  sealed trait ContentServer extends EAccountType
  /* 6 */ @js.native
  object ContentServer extends TopLevel[ContentServer with Double]
  
  @js.native
  sealed trait GameServer extends EAccountType
  /* 3 */ @js.native
  object GameServer extends TopLevel[GameServer with Double]
  
  @js.native
  sealed trait Individual extends EAccountType
  /* 1 */ @js.native
  object Individual extends TopLevel[Individual with Double]
  
  @js.native
  sealed trait Invalid extends EAccountType
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait Max extends EAccountType
  /* 11 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait Multiseat extends EAccountType
  /* 2 */ @js.native
  object Multiseat extends TopLevel[Multiseat with Double]
  
  @js.native
  sealed trait Pending extends EAccountType
  /* 5 */ @js.native
  object Pending extends TopLevel[Pending with Double]
}
