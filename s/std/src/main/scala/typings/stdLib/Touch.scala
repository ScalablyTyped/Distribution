package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  val altitudeAngle: scala.Double
  val azimuthAngle: scala.Double
  val clientX: scala.Double
  val clientY: scala.Double
  val force: scala.Double
  val identifier: scala.Double
  val pageX: scala.Double
  val pageY: scala.Double
  val radiusX: scala.Double
  val radiusY: scala.Double
  val rotationAngle: scala.Double
  val screenX: scala.Double
  val screenY: scala.Double
  val target: EventTarget
  val touchType: TouchType
}

@JSGlobal("Touch")
@js.native
class TouchCls protected () extends Touch {
  def this(touchInitDict: TouchInit) = this()
  /* CompleteClass */
  override val altitudeAngle: scala.Double = js.native
  /* CompleteClass */
  override val azimuthAngle: scala.Double = js.native
  /* CompleteClass */
  override val clientX: scala.Double = js.native
  /* CompleteClass */
  override val clientY: scala.Double = js.native
  /* CompleteClass */
  override val force: scala.Double = js.native
  /* CompleteClass */
  override val identifier: scala.Double = js.native
  /* CompleteClass */
  override val pageX: scala.Double = js.native
  /* CompleteClass */
  override val pageY: scala.Double = js.native
  /* CompleteClass */
  override val radiusX: scala.Double = js.native
  /* CompleteClass */
  override val radiusY: scala.Double = js.native
  /* CompleteClass */
  override val rotationAngle: scala.Double = js.native
  /* CompleteClass */
  override val screenX: scala.Double = js.native
  /* CompleteClass */
  override val screenY: scala.Double = js.native
  /* CompleteClass */
  override val target: EventTarget = js.native
  /* CompleteClass */
  override val touchType: TouchType = js.native
}

@JSGlobal("Touch")
@js.native
object Touch
  extends org.scalablytyped.runtime.Instantiable1[/* touchInitDict */ TouchInit, Touch]

