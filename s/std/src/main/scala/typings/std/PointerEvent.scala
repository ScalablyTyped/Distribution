package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc. */
@js.native
trait PointerEvent extends MouseEvent {
  val height: Double = js.native
  val isPrimary: scala.Boolean = js.native
  val pointerId: Double = js.native
  val pointerType: java.lang.String = js.native
  val pressure: Double = js.native
  val tangentialPressure: Double = js.native
  val tiltX: Double = js.native
  val tiltY: Double = js.native
  val twist: Double = js.native
  val width: Double = js.native
}

