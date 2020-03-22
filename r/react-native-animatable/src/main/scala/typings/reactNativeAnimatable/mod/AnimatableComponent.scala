package typings.reactNativeAnimatable.mod

import typings.react.mod.ClassicComponentClass
import typings.reactNative.mod.NativeMethodsMixinStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
  extends ClassicComponentClass[AnimatableProperties[S] with P]
     with NativeMethodsMixinStatic
     with AnimatableAnimationMethods {
  def stopAnimation(): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double, easing: Easing): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: Double): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: Double, easing: Easing): Unit = js.native
}

