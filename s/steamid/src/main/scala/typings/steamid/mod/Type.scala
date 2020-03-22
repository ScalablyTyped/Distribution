package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

// Type constants
@JSImport("steamid", "Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait ANON_GAMESERVER extends Type
  
  @js.native
  sealed trait ANON_USER extends Type
  
  @js.native
  sealed trait CHAT extends Type
  
  @js.native
  sealed trait CLAN extends Type
  
  @js.native
  sealed trait CONTENT_SERVER extends Type
  
  @js.native
  sealed trait GAMESERVER extends Type
  
  @js.native
  sealed trait INDIVIDUAL extends Type
  
  @js.native
  sealed trait INVALID extends Type
  
  @js.native
  sealed trait MULTISEAT extends Type
  
  @js.native
  sealed trait P2P_SUPER_SEEDER extends Type
  
  @js.native
  sealed trait PENDING extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 4 */ @js.native
  object ANON_GAMESERVER extends TopLevel[ANON_GAMESERVER with Double]
  
  /* 10 */ @js.native
  object ANON_USER extends TopLevel[ANON_USER with Double]
  
  /* 8 */ @js.native
  object CHAT extends TopLevel[CHAT with Double]
  
  /* 7 */ @js.native
  object CLAN extends TopLevel[CLAN with Double]
  
  /* 6 */ @js.native
  object CONTENT_SERVER extends TopLevel[CONTENT_SERVER with Double]
  
  /* 3 */ @js.native
  object GAMESERVER extends TopLevel[GAMESERVER with Double]
  
  /* 1 */ @js.native
  object INDIVIDUAL extends TopLevel[INDIVIDUAL with Double]
  
  /* 0 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  /* 2 */ @js.native
  object MULTISEAT extends TopLevel[MULTISEAT with Double]
  
  /* 9 */ @js.native
  object P2P_SUPER_SEEDER extends TopLevel[P2P_SUPER_SEEDER with Double]
  
  /* 5 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
  
}

