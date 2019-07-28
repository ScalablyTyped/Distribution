package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occur due to the user moving a mouse wheel or similar input device. */
@js.native
trait WheelEvent extends MouseEvent {
  val DOM_DELTA_LINE: Double = js.native
  val DOM_DELTA_PAGE: Double = js.native
  val DOM_DELTA_PIXEL: Double = js.native
  val deltaMode: Double = js.native
  val deltaX: Double = js.native
  val deltaY: Double = js.native
  val deltaZ: Double = js.native
  def getCurrentPoint(element: Element): Unit = js.native
  def initWheelEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    buttonArg: Double,
    relatedTargetArg: EventTarget,
    modifiersListArg: java.lang.String,
    deltaXArg: Double,
    deltaYArg: Double,
    deltaZArg: Double,
    deltaMode: Double
  ): Unit = js.native
}

@JSGlobal("WheelEvent")
@js.native
class WheelEventCls protected () extends WheelEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: WheelEventInit) = this()
}

@JSGlobal("WheelEvent")
@js.native
object WheelEvent
  extends Instantiable1[/* typeArg */ java.lang.String, WheelEvent]
     with Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ WheelEventInit, WheelEvent] {
  val DOM_DELTA_LINE: Double = js.native
  val DOM_DELTA_PAGE: Double = js.native
  val DOM_DELTA_PIXEL: Double = js.native
}

