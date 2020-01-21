package typings.reactColor.colorWrapMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/ColorWrap", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ComponentClass[A with ExportedColorProps, ComponentState] = js.native
}

