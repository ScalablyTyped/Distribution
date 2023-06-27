package typings.std.global

import typings.std.DOMHighResTimeStamp
import typings.std.GamepadMappingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
/* standard dom */
open class Gamepad ()
  extends StObject
     with typings.std.Gamepad {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/axes) */
  /* standard dom */
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/buttons) */
  /* standard dom */
  /* CompleteClass */
  override val buttons: js.Array[typings.std.GamepadButton] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/connected) */
  /* standard dom */
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/hapticActuators) */
  /* standard dom */
  /* CompleteClass */
  override val hapticActuators: js.Array[typings.std.GamepadHapticActuator] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/id) */
  /* standard dom */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/index) */
  /* standard dom */
  /* CompleteClass */
  override val index: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping) */
  /* standard dom */
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: DOMHighResTimeStamp = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val vibrationActuator: typings.std.GamepadHapticActuator | Null = js.native
}
