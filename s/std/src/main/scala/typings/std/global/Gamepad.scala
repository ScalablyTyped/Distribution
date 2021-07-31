package typings.std.global

import typings.std.GamepadHand
import typings.std.GamepadMappingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
class Gamepad ()
  extends StObject
     with typings.std.Gamepad {
  
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  
  /* CompleteClass */
  override val buttons: js.Array[typings.std.GamepadButton] = js.native
  
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  
  /* CompleteClass */
  override val hapticActuators: js.Array[typings.std.GamepadHapticActuator] = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val index: Double = js.native
  
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /* CompleteClass */
  override val pose: typings.std.GamepadPose | Null = js.native
  
  /* CompleteClass */
  override val timestamp: Double = js.native
}
