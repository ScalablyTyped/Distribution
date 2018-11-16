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
object FocusEvent
  extends ScalablyTyped.runtime.Instantiable1[/* typeArg */ java.lang.String, FocusEvent]
     with ScalablyTyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ FocusEventInit, FocusEvent]

