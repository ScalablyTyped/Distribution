package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEvent extends UIEvent {
  val altKey: scala.Boolean = js.native
  val button: scala.Double = js.native
  val buttons: scala.Double = js.native
  val clientX: scala.Double = js.native
  val clientY: scala.Double = js.native
  val ctrlKey: scala.Boolean = js.native
  /** @deprecated */
  val fromElement: Element = js.native
  val layerX: scala.Double = js.native
  val layerY: scala.Double = js.native
  val metaKey: scala.Boolean = js.native
  val movementX: scala.Double = js.native
  val movementY: scala.Double = js.native
  val offsetX: scala.Double = js.native
  val offsetY: scala.Double = js.native
  val pageX: scala.Double = js.native
  val pageY: scala.Double = js.native
  val relatedTarget: EventTarget = js.native
  val screenX: scala.Double = js.native
  val screenY: scala.Double = js.native
  val shiftKey: scala.Boolean = js.native
  /** @deprecated */
  val toElement: Element = js.native
  /** @deprecated */
  val which: scala.Double = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  def initMouseEvent(
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
    buttonArg: scala.Double
  ): scala.Unit = js.native
  def initMouseEvent(
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
    relatedTargetArg: EventTarget
  ): scala.Unit = js.native
}

@JSGlobal("MouseEvent")
@js.native
object MouseEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, MouseEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ MouseEventInit, MouseEvent]

