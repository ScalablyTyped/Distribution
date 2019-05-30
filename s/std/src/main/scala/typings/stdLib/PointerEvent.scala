package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc. */
@js.native
trait PointerEvent extends MouseEvent {
  val height: scala.Double = js.native
  val isPrimary: scala.Boolean = js.native
  val pointerId: scala.Double = js.native
  val pointerType: java.lang.String = js.native
  val pressure: scala.Double = js.native
  val tangentialPressure: scala.Double = js.native
  val tiltX: scala.Double = js.native
  val tiltY: scala.Double = js.native
  val twist: scala.Double = js.native
  val width: scala.Double = js.native
}

@JSGlobal("PointerEvent")
@js.native
class PointerEventCls protected () extends PointerEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PointerEventInit) = this()
}

@JSGlobal("PointerEvent")
@js.native
object PointerEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, PointerEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ PointerEventInit, PointerEvent]

