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
class TouchCls protected () extends Touch {
  def this(touchInitDict: TouchInit) = this()
  /* CompleteClass */
  override val altitudeAngle: Double = js.native
  /* CompleteClass */
  override val azimuthAngle: Double = js.native
  /* CompleteClass */
  override val clientX: Double = js.native
  /* CompleteClass */
  override val clientY: Double = js.native
  /* CompleteClass */
  override val force: Double = js.native
  /* CompleteClass */
  override val identifier: Double = js.native
  /* CompleteClass */
  override val pageX: Double = js.native
  /* CompleteClass */
  override val pageY: Double = js.native
  /* CompleteClass */
  override val radiusX: Double = js.native
  /* CompleteClass */
  override val radiusY: Double = js.native
  /* CompleteClass */
  override val rotationAngle: Double = js.native
  /* CompleteClass */
  override val screenX: Double = js.native
  /* CompleteClass */
  override val screenY: Double = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val touchType: TouchType = js.native
}

@JSGlobal("Touch")
@js.native
object Touch extends Instantiable1[/* touchInitDict */ TouchInit, Touch]

