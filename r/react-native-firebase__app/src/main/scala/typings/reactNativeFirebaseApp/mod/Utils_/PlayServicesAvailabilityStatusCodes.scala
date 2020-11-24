package typings.reactNativeFirebaseApp.mod.Utils_

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayServicesAvailabilityStatusCodes extends js.Object
@JSImport("@react-native-firebase/app", "Utils.PlayServicesAvailabilityStatusCodes")
@js.native
object PlayServicesAvailabilityStatusCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayServicesAvailabilityStatusCodes with Double] = js.native
  
  @js.native
  sealed trait API_UNAVAILABLE extends PlayServicesAvailabilityStatusCodes
  /* 16 */ @js.native
  object API_UNAVAILABLE extends TopLevel[API_UNAVAILABLE with Double]
  
  @js.native
  sealed trait CANCELED extends PlayServicesAvailabilityStatusCodes
  /* 13 */ @js.native
  object CANCELED extends TopLevel[CANCELED with Double]
  
  @js.native
  sealed trait DEVELOPER_ERROR extends PlayServicesAvailabilityStatusCodes
  /* 10 */ @js.native
  object DEVELOPER_ERROR extends TopLevel[DEVELOPER_ERROR with Double]
  
  @js.native
  sealed trait DRIVE_EXTERNAL_STORAGE_REQUIRED extends PlayServicesAvailabilityStatusCodes
  /* 1500 */ @js.native
  object DRIVE_EXTERNAL_STORAGE_REQUIRED extends TopLevel[DRIVE_EXTERNAL_STORAGE_REQUIRED with Double]
  
  @js.native
  sealed trait INTERNAL_ERROR extends PlayServicesAvailabilityStatusCodes
  /* 8 */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
  
  @js.native
  sealed trait INTERRUPTED extends PlayServicesAvailabilityStatusCodes
  /* 15 */ @js.native
  object INTERRUPTED extends TopLevel[INTERRUPTED with Double]
  
  @js.native
  sealed trait INVALID_ACCOUNT extends PlayServicesAvailabilityStatusCodes
  /* 5 */ @js.native
  object INVALID_ACCOUNT extends TopLevel[INVALID_ACCOUNT with Double]
  
  @js.native
  sealed trait LICENSE_CHECK_FAILED extends PlayServicesAvailabilityStatusCodes
  /* 11 */ @js.native
  object LICENSE_CHECK_FAILED extends TopLevel[LICENSE_CHECK_FAILED with Double]
  
  @js.native
  sealed trait NETWORK_ERROR extends PlayServicesAvailabilityStatusCodes
  /* 7 */ @js.native
  object NETWORK_ERROR extends TopLevel[NETWORK_ERROR with Double]
  
  @js.native
  sealed trait RESOLUTION_REQUIRED extends PlayServicesAvailabilityStatusCodes
  /* 6 */ @js.native
  object RESOLUTION_REQUIRED extends TopLevel[RESOLUTION_REQUIRED with Double]
  
  @js.native
  sealed trait RESTRICTED_PROFILE extends PlayServicesAvailabilityStatusCodes
  /* 20 */ @js.native
  object RESTRICTED_PROFILE extends TopLevel[RESTRICTED_PROFILE with Double]
  
  @js.native
  sealed trait SERVICE_DISABLED extends PlayServicesAvailabilityStatusCodes
  /* 3 */ @js.native
  object SERVICE_DISABLED extends TopLevel[SERVICE_DISABLED with Double]
  
  @js.native
  sealed trait SERVICE_INVALID extends PlayServicesAvailabilityStatusCodes
  /* 9 */ @js.native
  object SERVICE_INVALID extends TopLevel[SERVICE_INVALID with Double]
  
  @js.native
  sealed trait SERVICE_MISSING extends PlayServicesAvailabilityStatusCodes
  /* 1 */ @js.native
  object SERVICE_MISSING extends TopLevel[SERVICE_MISSING with Double]
  
  @js.native
  sealed trait SERVICE_MISSING_PERMISSION extends PlayServicesAvailabilityStatusCodes
  /* 19 */ @js.native
  object SERVICE_MISSING_PERMISSION extends TopLevel[SERVICE_MISSING_PERMISSION with Double]
  
  @js.native
  sealed trait SERVICE_UPDATING extends PlayServicesAvailabilityStatusCodes
  /* 18 */ @js.native
  object SERVICE_UPDATING extends TopLevel[SERVICE_UPDATING with Double]
  
  @js.native
  sealed trait SERVICE_VERSION_UPDATE_REQUIRED extends PlayServicesAvailabilityStatusCodes
  /* 2 */ @js.native
  object SERVICE_VERSION_UPDATE_REQUIRED extends TopLevel[SERVICE_VERSION_UPDATE_REQUIRED with Double]
  
  @js.native
  sealed trait SIGN_IN_FAILED extends PlayServicesAvailabilityStatusCodes
  /* 17 */ @js.native
  object SIGN_IN_FAILED extends TopLevel[SIGN_IN_FAILED with Double]
  
  @js.native
  sealed trait SIGN_IN_REQUIRED extends PlayServicesAvailabilityStatusCodes
  /* 4 */ @js.native
  object SIGN_IN_REQUIRED extends TopLevel[SIGN_IN_REQUIRED with Double]
  
  @js.native
  sealed trait SUCCESS extends PlayServicesAvailabilityStatusCodes
  /* 0 */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with Double]
  
  @js.native
  sealed trait TIMEOUT extends PlayServicesAvailabilityStatusCodes
  /* 14 */ @js.native
  object TIMEOUT extends TopLevel[TIMEOUT with Double]
}
