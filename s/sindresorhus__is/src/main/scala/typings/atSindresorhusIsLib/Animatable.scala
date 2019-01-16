package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animatable extends js.Object {
  def animate(): Animation = js.native
  def animate(keyframes: Array[Keyframe]): Animation = js.native
  def animate(keyframes: Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: Array[Keyframe], options: scala.Double): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: scala.Double): Animation = js.native
  def animate(keyframes: scala.Null, options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: scala.Null, options: scala.Double): Animation = js.native
  def getAnimations(): Array[Animation] = js.native
}

