package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSPointerEvent extends MouseEvent {
  val currentPoint: js.Any = js.native
  val height: scala.Double = js.native
  val hwTimestamp: scala.Double = js.native
  val intermediatePoints: js.Any = js.native
  val isPrimary: scala.Boolean = js.native
  val pointerId: scala.Double = js.native
  val pointerType: js.Any = js.native
  val pressure: scala.Double = js.native
  val rotation: scala.Double = js.native
  val tiltX: scala.Double = js.native
  val tiltY: scala.Double = js.native
  val width: scala.Double = js.native
  def getCurrentPoint(element: Element): scala.Unit = js.native
  def getIntermediatePoints(element: Element): scala.Unit = js.native
  def initPointerEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: scala.Double,
    relatedTargetArg: EventTarget,
    offsetXArg: scala.Double,
    offsetYArg: scala.Double,
    widthArg: scala.Double,
    heightArg: scala.Double,
    pressure: scala.Double,
    rotation: scala.Double,
    tiltX: scala.Double,
    tiltY: scala.Double,
    pointerIdArg: scala.Double,
    pointerType: js.Any,
    hwTimestampArg: scala.Double,
    isPrimary: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("MSPointerEvent")
@js.native
object MSPointerEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, MSPointerEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ PointerEventInit, MSPointerEvent]

