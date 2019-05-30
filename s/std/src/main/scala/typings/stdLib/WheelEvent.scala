package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occur due to the user moving a mouse wheel or similar input device. */
@js.native
trait WheelEvent extends MouseEvent {
  val DOM_DELTA_LINE: scala.Double = js.native
  val DOM_DELTA_PAGE: scala.Double = js.native
  val DOM_DELTA_PIXEL: scala.Double = js.native
  val deltaMode: scala.Double = js.native
  val deltaX: scala.Double = js.native
  val deltaY: scala.Double = js.native
  val deltaZ: scala.Double = js.native
  def getCurrentPoint(element: Element): scala.Unit = js.native
  def initWheelEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    buttonArg: scala.Double,
    relatedTargetArg: EventTarget,
    modifiersListArg: java.lang.String,
    deltaXArg: scala.Double,
    deltaYArg: scala.Double,
    deltaZArg: scala.Double,
    deltaMode: scala.Double
  ): scala.Unit = js.native
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
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, WheelEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ WheelEventInit, WheelEvent] {
  val DOM_DELTA_LINE: scala.Double = js.native
  val DOM_DELTA_PAGE: scala.Double = js.native
  val DOM_DELTA_PIXEL: scala.Double = js.native
}

