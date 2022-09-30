package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by DeviceLocationTrackingComponent to indicate the user’s distance from the landmarker location. See the Landmarker guide for more information. */
@JSGlobal("LocationProximityStatus")
@js.native
object LocationProximityStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.LocationProximityStatus & Double] = js.native
  
  /* 2 */ val OutOfRange: typings.snapchatLensStudio.LocationProximityStatus.OutOfRange & Double = js.native
  
  /* 0 */ val Unknown: typings.snapchatLensStudio.LocationProximityStatus.Unknown & Double = js.native
  
  /* 1 */ val WithinRange: typings.snapchatLensStudio.LocationProximityStatus.WithinRange & Double = js.native
}
