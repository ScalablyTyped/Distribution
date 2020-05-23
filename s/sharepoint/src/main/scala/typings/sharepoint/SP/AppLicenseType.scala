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
  
}

