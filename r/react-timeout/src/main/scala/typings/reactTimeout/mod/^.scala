package typings.reactTimeout.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](SourceComponent: ComponentClass[T, ComponentState]): ComponentClass[T, ComponentState] = js.native
  def apply[T](SourceComponent: StatelessComponent[T]): ComponentClass[T, ComponentState] = js.native
}

