package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard. */
@js.native
trait KeyboardEvent extends UIEvent {
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
  val altKey: scala.Boolean = js.native
  /** @deprecated */
  var char: java.lang.String = js.native
  /** @deprecated */
  val charCode: Double = js.native
  val code: java.lang.String = js.native
  val ctrlKey: scala.Boolean = js.native
  val isComposing: scala.Boolean = js.native
  val key: java.lang.String = js.native
  /** @deprecated */
  val keyCode: Double = js.native
  val location: Double = js.native
  val metaKey: scala.Boolean = js.native
  val repeat: scala.Boolean = js.native
  val shiftKey: scala.Boolean = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
}

