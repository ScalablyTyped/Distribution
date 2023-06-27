package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator)
  */
@js.native
trait GamepadHapticActuator extends StObject {
  
  /* standard dom */
  def playEffect(`type`: GamepadHapticEffectType): js.Promise[GamepadHapticsResult] = js.native
  def playEffect(`type`: GamepadHapticEffectType, params: GamepadEffectParameters): js.Promise[GamepadHapticsResult] = js.native
  
  /* standard dom */
  def reset(): js.Promise[GamepadHapticsResult] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/type) */
  /* standard dom */
  val `type`: GamepadHapticActuatorType = js.native
}
