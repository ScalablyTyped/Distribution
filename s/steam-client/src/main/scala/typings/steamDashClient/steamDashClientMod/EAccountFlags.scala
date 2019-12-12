package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Admin
import typings.steamDashClient.steamDashClientMod.EAccountFlags.AppEditor
import typings.steamDashClient.steamDashClientMod.EAccountFlags.BannedFromWebAPI
import typings.steamDashClient.steamDashClientMod.EAccountFlags.ClansOnlyFromFriends
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Debug
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Disabled
import typings.steamDashClient.steamDashClientMod.EAccountFlags.EmailValidated
import typings.steamDashClient.steamDashClientMod.EAccountFlags.ForceEmailVerification
import typings.steamDashClient.steamDashClientMod.EAccountFlags.ForcePasswordChange
import typings.steamDashClient.steamDashClientMod.EAccountFlags.GlobalModerator
import typings.steamDashClient.steamDashClientMod.EAccountFlags.HWIDSet
import typings.steamDashClient.steamDashClientMod.EAccountFlags.LimitedUser
import typings.steamDashClient.steamDashClientMod.EAccountFlags.LimitedUserForce
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Lockdown
import typings.steamDashClient.steamDashClientMod.EAccountFlags.LogonExtraSecurity
import typings.steamDashClient.steamDashClientMod.EAccountFlags.LogonExtraSecurityDisabled
import typings.steamDashClient.steamDashClientMod.EAccountFlags.MarketingTreatment
import typings.steamDashClient.steamDashClientMod.EAccountFlags.MasterAppEditor
import typings.steamDashClient.steamDashClientMod.EAccountFlags.NeedLogs
import typings.steamDashClient.steamDashClientMod.EAccountFlags.NeedsSSANextSteamLogon
import typings.steamDashClient.steamDashClientMod.EAccountFlags.NormalUser
import typings.steamDashClient.steamDashClientMod.EAccountFlags.OGGInviteOptOut
import typings.steamDashClient.steamDashClientMod.EAccountFlags.ParentalSettings
import typings.steamDashClient.steamDashClientMod.EAccountFlags.PasswordSet
import typings.steamDashClient.steamDashClientMod.EAccountFlags.PersonaNameSet
import typings.steamDashClient.steamDashClientMod.EAccountFlags.PersonalQASet
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Steam2MigrationComplete
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Supervisor
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Support
import typings.steamDashClient.steamDashClientMod.EAccountFlags.ThirdPartySupport
import typings.steamDashClient.steamDashClientMod.EAccountFlags.Unbannable
import typings.steamDashClient.steamDashClientMod.EAccountFlags.VacBeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAccountFlags extends js.Object

@JSImport("steam-client", "EAccountFlags")
@js.native
object EAccountFlags extends js.Object {
  @js.native
  sealed trait Admin extends EAccountFlags
  
  @js.native
  sealed trait AppEditor extends EAccountFlags
  
  @js.native
  sealed trait BannedFromWebAPI extends EAccountFlags
  
  @js.native
  sealed trait ClansOnlyFromFriends extends EAccountFlags
  
  @js.native
  sealed trait Debug extends EAccountFlags
  
  @js.native
  sealed trait Disabled extends EAccountFlags
  
  @js.native
  sealed trait EmailValidated extends EAccountFlags
  
  @js.native
  sealed trait ForceEmailVerification extends EAccountFlags
  
  @js.native
  sealed trait ForcePasswordChange extends EAccountFlags
  
  @js.native
  sealed trait GlobalModerator extends EAccountFlags
  
  @js.native
  sealed trait HWIDSet extends EAccountFlags
  
  @js.native
  sealed trait LimitedUser extends EAccountFlags
  
  @js.native
  sealed trait LimitedUserForce extends EAccountFlags
  
  @js.native
  sealed trait Lockdown extends EAccountFlags
  
  @js.native
  sealed trait LogonExtraSecurity extends EAccountFlags
  
  @js.native
  sealed trait LogonExtraSecurityDisabled extends EAccountFlags
  
  @js.native
  sealed trait MarketingTreatment extends EAccountFlags
  
  @js.native
  sealed trait MasterAppEditor extends EAccountFlags
  
  @js.native
  sealed trait NeedLogs extends EAccountFlags
  
  @js.native
  sealed trait NeedsSSANextSteamLogon extends EAccountFlags
  
  @js.native
  sealed trait NormalUser extends EAccountFlags
  
  @js.native
  sealed trait OGGInviteOptOut extends EAccountFlags
  
  @js.native
  sealed trait ParentalSettings extends EAccountFlags
  
  @js.native
  sealed trait PasswordSet extends EAccountFlags
  
  @js.native
  sealed trait PersonaNameSet extends EAccountFlags
  
  @js.native
  sealed trait PersonalQASet extends EAccountFlags
  
  @js.native
  sealed trait Steam2MigrationComplete extends EAccountFlags
  
  @js.native
  sealed trait Supervisor extends EAccountFlags
  
  @js.native
  sealed trait Support extends EAccountFlags
  
  @js.native
  sealed trait ThirdPartySupport extends EAccountFlags
  
  @js.native
  sealed trait Unbannable extends EAccountFlags
  
  @js.native
  sealed trait VacBeta extends EAccountFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountFlags with Double] = js.native
  /* 16 */ @js.native
  object Admin extends TopLevel[Admin with Double]
  
  /* 64 */ @js.native
  object AppEditor extends TopLevel[AppEditor with Double]
  
  /* 33554432 */ @js.native
  object BannedFromWebAPI extends TopLevel[BannedFromWebAPI with Double]
  
  /* 67108864 */ @js.native
  object ClansOnlyFromFriends extends TopLevel[ClansOnlyFromFriends with Double]
  
  /* 1024 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  /* 2048 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 16384 */ @js.native
  object EmailValidated extends TopLevel[EmailValidated with Double]
  
  /* 262144 */ @js.native
  object ForceEmailVerification extends TopLevel[ForceEmailVerification with Double]
  
  /* 131072 */ @js.native
  object ForcePasswordChange extends TopLevel[ForcePasswordChange with Double]
  
  /* 134217728 */ @js.native
  object GlobalModerator extends TopLevel[GlobalModerator with Double]
  
  /* 128 */ @js.native
  object HWIDSet extends TopLevel[HWIDSet with Double]
  
  /* 4096 */ @js.native
  object LimitedUser extends TopLevel[LimitedUser with Double]
  
  /* 8192 */ @js.native
  object LimitedUserForce extends TopLevel[LimitedUserForce with Double]
  
  /* 8388608 */ @js.native
  object Lockdown extends TopLevel[Lockdown with Double]
  
  /* 524288 */ @js.native
  object LogonExtraSecurity extends TopLevel[LogonExtraSecurity with Double]
  
  /* 1048576 */ @js.native
  object LogonExtraSecurityDisabled extends TopLevel[LogonExtraSecurityDisabled with Double]
  
  /* 32768 */ @js.native
  object MarketingTreatment extends TopLevel[MarketingTreatment with Double]
  
  /* 16777216 */ @js.native
  object MasterAppEditor extends TopLevel[MasterAppEditor with Double]
  
  /* 4194304 */ @js.native
  object NeedLogs extends TopLevel[NeedLogs with Double]
  
  /* 1073741824 */ @js.native
  object NeedsSSANextSteamLogon extends TopLevel[NeedsSSANextSteamLogon with Double]
  
  /* 0 */ @js.native
  object NormalUser extends TopLevel[NormalUser with Double]
  
  /* 65536 */ @js.native
  object OGGInviteOptOut extends TopLevel[OGGInviteOptOut with Double]
  
  /* 268435456 */ @js.native
  object ParentalSettings extends TopLevel[ParentalSettings with Double]
  
  /* 4 */ @js.native
  object PasswordSet extends TopLevel[PasswordSet with Double]
  
  /* 1 */ @js.native
  object PersonaNameSet extends TopLevel[PersonaNameSet with Double]
  
  /* 256 */ @js.native
  object PersonalQASet extends TopLevel[PersonalQASet with Double]
  
  /* 2097152 */ @js.native
  object Steam2MigrationComplete extends TopLevel[Steam2MigrationComplete with Double]
  
  /* 32 */ @js.native
  object Supervisor extends TopLevel[Supervisor with Double]
  
  /* 8 */ @js.native
  object Support extends TopLevel[Support with Double]
  
  /* 536870912 */ @js.native
  object ThirdPartySupport extends TopLevel[ThirdPartySupport with Double]
  
  /* 2 */ @js.native
  object Unbannable extends TopLevel[Unbannable with Double]
  
  /* 512 */ @js.native
  object VacBeta extends TopLevel[VacBeta with Double]
  
}

