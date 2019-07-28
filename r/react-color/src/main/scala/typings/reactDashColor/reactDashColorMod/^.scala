package typings.reactDashColor.reactDashColorMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.reactDashColor.libComponentsCommonColorWrapMod.ExportedColorProps
import typings.reactDashColor.libComponentsCommonColorWrapMod.InjectedColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def CustomPicker[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
  def CustomPicker[A](component: StatelessComponent[A with InjectedColorProps]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
}

