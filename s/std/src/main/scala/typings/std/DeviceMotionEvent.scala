package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation.
  * Available only in secure contexts.
  */
@js.native
trait DeviceMotionEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val acceleration: DeviceMotionEventAcceleration | Null = js.native
  
  /* standard dom */
  val accelerationIncludingGravity: DeviceMotionEventAcceleration | Null = js.native
  
  /* standard dom */
  val interval: Double = js.native
  
  /* standard dom */
  val rotationRate: DeviceMotionEventRotationRate | Null = js.native
}
