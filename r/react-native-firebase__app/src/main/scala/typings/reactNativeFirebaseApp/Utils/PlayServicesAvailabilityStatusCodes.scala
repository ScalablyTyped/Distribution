package typings.reactNativeFirebaseApp.Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayServicesAvailabilityStatusCodes extends js.Object

@JSGlobal("Utils.PlayServicesAvailabilityStatusCodes")
@js.native
object PlayServicesAvailabilityStatusCodes extends js.Object {
  @js.native
  sealed trait API_UNAVAILABLE extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait CANCELED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait DEVELOPER_ERROR extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait DRIVE_EXTERNAL_STORAGE_REQUIRED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait INTERNAL_ERROR extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait INTERRUPTED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait INVALID_ACCOUNT extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait LICENSE_CHECK_FAILED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait NETWORK_ERROR extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait RESOLUTION_REQUIRED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait RESTRICTED_PROFILE extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SERVICE_DISABLED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SERVICE_INVALID extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SERVICE_MISSING extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SERVICE_MISSING_PERMISSION extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SERVICE_UPDATING extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SERVICE_VERSION_UPDATE_REQUIRED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SIGN_IN_FAILED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SIGN_IN_REQUIRED extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait SUCCESS extends PlayServicesAvailabilityStatusCodes
  
  @js.native
  sealed trait TIMEOUT extends PlayServicesAvailabilityStatusCodes
  
}

