package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
// Type constants
@JSImport("steamid", "Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type & Double] = js.native
  
  @js.native
  sealed trait ANON_GAMESERVER
    extends StObject
       with Type
  /* 4 */ val ANON_GAMESERVER: typings.steamid.mod.Type.ANON_GAMESERVER & Double = js.native
  
  @js.native
  sealed trait ANON_USER
    extends StObject
       with Type
  /* 10 */ val ANON_USER: typings.steamid.mod.Type.ANON_USER & Double = js.native
  
  @js.native
  sealed trait CHAT
    extends StObject
       with Type
  /* 8 */ val CHAT: typings.steamid.mod.Type.CHAT & Double = js.native
  
  @js.native
  sealed trait CLAN
    extends StObject
       with Type
  /* 7 */ val CLAN: typings.steamid.mod.Type.CLAN & Double = js.native
  
  @js.native
  sealed trait CONTENT_SERVER
    extends StObject
       with Type
  /* 6 */ val CONTENT_SERVER: typings.steamid.mod.Type.CONTENT_SERVER & Double = js.native
  
  @js.native
  sealed trait GAMESERVER
    extends StObject
       with Type
  /* 3 */ val GAMESERVER: typings.steamid.mod.Type.GAMESERVER & Double = js.native
  
  @js.native
  sealed trait INDIVIDUAL
    extends StObject
       with Type
  /* 1 */ val INDIVIDUAL: typings.steamid.mod.Type.INDIVIDUAL & Double = js.native
  
  @js.native
  sealed trait INVALID
    extends StObject
       with Type
  /* 0 */ val INVALID: typings.steamid.mod.Type.INVALID & Double = js.native
  
  @js.native
  sealed trait MULTISEAT
    extends StObject
       with Type
  /* 2 */ val MULTISEAT: typings.steamid.mod.Type.MULTISEAT & Double = js.native
  
  @js.native
  sealed trait P2P_SUPER_SEEDER
    extends StObject
       with Type
  /* 9 */ val P2P_SUPER_SEEDER: typings.steamid.mod.Type.P2P_SUPER_SEEDER & Double = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with Type
  /* 5 */ val PENDING: typings.steamid.mod.Type.PENDING & Double = js.native
}
