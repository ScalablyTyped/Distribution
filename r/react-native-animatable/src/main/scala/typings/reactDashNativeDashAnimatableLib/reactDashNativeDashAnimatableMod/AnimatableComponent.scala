package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ @js.native
trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
  extends reactLib.reactMod.ReactNs.ClassicComponentClass[AnimatableProperties[S] with P]
     with reactDashNativeLib.reactDashNativeMod.NativeMethodsMixinStatic {
  def stopAnimation(): scala.Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T): scala.Unit = js.native
  def transition[T /* <: S */](fromValues: T, toValues: T, duration: scala.Double): scala.Unit = js.native
  def transition[T /* <: S */](
    fromValues: T,
    toValues: T,
    duration: scala.Double,
    easing: reactDashNativeDashAnimatableLib.Easing
  ): scala.Unit = js.native
  def transitionTo[T /* <: S */](toValues: T): scala.Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: scala.Double): scala.Unit = js.native
  def transitionTo[T /* <: S */](toValues: T, duration: scala.Double, easing: reactDashNativeDashAnimatableLib.Easing): scala.Unit = js.native
}

