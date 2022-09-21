package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatPermission extends StObject
@JSImport("steam-user", "EChatPermission")
@js.native
object EChatPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission & Double] = js.native
  
  @js.native
  sealed trait Ban
    extends StObject
       with EChatPermission
  /* 256 */ val Ban: typings.steamUser.mod.EChatPermission.Ban & Double = js.native
  
  @js.native
  sealed trait ChangeAccess
    extends StObject
       with EChatPermission
  /* 512 */ val ChangeAccess: typings.steamUser.mod.EChatPermission.ChangeAccess & Double = js.native
  
  @js.native
  sealed trait ChangePermissions
    extends StObject
       with EChatPermission
  /* 128 */ val ChangePermissions: typings.steamUser.mod.EChatPermission.ChangePermissions & Double = js.native
  
  @js.native
  sealed trait Close
    extends StObject
       with EChatPermission
  /* 1 */ val Close: typings.steamUser.mod.EChatPermission.Close & Double = js.native
  
  @js.native
  sealed trait Invite
    extends StObject
       with EChatPermission
  /* 2 */ val Invite: typings.steamUser.mod.EChatPermission.Invite & Double = js.native
  
  @js.native
  sealed trait Kick
    extends StObject
       with EChatPermission
  /* 16 */ val Kick: typings.steamUser.mod.EChatPermission.Kick & Double = js.native
  
  @js.native
  sealed trait Mask
    extends StObject
       with EChatPermission
  /* 1019 */ val Mask: typings.steamUser.mod.EChatPermission.Mask & Double = js.native
  
  @js.native
  sealed trait Mute
    extends StObject
       with EChatPermission
  /* 32 */ val Mute: typings.steamUser.mod.EChatPermission.Mute & Double = js.native
  
  @js.native
  sealed trait SetMetadata
    extends StObject
       with EChatPermission
  /* 64 */ val SetMetadata: typings.steamUser.mod.EChatPermission.SetMetadata & Double = js.native
  
  @js.native
  sealed trait Talk
    extends StObject
       with EChatPermission
  /* 8 */ val Talk: typings.steamUser.mod.EChatPermission.Talk & Double = js.native
}
