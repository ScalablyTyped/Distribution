package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard. */
@js.native
trait KeyboardEvent extends UIEvent {
  val DOM_KEY_LOCATION_JOYSTICK: scala.Double = js.native
  val DOM_KEY_LOCATION_LEFT: scala.Double = js.native
  val DOM_KEY_LOCATION_MOBILE: scala.Double = js.native
  val DOM_KEY_LOCATION_NUMPAD: scala.Double = js.native
  val DOM_KEY_LOCATION_RIGHT: scala.Double = js.native
  val DOM_KEY_LOCATION_STANDARD: scala.Double = js.native
  val altKey: scala.Boolean = js.native
  /** @deprecated */
  var char: java.lang.String = js.native
  /** @deprecated */
  val charCode: scala.Double = js.native
  val code: java.lang.String = js.native
  val ctrlKey: scala.Boolean = js.native
  val key: java.lang.String = js.native
  /** @deprecated */
  val keyCode: scala.Double = js.native
  val location: scala.Double = js.native
  val metaKey: scala.Boolean = js.native
  val repeat: scala.Boolean = js.native
  val shiftKey: scala.Boolean = js.native
  /** @deprecated */
  val which: scala.Double = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  /** @deprecated */
  def initKeyboardEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    keyArg: java.lang.String,
    locationArg: scala.Double,
    modifiersListArg: java.lang.String,
    repeat: scala.Boolean,
    locale: java.lang.String
  ): scala.Unit = js.native
}

@JSGlobal("KeyboardEvent")
@js.native
class KeyboardEventCls protected () extends KeyboardEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: KeyboardEventInit) = this()
}

@JSGlobal("KeyboardEvent")
@js.native
object KeyboardEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, KeyboardEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ KeyboardEventInit, KeyboardEvent] {
  val DOM_KEY_LOCATION_JOYSTICK: scala.Double = js.native
  val DOM_KEY_LOCATION_LEFT: scala.Double = js.native
  val DOM_KEY_LOCATION_MOBILE: scala.Double = js.native
  val DOM_KEY_LOCATION_NUMPAD: scala.Double = js.native
  val DOM_KEY_LOCATION_RIGHT: scala.Double = js.native
  val DOM_KEY_LOCATION_STANDARD: scala.Double = js.native
}

