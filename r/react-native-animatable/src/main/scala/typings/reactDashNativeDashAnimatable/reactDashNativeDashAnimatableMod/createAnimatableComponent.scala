package typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod

import typings.react.reactMod.ClassicComponentClass
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.reactDashNativeDashAnimatable.Anon_Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "createAnimatableComponent")
@js.native
object createAnimatableComponent extends js.Object {
  def apply[P /* <: Anon_Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Anon_Style */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Anon_Style */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
}

