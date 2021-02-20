package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatPermission extends StObject
@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission with Double] = js.native
  
  @js.native
  sealed trait Ban extends EChatPermission
  /* 256 */ val Ban: typings.steamClient.mod.EChatPermission.Ban with Double = js.native
  
  @js.native
  sealed trait ChangeAccess extends EChatPermission
  /* 512 */ val ChangeAccess: typings.steamClient.mod.EChatPermission.ChangeAccess with Double = js.native
  
  @js.native
  sealed trait ChangePermissions extends EChatPermission
  /* 128 */ val ChangePermissions: typings.steamClient.mod.EChatPermission.ChangePermissions with Double = js.native
  
  @js.native
  sealed trait Close extends EChatPermission
  /* 1 */ val Close: typings.steamClient.mod.EChatPermission.Close with Double = js.native
  
  // 8
  @js.native
  sealed trait EveryoneDefault extends EChatPermission
  /* 8 | 2 */ val EveryoneDefault: typings.steamClient.mod.EChatPermission.EveryoneDefault with Double = js.native
  
  @js.native
  sealed trait EveryoneNotInClanDefault extends EChatPermission
  /* 8 */ val EveryoneNotInClanDefault: typings.steamClient.mod.EChatPermission.EveryoneNotInClanDefault with Double = js.native
  
  @js.native
  sealed trait Invite extends EChatPermission
  /* 2 */ val Invite: typings.steamClient.mod.EChatPermission.Invite with Double = js.native
  
  @js.native
  sealed trait Kick extends EChatPermission
  /* 16 */ val Kick: typings.steamClient.mod.EChatPermission.Kick with Double = js.native
  
  // 891
  @js.native
  sealed trait Mask extends EChatPermission
  /* 1019 */ val Mask: typings.steamClient.mod.EChatPermission.Mask with Double = js.native
  
  // 10
  // todo: this doesn't seem correct...
  @js.native
  sealed trait MemberDefault extends EChatPermission
  /* 256 | 16 | 8 | 2 */ val MemberDefault: typings.steamClient.mod.EChatPermission.MemberDefault with Double = js.native
  
  @js.native
  sealed trait Mute extends EChatPermission
  /* 32 */ val Mute: typings.steamClient.mod.EChatPermission.Mute with Double = js.native
  
  // 282
  @js.native
  sealed trait OfficerDefault extends EChatPermission
  /* 256 | 16 | 8 | 2 */ val OfficerDefault: typings.steamClient.mod.EChatPermission.OfficerDefault with Double = js.native
  
  // 282
  @js.native
  sealed trait OwnerDefault extends EChatPermission
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ val OwnerDefault: typings.steamClient.mod.EChatPermission.OwnerDefault with Double = js.native
  
  @js.native
  sealed trait SetMetadata extends EChatPermission
  /* 64 */ val SetMetadata: typings.steamClient.mod.EChatPermission.SetMetadata with Double = js.native
  
  @js.native
  sealed trait Talk extends EChatPermission
  /* 8 */ val Talk: typings.steamClient.mod.EChatPermission.Talk with Double = js.native
}
