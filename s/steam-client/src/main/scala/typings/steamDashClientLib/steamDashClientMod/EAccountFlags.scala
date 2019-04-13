package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAccountFlags extends js.Object

@JSImport("steam-client", "EAccountFlags")
@js.native
object EAccountFlags extends js.Object {
  @js.native
  sealed trait Admin
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait AppEditor
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait BannedFromWebAPI
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait ClansOnlyFromFriends
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Debug
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Disabled
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait EmailValidated
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait ForceEmailVerification
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait ForcePasswordChange
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait GlobalModerator
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait HWIDSet
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait LimitedUser
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait LimitedUserForce
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Lockdown
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait LogonExtraSecurity
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait LogonExtraSecurityDisabled
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait MarketingTreatment
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait MasterAppEditor
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait NeedLogs
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait NeedsSSANextSteamLogon
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait NormalUser
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait OGGInviteOptOut
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait ParentalSettings
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait PasswordSet
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait PersonaNameSet
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait PersonalQASet
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Steam2MigrationComplete
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Supervisor
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Support
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait ThirdPartySupport
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait Unbannable
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  @js.native
  sealed trait VacBeta
    extends steamDashClientLib.steamDashClientMod.EAccountFlags
  
  /* 16 */ val Admin: Admin with scala.Double = js.native
  /* 64 */ val AppEditor: AppEditor with scala.Double = js.native
  /* 33554432 */ val BannedFromWebAPI: BannedFromWebAPI with scala.Double = js.native
  /* 67108864 */ val ClansOnlyFromFriends: ClansOnlyFromFriends with scala.Double = js.native
  /* 1024 */ val Debug: Debug with scala.Double = js.native
  /* 2048 */ val Disabled: Disabled with scala.Double = js.native
  /* 16384 */ val EmailValidated: EmailValidated with scala.Double = js.native
  /* 262144 */ val ForceEmailVerification: ForceEmailVerification with scala.Double = js.native
  /* 131072 */ val ForcePasswordChange: ForcePasswordChange with scala.Double = js.native
  /* 134217728 */ val GlobalModerator: GlobalModerator with scala.Double = js.native
  /* 128 */ val HWIDSet: HWIDSet with scala.Double = js.native
  /* 4096 */ val LimitedUser: LimitedUser with scala.Double = js.native
  /* 8192 */ val LimitedUserForce: LimitedUserForce with scala.Double = js.native
  /* 8388608 */ val Lockdown: Lockdown with scala.Double = js.native
  /* 524288 */ val LogonExtraSecurity: LogonExtraSecurity with scala.Double = js.native
  /* 1048576 */ val LogonExtraSecurityDisabled: LogonExtraSecurityDisabled with scala.Double = js.native
  /* 32768 */ val MarketingTreatment: MarketingTreatment with scala.Double = js.native
  /* 16777216 */ val MasterAppEditor: MasterAppEditor with scala.Double = js.native
  /* 4194304 */ val NeedLogs: NeedLogs with scala.Double = js.native
  /* 1073741824 */ val NeedsSSANextSteamLogon: NeedsSSANextSteamLogon with scala.Double = js.native
  /* 0 */ val NormalUser: NormalUser with scala.Double = js.native
  /* 65536 */ val OGGInviteOptOut: OGGInviteOptOut with scala.Double = js.native
  /* 268435456 */ val ParentalSettings: ParentalSettings with scala.Double = js.native
  /* 4 */ val PasswordSet: PasswordSet with scala.Double = js.native
  /* 1 */ val PersonaNameSet: PersonaNameSet with scala.Double = js.native
  /* 256 */ val PersonalQASet: PersonalQASet with scala.Double = js.native
  /* 2097152 */ val Steam2MigrationComplete: Steam2MigrationComplete with scala.Double = js.native
  /* 32 */ val Supervisor: Supervisor with scala.Double = js.native
  /* 8 */ val Support: Support with scala.Double = js.native
  /* 536870912 */ val ThirdPartySupport: ThirdPartySupport with scala.Double = js.native
  /* 2 */ val Unbannable: Unbannable with scala.Double = js.native
  /* 512 */ val VacBeta: VacBeta with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EAccountFlags with scala.Double] = js.native
}

