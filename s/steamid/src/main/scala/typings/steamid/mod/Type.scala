package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
// Type constants
@JSImport("steamid", "Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait ANON_GAMESERVER extends Type
  /* 4 */ val ANON_GAMESERVER: typings.steamid.mod.Type.ANON_GAMESERVER with Double = js.native
  
  @js.native
  sealed trait ANON_USER extends Type
  /* 10 */ val ANON_USER: typings.steamid.mod.Type.ANON_USER with Double = js.native
  
  @js.native
  sealed trait CHAT extends Type
  /* 8 */ val CHAT: typings.steamid.mod.Type.CHAT with Double = js.native
  
  @js.native
  sealed trait CLAN extends Type
  /* 7 */ val CLAN: typings.steamid.mod.Type.CLAN with Double = js.native
  
  @js.native
  sealed trait CONTENT_SERVER extends Type
  /* 6 */ val CONTENT_SERVER: typings.steamid.mod.Type.CONTENT_SERVER with Double = js.native
  
  @js.native
  sealed trait GAMESERVER extends Type
  /* 3 */ val GAMESERVER: typings.steamid.mod.Type.GAMESERVER with Double = js.native
  
  @js.native
  sealed trait INDIVIDUAL extends Type
  /* 1 */ val INDIVIDUAL: typings.steamid.mod.Type.INDIVIDUAL with Double = js.native
  
  @js.native
  sealed trait INVALID extends Type
  /* 0 */ val INVALID: typings.steamid.mod.Type.INVALID with Double = js.native
  
  @js.native
  sealed trait MULTISEAT extends Type
  /* 2 */ val MULTISEAT: typings.steamid.mod.Type.MULTISEAT with Double = js.native
  
  @js.native
  sealed trait P2P_SUPER_SEEDER extends Type
  /* 9 */ val P2P_SUPER_SEEDER: typings.steamid.mod.Type.P2P_SUPER_SEEDER with Double = js.native
  
  @js.native
  sealed trait PENDING extends Type
  /* 5 */ val PENDING: typings.steamid.mod.Type.PENDING with Double = js.native
}
