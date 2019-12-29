package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppLicenseType with Double] = js.native
  /* 1 */ @js.native
  object perpetualAllUsers extends TopLevel[perpetualAllUsers with Double]
  
  /* 0 */ @js.native
  object perpetualMultiUser extends TopLevel[perpetualMultiUser with Double]
  
  /* 3 */ @js.native
  object trialAllUsers extends TopLevel[trialAllUsers with Double]
  
  /* 2 */ @js.native
  object trialMultiUser extends TopLevel[trialMultiUser with Double]
  
}

