package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppLicenseType extends StObject
@JSGlobal("SP.AppLicenseType")
@js.native
object AppLicenseType extends StObject {
  
  @js.native
  sealed trait perpetualAllUsers extends AppLicenseType
  
  @js.native
  sealed trait perpetualMultiUser extends AppLicenseType
  
  @js.native
  sealed trait trialAllUsers extends AppLicenseType
  
  @js.native
  sealed trait trialMultiUser extends AppLicenseType
}
