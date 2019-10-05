package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppLicenseType extends js.Object

@JSGlobal("SP.AppLicenseType")
@js.native
object AppLicenseType extends js.Object {
  @js.native
  sealed trait perpetualAllUsers extends AppLicenseType
  
  @js.native
  sealed trait perpetualMultiUser extends AppLicenseType
  
  @js.native
  sealed trait trialAllUsers extends AppLicenseType
  
  @js.native
  sealed trait trialMultiUser extends AppLicenseType
  
  /* 1 */ val perpetualAllUsers: typings.sharepoint.SP.AppLicenseType.perpetualAllUsers with Double = js.native
  /* 0 */ val perpetualMultiUser: typings.sharepoint.SP.AppLicenseType.perpetualMultiUser with Double = js.native
  /* 3 */ val trialAllUsers: typings.sharepoint.SP.AppLicenseType.trialAllUsers with Double = js.native
  /* 2 */ val trialMultiUser: typings.sharepoint.SP.AppLicenseType.trialMultiUser with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppLicenseType with Double] = js.native
}

