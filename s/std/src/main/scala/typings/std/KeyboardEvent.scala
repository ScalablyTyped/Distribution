package typings.std

import typings.std.stdInts.`0x00`
import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import typings.std.stdInts.`0x03`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent)
  */
@js.native
trait KeyboardEvent
  extends StObject
     with UIEvent {
  
  /* standard dom */
  val DOM_KEY_LOCATION_LEFT: `0x01` = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_NUMPAD: `0x03` = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_RIGHT: `0x02` = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_STANDARD: `0x00` = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/altKey) */
  /* standard dom */
  val altKey: scala.Boolean = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charCode)
    */
  /* standard dom */
  val charCode: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/code) */
  /* standard dom */
  val code: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/ctrlKey) */
  /* standard dom */
  val ctrlKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/getModifierState) */
  /* standard dom */
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  def initKeyboardEvent(
    typeArg: java.lang.String,
    bubblesArg: js.UndefOr[scala.Boolean],
    cancelableArg: js.UndefOr[scala.Boolean],
    viewArg: js.UndefOr[Window | Null],
    keyArg: js.UndefOr[java.lang.String],
    locationArg: js.UndefOr[Double],
    ctrlKey: js.UndefOr[scala.Boolean],
    altKey: js.UndefOr[scala.Boolean],
    shiftKey: js.UndefOr[scala.Boolean],
    metaKey: js.UndefOr[scala.Boolean]
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/isComposing) */
  /* standard dom */
  val isComposing: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/key) */
  /* standard dom */
  val key: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keyCode)
    */
  /* standard dom */
  val keyCode: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/location) */
  /* standard dom */
  val location: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/metaKey) */
  /* standard dom */
  val metaKey: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/repeat) */
  /* standard dom */
  val repeat: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/shiftKey) */
  /* standard dom */
  val shiftKey: scala.Boolean = js.native
}
