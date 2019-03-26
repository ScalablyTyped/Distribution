package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusEvent extends UIEvent {
  val relatedTarget: EventTarget = js.native
  def initFocusEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: scala.Double,
    relatedTargetArg: EventTarget
  ): scala.Unit = js.native
}

@JSGlobal("FocusEvent")
@js.native
class FocusEventCls protected () extends FocusEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: FocusEventInit) = this()
}

@JSGlobal("FocusEvent")
@js.native
object FocusEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, FocusEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ FocusEventInit, FocusEvent]

