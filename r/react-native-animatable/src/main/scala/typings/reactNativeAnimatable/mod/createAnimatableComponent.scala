package typings.reactNativeAnimatable.mod

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.reactNativeAnimatable.anon.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-animatable", "createAnimatableComponent")
@js.native
object createAnimatableComponent extends js.Object {
  
  def apply[P /* <: Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Style */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Style */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
}
