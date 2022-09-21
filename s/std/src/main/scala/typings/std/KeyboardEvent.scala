package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard. */
@js.native
trait KeyboardEvent
  extends StObject
     with UIEvent {
  
  /* standard dom */
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  
  /* standard dom */
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
  
  /* standard dom */
  val altKey: scala.Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  val charCode: Double = js.native
  
  /* standard dom */
  val code: java.lang.String = js.native
  
  /* standard dom */
  val ctrlKey: scala.Boolean = js.native
  
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
  
  /* standard dom */
  val isComposing: scala.Boolean = js.native
  
  /* standard dom */
  val key: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  val keyCode: Double = js.native
  
  /* standard dom */
  val location: Double = js.native
  
  /* standard dom */
  val metaKey: scala.Boolean = js.native
  
  /* standard dom */
  val repeat: scala.Boolean = js.native
  
  /* standard dom */
  val shiftKey: scala.Boolean = js.native
}
