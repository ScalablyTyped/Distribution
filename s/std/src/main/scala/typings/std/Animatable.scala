package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animatable extends StObject {
  
  /* standard dom */
  def animate(): Animation = js.native
  def animate(keyframes: js.Array[Keyframe]): Animation = js.native
  def animate(keyframes: js.Array[Keyframe], options: Double): Animation = js.native
  def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: Null, options: Double): Animation = js.native
  def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
  
  /* standard dom */
  def getAnimations(): js.Array[Animation] = js.native
  def getAnimations(options: GetAnimationsOptions): js.Array[Animation] = js.native
}
