package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEvent extends UIEvent {
  val DOM_INPUT_METHOD_DROP: scala.Double = js.native
  val DOM_INPUT_METHOD_HANDWRITING: scala.Double = js.native
  val DOM_INPUT_METHOD_IME: scala.Double = js.native
  val DOM_INPUT_METHOD_KEYBOARD: scala.Double = js.native
  val DOM_INPUT_METHOD_MULTIMODAL: scala.Double = js.native
  val DOM_INPUT_METHOD_OPTION: scala.Double = js.native
  val DOM_INPUT_METHOD_PASTE: scala.Double = js.native
  val DOM_INPUT_METHOD_SCRIPT: scala.Double = js.native
  val DOM_INPUT_METHOD_UNKNOWN: scala.Double = js.native
  val DOM_INPUT_METHOD_VOICE: scala.Double = js.native
  val data: java.lang.String = js.native
  def initTextEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    dataArg: java.lang.String,
    inputMethod: scala.Double,
    locale: java.lang.String
  ): scala.Unit = js.native
}

@JSGlobal("TextEvent")
@js.native
object TextEvent
  extends org.scalablytyped.runtime.Instantiable0[TextEvent] {
  val DOM_INPUT_METHOD_DROP: scala.Double = js.native
  val DOM_INPUT_METHOD_HANDWRITING: scala.Double = js.native
  val DOM_INPUT_METHOD_IME: scala.Double = js.native
  val DOM_INPUT_METHOD_KEYBOARD: scala.Double = js.native
  val DOM_INPUT_METHOD_MULTIMODAL: scala.Double = js.native
  val DOM_INPUT_METHOD_OPTION: scala.Double = js.native
  val DOM_INPUT_METHOD_PASTE: scala.Double = js.native
  val DOM_INPUT_METHOD_SCRIPT: scala.Double = js.native
  val DOM_INPUT_METHOD_UNKNOWN: scala.Double = js.native
  val DOM_INPUT_METHOD_VOICE: scala.Double = js.native
}

