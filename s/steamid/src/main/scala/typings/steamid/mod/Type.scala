package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
// Type constants
@JSImport("steamid", "Type")
@js.native
object Type extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait ANON_GAMESERVER extends Type
  /* 4 */ @js.native
  object ANON_GAMESERVER extends TopLevel[ANON_GAMESERVER with Double]
  
  @js.native
  sealed trait ANON_USER extends Type
  /* 10 */ @js.native
  object ANON_USER extends TopLevel[ANON_USER with Double]
  
  @js.native
  sealed trait CHAT extends Type
  /* 8 */ @js.native
  object CHAT extends TopLevel[CHAT with Double]
  
  @js.native
  sealed trait CLAN extends Type
  /* 7 */ @js.native
  object CLAN extends TopLevel[CLAN with Double]
  
  @js.native
  sealed trait CONTENT_SERVER extends Type
  /* 6 */ @js.native
  object CONTENT_SERVER extends TopLevel[CONTENT_SERVER with Double]
  
  @js.native
  sealed trait GAMESERVER extends Type
  /* 3 */ @js.native
  object GAMESERVER extends TopLevel[GAMESERVER with Double]
  
  @js.native
  sealed trait INDIVIDUAL extends Type
  /* 1 */ @js.native
  object INDIVIDUAL extends TopLevel[INDIVIDUAL with Double]
  
  @js.native
  sealed trait INVALID extends Type
  /* 0 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  @js.native
  sealed trait MULTISEAT extends Type
  /* 2 */ @js.native
  object MULTISEAT extends TopLevel[MULTISEAT with Double]
  
  @js.native
  sealed trait P2P_SUPER_SEEDER extends Type
  /* 9 */ @js.native
  object P2P_SUPER_SEEDER extends TopLevel[P2P_SUPER_SEEDER with Double]
  
  @js.native
  sealed trait PENDING extends Type
  /* 5 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
}
