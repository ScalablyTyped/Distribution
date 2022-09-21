package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountFlags extends StObject
//#region "ENUMS"
@JSImport("steam-user", "EAccountFlags")
@js.native
object EAccountFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountFlags & Double] = js.native
  
  @js.native
  sealed trait Admin
    extends StObject
       with EAccountFlags
  /* 16 */ val Admin: typings.steamUser.mod.EAccountFlags.Admin & Double = js.native
  
  @js.native
  sealed trait AppEditor
    extends StObject
       with EAccountFlags
  /* 64 */ val AppEditor: typings.steamUser.mod.EAccountFlags.AppEditor & Double = js.native
  
  @js.native
  sealed trait BannedFromWebAPI
    extends StObject
       with EAccountFlags
  /* 33554432 */ val BannedFromWebAPI: typings.steamUser.mod.EAccountFlags.BannedFromWebAPI & Double = js.native
  
  @js.native
  sealed trait ClansOnlyFromFriends
    extends StObject
       with EAccountFlags
  /* 67108864 */ val ClansOnlyFromFriends: typings.steamUser.mod.EAccountFlags.ClansOnlyFromFriends & Double = js.native
  
  @js.native
  sealed trait Debug
    extends StObject
       with EAccountFlags
  /* 1024 */ val Debug: typings.steamUser.mod.EAccountFlags.Debug & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EAccountFlags
  /* 2048 */ val Disabled: typings.steamUser.mod.EAccountFlags.Disabled & Double = js.native
  
  @js.native
  sealed trait EmailValidated
    extends StObject
       with EAccountFlags
  /* 16384 */ val EmailValidated: typings.steamUser.mod.EAccountFlags.EmailValidated & Double = js.native
  
  @js.native
  sealed trait ForceEmailVerification
    extends StObject
       with EAccountFlags
  /* 262144 */ val ForceEmailVerification: typings.steamUser.mod.EAccountFlags.ForceEmailVerification & Double = js.native
  
  @js.native
  sealed trait ForcePasswordChange
    extends StObject
       with EAccountFlags
  /* 131072 */ val ForcePasswordChange: typings.steamUser.mod.EAccountFlags.ForcePasswordChange & Double = js.native
  
  @js.native
  sealed trait GlobalModerator
    extends StObject
       with EAccountFlags
  /* 134217728 */ val GlobalModerator: typings.steamUser.mod.EAccountFlags.GlobalModerator & Double = js.native
  
  @js.native
  sealed trait HWIDSet
    extends StObject
       with EAccountFlags
  /* 128 */ val HWIDSet: typings.steamUser.mod.EAccountFlags.HWIDSet & Double = js.native
  
  @js.native
  sealed trait LimitedUser
    extends StObject
       with EAccountFlags
  /* 4096 */ val LimitedUser: typings.steamUser.mod.EAccountFlags.LimitedUser & Double = js.native
  
  @js.native
  sealed trait LimitedUserForce
    extends StObject
       with EAccountFlags
  /* 8192 */ val LimitedUserForce: typings.steamUser.mod.EAccountFlags.LimitedUserForce & Double = js.native
  
  @js.native
  sealed trait Lockdown
    extends StObject
       with EAccountFlags
  /* 8388608 */ val Lockdown: typings.steamUser.mod.EAccountFlags.Lockdown & Double = js.native
  
  @js.native
  sealed trait LogonExtraSecurity
    extends StObject
       with EAccountFlags
  /* 524288 */ val LogonExtraSecurity: typings.steamUser.mod.EAccountFlags.LogonExtraSecurity & Double = js.native
  
  @js.native
  sealed trait LogonExtraSecurityDisabled
    extends StObject
       with EAccountFlags
  /* 1048576 */ val LogonExtraSecurityDisabled: typings.steamUser.mod.EAccountFlags.LogonExtraSecurityDisabled & Double = js.native
  
  @js.native
  sealed trait MarketingTreatment
    extends StObject
       with EAccountFlags
  /* 32768 */ val MarketingTreatment: typings.steamUser.mod.EAccountFlags.MarketingTreatment & Double = js.native
  
  @js.native
  sealed trait MasterAppEditor
    extends StObject
       with EAccountFlags
  /* 16777216 */ val MasterAppEditor: typings.steamUser.mod.EAccountFlags.MasterAppEditor & Double = js.native
  
  @js.native
  sealed trait NeedLogs
    extends StObject
       with EAccountFlags
  /* 4194304 */ val NeedLogs: typings.steamUser.mod.EAccountFlags.NeedLogs & Double = js.native
  
  @js.native
  sealed trait NeedsSSANextSteamLogon
    extends StObject
       with EAccountFlags
  /* 1073741824 */ val NeedsSSANextSteamLogon: typings.steamUser.mod.EAccountFlags.NeedsSSANextSteamLogon & Double = js.native
  
  @js.native
  sealed trait NormalUser
    extends StObject
       with EAccountFlags
  /* 0 */ val NormalUser: typings.steamUser.mod.EAccountFlags.NormalUser & Double = js.native
  
  @js.native
  sealed trait OGGInviteOptOut
    extends StObject
       with EAccountFlags
  /* 65536 */ val OGGInviteOptOut: typings.steamUser.mod.EAccountFlags.OGGInviteOptOut & Double = js.native
  
  @js.native
  sealed trait ParentalSettings
    extends StObject
       with EAccountFlags
  /* 268435456 */ val ParentalSettings: typings.steamUser.mod.EAccountFlags.ParentalSettings & Double = js.native
  
  @js.native
  sealed trait PasswordSet
    extends StObject
       with EAccountFlags
  /* 4 */ val PasswordSet: typings.steamUser.mod.EAccountFlags.PasswordSet & Double = js.native
  
  @js.native
  sealed trait PersonaNameSet
    extends StObject
       with EAccountFlags
  /* 1 */ val PersonaNameSet: typings.steamUser.mod.EAccountFlags.PersonaNameSet & Double = js.native
  
  @js.native
  sealed trait PersonalQASet
    extends StObject
       with EAccountFlags
  /* 256 */ val PersonalQASet: typings.steamUser.mod.EAccountFlags.PersonalQASet & Double = js.native
  
  @js.native
  sealed trait Steam2MigrationComplete
    extends StObject
       with EAccountFlags
  /* 2097152 */ val Steam2MigrationComplete: typings.steamUser.mod.EAccountFlags.Steam2MigrationComplete & Double = js.native
  
  @js.native
  sealed trait Supervisor
    extends StObject
       with EAccountFlags
  /* 32 */ val Supervisor: typings.steamUser.mod.EAccountFlags.Supervisor & Double = js.native
  
  @js.native
  sealed trait Support
    extends StObject
       with EAccountFlags
  /* 8 */ val Support: typings.steamUser.mod.EAccountFlags.Support & Double = js.native
  
  @js.native
  sealed trait ThirdPartySupport
    extends StObject
       with EAccountFlags
  /* 536870912 */ val ThirdPartySupport: typings.steamUser.mod.EAccountFlags.ThirdPartySupport & Double = js.native
  
  @js.native
  sealed trait Unbannable
    extends StObject
       with EAccountFlags
  /* 2 */ val Unbannable: typings.steamUser.mod.EAccountFlags.Unbannable & Double = js.native
  
  @js.native
  sealed trait VacBeta
    extends StObject
       with EAccountFlags
  /* 512 */ val VacBeta: typings.steamUser.mod.EAccountFlags.VacBeta & Double = js.native
}
