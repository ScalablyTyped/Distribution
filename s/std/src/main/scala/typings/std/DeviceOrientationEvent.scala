package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent)
  */
@js.native
trait DeviceOrientationEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/absolute) */
  /* standard dom */
  val absolute: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/alpha) */
  /* standard dom */
  val alpha: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/beta) */
  /* standard dom */
  val beta: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/gamma) */
  /* standard dom */
  val gamma: Double | Null = js.native
}
