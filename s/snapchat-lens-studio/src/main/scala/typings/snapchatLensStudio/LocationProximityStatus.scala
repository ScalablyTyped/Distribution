package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationProximityStatus extends StObject
/** Used by DeviceLocationTrackingComponent to indicate the user’s distance from the landmarker location. See the Landmarker guide for more information. */
@JSGlobal("LocationProximityStatus")
@js.native
object LocationProximityStatus extends StObject {
  
  /** User is too far away from the landmarker location to track it. */
  @js.native
  sealed trait OutOfRange
    extends StObject
       with LocationProximityStatus
  
  /** User’s distance cannot be determined or has not been determined yet. */
  @js.native
  sealed trait Unknown
    extends StObject
       with LocationProximityStatus
  
  /** User is close enough to the landmarker location to begin tracking. */
  @js.native
  sealed trait WithinRange
    extends StObject
       with LocationProximityStatus
}
