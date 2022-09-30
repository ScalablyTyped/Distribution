package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceTrackingMode extends StObject
/** Tracking modes used by the DeviceTracking component to specify what type of tracking to use. */
@JSGlobal("DeviceTrackingMode")
@js.native
object DeviceTrackingMode extends StObject {
  
  /** Use gyroscope tracking ( only: rotation) */
  @js.native
  sealed trait Rotation
    extends StObject
       with DeviceTrackingMode
  
  /** Use surface tracking (position and rotation) */
  @js.native
  sealed trait Surface
    extends StObject
       with DeviceTrackingMode
  
  /** Use native tracking (position and rotation) */
  @js.native
  sealed trait World
    extends StObject
       with DeviceTrackingMode
}
