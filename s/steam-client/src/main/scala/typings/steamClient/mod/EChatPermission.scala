package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatPermission extends StObject
@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission & Double] = js.native
  
  @js.native
  sealed trait Ban
    extends StObject
       with EChatPermission
  /* 256 */ val Ban: typings.steamClient.mod.EChatPermission.Ban & Double = js.native
  
  @js.native
  sealed trait ChangeAccess
    extends StObject
       with EChatPermission
  /* 512 */ val ChangeAccess: typings.steamClient.mod.EChatPermission.ChangeAccess & Double = js.native
  
  @js.native
  sealed trait ChangePermissions
    extends StObject
       with EChatPermission
  /* 128 */ val ChangePermissions: typings.steamClient.mod.EChatPermission.ChangePermissions & Double = js.native
  
  @js.native
  sealed trait Close
    extends StObject
       with EChatPermission
  /* 1 */ val Close: typings.steamClient.mod.EChatPermission.Close & Double = js.native
  
  // 8
  @js.native
  sealed trait EveryoneDefault
    extends StObject
       with EChatPermission
  /* 8 | 2 */ val EveryoneDefault: typings.steamClient.mod.EChatPermission.EveryoneDefault & Double = js.native
  
  @js.native
  sealed trait EveryoneNotInClanDefault
    extends StObject
       with EChatPermission
  /* 8 */ val EveryoneNotInClanDefault: typings.steamClient.mod.EChatPermission.EveryoneNotInClanDefault & Double = js.native
  
  @js.native
  sealed trait Invite
    extends StObject
       with EChatPermission
  /* 2 */ val Invite: typings.steamClient.mod.EChatPermission.Invite & Double = js.native
  
  @js.native
  sealed trait Kick
    extends StObject
       with EChatPermission
  /* 16 */ val Kick: typings.steamClient.mod.EChatPermission.Kick & Double = js.native
  
  // 891
  @js.native
  sealed trait Mask
    extends StObject
       with EChatPermission
  /* 1019 */ val Mask: typings.steamClient.mod.EChatPermission.Mask & Double = js.native
  
  // 10
  // todo: this doesn't seem correct...
  @js.native
  sealed trait MemberDefault
    extends StObject
       with EChatPermission
  /* 256 | 16 | 8 | 2 */ val MemberDefault: typings.steamClient.mod.EChatPermission.MemberDefault & Double = js.native
  
  @js.native
  sealed trait Mute
    extends StObject
       with EChatPermission
  /* 32 */ val Mute: typings.steamClient.mod.EChatPermission.Mute & Double = js.native
  
  // 282
  @js.native
  sealed trait OfficerDefault
    extends StObject
       with EChatPermission
  /* 256 | 16 | 8 | 2 */ val OfficerDefault: typings.steamClient.mod.EChatPermission.OfficerDefault & Double = js.native
  
  // 282
  @js.native
  sealed trait OwnerDefault
    extends StObject
       with EChatPermission
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ val OwnerDefault: typings.steamClient.mod.EChatPermission.OwnerDefault & Double = js.native
  
  @js.native
  sealed trait SetMetadata
    extends StObject
       with EChatPermission
  /* 64 */ val SetMetadata: typings.steamClient.mod.EChatPermission.SetMetadata & Double = js.native
  
  @js.native
  sealed trait Talk
    extends StObject
       with EChatPermission
  /* 8 */ val Talk: typings.steamClient.mod.EChatPermission.Talk & Double = js.native
}
