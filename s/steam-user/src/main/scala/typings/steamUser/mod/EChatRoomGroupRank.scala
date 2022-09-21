package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomGroupRank extends StObject
@JSImport("steam-user", "EChatRoomGroupRank")
@js.native
object EChatRoomGroupRank extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomGroupRank & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EChatRoomGroupRank
  /* 0 */ val Default: typings.steamUser.mod.EChatRoomGroupRank.Default & Double = js.native
  
  @js.native
  sealed trait Guest
    extends StObject
       with EChatRoomGroupRank
  /* 15 */ val Guest: typings.steamUser.mod.EChatRoomGroupRank.Guest & Double = js.native
  
  @js.native
  sealed trait Member
    extends StObject
       with EChatRoomGroupRank
  /* 20 */ val Member: typings.steamUser.mod.EChatRoomGroupRank.Member & Double = js.native
  
  @js.native
  sealed trait Moderator
    extends StObject
       with EChatRoomGroupRank
  /* 30 */ val Moderator: typings.steamUser.mod.EChatRoomGroupRank.Moderator & Double = js.native
  
  @js.native
  sealed trait Officer
    extends StObject
       with EChatRoomGroupRank
  /* 40 */ val Officer: typings.steamUser.mod.EChatRoomGroupRank.Officer & Double = js.native
  
  @js.native
  sealed trait Owner
    extends StObject
       with EChatRoomGroupRank
  /* 50 */ val Owner: typings.steamUser.mod.EChatRoomGroupRank.Owner & Double = js.native
  
  @js.native
  sealed trait TestInvalid
    extends StObject
       with EChatRoomGroupRank
  /* 99 */ val TestInvalid: typings.steamUser.mod.EChatRoomGroupRank.TestInvalid & Double = js.native
  
  @js.native
  sealed trait Viewer
    extends StObject
       with EChatRoomGroupRank
  /* 10 */ val Viewer: typings.steamUser.mod.EChatRoomGroupRank.Viewer & Double = js.native
}
