package typings.reactColor.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.reactColor.colorWrapMod.ExportedColorProps
import typings.reactColor.colorWrapMod.InjectedColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", "CustomPicker")
@js.native
object CustomPicker extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
}

