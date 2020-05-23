package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.TouchInit
import typings.std.TouchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Touch")
@js.native
class Touch protected ()
  extends typings.std.Touch {
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
  override val target: typings.std.EventTarget = js.native
  /* CompleteClass */
  override val touchType: TouchType = js.native
}

@JSGlobal("Touch")
@js.native
object Touch
  extends Instantiable1[/* touchInitDict */ TouchInit, typings.std.Touch]

