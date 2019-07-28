package typings.reactcss.reactcssMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reactcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T](classes: Classes[T], activations: js.Any*): T = js.native
  def hover[A](component: ComponentClass[A, ComponentState]): ComponentClass[A, ComponentState] = js.native
  def hover[A](component: StatelessComponent[A]): ComponentClass[A, ComponentState] = js.native
  def loop(index: Double, length: Double): LoopableProps = js.native
}

