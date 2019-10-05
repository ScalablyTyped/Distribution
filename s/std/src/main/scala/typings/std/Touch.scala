package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad. */
trait Touch extends js.Object {
  val altitudeAngle: Double
  val azimuthAngle: Double
  val clientX: Double
  val clientY: Double
  val force: Double
  val identifier: Double
  val pageX: Double
  val pageY: Double
  val radiusX: Double
  val radiusY: Double
  val rotationAngle: Double
  val screenX: Double
  val screenY: Double
  val target: EventTarget
  val touchType: TouchType
}

@JSGlobal("Touch")
@js.native
object Touch extends Instantiable1[/* touchInitDict */ TouchInit, Touch]

