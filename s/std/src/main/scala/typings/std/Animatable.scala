package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animatable extends js.Object {
  def animate(): Animation = js.native
  def animate(keyframes: js.Array[Keyframe]): Animation = js.native
  def animate(keyframes: js.Array[Keyframe], options: Double): Animation = js.native
  def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: Null, options: Double): Animation = js.native
  def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
  def getAnimations(): js.Array[Animation] = js.native
}

