package typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod

import typings.react.reactMod.ClassicComponentClass
import typings.reactDashNative.reactDashNativeMod.NativeMethodsMixinStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof {[ k in std.Animation ]: (duration? : number): std.Promise<{  finished  :boolean}>} ]:? {[ k in std.Animation ]: (duration? : number): std.Promise<{  finished  :boolean}>}[P]} */ @js.native
trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
  extends ClassicComponentClass[AnimatableProperties[S] with P]
     with NativeMethodsMixinStatic {
  def stopAnimation(): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double): Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double, easing: Easing): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: Double): Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: Double, easing: Easing): Unit = js.native
}

