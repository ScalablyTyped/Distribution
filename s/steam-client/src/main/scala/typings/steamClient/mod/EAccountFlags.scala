package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountFlags extends js.Object
@JSImport("steam-client", "EAccountFlags")
@js.native
object EAccountFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountFlags with Double] = js.native
  
  @js.native
  sealed trait Admin extends EAccountFlags
  /* 16 */ @js.native
  object Admin extends TopLevel[Admin with Double]
  
  @js.native
  sealed trait AppEditor extends EAccountFlags
  /* 64 */ @js.native
  object AppEditor extends TopLevel[AppEditor with Double]
  
  @js.native
  sealed trait BannedFromWebAPI extends EAccountFlags
  /* 33554432 */ @js.native
  object BannedFromWebAPI extends TopLevel[BannedFromWebAPI with Double]
  
  @js.native
  sealed trait ClansOnlyFromFriends extends EAccountFlags
  /* 67108864 */ @js.native
  object ClansOnlyFromFriends extends TopLevel[ClansOnlyFromFriends with Double]
  
  @js.native
  sealed trait Debug extends EAccountFlags
  /* 1024 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  @js.native
  sealed trait Disabled extends EAccountFlags
  /* 2048 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  @js.native
  sealed trait EmailValidated extends EAccountFlags
  /* 16384 */ @js.native
  object EmailValidated extends TopLevel[EmailValidated with Double]
  
  @js.native
  sealed trait ForceEmailVerification extends EAccountFlags
  /* 262144 */ @js.native
  object ForceEmailVerification extends TopLevel[ForceEmailVerification with Double]
  
  @js.native
  sealed trait ForcePasswordChange extends EAccountFlags
  /* 131072 */ @js.native
  object ForcePasswordChange extends TopLevel[ForcePasswordChange with Double]
  
  @js.native
  sealed trait GlobalModerator extends EAccountFlags
  /* 134217728 */ @js.native
  object GlobalModerator extends TopLevel[GlobalModerator with Double]
  
  @js.native
  sealed trait HWIDSet extends EAccountFlags
  /* 128 */ @js.native
  object HWIDSet extends TopLevel[HWIDSet with Double]
  
  @js.native
  sealed trait LimitedUser extends EAccountFlags
  /* 4096 */ @js.native
  object LimitedUser extends TopLevel[LimitedUser with Double]
  
  @js.native
  sealed trait LimitedUserForce extends EAccountFlags
  /* 8192 */ @js.native
  object LimitedUserForce extends TopLevel[LimitedUserForce with Double]
  
  @js.native
  sealed trait Lockdown extends EAccountFlags
  /* 8388608 */ @js.native
  object Lockdown extends TopLevel[Lockdown with Double]
  
  @js.native
  sealed trait LogonExtraSecurity extends EAccountFlags
  /* 524288 */ @js.native
  object LogonExtraSecurity extends TopLevel[LogonExtraSecurity with Double]
  
  @js.native
  sealed trait LogonExtraSecurityDisabled extends EAccountFlags
  /* 1048576 */ @js.native
  object LogonExtraSecurityDisabled extends TopLevel[LogonExtraSecurityDisabled with Double]
  
  @js.native
  sealed trait MarketingTreatment extends EAccountFlags
  /* 32768 */ @js.native
  object MarketingTreatment extends TopLevel[MarketingTreatment with Double]
  
  @js.native
  sealed trait MasterAppEditor extends EAccountFlags
  /* 16777216 */ @js.native
  object MasterAppEditor extends TopLevel[MasterAppEditor with Double]
  
  @js.native
  sealed trait NeedLogs extends EAccountFlags
  /* 4194304 */ @js.native
  object NeedLogs extends TopLevel[NeedLogs with Double]
  
  @js.native
  sealed trait NeedsSSANextSteamLogon extends EAccountFlags
  /* 1073741824 */ @js.native
  object NeedsSSANextSteamLogon extends TopLevel[NeedsSSANextSteamLogon with Double]
  
  @js.native
  sealed trait NormalUser extends EAccountFlags
  /* 0 */ @js.native
  object NormalUser extends TopLevel[NormalUser with Double]
  
  @js.native
  sealed trait OGGInviteOptOut extends EAccountFlags
  /* 65536 */ @js.native
  object OGGInviteOptOut extends TopLevel[OGGInviteOptOut with Double]
  
  @js.native
  sealed trait ParentalSettings extends EAccountFlags
  /* 268435456 */ @js.native
  object ParentalSettings extends TopLevel[ParentalSettings with Double]
  
  @js.native
  sealed trait PasswordSet extends EAccountFlags
  /* 4 */ @js.native
  object PasswordSet extends TopLevel[PasswordSet with Double]
  
  @js.native
  sealed trait PersonaNameSet extends EAccountFlags
  /* 1 */ @js.native
  object PersonaNameSet extends TopLevel[PersonaNameSet with Double]
  
  @js.native
  sealed trait PersonalQASet extends EAccountFlags
  /* 256 */ @js.native
  object PersonalQASet extends TopLevel[PersonalQASet with Double]
  
  @js.native
  sealed trait Steam2MigrationComplete extends EAccountFlags
  /* 2097152 */ @js.native
  object Steam2MigrationComplete extends TopLevel[Steam2MigrationComplete with Double]
  
  @js.native
  sealed trait Supervisor extends EAccountFlags
  /* 32 */ @js.native
  object Supervisor extends TopLevel[Supervisor with Double]
  
  @js.native
  sealed trait Support extends EAccountFlags
  /* 8 */ @js.native
  object Support extends TopLevel[Support with Double]
  
  @js.native
  sealed trait ThirdPartySupport extends EAccountFlags
  /* 536870912 */ @js.native
  object ThirdPartySupport extends TopLevel[ThirdPartySupport with Double]
  
  @js.native
  sealed trait Unbannable extends EAccountFlags
  /* 2 */ @js.native
  object Unbannable extends TopLevel[Unbannable with Double]
  
  @js.native
  sealed trait VacBeta extends EAccountFlags
  /* 512 */ @js.native
  object VacBeta extends TopLevel[VacBeta with Double]
}
