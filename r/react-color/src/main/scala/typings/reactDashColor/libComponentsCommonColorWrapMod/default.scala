package typings.reactDashColor.libComponentsCommonColorWrapMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/ColorWrap", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
}

