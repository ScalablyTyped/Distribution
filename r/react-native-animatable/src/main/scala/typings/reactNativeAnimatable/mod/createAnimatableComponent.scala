package typings.reactNativeAnimatable.mod

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.reactNativeAnimatable.AnonStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "createAnimatableComponent")
@js.native
object createAnimatableComponent extends js.Object {
  def apply[P /* <: AnonStyle */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: AnonStyle */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: AnonStyle */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
}

